// https://www.acmicpc.net/problem/28062
// 준석이의 사탕 사기
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        if(size % 2 == 0){
            for (int i = array.length - 1; i >= 0; i--) {
                answer += array[i];
            }
        } else {
            for (int i = array.length - 1; i >= 1; i--) {
                answer += array[i];
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
