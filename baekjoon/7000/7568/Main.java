// https://www.acmicpc.net/problem/7568
// 덩치
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int[] answerArray = new int[size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if(i == j){
                    continue;
                }
                if(array[i][0] < array[j][0] && array[i][1] < array[j][1]){
                    count++;
                }
            }
            answerArray[i] = count;
        }
        
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}