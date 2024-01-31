// https://www.acmicpc.net/problem/16483
// 접시 안의 원
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Double.parseDouble(bf.readLine()) / 2;
        double result = n * n;
        int answer = (int) Math.round(result);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    


}
