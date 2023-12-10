// https://www.acmicpc.net/problem/25191
// 치킨댄스를 추는 곰곰이를 본 임스
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int sum = (n1 / 2) + n2;
        if(n >= sum){
            bw.write(sum + "\n");
        } else {
            bw.write(n + "\n");
        }
        bw.flush();
        bw.close();
    }

}
