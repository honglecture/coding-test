// https://www.acmicpc.net/problem/1074
// Z
import java.io.*;
public class Main {

    private static int[][] array;
    private static int targetY;
    private static int targetX;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        targetY = Integer.parseInt(sArray[1]);
        targetX = Integer.parseInt(sArray[2]);
        array = new int[(int)Math.pow(2, n1)][(int)Math.pow(2, n1)];

        int count = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            for (int j = 0; j < array.length; j = j + 2) {
                array[i][j] = count;
                count += 4;
            }
        }

        for (int i = 0; i < array.length; i = i + 2) {
            for (int j = 0; j < array.length; j = j + 2) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        bw.flush();
        bw.close();
    }


    
}