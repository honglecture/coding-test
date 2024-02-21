// https://www.acmicpc.net/problem/28097
// 모범생 포닉스
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int sum = 0;
        sum = (size - 1) * 8;
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            sum += Integer.parseInt(sArray[i]);
        }
        int answer1 = sum / 24;
        int answer2 = sum % 24;
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

  
}
