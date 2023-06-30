// https://www.acmicpc.net/problem/10817
// 세 수
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int[] array = new int[3];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        Arrays.sort(array);
        bw.write(array[1]+"");
        bw.flush();
        bw.close();
    }
}