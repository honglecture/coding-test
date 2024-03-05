// https://www.acmicpc.net/problem/26736
// Wynik meczu
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A'){
                n1++;
            } else {
                n2++;
            }
        }
        System.out.println(n1 + " : " + n2);
        bw.flush();
        bw.close();
    }

}
