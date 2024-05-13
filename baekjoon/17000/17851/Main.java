// https://www.acmicpc.net/problem/17851
// This Problem’s a Slam Dunk
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int answer = 0;
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = array1.length - 1; i >= 0; i--) {
            if(array1[i] > array2[i]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

   
}