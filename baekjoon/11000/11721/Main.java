// https://www.acmicpc.net/problem/11721
// 열 개씩 끊어 출력하기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            result += c;
            if(result.length() == 10){
                bw.write(result+"\n");
                result = "";
            }
        }
        if(!result.equals("")){
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}