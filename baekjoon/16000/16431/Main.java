// https://www.acmicpc.net/problem/16431
// 베시와 데이지
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int by = Integer.parseInt(sArray[0]);
        int bx = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int dy = Integer.parseInt(sArray[0]);
        int dx = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");

        int jy = Integer.parseInt(sArray[0]);
        int jx = Integer.parseInt(sArray[1]);

        int result1 = 0;
        int sum1 = Math.abs(jy - by);
        int sum2 = Math.abs(jx - bx);
        if(sum1 > sum2){
            result1 = (sum1 - sum2) + sum2;
        } else if(sum1 < sum2){
            result1 = (sum2 - sum1) + sum1;
        } else {
            result1 = sum1;
        }
        int result2 = Math.abs(jy - dy) + Math.abs(jx - dx);
        if(result1 < result2){
            bw.write("bessie\n");
        } else if(result1 > result2){
            bw.write("daisy\n");
        } else {
            bw.write("tie\n");
        }

        bw.flush();
        bw.close();
    }

    


}
