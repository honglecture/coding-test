// https://www.acmicpc.net/problem/13417
// 카드 문자열
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            Deque<String> queue = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sArray.length; j++) {
                String str = sArray[j];
                if(queue.size() == 0){
                    queue.add(str);
                } else {
                    String s1 = queue.peekFirst();
                    if(s1.compareTo(str) >= 0){
                        queue.addFirst(str);
                    } else {
                        queue.add(str);
                    }
                }
            }
            while (queue.size() != 0) {
                sb.append(queue.poll());
            }
            bw.write(sb.toString() + "\n");
        }
       
        bw.flush();
        bw.close();
    }
}