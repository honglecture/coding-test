// https://www.acmicpc.net/problem/10708
// 크리스마스 파티
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        int[] scoreArray = new int[n];
        String[] sArray = bf.readLine().split(" ");
        int[] targetArray = new int[size];
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int target = targetArray[i];
            for (int j = 0; j < sArray.length; j++) {
                int select = Integer.parseInt(sArray[j]);
                if(target == select){
                    scoreArray[j]++;
                } else {
                    scoreArray[target - 1]++;
                }
            }
        }
        for (int i = 0; i < scoreArray.length; i++) {
            bw.write(scoreArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}