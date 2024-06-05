// https://www.acmicpc.net/problem/11256
// 사탕
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int keyNum = Integer.parseInt(sArray[0]);
            int size = Integer.parseInt(sArray[1]);
            int[] array = new int[size];
            int answer = 0;
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                int result = Integer.parseInt(sArray[0]) * Integer.parseInt(sArray[1]);
                array[j] = result;
            }
            Arrays.sort(array);
            for (int j = array.length - 1; j >= 0; j--) {
                answer++;
                keyNum -= array[j];
                if(keyNum <= 0){
                    break;
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    
}