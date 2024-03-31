// https://www.acmicpc.net/problem/17436
// 소수의 배수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        long n1 = Long.parseLong(sArray[0]);
        long n2 = Long.parseLong(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        long answer = 0;
        long sum = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            sum *= array[i];
        }
        for (int i = 0; i < array.length; i++) {
            long n = array[i];
            long result1 = n2 / n;
            long result2 = (n1 - 1) / n;
            answer += (result1 - result2);
        }
        System.out.println(answer);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                long n = array[i] * array[j];
                long result1 = n2 / n;
                long result2 = (n1 - 1) / n;
                answer -= (result1 - result2);
            }
        }
        System.out.println(answer);
        for (int i = 0; i < array.length; i++) {
            if(array.length <= 2){
                break;
            }
            long n = sum;
            long result1 = n2 / n;
            long result2 = (n1 - 1) / n;
            answer += (result1 - result2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
