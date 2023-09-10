// https://www.acmicpc.net/problem/5397
// 키로거
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String result = getAnswer(str);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(String str){
        StringBuilder result = new StringBuilder("");
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals("<")){
                if(leftStack.empty()){
                    continue;
                }
                rightStack.add(leftStack.pop());
            } else if(s.equals(">")){
                if(rightStack.empty()){
                    continue;
                }
                leftStack.add(rightStack.pop());
            } else if(s.equals("-")){
                if(leftStack.empty()){
                    continue;
                }
                leftStack.pop();
            } else {
                leftStack.add(s);
            }
        }
        while(leftStack.size() != 0){
            result.append(leftStack.pop());
        }
        result.reverse();
        while(rightStack.size() != 0){
            result.append(rightStack.pop());
        }
        return result.toString();
    }
}