// https://www.acmicpc.net/problem/16194
// 카드 구매하기 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n + 1];
        String[] sArray = bf.readLine().split(" ");
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < sArray.length; i++) {
            array[i + 1] = Integer.parseInt(sArray[i]);
        }
        for (int i = 1; i < array.length; i++) {
            int m = array[i];
            int sum = 0;
            if(n % i == 0){
                sum = (n / i) * m;
            } else {
                sum = (n / i) * m;
                sum += array[n % i];
            }
            if(answer > sum){
                answer = sum;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
