// https://www.acmicpc.net/problem/25849
// Briefcases Full of Money
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = {1, 5, 10, 20, 50, 100};
        int[] sumArray = new int[array.length];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = Integer.parseInt(sArray[i]) * array[i];
        }
        int maxNum = 0;
        int minCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if(maxNum < sumArray[i]){
                maxNum = sumArray[i];
                maxIndex = i;
                minCount = Integer.parseInt(sArray[i]);
            } else if(maxNum == sumArray[i]){
                if(minCount > Integer.parseInt(sArray[i])){
                    minCount = Integer.parseInt(sArray[i]);
                    maxIndex = i;
                }
            }
        }
        System.out.println(array[maxIndex]);
        bw.flush();
        bw.close();
    }

}
