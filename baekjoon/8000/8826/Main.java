// https://www.acmicpc.net/problem/8826
// Spacer
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            int n1 = 0;
            int n2 = 0;
            int answer = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'N'){
                    n1++;
                } else if(c == 'S'){
                    n1--;
                } else if(c == 'E'){
                    n2++;
                } else if(c == 'W'){
                    n2--;
                }
            }
            answer = Math.abs(n1) + Math.abs(n2);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}