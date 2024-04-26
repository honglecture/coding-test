// https://www.acmicpc.net/problem/3578
// Holes
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n == 0){
            System.out.println("1");
        } else if(n == 1){
            System.out.println("0");
        } else {
            int count1 = n / 2;
            int count2 = n % 2;
            String answer = "";
            for (int i = 0; i < count2; i++) {
                answer += "4";
            }
            for (int i = 0; i < count1; i++) {
                answer += "8";
            }
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }

    

}

