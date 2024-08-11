// https://www.acmicpc.net/problem/8387
// Dyslexia
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int answer = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}