// https://www.acmicpc.net/problem/20044
// Project Teams
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int[] teamArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            teamArray[i] = array[i];
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            teamArray[array.length - 1 - i] += array[i];
        }
        Arrays.sort(teamArray);
        System.out.println(teamArray[0]);
        bw.flush();
        bw.close();
    }

}
