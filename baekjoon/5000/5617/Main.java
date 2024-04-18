// https://www.acmicpc.net/problem/5617
// 問題 1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            String[] sArray = str.split(" ");
            int[] array = {Integer.parseInt(sArray[0]), Integer.parseInt(sArray[1]), Integer.parseInt(sArray[2])};
            Arrays.sort(array);
            int n1 = array[0];
            int n2 = array[1];
            int n3 = array[2];
            int sum1 = n1 + n2;
            int sum2 = n1 + n3;
            int sum3 = n2 + n3;
            if(sum1 > n3 && sum2 > n2 && sum3 > n1){
                count1++;
                int result1 = (n1 * n1) + (n2 * n2);
                int result2 = (n3 * n3);
                if(result1 > result2){
                    count3++;
                } else if(result1 < result2){
                    count4++;
                } else {
                    count2++;
                }
            } else {
                break;
            }
        }
        bw.write(count1 + " " + count2 + " " + count3 + " " + count4 + "\n");
        bw.flush();
        bw.close();
    }
}