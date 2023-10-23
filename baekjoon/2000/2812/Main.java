// https://www.acmicpc.net/problem/2812
// 크게 만들기
import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        String str = bf.readLine();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) + "";
            if(stack.empty()){
                stack.add(s);
                continue;
            }
            int n1 = Integer.parseInt(stack.peek());
            int n2 = Integer.parseInt(s);
            while(true){
                if(size2 == 0){
                    break;
                }
                if(stack.empty()){
                    break;
                }
                int sn = Integer.parseInt(stack.peek());
                if(sn < n2){
                    size2--;
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.add(s);
            if(size2 == 0){
                if(i + 1 <= str.length() - 1){
                    if(stack.size() == size1 - size2){
                        break;
                    }
                    for (int j = i + 1; j < str.length(); j++) {
                        stack.add(str.charAt(j) + "");
                    }
                }
                break;
            }
        }
        StringBuilder answer = new StringBuilder();
        size2 = Integer.parseInt(sArray[1]);
        while(stack.size() != 0){
            answer.insert(0, stack.pop());
        }
        String result = answer.substring(0, size1 - size2);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
