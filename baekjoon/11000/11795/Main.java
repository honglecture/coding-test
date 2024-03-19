// https://www.acmicpc.net/problem/11795
// Donation Packaging
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
        int[] array = new int[3];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[j] += Integer.parseInt(sArray[j]);
            }
            int min = Integer.min(Integer.min(array[0], array[1]), array[2]);
            if(min >= 30){
                bw.write(min + "\n");
                for (int j = 0; j < array.length; j++) {
                    array[j] -= min;
                }
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close(); 
    }

}