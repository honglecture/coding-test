// https://www.acmicpc.net/problem/13484
// Tarifa
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n > x){
                sum -= (n - x);
            } else if(n < x){
                sum += (x - n);
            }
        }
        System.out.println(x + sum);
        bw.flush();
        bw.close();
    }

}