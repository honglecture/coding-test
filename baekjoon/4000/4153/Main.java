// https://www.acmicpc.net/problem/4153
// 직각삼각형
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
        while(true){
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[3];
            array[0] = Integer.parseInt(sArray[0]);
            array[1] = Integer.parseInt(sArray[1]);
            array[2] = Integer.parseInt(sArray[2]);
            if(array[0] == 0 && array[1] == 0 && array[2] == 0){
                break;
            }
            Arrays.sort(array);
            if((array[0] * array[0]) + (array[1] * array[1]) == array[2] * array[2]){
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
        bw.close();
    }
}