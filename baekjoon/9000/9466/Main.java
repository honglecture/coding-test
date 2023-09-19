// https://www.acmicpc.net/problem/9466
// 텀 프로젝트
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int[] visitArray = new int[n + 1];
            for (int j = 0; j < sArray.length; j++) {
                map.put(j + 1, Integer.parseInt(sArray[j]));
                if(j + 1 == Integer.parseInt(sArray[j])){
                    visitArray[j + 1] = 1;
                }
            }
            for (int j = 1; j < visitArray.length; j++) {
                if(visitArray[j] == 1 || visitArray[j] == 2){
                    continue;
                }
                Set<Integer> set = new HashSet<>();
                List<Integer> list = new ArrayList<>();
                Queue<Integer> queue = new ArrayDeque<>();
                int start = j;
                int end = 0;
                boolean flag = true;
                queue.add(start);
                while(queue.size() != 0){
                    int currentN = queue.poll();
                    if(visitArray[currentN] == 1 || visitArray[currentN] == 2){
                        visitArray[start] = 2;
                        flag = false;
                        break;
                    }
                    if(set.contains(currentN)){
                        end = currentN;
                        break;
                    }
                    set.add(currentN);
                    list.add(currentN);
                    queue.add(map.get(currentN));
                }
                if(flag){
                    boolean addFlag = false;
                    for (int k = 0; k < list.size(); k++) {
                        int currentN = list.get(k);
                        if(addFlag){
                            visitArray[currentN] = 1;
                            continue;
                        }
                        if(currentN == end){
                            addFlag = true;
                            visitArray[currentN] = 1;
                        } else {
                            visitArray[currentN] = 2;
                        }
                    }
                } else {
                    for (int k = 0; k < list.size(); k++) {
                        visitArray[list.get(k)] = 2;
                    }
                }
            }
            for (int j = 1; j < visitArray.length; j++) {
                if(visitArray[j] == 2){
                    count++;
                }
            }
            bw.write(count + "\n");
            
        }
        bw.flush();
        bw.close();
    }
   

}