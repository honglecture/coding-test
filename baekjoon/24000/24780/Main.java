// https://www.acmicpc.net/problem/24780
// Kitten on a Tree
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int key = Integer.parseInt(bf.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        while (true) {
            String temp = bf.readLine();
            if(temp.equals("-1")){
                break;
            }
            String[] sArray = temp.split(" ");
            List<Integer> list = new ArrayList<>();
            int n1 = Integer.parseInt(sArray[0]);
            for (int i = 1; i < sArray.length; i++) {
                int n2 = Integer.parseInt(sArray[i]);
                list.add(n2);
            }
            map.put(n1, list);
        }
        StringBuilder answer = new StringBuilder();
        answer.append(key + " ");
        while (true) {
            boolean flag = false;
            for (int n : map.keySet()) {
                List<Integer> list = map.get(n);
                for (int i = 0; i < list.size(); i++) {
                    if(key == list.get(i)){
                        flag = true;
                        key = n;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(!flag){
                break;
            }
            answer.append(key + " ");
            
        }
        answer.deleteCharAt(answer.length() - 1);
        System.out.println(answer.toString());
        bw.flush();
        bw.close();
    }

}