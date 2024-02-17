// https://www.acmicpc.net/problem/14175
// The Cow-Signal
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int n = Integer.parseInt(sArray[2]);
        String[][] array = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    str += array[i][j];
                }
            }
            for (int j = 0; j < n; j++) {
                bw.write(str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }


}