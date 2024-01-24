// https://www.acmicpc.net/problem/3023
// 마술사 이민혁
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
        String[][] array = new String[y][x];
        String[][] answerArray = new String[y * 2][x * 2];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                answerArray[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                answerArray[i][answerArray[0].length - 1 - j] = array[i][j];
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                answerArray[answerArray.length - 1 - i][j] = answerArray[i][j];
            }
        }

        sArray = bf.readLine().split(" ");
        int erY = Integer.parseInt(sArray[0]) - 1;
        int erX = Integer.parseInt(sArray[1]) - 1;
        if(answerArray[erY][erX].equals(".")){
            answerArray[erY][erX] = "#";
        } else {
            answerArray[erY][erX] = ".";
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