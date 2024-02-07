// https://www.acmicpc.net/problem/21633
// Bank Transfer
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        double sum = 25;
        double result = n * 0.01;
        sum += result;
        if(sum <= 100){
            sum = 100;
        } else if(sum >= 2000){
            sum = 2000;
        }
        String answer = String.format("%.2f", sum);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
