// https://www.acmicpc.net/problem/9550
// 아이들은 사탕을 좋아해
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int[] array = new int[n1];
            sArray = bf.readLine().split(" ");
            int answer = 0;
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            for (int j = 0; j < array.length; j++) {
                int result = array[j] / n2;
                answer += result;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
   

}