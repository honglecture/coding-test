// https://www.acmicpc.net/problem/17173
// 배수들의 합
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if(i % array[j] == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                answer += i;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
