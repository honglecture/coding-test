// https://www.acmicpc.net/problem/15104
// Odd Palindrome
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                String s = str.substring(j, j + i);
                StringBuilder sb = new StringBuilder(s).reverse();
                if(s.equals(sb.toString())){
                    if(i % 2 == 0){
                        answer = "Or not.";
                    } else {
                        answer = "Odd.";
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
