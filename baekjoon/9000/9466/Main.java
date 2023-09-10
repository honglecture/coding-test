// https://www.acmicpc.net/problem/9466
// 텀 프로젝트
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
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
            for (int j = 0; j < sArray.length; j++) {
                map.put(j + 1, Integer.parseInt(sArray[j]));
            }
            for (int j = 1; j <= n; j++) {
                boolean[] checkArray = new boolean[n + 1];
                Queue<Integer> queue = new ArrayDeque<>();
                checkArray[j] = true;
                queue.add(map.get(j));
                while(queue.size() != 0){
                    int num = queue.poll();
                    if(j == num){
                        break;
                    }
                    if(checkArray[num]){
                        count += 1;
                        break;
                    }
                    checkArray[num] = true;
                    queue.add(map.get(num));
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
   

}