// https://www.acmicpc.net/problem/25830
// Microwave Mishap
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(":");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result = (n1 * 60 * 60) + (n2 * 60) - (n1 * 60) - n2;
        int result1 = result / 3600;
        result %= 3600;
        int result2 = result / 60;
        result %= 60;
        int result3 = result;
        String answer1 = String.valueOf(result1).length() == 1 ? "0" + result1 : result1 + "";
        String answer2 = String.valueOf(result2).length() == 1 ? "0" + result2 : result2 + "";
        String answer3 = String.valueOf(result3).length() == 1 ? "0" + result3 : result3 + "";
        System.out.println(answer1 + ":" + answer2 + ":" + answer3);
        bw.flush();
        bw.close();
    }

}
