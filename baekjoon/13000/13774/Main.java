// https://www.acmicpc.net/problem/13774
// Palindromes
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringBuilder sb = new StringBuilder(bf.readLine());
            if(sb.toString().equals("#")){
                break;
            }
            StringBuilder temp = new StringBuilder(sb.toString());
            String answer = "not possible";
            for (int i = 0; i < sb.length(); i++) {
                temp.deleteCharAt(i);
                StringBuilder sb1 = new StringBuilder(temp.toString());
                StringBuilder sb2 = new StringBuilder(temp.toString()).reverse();
                if(sb1.toString().equals(sb2.toString())){
                    answer = temp.toString();
                    break;
                }
                temp = new StringBuilder(sb.toString());
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}