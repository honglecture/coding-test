// https://www.acmicpc.net/problem/11950
// 2016 IOI
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < y - 2; i++) {
            for (int j = i + 1; j < y - 1; j++) {
                for (int k = j + 1; k < y; k++) {
                    int reuslt = getAnswer(array, i, j, k);
                    min = Integer.min(min, reuslt);
                }
            }
        }
        System.out.println(min);
        bw.flush();
        bw.close(); 
    }

    private static int getAnswer(String[][] array, int n1, int n2, int n3){
        int result = 0;
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].equals("W")){
                    result++;
                }
            }
        }
        for (int i = n1 + 1; i <= n3 - 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].equals("B")){
                    result++;
                }
            }
        }
        for (int i = n3; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].equals("R")){
                    result++;
                }
            }
        }
        return result;
    }

}