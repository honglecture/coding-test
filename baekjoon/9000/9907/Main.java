// https://www.acmicpc.net/problem/9907
// ID
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = {2, 7, 6, 5, 4, 3, 2};
        String[] strArray = {"J", "A", "B", "C", "D", "E", "F", "G", "H", "I", "Z"};
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += n * array[i];
        }
        int result = sum % 11;
        System.out.println(strArray[result]);
        bw.flush();
        bw.close();
    }
}