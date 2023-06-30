// https://www.acmicpc.net/problem/11047
// 동전 0
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int total = Integer.parseInt(sArray[1]);
        int count = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int n = array[i];
            if(total / n != 0){
                int m = total / n;
                total -= n * m;
                count += m;
            }
            if(total == 0){
                break;
            }
        }
        bw.write(count +"\n");
        bw.flush();
        bw.close();
    }
}