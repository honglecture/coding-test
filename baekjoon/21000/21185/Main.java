// https://www.acmicpc.net/problem/21185
// Some Sum
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[101];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        int result1 = 0;
        int result2 = 0;
        for (int i = 10; i < 10 + n; i++) {
            result1 += array[i];
        }
        for (int i = 11; i < 11 + n; i++) {
            result2 += array[i];
        }
        if(result1 % 2 == 0 && result2 % 2 == 0){
            System.out.println("Even");
        } else if(result2 % 2 != 0 && result1 % 2 != 0){
            System.out.println("Odd");
        } else {
            System.out.println("Either");
        }
        bw.flush();
        bw.close();
    }

}
