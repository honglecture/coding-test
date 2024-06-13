// https://www.acmicpc.net/problem/25756
// 방어율 무시 계산하기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        double currentAnswer = 0;
        for (int i = 0; i < array.length; i++) {
            double n = array[i];
            double result = 1 - ((1 - currentAnswer) * (1 - n));
            bw.write(result + "\n");
            currentAnswer = result;
        }
        bw.flush();
        bw.close();
    }

}
