// https://www.acmicpc.net/problem/24448
// 図書館 2 (Library 2)
import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.equals("READ")){
                bw.write(stack.pop() + "\n");
            } else {
                stack.add(str);
            }
        }
        bw.flush();
        bw.close();
    }

}
