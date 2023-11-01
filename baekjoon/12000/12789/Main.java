// https://www.acmicpc.net/problem/12789
import java.io.*;
import java.util.Stack;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Stack<Integer> stack = new Stack<>();
        int nextNum = 1;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            stack.add(n);
            while(true){
                if(stack.isEmpty()){
                    break;
                }
                if(stack.peek() == nextNum){
                    stack.pop();
                    nextNum++;
                } else {
                    break;
                }
            }
        }
        if(stack.isEmpty()){
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }
        bw.flush();
        bw.close();
    }

}
