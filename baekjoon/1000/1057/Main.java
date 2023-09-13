// https://www.acmicpc.net/problem/1057
// 토너먼트
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int answer = 1;
        int n = 2;
        while(true){
            boolean flag = false;
            int start = 1;
            int end = start + n - 1;
            while(true){
                if(start <= n2 && end >= n2 && start <= n3 && end >= n3){
                    flag = true;
                    break;
                }
                start += n;
                end = start + n - 1;
                if(start > n1){
                    break;
                }
            }
            if(flag){
                break;
            }
            answer++;
            n *= 2;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}