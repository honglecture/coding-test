// https://www.acmicpc.net/problem/9296
// Grading Exams
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String str1 = bf.readLine();
            String str2 = bf.readLine();
            int answer = 0;
            for (int j = 0; j < str1.length(); j++) {
                if(str1.charAt(j) != str2.charAt(j)){
                    answer++;
                }
            }
            bw.write("Case "+(i + 1)+": " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}