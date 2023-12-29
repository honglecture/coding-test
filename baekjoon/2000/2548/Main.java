// https://www.acmicpc.net/problem/2548
// 대표 자연수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i];
            int result = 0;
            for (int j = 0; j < array.length; j++) {
                int n2 = array[j];
                result += Math.abs(n1 - n2);
            }
            if(result < sum){
                sum = result;
                answer = n1;
            } else if(result == sum){
                if(n1 < answer){
                    answer = n1;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}