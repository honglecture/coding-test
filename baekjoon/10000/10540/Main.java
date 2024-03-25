// https://www.acmicpc.net/problem/10540
// KLOPKA
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            min = Integer.min(Integer.min(n1, n2), min);
            max = Integer.max(Integer.max(n1, n2), max);
        }
        int result = (max - min) * (max - min);
        System.out.println(result);
        bw.flush();
        bw.close();
    }


    

}