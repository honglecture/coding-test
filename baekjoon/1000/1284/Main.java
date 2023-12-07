// https://www.acmicpc.net/problem/1284
// 집 주소
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String n = bf.readLine();
            if(n.equals("0")){
                break;
            }
            int count = 2;
            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);
                if(c == '1'){
                    count += 2;
                } else if(c == '0'){
                    count += 4;
                } else {
                    count += 3;
                }
                count++;
            }
            count -= 1;
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}