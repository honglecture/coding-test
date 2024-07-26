// https://www.acmicpc.net/problem/4563
// 리벤지 오브 피타고라스
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int a = Integer.parseInt(bf.readLine());
            if(a == 0){
                break;
            }
            int b = a + 1;
            int answer = 0;
            while (true) {
                long n1 = (long) Math.pow(a, 2);
                long n2 = (long) Math.pow(b, 2);
                long n3 = n1 + n2;
                double c = Math.sqrt(n3);
                bw.write(b + " " + (long) c + "\n");
                if(b == (long)c){
                    break;
                }
                if(n3 % c == 0){
                    bw.write(n1 + " " + n2 + " " + n3 + "\n");
                    answer++;
                }
                b++;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}