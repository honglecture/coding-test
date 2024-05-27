// https://www.acmicpc.net/problem/5678
// Bakugan
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            int answer1 = 0;
            int answer2 = 0;
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            int[] array1 = new int[sArray1.length];
            int[] array2 = new int[sArray2.length];
            for (int i = 0; i < array2.length; i++) {
                array1[i] = Integer.parseInt(sArray1[i]);
                array2[i] = Integer.parseInt(sArray2[i]);
            }
            for (int i = 0; i < array2.length; i++) {
                answer1 += array1[i];
                answer2 += array2[i];
            }
            for (int i = 0; i < array2.length - 2; i++) {
                boolean flag1 = false;
                boolean flag2 = false;
                if(array1[i] == array1[i + 1] && array1[i + 1] == array1[i + 2]){
                    flag1 = true;
                }
                if(array2[i] == array2[i + 1] && array2[i + 1] == array2[i + 2]){
                    flag2 = true;
                }
                if(flag1 && !flag2){
                    answer1 += 30;
                    break;
                } else if(!flag1 && flag2){
                    answer2 += 30;
                    break;
                } else if(flag1 && flag2){
                    break;
                }
            }
            if(answer1 > answer2){
                bw.write("M\n");
            } else if(answer1 <  answer2){
                bw.write("L\n");
            } else {
                bw.write("T\n");
            }
        }
        bw.flush();
        bw.close();
    }
}