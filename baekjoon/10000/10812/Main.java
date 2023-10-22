// https://www.acmicpc.net/problem/10812
// 바구니 순서 바꾸기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array = new int[size1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]) - 1;
            int n3 = Integer.parseInt(sArray[2]) - 1;
            int[] innerArray = new int[n2 - n1 + 1];
            int index = 0;
            for (int j = n3; j <= n2; j++) {
                innerArray[index++] = array[j];
            }
            for (int j = n1; j < n3; j++) {
                innerArray[index++] = array[j];
            }
            index = n1;
            for (int j = 0; j < innerArray.length; j++) {
                array[index++] = innerArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}