// https://www.acmicpc.net/problem/16019
// Are we there yet?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            int[] answerArray = new int[5];
            int[] sumArray = new int[5];
            int index = 0;
            for (int j = 0; j < answerArray.length; j++) {
                if(i == j){
                    continue;
                }
                answerArray[j] = array[index++];
            }

            for (int j = i - 1; j >= 0; j--) {
                sumArray[j] = sumArray[j + 1] + answerArray[j];
            }
            for (int j = i + 1; j < answerArray.length; j++) {
                sumArray[j] = sumArray[j - 1] + answerArray[j];
            }

            for (int j = 0; j < sumArray.length; j++) {
                bw.write(sumArray[j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
