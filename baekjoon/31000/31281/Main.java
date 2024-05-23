// https://www.acmicpc.net/problem/31281
// ЗЛАТНАТА СРЕДА
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        long[] array = new long[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Long.parseLong(sArray[i]);
        }
        Arrays.sort(array);
        System.out.println(array[1]);
        bw.flush();
        bw.close();
    }

    

}
