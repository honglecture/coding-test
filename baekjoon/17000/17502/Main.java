// https://www.acmicpc.net/problem/17502
// 클레어와 팰린드롬
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        StringBuilder sb = new StringBuilder(bf.readLine());
        if(sb.length() % 2 != 0){
            int index = sb.length() / 2;
            if(sb.charAt(index) == '?'){
                sb.setCharAt(index, 'a');
            }
        }
        for (int i = 0; i < sb.length() / 2; i++) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(sb.length() - 1 - i);
            if(c1 == c2){
                if(c1 == '?'){
                    sb.setCharAt(i, 'a');
                    sb.setCharAt(sb.length() - 1 - i, 'a');
                }
            } else {
                if(c1 == '?'){
                    sb.setCharAt(i, c2);
                } else {
                    sb.setCharAt(sb.length() - 1 - i, c1);
                }
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }


}
