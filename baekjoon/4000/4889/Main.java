// https://www.acmicpc.net/problem/4889
// 안정적인 문자열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 1;
        while (true) {
            String str = bf.readLine();
            if(str.contains("-")){
                break;
            }
            int result = getAnswer(str);
            bw.write(index +". " + result + "\n");
            index++;
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String str){
        if(str == null || str.equals("")){
            return 0;
        }
        int result = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(stack.empty()){
                stack.add(s);
            } else {
                if(s.equals("{")){
                    stack.add(s);
                } else {
                    if(stack.peek().equals("{")){
                        stack.pop();
                    } else {
                        stack.add(s);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        sb = sb.reverse();
        for (int i = 0; i < sb.length() / 2; i++) {
            char c = sb.charAt(i);
            if(i == 0){
                if(c == '}'){
                    result++;
                }
            } else if(i == sb.length() / 2 - 1) {
                if(c == '}'){
                    result++;
                }
            } else {
                
            }
        }
        for (int i = sb.length() - 1; i >= sb.length() / 2; i--) {
            
        }
        return result;
    }
}
