// https://www.acmicpc.net/problem/13580
// Andando no tempo
import java.io.*;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        if(array[0] == array[1] || array[1] == array[2]){
            System.out.println("S");
        } else {
            if(array[0] + array[1] == array[2]){
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
        bw.flush();
        bw.close();
    }

}