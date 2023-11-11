// https://www.acmicpc.net/problem/11948
// 과목선택
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = new int[4];
        int[] array2 = new int[2];
        array1[0] = Integer.parseInt(bf.readLine());
        array1[1] = Integer.parseInt(bf.readLine());
        array1[2] = Integer.parseInt(bf.readLine());
        array1[3] = Integer.parseInt(bf.readLine());
        array2[0] = Integer.parseInt(bf.readLine());
        array2[1] = Integer.parseInt(bf.readLine());
        Arrays.sort(array1);
        Arrays.sort(array2);
        int sum = 0;
        for (int i = array1.length - 1; i >= 1; i--) {
            sum += array1[i];
        }
        sum += array2[1];
        bw.write(sum + "\n");
        bw.flush();
        bw.close(); 
    }

}