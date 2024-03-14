// https://www.acmicpc.net/problem/28464
// Potato
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            answer2 += array[array.length - 1 - i];
            array[array.length - 1 - i] = 0;
            answer1 += array[i];
            array[i] = 0;
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

  
}
