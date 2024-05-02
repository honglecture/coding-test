// https://www.acmicpc.net/problem/24077
// 比較 (Comparison)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int answer = 0;
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            int n1 = array1[i];
            for (int j = 0; j < array2.length; j++) {
                int n2 = array2[j];
                if(n1 <= n2){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
