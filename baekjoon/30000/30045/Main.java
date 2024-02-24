// https://www.acmicpc.net/problem/30033
// Rust Study
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray2[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] <= array2[i]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
