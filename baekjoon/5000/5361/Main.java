// https://www.acmicpc.net/problem/5361
// 전투 드로이드 가격
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Integer.parseInt(sArray[0]) * 350.34;
            double n2 = Integer.parseInt(sArray[1]) * 230.90;
            double n3 = Integer.parseInt(sArray[2]) * 190.55;
            double n4 = Integer.parseInt(sArray[3]) * 125.30;
            double n5 = Integer.parseInt(sArray[4]) * 180.90;
            double result = n1 + n2 + n3 + n4 + n5;
            String answer = (Math.round(result * 100) / 100.0) + "";
            if(String.valueOf(answer).split("\\.")[1].length() == 1){
                answer += "0";
            }
            bw.write("$"+answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}