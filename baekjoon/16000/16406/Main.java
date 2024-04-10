// https://www.acmicpc.net/problem/16406
// Exam
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int answer = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1 == c2){
                if(n > 0){
                    answer += 1;
                    n--;
                }
            }
            if(n == 0){
                break;
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1 != c2){
                if(n > 0){
                    n--;
                } else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
