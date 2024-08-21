// https://www.acmicpc.net/problem/24074
// 分割 (Split)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int maxIndex = 0;
        int maxNum = -1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(maxNum < array[i]){
                maxNum = array[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < maxIndex; i++) {
            sum1 += array[i];
        }
        for (int i = maxIndex + 1; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
        bw.flush();
        bw.close();
    }

}
