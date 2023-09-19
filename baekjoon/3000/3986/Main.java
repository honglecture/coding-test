// https://www.acmicpc.net/problem/3986
// 좋은 단어
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
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(stack.isEmpty()){
                    stack.add(c);
                } else {
                    if(stack.peek() == c){
                        stack.pop();
                    } else {
                        stack.add(c);
                    }
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}