// https://www.acmicpc.net/problem/1388
// 바닥 장식
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
        boolean[][] visitArray = new boolean[y][x];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray[i].length; j++) {
                if(!visitArray[i][j]){
                    visitArray[i][j] = true;
                    answer++;
                    if(array[i][j].equals("-")){
                        for (int k = j + 1; k < visitArray[0].length; k++) {
                            if(visitArray[i][k]){
                                break;
                            }
                            if(!array[i][k].equals("-")){
                                break;
                            }
                            visitArray[i][k] = true;
                        }
                    } else {
                        for (int k = i + 1; k < visitArray.length; k++) {
                            if(visitArray[k][j]){
                                break;
                            }
                            if(!array[k][j].equals("|")){
                                break;
                            }
                            visitArray[k][j] = true;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}