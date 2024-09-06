// https://www.acmicpc.net/problem/20721
// Safe Squares
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[8][8];
        boolean[][] visitArray = new boolean[8][8];
        List<int[]> list = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("R")){
                    list.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            int y = temp[0];
            int x = temp[1];
            for (int j = 0; j < array.length; j++) {
                visitArray[y][j] = true;
            }
            for (int j = 0; j < array.length; j++) {
                visitArray[j][x] = true;
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            for (int j = 0; j < visitArray.length; j++) {
                if(!visitArray[i][j]){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
