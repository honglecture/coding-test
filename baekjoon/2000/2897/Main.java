// https://www.acmicpc.net/problem/2897
// 몬스터 트럭
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int[] answerArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                int count1 = 0;
                int count2 = 0;
                for (int k = i; k < i + 2; k++) {
                    for (int l = j; l < j + 2; l++) {
                        if(array[k][l].equals("#")){
                            count2++;
                        } else if(array[k][l].equals("X")){
                            count1++;
                        }
                    }
                }
                if(count2 == 0){
                    answerArray[count1]++;
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}