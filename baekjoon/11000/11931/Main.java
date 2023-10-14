// https://www.acmicpc.net/problem/11931
// 수 정렬하기 4
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
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }        
        Arrays.sort(array);
        for (int i = array.length -1; i >= 0; i--) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close(); 
    }

}