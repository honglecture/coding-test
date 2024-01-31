// https://www.acmicpc.net/problem/16479
// 컵라면 측정하기
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double k = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        double d1 = Integer.parseInt(sArray[0]);
        double d2 = Integer.parseInt(sArray[1]);
        double n1 = (d1 - d2) / 2;
        double n2 = k * k;
        double n3 = n1 * n1;
        double n4 = n2 - n3;
        System.out.println(n4);
        bw.flush();
        bw.close();
    }

    


}
