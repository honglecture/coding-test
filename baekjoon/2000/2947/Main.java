// https://www.acmicpc.net/problem/2947
// 나무 조각
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int[] answerArray = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            answerArray[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(answerArray);
        while (true) {
            boolean flag = true;
            for (int i = 0; i < answerArray.length; i++) {
                if(answerArray[i] != array[i]){
                    flag = false;
                    break;
                }
            }
            for (int i = 0; i < array.length - 1; i++) {
                int n1 = array[i];
                int n2 = array[i + 1];
                if(n1 > n2){
                    array[i] = n2;
                    array[i + 1] = n1;
                    for (int j = 0; j < array.length; j++) {
                        bw.write(array[j] + " ");
                    }
                    bw.write("\n");
                }
            }
            if(flag){
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}