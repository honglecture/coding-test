// https://www.acmicpc.net/problem/11597
// Excellence
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < array.length / 2; i++) {
            int n1 = array[i];
            int n2 = array[array.length - i - 1];
            int sum = n1 + n2;
            answer = Integer.min(answer, sum);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}

