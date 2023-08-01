// https://www.acmicpc.net/problem/1406
// 에디터

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
        int size = Integer.parseInt(bf.readLine());
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) + "";
            stack1.add(s);
        }
        for (int i = 0; i < size; i++){
            String type = bf.readLine();
            if(type.length() != 1){
                String[] sArray = type.split(" ");
                String s = sArray[1];
                stack1.add(s);
            } else {
                if(type.equals("L")){
                    if(stack1.empty()){
                        continue;
                    }
                    String popString = stack1.pop();
                    stack2.add(popString);
                } else if(type.equals("D")){
                    if(stack2.empty()){
                        continue;
                    }
                    String popString = stack2.pop();
                    stack1.add(popString);
                } else if(type.equals("B")){
                    if(stack1.empty()){
                        continue;
                    }
                    stack1.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stack1.size() != 0){
            stack2.add(stack1.pop());
        }
        while(stack2.size() != 0){
            sb.append(stack2.pop());
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
    
}