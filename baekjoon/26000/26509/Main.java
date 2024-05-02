// https://www.acmicpc.net/problem/26509
// Triangle
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            boolean flag = true;
            String[] sArray = bf.readLine().split(" ");
            int[] array1 = new int[sArray.length];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = Integer.parseInt(sArray[j]);
            }
            sArray = bf.readLine().split(" ");
            int[] array2 = new int[sArray.length];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array1);
            Arrays.sort(array2);
            for (int j = 0; j < array2.length; j++) {
                if(array1[j] != array2[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                int n1 = array1[0] * array1[0];
                int n2 = array1[1] * array1[1];
                int n3 = array1[2] * array1[2];
                if(n1 + n2 == n3){
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
