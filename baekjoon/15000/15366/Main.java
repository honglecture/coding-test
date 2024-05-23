// https://www.acmicpc.net/problem/15366
// Olivander
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean answer = true;
        int size = Integer.parseInt(bf.readLine());
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for (int i = 0; i < array2.length; i++) {
            array1[i] = Integer.parseInt(sArray1[i]);
            array2[i] = Integer.parseInt(sArray2[i]);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            int n1 = array1[i];
            int n2 = array2[i];
            if(n1 > n2){
                answer = false;
                break;
            }
        }
        if(answer){
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
        bw.flush();
        bw.close();
    }

    
}
