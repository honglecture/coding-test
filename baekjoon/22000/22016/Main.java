// https://www.acmicpc.net/problem/22016
// 巻物 (Scroll)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < n2 - 1; i++) {
            answer += str.charAt(i);
        }
        for (int i = n2 - 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90){
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
