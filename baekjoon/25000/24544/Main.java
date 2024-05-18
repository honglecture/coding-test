// https://www.acmicpc.net/problem/24544
// 카카오뷰 큐레이팅 효용성 분석
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] == 0){
                sum2 += array1[i];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        bw.flush();
        bw.close();
    }

}
