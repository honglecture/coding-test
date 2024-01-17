// https://www.acmicpc.net/problem/13420
// 사칙연산
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String answer = "wrong answer";
            String[] sArray = bf.readLine().split(" ");
            long n1 = Long.parseLong(sArray[0]);
            long n2 = Long.parseLong(sArray[2]);
            String type = sArray[1];
            long result = Long.parseLong(sArray[4]);
            if(type.equals("+")){
                if(n1 + n2 == result){
                    answer = "correct";
                }
            } else if(type.equals("-")){
                if(n1 - n2 == result){
                    answer = "correct";
                }
            } else if(type.equals("*")){
                if(n1 * n2 == result){
                    answer = "correct";
                }
            } else if(type.equals("/")){
                if(n1 / n2 == result){
                    answer = "correct";
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}