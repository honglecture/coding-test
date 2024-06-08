// https://www.acmicpc.net/problem/16504
// 종이접기
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long sum = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                sum += Integer.parseInt(sArray[j]);
            }
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
