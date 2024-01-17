// https://www.acmicpc.net/problem/5656
// 비교 연산자
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            if(sArray[1].equals("E")){
                break;
            }
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[2]);
            String str = sArray[1];
            boolean flag = false;
            if(str.equals(">")){
                if(n1 > n2){
                    flag = true;
                }
            } else if(str.equals(">=")){
                if(n1 >= n2){
                    flag = true;
                }
            } else if(str.equals("<")){
                if(n1 < n2){
                    flag = true;
                }
            } else if(str.equals("<=")){
                if(n1 <= n2){
                    flag = true;
                }
            } else if(str.equals("==")){
                if(n1 == n2){
                    flag = true;
                }
            } else if(str.equals("!=")){
                if(n1 != n2){
                    flag = true;
                }
            }
            bw.write("Case "+count+": " + flag + "\n");
            count++;
        }
        bw.flush();
        bw.close();
    }
}