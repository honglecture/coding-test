// https://www.acmicpc.net/problem/14566
// Dongjak N1
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int key = array[j] - array[i];
                if(min > key){
                    min = key;
                    count = 1;
                } else if(min == key){
                    count++;
                }
            }
        }
        System.out.println(min + " " + count + "\n");
        bw.flush();
        bw.close();
    }

    

}