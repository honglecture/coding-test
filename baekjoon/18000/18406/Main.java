// https://www.acmicpc.net/problem/18406
// 럭키 스트레이트
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            sum1 += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = str.length() / 2; i < str.length(); i++) {
            sum2 += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        if(sum1 == sum2){
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
        bw.flush();
        bw.close();
    }

}
