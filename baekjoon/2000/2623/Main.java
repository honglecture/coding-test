// https://www.acmicpc.net/problem/2623
// 음악프로그램
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size1 = Integer.parseInt(sArray[1]);
        boolean[] visitArray = new boolean[n + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            int size2 = Integer.parseInt(sArray[0]);
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < sArray.length; j++) {
                int n2 = Integer.parseInt(sArray[j]);
                list.add(n2);
            }
            map.put(i, list);
        }
        while(true){
            if(map.keySet().size() == 0){
                break;
            }
            if(answerList.size() == n){
                break;
            }
            Map<Integer, Integer> innerMap = new HashMap<>();
            
            for (int key : map.keySet()) {
                int v = map.get(key).get(0);
                innerMap.put(v, 0);
            }
            for (int key : map.keySet()) {
                List<Integer> innerList = map.get(key);
                for (int key2 : innerMap.keySet()){
                    for (int i = 1; i < innerList.size(); i++) {
                        if(innerList.get(i) == key2){
                            innerMap.put(key2, innerMap.get(key2) + 1);
                            break;
                        }
                    }
                }
            }
            int removeNum = -1;
            for (int key : innerMap.keySet()){
                if(innerMap.get(key) == 0){
                    removeNum = key;
                    break;
                }
            }
            if(removeNum == -1){
                answerList.clear();
                answerList.add(0);
                break;
            }
            answerList.add(removeNum);
            List<Integer> removeKey = new ArrayList<>();
            for (int key : map.keySet()) {
                List<Integer> innerlist = map.get(key);
                innerlist.remove((Object)removeNum);
                if(innerlist.size() == 0){
                    removeKey.add(key);
                }
            }
            for (int i = 0; i < removeKey.size(); i++) {
                map.remove(removeKey.get(i));
            }
        }
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
            visitArray[answerList.get(i)] = true;
        }
        for (int i = 1; i < visitArray.length; i++) {
            if(!visitArray[i]){
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
