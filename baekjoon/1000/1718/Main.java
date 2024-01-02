// https://www.acmicpc.net/problem/1718
// 암호
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String key = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c1 = str.charAt(i);
            if(c1 == ' '){
                sb.append(" ");
                continue;
            }
            int k = 0;
            if(i != 0){
                k = i % key.length();
            }
            int c2 = key.charAt(k);
            int result = c1 - c2;
            if(result <= 0){
                result += 122;
            } else {
                result += 96;
            }
            sb.append(String.valueOf((char) result));
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

    


}
