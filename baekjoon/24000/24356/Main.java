// https://www.acmicpc.net/problem/24356
// ЧАСОВНИК
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int n4 = Integer.parseInt(sArray[3]);
        int sum1 = (n1 * 60) + n2;
        int sum2 = (n3 * 60) + n4;
        int result1 = 0;
        if(sum1 <= sum2){
            result1 = sum2 - sum1;
        } else {
            result1 += sum2;
            result1 += (1440 - sum1);
        }
        int result2 = result1 / 30;
        System.out.println(result1 + " " + result2);
        bw.flush();
        bw.close();
    }

}
