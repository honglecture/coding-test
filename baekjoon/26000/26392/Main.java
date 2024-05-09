// https://www.acmicpc.net/problem/26392
// Desni klik
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]);
        int x = Integer.parseInt(sArray[2]);
        for (int i = 0; i < size; i++) {
            String[][] array = new String[y][x];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = sArray[k];
                }
            }
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    String str = array[k][j];
                    if(str.equals("#")){
                        int result = y - k;
                        max = Integer.max(max, result);
                        min = Integer.min(min, result);
                        break;
                    }
                }
            }
            bw.write((max - min) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
