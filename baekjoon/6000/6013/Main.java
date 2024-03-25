// https://www.acmicpc.net/problem/6013
// Lonesome Partners
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int maxNum = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 0; i < size - 1; i++) {
            int n1 = array[i][0];
            int n2 = array[i][1];
            for (int j = i + 1; j < size; j++) {
                int n3 = array[j][0];
                int n4 = array[j][1];
                int result = Math.abs(n1 - n3) + Math.abs(n2 - n4);
                if(result > maxNum){
                    maxNum = result;
                    index1 = i + 1;
                    index2 = j + 1;
                }
            }
        }
        System.out.println(Integer.min(index1, index2) + " " + Integer.max(index1, index2));
        bw.flush();
        bw.close();
    }

}