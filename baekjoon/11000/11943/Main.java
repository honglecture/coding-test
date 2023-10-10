// https://www.acmicpc.net/problem/11943
// 파일 옮기기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray1[0]);
        int n2 = Integer.parseInt(sArray1[1]);
        int n3 = Integer.parseInt(sArray2[0]);
        int n4 = Integer.parseInt(sArray2[1]);
        int answer = Integer.min(n3 + n2, n1 + n4);
        bw.write(answer + "\n");
        bw.flush();
        bw.close(); 
    }

}