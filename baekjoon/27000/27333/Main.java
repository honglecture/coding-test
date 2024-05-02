// https://www.acmicpc.net/problem/27333
// JOI エディタ (JOI Editor)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder(bf.readLine());
        for (int i = 1; i < sb.length(); i++) {
            char c1 = sb.charAt(i - 1);
            char c2 = sb.charAt(i);
            if(c1 == c2){
                char result = String.valueOf(c1).toUpperCase().charAt(0);
                sb.setCharAt(i - 1, result);
                sb.setCharAt(i, result);
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

    

}
