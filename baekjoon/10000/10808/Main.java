// https://www.acmicpc.net/problem/10808
// 알파벳 개수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[26];
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i);
            array[n - 97]++;
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }
        bw.flush();
        bw.close();
    }

}