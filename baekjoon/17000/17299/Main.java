// https://www.acmicpc.net/problem/17299
// 오등큰수
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            if(map.get(array[i]) != null){
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        Stack<Integer> stack = new Stack<>();
        int[] answerArray = new int[size];
        for (int i = array.length - 1; i >= 0; i--) {
            int n = array[i];
            int count = map.get(n);
            while (stack.size() != 0) {
                int topNum = stack.peek();
                int count2 = map.get(topNum);
                if(count >= count2){
                    stack.pop();
                } else {
                    break;
                }
            }
            answerArray[i] = -1;
            if(stack.size() != 0){
                answerArray[i] = stack.peek();
            }
            stack.add(n);
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
