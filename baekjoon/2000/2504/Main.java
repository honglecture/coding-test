// https://www.acmicpc.net/problem/2504
// 괄호의 값
import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        Stack<String> stack = new Stack<>();
        int answer = 0;
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals("(")){
                stack.add(s);
            } else if(s.equals(")")){
                if(stack.empty() || !stack.peek().equals("(")){
                    flag = false;
                    break;
                }
                stack.pop();
            } else if(s.equals("[")){
                stack.add(s);
            } else if(s.equals("]")){
                if(stack.empty() || !stack.peek().equals("[")){
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }

        if(!flag || !stack.empty()){
            System.out.println("0");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if(!flag){
                break;
            }
            String s = String.valueOf(str.charAt(i));
            if(s.equals("(") || s.equals("[")){
                stack.add(s);
            } else if(s.equals(")")){
                int result = 1;
                while(true){
                    String stackStr = stack.pop();
                    if(isNumber(stackStr)){
                        int n = Integer.parseInt(stackStr);
                        result *= n;
                    } else {
                        result *= 2;
                        break;
                    }
                }
                stack.add(String.valueOf(result));
                result = 0;
                while(true){
                    if(stack.empty()){
                        break;
                    }
                    String stackStr = stack.peek();
                    if(isNumber(stackStr)){
                        int n = Integer.parseInt(stackStr);
                        result += n;
                        stack.pop();
                    } else {
                        break;
                    }
                }
                if(result != 0){
                    stack.add(String.valueOf(result));
                }
            } else if(s.equals("]")){
                int result = 1;
                while(true){
                    String stackStr = stack.pop();
                    if(isNumber(stackStr)){
                        int n = Integer.parseInt(stackStr);
                        result *= n;
                    } else {
                        result *= 3;
                        break;
                    }
                }
                stack.add(String.valueOf(result));
                result = 0;
                while(true){
                    if(stack.empty()){
                        break;
                    }
                    String stackStr = stack.peek();
                    if(isNumber(stackStr)){
                        int n = Integer.parseInt(stackStr);
                        result += n;
                        stack.pop();
                    } else {
                        break;
                    }
                }
                if(result != 0){
                    stack.add(String.valueOf(result));
                }
            }
        }
        bw.write(stack.pop() + "\n");
        bw.flush();
        bw.close();
    }

    private static boolean isNumber(String s){
        boolean result = true;
        if(s.equals("(") || s.equals(")") || s.equals("[") || s.equals("]")){
            result = false;
        }
        return result;
    }
}