// https://www.acmicpc.net/problem/14912
// 숫자 빈도수
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int end = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int[] array = new int[10];
        for (int i = 1; i <= end; i++) {
            String str = i + "";
            for (int j = 0; j < str.length(); j++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(j)));
                array[n]++;
            }
        }
        System.out.println(array[key]);
        bw.flush();
        bw.close();
    }
    
}