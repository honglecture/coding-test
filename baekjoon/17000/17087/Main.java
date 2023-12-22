// https://www.acmicpc.net/problem/17087
// 숨바꼭질 6
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int start = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(Integer.parseInt(sArray[i]) - start);
        }
        Arrays.sort(array);
        int n = array[array.length - 1];
        int answer = 1;
        for (int i = n; i >= 1; i--) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(array[j] % i != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer = i;
                break;
            }
        }
        bw.write(answer  +"\n");
        bw.flush();
        bw.close();
    }

}
