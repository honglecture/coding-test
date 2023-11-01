// https://www.acmicpc.net/problem/11945
// 뜨거운 붕어빵
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);


        if(y == 0 || x == 0){
            bw.write("\n");
            bw.flush();
            bw.close(); 
            return;
        }



        String[][] array = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        String[][] answerArray = new String[y][x];
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                answerArray[i][j] = array[i][array[0].length - 1 - j];
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