// https://www.acmicpc.net/problem/17298
// 오큰수
import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] answerArray = new int[size];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(i == 0){
                stack.add(new int[]{i, n});
                continue;
            }
            while(stack.size() != 0){
                int[] array = stack.peek();
                int index = array[0];
                int stackNum = array[1];
                if(stackNum < n){
                    answerArray[index] = n;
                    stack.pop();
                } else {
                    stack.add(new int[]{i, n});
                    break;
                }
            }
            if(stack.size() == 0){
                stack.add(new int[]{i, n});
            }
        }
        while(stack.size() != 0){
            int[] array = stack.pop();
            int index = array[0];
            answerArray[index] = -1;
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
