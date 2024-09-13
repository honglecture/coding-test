// https://www.acmicpc.net/problem/14916
// 거스름돈
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = Integer.MAX_VALUE;
        int count = 0;
        while (true) {
            int result = n - (count * 5);
            if(result < 0){
                break;
            }
            if(result % 2 == 0){
                int sum = (result / 2) + count;
                if(sum < answer){
                    answer = sum;
                }
            }
            count++;
        }
        if(answer == Integer.MAX_VALUE){
            answer = -1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
}