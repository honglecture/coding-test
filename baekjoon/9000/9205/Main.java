// https://www.acmicpc.net/problem/9205
// 맥주 마시면서 걸어가기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            int[][] array = new int[2 + size][2];
            array[0][0] = Integer.parseInt(sArray[0]);
            array[0][1] = Integer.parseInt(sArray[1]);
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                array[j + 1][0] = Integer.parseInt(sArray[0]);
                array[j + 1][1] = Integer.parseInt(sArray[1]);
            }
            sArray = bf.readLine().split(" ");
            array[array.length - 1][0] = Integer.parseInt(sArray[0]);
            array[array.length - 1][1] = Integer.parseInt(sArray[1]);
            boolean flag = true;
            for (int j = 1; j < array.length; j++) {
                int[] array1 = array[j - 1];
                int[] array2 = array[j];
                int result = Math.abs(array1[0] - array2[0]) + Math.abs(array1[1] - array2[1]);
                int cost = result;
                if(cost >= 20 * 50 - 19){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("happy\n");
            } else {
                bw.write("sad\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
