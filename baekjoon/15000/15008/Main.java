// https://www.acmicpc.net/problem/15008
// Falling Apart
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer1 = 0;
        int answer2 = 0;
        boolean flag = true;
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if(flag){
                answer1 += array[i];
                flag = false;
            } else {
                answer2 += array[i];
                flag = true;
            }
        }
        bw.write(answer1 + " " + answer2 + "\n");
        bw.flush();
        bw.close();
    }

    
}
