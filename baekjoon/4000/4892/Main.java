// https://www.acmicpc.net/problem/4892
// 숫자 맞추기 게임
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            int n1 = 3 * n;
            int n2 = 0;
            if(n1 % 2 == 0){
                n2 = n1 / 2;
            } else {
                n2 = (n1 + 1) / 2;
            }
            int n3 = n2 * 3;
            int n4 = n3 / 9;
            int answer = 0;
            if(n1 % 2 == 0){
                answer = 2 * n4;
                bw.write(count + ". even " + n4 + "\n");
            } else {
                answer = 2 * n4 + 1;
                bw.write(count + ". odd " + n4 + "\n");
            }
            count++;
        }
        bw.flush();
        bw.close();
    }
}
