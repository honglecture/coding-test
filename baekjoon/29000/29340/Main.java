// https://www.acmicpc.net/problem/29340
// Отряд
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += String.valueOf(Integer.max(Integer.parseInt(String.valueOf(str1.charAt(i))), Integer.parseInt(String.valueOf(str2.charAt(i)))));
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
