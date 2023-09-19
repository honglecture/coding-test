// https://www.acmicpc.net/problem/1935
// 후위 표기식2
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
        String str = bf.readLine();
        int[] array = new int[26];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) + "";
            if(s.equals("+")){
                double n2 = stack.pop();
                double n1 = stack.pop();
                stack.add(n1 + n2);
            } else if(s.equals("-")){
                double n2 = stack.pop();
                double n1 = stack.pop();
                stack.add(n1 - n2);
            } else if(s.equals("*")){
                double n2 = stack.pop();
                double n1 = stack.pop();
                stack.add(n1 * n2);
            } else if(s.equals("/")){
                double n2 = stack.pop();
                double n1 = stack.pop();
                stack.add(n1 / n2);
            } else {
                double temp = array[s.charAt(0) - 65];
                stack.add(temp);
            }
        }
        double n = stack.pop();
        double result = Math.round(n * 100) / 100.0;
        System.out.printf("%.2f", result);
        bw.flush();
        bw.close();
    }
}