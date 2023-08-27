// https://www.acmicpc.net/problem/9935
// 문자열 폭발
import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str = new StringBuilder(bf.readLine());
        String key = bf.readLine();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(stack.size() < key.length()){
                stack.add(s);
                continue;
            }
            if(stack.peek().equals(String.valueOf(key.charAt(key.length() - 1)))){
                boolean flag = true;
                StringBuilder sb = new StringBuilder("");
                for (int j = 0; j < key.length(); j++) {
                    if(stack.peek().equals(String.valueOf(key.charAt(key.length() - 1 - j)))){
                        sb.append(stack.pop());
                    } else {
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    if(!sb.toString().equals(key)){
                        for (int j = sb.length() - 1; j >= 0; j--) {
                            stack.add(String.valueOf(sb.charAt(j)));
                        }
                    }
                }
            }
            stack.add(s);
        }
        if(stack.size() >= key.length()){
            if(stack.peek().equals(String.valueOf(key.charAt(key.length() - 1)))){
                StringBuilder sb = new StringBuilder("");
                for (int j = 0; j < key.length(); j++) {
                    sb.append(stack.pop());
                }
                sb.reverse();
                if(!sb.toString().equals(key)){
                    for (int j = 0; j < sb.length(); j++) {
                        stack.add(String.valueOf(sb.charAt(j)));
                    }
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        while(stack.size() != 0){
            answer.append(stack.pop());
        }
        answer.reverse();
        bw.write(answer.toString().equals("") ? "FRULA\n" : answer.toString() + "\n");
        bw.flush();
        bw.close();
    }
}