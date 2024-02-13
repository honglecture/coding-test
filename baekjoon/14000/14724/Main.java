// https://www.acmicpc.net/problem/14724
// 관리자는 누구?
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[9][size];
        String[] answerArray = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int maxNum = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int[] tempArray = new int[size];
            for (int j = 0; j < array[i].length; j++) {
                tempArray[j] = array[i][j];
            }
            Arrays.sort(tempArray);
            int n = tempArray[size - 1];
            if(maxNum < n){
                maxNum = n;
                maxIndex = i;
            }
        }
        System.out.println(answerArray[maxIndex]);
        bw.flush();
        bw.close();
    }

    
}