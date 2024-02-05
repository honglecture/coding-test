// https://www.acmicpc.net/problem/2799
// 유학 금지
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[6 + ((y - 1) * 5)][6 + ((x - 1) * 5)];
        int[] answerArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 1; i < array.length; i += 5) {
            for (int j = 1; j < array[i].length; j += 5) {
                int count = 0;
                for (int k = i; k < i + 4; k++) {
                    if(!array[k][j].equals("*")){
                        break;
                    }
                    count++;
                }
                answerArray[count]++;
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}