// https://www.acmicpc.net/problem/20540
// 세금
import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        String s1 = str.charAt(0) + "";
        String s2 = str.charAt(1) + "";
        String s3 = str.charAt(2) + "";
        String s4 = str.charAt(3) + "";
        if(s1.equals("E")){
            answer += "I";
        } else {
            answer += "E";
        }
        if(s2.equals("S")){
            answer += "N";
        } else {
            answer += "S";
        }
        if(s3.equals("T")){
            answer += "F";
        } else {
            answer += "T";
        }
        if(s4.equals("J")){
            answer += "P";
        } else {
            answer += "J";
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
