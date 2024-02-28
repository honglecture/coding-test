// https://www.acmicpc.net/problem/14470
// 전자레인지
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int n4 = Integer.parseInt(bf.readLine());
        int n5 = Integer.parseInt(bf.readLine());
        int answer = 0;
        if(n1 < 0){
            answer = Math.abs(n1) * n3 + n4;
            n1 = 0;
        }
        answer += (n2 - n1) * n5;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}