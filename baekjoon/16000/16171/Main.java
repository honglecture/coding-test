// https://www.acmicpc.net/problem/16171
// 나는 친구가 적다 (Small)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c >= 65 && c <= 90){
                sb.append(String.valueOf(c));
            } else if(c >= 97 && c <= 122){
                sb.append(String.valueOf(c));
            }
        }
        if(sb.toString().contains(str2)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
