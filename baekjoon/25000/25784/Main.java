// https://www.acmicpc.net/problem/25784
// Easy-to-Solve Expressions
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        if(array[0] + array[1] == array[2]){
            System.out.println("1");
        } else if(array[0] * array[1] == array[2]){
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        bw.flush();
        bw.close();
    }

}
