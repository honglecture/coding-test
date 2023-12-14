// https://www.acmicpc.net/problem/1598
// 꼬리를 무는 숫자 나열
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
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int temp1 = (n1 - 1) / 4;
        int temp2 = (n2 - 1) / 4;
        int result1 = Math.abs(temp1 - temp2);
        temp1 = (n1 - 1) % 4;
        temp2 = (n2 - 1) % 4;
        int result2 = Math.abs(temp1 - temp2);
        System.out.println(result1 + result2);
        bw.flush();
        bw.close();
    }


}
