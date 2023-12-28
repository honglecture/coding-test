// https://www.acmicpc.net/problem/5613
// 계산기 프로그램
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = Integer.parseInt(bf.readLine());
        while (true) {
            String str = bf.readLine();
            if(str.equals("=")){
                break;
            }
            if(str.equals("+")){
                int n = Integer.parseInt(bf.readLine());
                result += n;
            } else if(str.equals("-")){
                int n = Integer.parseInt(bf.readLine());
                result -= n;
            } else if(str.equals("*")){
                int n = Integer.parseInt(bf.readLine());
                result *= n;
            } else if(str.equals("/")){
                int n = Integer.parseInt(bf.readLine());
                result /= n;
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}