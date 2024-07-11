// https://www.acmicpc.net/problem/9843
// LVM
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, String> map = new HashMap<>(); 
        for (int i = 0; i < size; i++) {
            map.put(i, bf.readLine());
        }
        int start = 0;
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int reg = Integer.MIN_VALUE;
        while (true) {
            String str = map.get(start);
            String[] sArray = str.split(" ");
            String type = sArray[0];
            if(type.equals("PUSH")){
                int n = Integer.parseInt(sArray[1]);
                stack.push(n);
                start++;
            } else if(type.equals("STORE")){
                reg = stack.pop();
                start++;
            } else if(type.equals("LOAD")){
                stack.push(reg);
                start++;
            } else if(type.equals("PLUS")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1 + n2);
                start++;
            } else if(type.equals("TIMES")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1 * n2);
                start++;
            } else if(type.equals("IFZERO")){
                int n1 = stack.pop();
                if(n1 == 0){
                    start = Integer.parseInt(sArray[1]);
                } else {
                    start++;
                }
            } else if(type.equals("DONE")){
                answer = stack.pop();
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}