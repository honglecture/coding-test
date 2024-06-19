// https://www.acmicpc.net/problem/18413
// 最頻値 (Mode)
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[n1];
        int[] answerArray = new int[n2 + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] <= n2){
                answerArray[array[i]]++;
            }
        }
        Arrays.sort(answerArray);
        System.out.println(answerArray[answerArray.length - 1]);
        bw.flush();
        bw.close();
    }

}
