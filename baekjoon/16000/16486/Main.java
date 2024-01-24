// https://www.acmicpc.net/problem/16486
// 운동장 한 바퀴
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n1 = Integer.parseInt(bf.readLine());
        double n2 = Integer.parseInt(bf.readLine());
        double sum1 = n1 + n1;
        double sum2 = 2 * n2 * 3.141592;
        System.out.println(sum1 + sum2);
        bw.flush();
        bw.close();
    }

    


}
