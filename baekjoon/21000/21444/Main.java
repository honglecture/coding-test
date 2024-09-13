// https://www.acmicpc.net/problem/21444
// 스페이스
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int index = Integer.parseInt(sArray[1]);
        int min = Integer.MAX_VALUE;
        min = Integer.min(size + (size - index) - 1, size + index - 2);
        int[] array = new int[size];
        sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            answer += array[i];
        }
        answer += min;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
