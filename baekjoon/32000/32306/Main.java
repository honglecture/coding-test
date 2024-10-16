// https://www.acmicpc.net/problem/32306
// Basketball Score
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = {1, 2, 3};
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < sArray2.length; i++) {
            sum1 += Integer.parseInt(sArray1[i]) * array[i];
            sum2 += Integer.parseInt(sArray2[i]) * array[i];
        }
        if(sum1 > sum2){
            System.out.println("1");
        } else if(sum1 < sum2){
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }


}
