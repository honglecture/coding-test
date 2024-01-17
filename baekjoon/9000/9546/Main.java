// https://www.acmicpc.net/problem/9546
// 3000번 버스
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            double result = 1;
            for (int j = 1; j < n; j++) {
                result += 0.5;
                result *= 2;
            }
            bw.write((int)result +"\n");
        }        
        bw.close();
    }
   

}