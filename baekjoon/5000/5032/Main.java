// https://www.acmicpc.net/problem/5032
// 탄산 음료
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int sum = n1 + n2;
        int answer = 0;
        while (true) {
            int result1 = sum / n3;
            int result2 = sum % n3;
            answer += result1;
            sum = result2 + result1;
            if(result1 == 0){
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}