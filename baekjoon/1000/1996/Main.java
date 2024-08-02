// https://www.acmicpc.net/problem/1996
// 지뢰 찾기
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
        String[][] array = new String[size][size];
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {1, 0, -1, -1, -1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        String[][] answerArray = new String[size][size];
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                answerArray[i][j] = "0";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].equals(".")){
                    for (int k = 0; k < array1.length; k++) {
                        int y = i + array1[k];
                        int x = j + array2[k];
                        if(y < 0 || x < 0 || y > array.length - 1 || x > array[0].length - 1){
                            continue;
                        }
                        if(!array[y][x].equals(".")){
                            continue;
                        }
                        int n1 = Integer.parseInt(array[i][j]);
                        int n2 = Integer.parseInt(answerArray[y][x]);
                        answerArray[y][x] = String.valueOf(n1 + n2);
                    }
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                if(!array[i][j].equals(".")){
                    answerArray[i][j] = "*";
                    continue;
                }
                if(Integer.parseInt(answerArray[i][j]) > 9){
                    answerArray[i][j] = "M";
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                bw.write(answerArray[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}