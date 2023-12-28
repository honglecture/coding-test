// https://www.acmicpc.net/problem/17863
// FYI
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String s = str.substring(0, 3);
        if(s.equals("555")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }

   
}