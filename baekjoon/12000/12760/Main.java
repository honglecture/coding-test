// https://www.acmicpc.net/problem/12760
// 최후의 승자는 누구?
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[][] array = new int[size1][size2];
        int[] sumArray = new int[size1];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array[i]);
        }
        for (int i = 0; i < array[0].length; i++) {
            List<Integer> maxIndexList = new ArrayList<>();
            int maxNum = 0;
            for (int j = 0; j < array.length; j++) {
                int n = array[j][i];
                if(maxNum < n){
                    maxIndexList.clear();
                    maxNum = n;
                    maxIndexList.add(j);
                } else if(maxNum == n){
                    maxIndexList.add(j);
                }
            }
            for (int j = 0; j < maxIndexList.size(); j++) {
                sumArray[maxIndexList.get(j)]++;
            }
        }
        int maxNum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            maxNum = Integer.max(maxNum, sumArray[i]);
        }
        for (int i = 0; i < sumArray.length; i++) {
            if(sumArray[i] == maxNum){
                bw.write((i + 1) + " ");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
