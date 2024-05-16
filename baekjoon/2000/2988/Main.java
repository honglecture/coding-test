// https://www.acmicpc.net/problem/2988
// 아보가드로
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[3][size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array[i]);
        }
        for (int i = 0; i < array[0].length; i++) {
            int n1 = array[0][i];
            int n2 = array[1][i];
            int n3 = array[2][i];
            if(n1 != n2 || n2 != n3){
                answer++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}