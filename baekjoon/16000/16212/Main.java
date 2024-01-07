// https://www.acmicpc.net/problem/16212
// 정열적인 정렬
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    
}

