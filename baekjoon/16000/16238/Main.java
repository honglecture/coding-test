// https://www.acmicpc.net/problem/16238
// 독수리
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int answer = 0;
        while (true) {
            boolean flag = false;
            for (int i = array.length - 1; i >= 0; i--) {
                if(array[i] != 0){
                    flag = true;
                    answer += array[i];
                    array[i] = 0;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for (int i = 0; i < array.length; i++) {
                if(array[i] != 0){
                    array[i]--;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
