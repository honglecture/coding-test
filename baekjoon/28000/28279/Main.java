// https://www.acmicpc.net/problem/28279
// 덱 2
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> queue = new ArrayDeque<>();
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int order = Integer.parseInt(sArray[0]);
            if(order == 1){
                int n = Integer.parseInt(sArray[1]);
                queue.addFirst(n);
            } else if(order == 2){
                int n = Integer.parseInt(sArray[1]);
                queue.addLast(n);
            } else if(order == 3){
                if(!queue.isEmpty()){
                    bw.write(queue.pollFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if(order == 4){
                if(!queue.isEmpty()){
                    bw.write(queue.pollLast() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if(order == 5){
                bw.write(queue.size() +"\n");
            } else if(order == 6){
                if(!queue.isEmpty()){
                    bw.write("0\n");
                } else {
                    bw.write("1\n");
                }
            } else if(order == 7){
                if(!queue.isEmpty()){
                    bw.write(queue.peekFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if(order == 8){
                if(!queue.isEmpty()){
                    bw.write(queue.peekLast() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

  
}
