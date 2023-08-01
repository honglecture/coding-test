// https://www.acmicpc.net/problem/13458
// 시험 감독
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        int b = Integer.parseInt(sArray[0]);
        int c = Integer.parseInt(sArray[1]);
        long count = size;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            n -= b;
            if(n <= 0){
                continue;
            }
            if(n % c == 0){
                count += n / c;
            } else {
                count += (n / c) + 1;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}