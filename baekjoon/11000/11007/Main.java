// https://www.acmicpc.net/problem/11007
// Inverse Move-to-Front Transform
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
            String answer = "";
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            for (int j = 0; j < array.length; j++) {
                int index = array[j];
                char c = sb.charAt(index);
                answer += String.valueOf(c);
                sb.deleteCharAt(index);
                sb.insert(0, c);
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }
}