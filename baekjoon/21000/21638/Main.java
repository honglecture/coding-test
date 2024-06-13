// https://www.acmicpc.net/problem/21638
// SMS from MCHS
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int[] array1 = new int[2];
        int[] array2 = new int[2];
        for (int i = 0; i < array2.length; i++) {
            array1[i] = Integer.parseInt(sArray1[i]);
            array2[i] = Integer.parseInt(sArray2[i]);
        }
        if(array2[0] < 0 && array2[1] >= 10){
            System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
        } else {
            if(array2[0] < array1[0]){
                System.out.println("MCHS warns! Low temperature is expected tomorrow.");
            } else {
                if(array2[1] > array1[1]){
                    System.out.println("MCHS warns! Strong wind is expected tomorrow.");
                } else {
                    System.out.println("No message");
                }
            }
        }

        bw.flush();
        bw.close();
    }

}
