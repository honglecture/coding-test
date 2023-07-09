// https://www.acmicpc.net/problem/1541
// 잃어버린 괄호

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
        Stack<Integer> stack = new Stack<>();
        String temp = "";
        String beforeType = "";
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) + "";
            if(s.equals("+") || s.equals("-")){
                if(stack.size() == 0){
                    stack.add(Integer.parseInt(temp));
                    beforeType = s;
                    temp = "";
                } else {
                    if(beforeType.equals("+")){
                        int n1 = stack.pop() + Integer.parseInt(temp);
                        stack.add(n1);
                        temp = "";
                        beforeType = s;
                    } else if(beforeType.equals("-")){
                        int n1 = Integer.parseInt(temp);
                        stack.add(n1);
                        temp = "";
                        beforeType = s;
                    }
                }
            } else {
                temp += s;
                if(i == str.length() - 1){
                    if(beforeType.equals("+")){
                        int n1 = stack.pop() + Integer.parseInt(temp);
                        stack.add(n1);
                        temp = "";
                    } else if(beforeType.equals("-")){
                        int n1 = Integer.parseInt(temp);
                        stack.add(n1);
                        temp = "";
                    }
                }
            }
        }
        if(!temp.equals("")){
            stack.add(Integer.parseInt(temp));
        }
        int sum = 0;
        while(stack.size() != 1){
            sum += stack.pop();
        }
        int n1 = stack.pop();
        int result = n1 - sum;
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }


}
