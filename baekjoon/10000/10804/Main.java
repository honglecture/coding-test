// https://www.acmicpc.net/problem/10804
// 카드 역배치
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = 10;
        int[] array = new int[21];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int[] tempArray = new int[n2 - n1 + 1];
            int index = 0;
            for (int j = n1; j <= n2; j++) {
                tempArray[index++] = array[j];
            }
            for (int j = tempArray.length - 1; j >= 0; j--) {
                array[n1++] = tempArray[j];
            }
        }
        String answer = "";
        for (int i = 1; i < array.length; i++) {
            answer += array[i] + " ";
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}