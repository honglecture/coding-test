// https://www.acmicpc.net/problem/2437
// 저울
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
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(sum + 1 < n){
                break;
            }
            sum += n;
        }
        System.out.println(sum + 1);
        bw.flush();
        bw.close();
    }
}