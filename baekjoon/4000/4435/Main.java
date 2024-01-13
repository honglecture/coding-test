// https://www.acmicpc.net/problem/4435
// 중간계 전쟁
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
        int[] array1 = {1,2,3,3,4,10};
        int[] array2 = {1,2,2,2,3,5,10};
        for (int i = 0; i < size; i++) {
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < sArray1.length; j++) {
                int n = Integer.parseInt(sArray1[j]);
                count1 += array1[j] * n;
            }
            for (int j = 0; j < sArray2.length; j++) {
                int n = Integer.parseInt(sArray2[j]);
                count2 += array2[j] * n;
            }
            if(count1 > count2){
                bw.write("Battle "+(i + 1)+": Good triumphs over Evil\n");
            } else if(count1 < count2){
                bw.write("Battle "+(i + 1)+": Evil eradicates all trace of Good\n");
            } else {
                bw.write("Battle "+(i + 1)+": No victor on this battle field\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
