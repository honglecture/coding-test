// https://www.acmicpc.net/problem/17174
// 전체 계산 횟수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int count = n1;
        while (true) {
            int n = n1 / n2;
            count += n;
            n1 = n;
            if(n == 0){
                break;
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
