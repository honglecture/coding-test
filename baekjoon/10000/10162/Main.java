// https://www.acmicpc.net/problem/10162
// 전자레인지
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array = {300, 60, 10};
        int[] answerArray = new int[3];
        for (int i = 0; i < array.length; i++) {
            if(n / array[i] != 0){
                answerArray[i] = n / array[i];
                n = (n - (answerArray[i] * array[i]));
            }
        }
        if(n != 0){
            bw.write(-1 + "\n");
        } else {
            for (int i = 0; i < answerArray.length; i++) {
                bw.write(answerArray[i] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}