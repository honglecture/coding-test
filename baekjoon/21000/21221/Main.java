// https://www.acmicpc.net/problem/21221
// Bold
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        String[][] answerArray = new String[y][x];
        int[] array1 = {0, 1, 1, 0};
        int[] array2 = {0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                answerArray[i][j] = ".";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String s = array[i][j];
                if(s.equals("#")){
                    for (int k = 0; k < array1.length; k++) {
                        int currentY = i + array1[k];
                        int currentX = j + array2[k];
                        if(currentY < 0 || currentX < 0 || currentY >  y - 1 || currentX > x - 1){
                            continue;
                        }
                        answerArray[currentY][currentX] = "#";
                    }
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
