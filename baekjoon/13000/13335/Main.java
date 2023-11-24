// https://www.acmicpc.net/problem/13335
// 트럭
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int w = Integer.parseInt(sArray[1]);
        int l = Integer.parseInt(sArray[2]);
        Queue<Integer> queue = new ArrayDeque<>();
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            queue.add(Integer.parseInt(sArray[i]));
        }
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        while (true) {
            if(queue.isEmpty() && list.size() == 0){
                break;
            }
            answer++;
            if(list.size() != 0){
                for (int i = 0; i < list.size(); i++) {
                    list.get(i)[1]++;
                }
                if(list.get(0)[1] == w){
                    list.remove(0);
                }
            }
            if(!queue.isEmpty()){
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i)[0];
                }
                int nextNum = queue.peek();
                if(sum + nextNum <= l){
                    list.add(new int[]{nextNum, 0});
                    queue.poll();
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}