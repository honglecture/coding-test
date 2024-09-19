// https://www.acmicpc.net/problem/6124
// Good Grass
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
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int sum = 0;
        int answerY = 0;
        int answerX = 0;
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = 0; j < array[i].length - 3; j++) {
                int result = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        result += array[k][l];
                    }
                }
                if(sum < result){
                    answerY = j + 1;
                    answerX = i + 1;
                    sum = result;
                }               
            }
        }
        System.out.println(sum);
        System.out.println(answerX + " " + answerY);
        bw.flush();
        bw.close();
    }
    
}