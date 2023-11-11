// https://www.acmicpc.net/problem/20055
// 컨베이어 벨트 위의 로봇
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int[] array = new int[n * 2];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        // 스스로 이동할 수 있다. 
        // 컨베이어 벨트도 돈다.
        bw.flush();
        bw.close();
    }

}
