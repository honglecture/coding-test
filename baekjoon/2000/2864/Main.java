// https://www.acmicpc.net/problem/2864
// 5와 6의 차이
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        StringBuilder sb1 = new StringBuilder(sArray[0]);
        StringBuilder sb2 = new StringBuilder(sArray[1]);
        for (int i = 0; i < sb1.length(); i++) {
            char c = sb1.charAt(i);
            if(c == '6'){
                sb1.setCharAt(i, '5');
            }
        }
        for (int i = 0; i < sb2.length(); i++) {
            char c = sb2.charAt(i);
            if(c == '6'){
                sb2.setCharAt(i, '5');
            }
        }
        int min = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        for (int i = 0; i < sb1.length(); i++) {
            char c = sb1.charAt(i);
            if(c == '5'){
                sb1.setCharAt(i, '6');
            }
        }
        for (int i = 0; i < sb2.length(); i++) {
            char c = sb2.charAt(i);
            if(c == '5'){
                sb2.setCharAt(i, '6');
            }
        }
        int max = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}