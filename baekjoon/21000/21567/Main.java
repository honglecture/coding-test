// https://www.acmicpc.net/problem/21567
// 숫자의 개수 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n1 = Integer.parseInt(bf.readLine());
        long n2 = Integer.parseInt(bf.readLine());
        long n3 = Integer.parseInt(bf.readLine());
        long result = n1 * n2 * n3;
        String str = result + "";
        int[] array = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(str.charAt(i) + "");
            array[n]++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        bw.flush();
        bw.close();
    }

}
