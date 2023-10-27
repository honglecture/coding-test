// https://www.acmicpc.net/problem/28278
// 스택 2
import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int order = Integer.parseInt(sArray[0]);
            if(order == 1){
                int n = Integer.parseInt(sArray[1]);
                stack.add(n);
            } else if(order == 2){
                if(!stack.empty()){
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if(order == 3){
                bw.write(stack.size()+"\n");
            } else if(order == 4){
                if(!stack.empty()){
                    bw.write("0\n");
                } else {
                    bw.write("1\n");
                }
            } else if(order == 5){
                if(!stack.empty()){
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

  
}
