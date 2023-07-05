// https://www.acmicpc.net/problem/10845
// 큐
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String type = sArray[0];
            if(type.equals("push")){
                 int n = Integer.parseInt(sArray[1]);
                 queue.add(n);
            } else if(type.equals("pop")){
                 if(queue.size() == 0){
                    bw.write("-1\n");
                 } else {
                    bw.write(queue.poll() + "\n");
                 }
            } else if(type.equals("size")){
                 bw.write(queue.size() + "\n");
            } else if(type.equals("empty")){
                 if(queue.size() == 0){
                    bw.write("1\n");
                 } else {
                    bw.write("0\n");
                 }
            } else if(type.equals("front")){
                 if(queue.size() == 0){
                    bw.write("-1\n");
                 } else {
                    bw.write(queue.peekFirst() + "\n");
                 }
            } else if(type.equals("back")){
                 if(queue.size() == 0){
                    bw.write("-1\n");
                 } else {
                    bw.write(queue.peekLast() + "\n");
                 }
            } else {}
        }
        bw.flush();
        bw.close();
    }
}