// https://www.acmicpc.net/problem/12931
// 두 배 더하기
import java.io.*;
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
        while (true) {
            boolean flag = true;
            for (int i = 0; i < array.length; i++) {
                if(array[i] > 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                break;
            }
            answer++;
            flag = true;
            for (int i = 0; i < array.length; i++) {
                int n = array[i];
                if(n == 0){
                    continue;
                }
                if(n % 2 != 0){
                    array[i]--;
                    flag = false;
                    break;
                }
            }
            if(flag){
                for (int i = 0; i < array.length; i++) {
                    array[i] /= 2;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}