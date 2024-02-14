// https://www.acmicpc.net/problem/4108
// 크냐?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {-1, 0, 1, 1, 1, 0 ,-1, -1};

        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            if(y == 0 && x == 0){
                break;
            }
            String[][] array = new String[y][x];
            String[][] answerArray = new String[y][x];
            
            for (int i = 0; i < array.length; i++) {
                sArray = bf.readLine().split("");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = sArray[j];
                    answerArray[i][j] = "*";
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j].equals(".")){
                        int count = 0;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = i + array1[k];
                            int nextX = j + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > y -1 || nextX > x - 1){
                                continue;
                            }
                            if(array[nextY][nextX].equals("*")){
                                count++;
                            }
                        }
                        answerArray[i][j] = count + "";
                    }
                }
            }
            for (int i = 0; i < answerArray.length; i++) {
                for (int j = 0; j < answerArray[i].length; j++) {
                    bw.write(answerArray[i][j] + "");
                }
                bw.write("\n");
            }
        }

        
        
        
        bw.flush();
        bw.close();
    }
}