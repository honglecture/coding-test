// https://www.acmicpc.net/problem/16208
// 귀찮음
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        long[] array = new long[size];
        long sum = 0;
        long answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            sum += array[i];
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if(i ==  array.length - 2){
                answer += array[i] * array[i + 1];
            } else {
                answer += array[i] * (sum - array[i]);
                sum -= array[i];
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}

