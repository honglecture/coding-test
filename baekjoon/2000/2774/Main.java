// https://www.acmicpc.net/problem/2774
// 아름다운 수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            boolean[] array = new boolean[10];
            int answer = 0;
            for (int j = 0; j < str.length(); j++) {
                int n = Integer.parseInt(String.valueOf(str.charAt(j)));
                array[n] = true;
            }
            for (int j = 0; j < array.length; j++) {
                if(array[j]){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}