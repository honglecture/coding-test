// https://www.acmicpc.net/problem/31617
// 差 (Difference)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int key = Integer.parseInt(bf.readLine());
        int size1 = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
        }
        int size2 = Integer.parseInt(bf.readLine());
        sArray = bf.readLine().split(" ");
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int n1 = array1[i];
                int n2 = array2[j];
                if(n1 + key == n2){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
