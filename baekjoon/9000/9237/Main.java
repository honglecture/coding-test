// https://www.acmicpc.net/problem/9237
// 이장님 초대
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int answer = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            int n = array[i];
            int result = n + array.length - i + 1;
            if(answer < result){
                answer = result;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
