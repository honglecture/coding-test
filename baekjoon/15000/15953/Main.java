// https://www.acmicpc.net/problem/15953
// 상금 헌터
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] pArray1 = {1,2,3,4,5,6};
        int[] mArray1 = {5000000, 3000000, 2000000, 500000, 300000, 100000};
        int[] array1 = new int[21];
        int index = 0;
        for (int i = 0; i < pArray1.length; i++) {
            for (int j = 0; j < pArray1[i]; j++) {
                array1[index++] = mArray1[i];
            }
        }
        int[] pArray2 = {1,2,4,8,16};
        int[] mArray2 = {5120000, 2560000, 1280000, 640000, 320000};
        int[] array2 = new int[31];
        index = 0;
        for (int i = 0; i < pArray2.length; i++) {
            for (int j = 0; j < pArray2[i]; j++) {
                array2[index++] = mArray2[i];
            }
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int sum = 0;
            if(n1 != 0 && n1 <= array1.length){
                sum += array1[n1 - 1];
            }
            if(n2 != 0 && n2 <= array2.length){
                sum += array2[n2 - 1];
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}