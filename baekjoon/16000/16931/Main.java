// https://www.acmicpc.net/problem/16931
// 겉넓이 구하기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int sum = (y * x) * 2;
        for (int i = 0; i < array.length; i++) {
            int innerSum = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                int n1 = array[i][j - 1];
                int n2 = array[i][j];
                if(n1 > n2){
                    innerSum += n1 - n2;
                }
            }
            sum += innerSum;
        }
        for (int i = 0; i < array.length; i++) {
            int innerSum = array[i][array[0].length - 1];
            for (int j = array[0].length - 2; j >= 0; j--) {
                int n1 = array[i][j + 1];
                int n2 = array[i][j];
                if(n1 > n2){
                    innerSum += n1 - n2;
                }
            }
            sum += innerSum;
        }
        for (int i = 0; i < array[0].length; i++) {
            int innerSum = array[0][i];
            for (int j = 1; j < array.length; j++) {
                int n1 = array[j - 1][i];
                int n2 = array[j][i];
                if(n1 > n2){
                    innerSum += n1 - n2;
                }
            }
            sum += innerSum;
        }
        for (int i = 0; i < array[0].length; i++) {
            int innerSum = array[array.length - 1][i];
            for (int j = array.length - 2; j >= 0; j--) {
                int n1 = array[j + 1][i];
                int n2 = array[j][i];
                if(n1 > n2){
                    innerSum += n1 - n2;
                }
            }
            sum += innerSum;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }
    
}
