// https://www.acmicpc.net/problem/28444
// HI-ARC=?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int result1 = array[0] * array[1];
        int result2 = array[2] * array[3] * array[4];
        System.out.println(result1 - result2);
        bw.flush();
        bw.close();
    }

  
}
