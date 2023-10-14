// https://www.acmicpc.net/problem/1652
// 누울 자리를 찾아라
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
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) {
                str += array[i][j];
            }
            String[] sArray = str.split("X");
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].length() >= 2){
                    answer1++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) {
                String s1 = array[j][i];
                str += s1;
            }
            String[] sArray = str.split("X");
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].length() >= 2){
                    answer2++;
                }
            }
        }
        bw.write(answer1 + " " + answer2 + "\n");
        bw.flush();
        bw.close();
    }

}