// https://www.acmicpc.net/problem/10709
// 기상캐스터
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int[][] answerArray = new int[y][x];
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                answerArray[i][j] = -1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("c")){
                    answerArray[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                if(answerArray[i][j] == 0){
                    int currentY = i;
                    int currentX = j;
                    int count = 0;
                    while (true) {
                        currentX++;
                        count++;
                        if(currentX > x - 1){
                            break;
                        }
                        int num = answerArray[currentY][currentX];
                        if(num == 0){
                            break;
                        }
                        answerArray[currentY][currentX] = count;
                    }
                }
            }
        }
        

        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                bw.write(answerArray[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}