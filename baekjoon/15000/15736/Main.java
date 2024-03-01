// https://www.acmicpc.net/problem/15736
// 청기 백기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 1;
        for (int i = 2; i <= n; i++) {
            if(i * i > n){
                break;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}