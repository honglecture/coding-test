// https://www.acmicpc.net/problem/3474
// 이진수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int result = 1;
        for (int i = size; i >= 1; i--) {
            result *= i;
        }
        System.out.println(result);
        for (int i = 0; i < size; i++) {
           // int n = Integer.parseInt(bf.readLine());
        }
        bw.flush();
        bw.close();
    }

    

}

