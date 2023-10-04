// https://www.acmicpc.net/problem/17608
// 막대기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        int count = 1;
        int currentN = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            if(currentN < array[i]){
                count++;
                currentN = array[i];
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}