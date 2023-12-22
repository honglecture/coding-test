// https://www.acmicpc.net/problem/1871
// 좋은 자동차 번호판
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
            String[] sArray = bf.readLine().split("-");
            String str = sArray[0];
            int num1 = Integer.parseInt(sArray[1]);
            int num2 = 0;
            for (int j = 0; j < str.length(); j++) {
                int n1 = str.charAt(j) - 65;
                int n2 =(int) Math.pow(26, str.length() - 1 - j);
                num2 += n1 * n2;
            }
            if(Math.abs(num1 - num2) <= 100){
                bw.write("nice\n");
            } else {
                bw.write("not nice\n");
            }
        }
        bw.flush();
        bw.close();
    }


}
