// https://www.acmicpc.net/problem/2493
// 탑
import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine()) + 1;
        int[] array = new int[size];
        int[] answerArray = new int[size];
        String[] sArray = bf.readLine().split(" ");
        Stack<int[]> stack = new Stack<>();
        Stack<int[]> answerStack = new Stack<>();
        for (int i = 1; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i - 1]);
            stack.add(new int[]{i, array[i]});
        }
        while(stack.size() != 0){
            int[] popArray = stack.pop();
            int index = popArray[0];
            int n = popArray[1];
            if(answerStack.size() == 0){
                answerStack.add(new int[]{index, n});
                continue;
            }
            while(answerStack.size() != 0){
                int[] answerPopArray = answerStack.peek();
                int answerIndex = answerPopArray[0];
                int answerN = answerPopArray[1];
                if(n > answerN){
                    answerArray[answerIndex] = index;
                    answerStack.pop();
                } else {
                    break;
                }
            }
            answerStack.add(new int[]{index, n});
        }
        for (int i = 1; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}