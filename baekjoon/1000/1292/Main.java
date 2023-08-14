// https://www.acmicpc.net/problem/1292
// 쉽게 푸는 문제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        int startNum = 1;
        int count = 1;
        int sum = 0;
        while(true){
            boolean flag = true;
            for (int i = 1; i <= startNum; i++) {
                if(count > end){
                    flag = false;
                    break;
                }
                if(start <= count && end >= count){
                    sum += startNum;
                }
                count++;
            }
            if(!flag){
                break;
            }
            startNum++;
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}