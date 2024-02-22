// https://www.acmicpc.net/problem/24365
// THE MAYA BEE
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int avg = (n1 + n2 + n3) / 3;
        int answer = 0;
        answer += (avg - n1) * 2;
        answer += (avg - n2);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
