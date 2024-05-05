// https://www.acmicpc.net/problem/14472
// 休憩スペース (Refreshment Area)
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int key = Integer.parseInt(sArray[2]);
        String[][] array = new String[y][x];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals("#")){
                    continue;
                }
                int endY = i + key - 1;
                int endX = j + key - 1;
                if(endY <= y - 1){
                    boolean flag = true;
                    for (int k = i; k <= endY; k++) {
                        if(array[k][j].equals("#")){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        answer++;
                    }
                }
                if(endX <= x - 1){
                    boolean flag = true;
                    for (int k = j; k <= endX; k++) {
                        if(array[i][k].equals("#")){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}