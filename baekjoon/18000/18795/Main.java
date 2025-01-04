// https://www.acmicpc.net/problem/18795
// 이동하기 3
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                sum += Integer.parseInt(sArray[j]);
            }
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
