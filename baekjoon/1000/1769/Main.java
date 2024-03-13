// https://www.acmicpc.net/problem/1769
// 3의 배수
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
        int result = 0;
        int count = 0;
        while (true) {
            if(str.length() == 1){
                break;
            }
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += n;
            }
            str = String.valueOf(sum);
            count++;
        }
        result = Integer.parseInt(String.valueOf(str));
        System.out.println(count);
        System.out.println(result % 3 == 0 ? "YES" : "NO");
        bw.flush();
        bw.close();
    }
   
}



