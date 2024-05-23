// https://www.acmicpc.net/problem/31821
// 학식 사주기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            answer += array[Integer.parseInt(bf.readLine()) - 1];
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
