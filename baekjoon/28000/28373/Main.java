// https://www.acmicpc.net/problem/28373
// Eszett
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine().toLowerCase();
        System.out.println(str);
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            if(c1 == 's' && c2 == 's'){
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j <= i - 1; j++) {
                    sb.append(String.valueOf(str.charAt(j)));
                }
                sb.append("B");
                for (int j = i + 2; j < str.length(); j++) {
                    sb.append(String.valueOf(str.charAt(j)));
                }
                System.out.println(sb.toString());
            }
            
        }
        
        bw.flush();
        bw.close();
    }

  
}
