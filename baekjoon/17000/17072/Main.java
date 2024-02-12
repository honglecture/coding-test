// https://www.acmicpc.net/problem/17072
// 아스키 아트
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x * 3];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        String[][] answerArray = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 3) {
                int n1 = array[i][j] * 2126;
                int n2 = array[i][j + 1] * 7152;
                int n3 = array[i][j + 2] * 722;
                int sum = n1 + n2 + n3;
                String result = "";
                if(sum >= 0 && sum < 510000){
                    result = "#";
                } else if(sum >= 510000 && sum < 1020000){
                    result = "o";
                } else if(sum >= 1020000 && sum < 1530000){
                    result = "+";
                } else if(sum >= 1530000 && sum < 2040000){
                    result = "-";
                } else {
                    result = ".";
                }
                answerArray[i][j / 3] = result;
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                bw.write(answerArray[i][j]+"");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
