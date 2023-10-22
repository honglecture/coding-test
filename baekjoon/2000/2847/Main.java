// https://www.acmicpc.net/problem/2847
// 게임을 만든 동준이
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
        int answer = 0;
        for (int i = array.length - 2; i >= 0; i--) {
            int n1 = array[i + 1];
            int n2 = array[i];
            if(n1 > n2){
                continue;
            } else if(n1 == n2){
                answer += 1;
                array[i] -= 1;
            } else {
                array[i] = n1 - 1;
                int result = n2 - n1;
                answer += result + 1;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}