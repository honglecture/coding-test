// https://www.acmicpc.net/problem/11816
// 8진수, 10진수, 16진수
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
        if(str.charAt(0) == '0'){
            if(str.charAt(1) == 'x'){
                long n = Long.parseLong(str.substring(2), 16);
                System.out.println(n);
            } else {
                long n = Long.parseLong(str.substring(1), 8);
                System.out.println(n);
            }
        } else {
            System.out.println(str);
        }
        bw.flush();
        bw.close(); 
    }

}