// https://www.acmicpc.net/problem/20650
// Do You Know Your ABCs? 
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int n1 = array[0];
        int n2 = array[1];
        int n3 = array[6] - n1 - n2;
        System.out.println(n1 + " " + n2 + " " + n3);
        bw.flush();
        bw.close();
    }

}
