// https://www.acmicpc.net/problem/1918
// 후위 표기식
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
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            int rank = getRank(s);
            switch (s) {
                case "*":
                case "/":
                case "+":
                case "-":
                    while(true){
                        if(stack.empty()){
                            break;
                        }
                        int beforeRank = getRank(stack.peek());
                        if(beforeRank < rank){
                            break;
                        }
                        sb.append(stack.pop());
                    }
                    stack.add(s);
                    break;
                case "(":
                    stack.add(s);
                    break;
                case ")":
                    while(true){
                        if(stack.empty()){
                            break;
                        }
                        if(stack.peek().equals("(")){
                            break;
                        }
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;  
                default:
                    sb.append(s);
                    break;
            }
        }
        while(stack.size() != 0){
            sb.append(stack.pop());
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }

    private static int getRank(String s){
        int result = 0;
        if(s.equals("+")){
            result = 1;
        } else if(s.equals("-")){
            result = 1;
        } else if(s.equals("*")){
            result = 2;
        } else if(s.equals("/")){
            result = 2;
        }
        return result;
    }

    
}