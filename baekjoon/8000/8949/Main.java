// https://www.acmicpc.net/problem/8949
// 팰린드롬
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String n1 = sArray[0];
        String n2 = sArray[1];
        if(n1.length() < n2.length()){
            int size = n2.length() - n1.length();
            for (int i = 0; i < size; i++) {
                n1 = "0" + n1;
            }
        } else if(n1.length() > n2.length()){
            int size = n1.length() - n2.length();
            for (int i = 0; i < size; i++) {
                n2 = "0" + n2;
            }
        }
        String answer = "";
        for (int i = n1.length() - 1; i >= 0; i--) {
            int c1 = Integer.parseInt(n1.charAt(i) + "");
            int c2 = Integer.parseInt(n2.charAt(i) + "");
            int result = c1 + c2;
            answer = result + answer;
        }
        
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
   
}