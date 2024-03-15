// https://www.acmicpc.net/problem/27239
// Шахматная доска
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[][] array = new int[8][8];
        int count = 1;
        int y = 0;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] == n){
                    y = i;
                    x = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println((char)(97 + x) + "" + (y + 1));
        bw.flush();
        bw.close();
    }

    

}
