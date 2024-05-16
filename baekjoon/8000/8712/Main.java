// https://www.acmicpc.net/problem/8712
// Wężyk
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][size];
        int count = 1;
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if(flag){
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = count++;
                }
                flag = false;
            } else {
                for (int j = array.length - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
                flag = true;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                bw.write(array[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
   
}