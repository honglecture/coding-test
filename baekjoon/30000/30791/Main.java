// https://www.acmicpc.net/problem/30791
// gahui and sousenkyo 1
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int max = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            if(max - 1000 <= array[i]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
