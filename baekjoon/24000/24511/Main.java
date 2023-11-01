// https://www.acmicpc.net/problem/24511
// queuestack
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        bf.readLine();
        String[] sArray3 = bf.readLine().split(" ");
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < sArray1.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]);
            int n2 = Integer.parseInt(sArray2[i]);
            if(n1 == 0){
                queue.add(n2);
            }
        }
        if(queue.isEmpty()){
            for (int i = 0; i < sArray3.length; i++) {
                int n1 = Integer.parseInt(sArray3[i]);
                bw.write(n1 + " ");
            }
        } else {
            for (int i = 0; i < sArray3.length; i++) {
                int n1 = Integer.parseInt(sArray3[i]);
                bw.write(queue.pollLast() + " ");
                queue.addFirst(n1);
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    

}
