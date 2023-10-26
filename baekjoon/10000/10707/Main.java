// https://www.acmicpc.net/problem/10707
// 수도요금
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        int answer1 = array[0] * array[4];
        int answer2 = array[1];
        if(array[2] < array[4]){
            answer2 = array[1] + ((array[4] - array[2]) * array[3]);
        }
        bw.write(Integer.min(answer1, answer2) + "\n");
        bw.flush();
        bw.close();
    }

}