// https://www.acmicpc.net/problem/24072
// 計算 (Calculation)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Integer.parseInt(sArray[0]) + 0.5;
        double n2 = Integer.parseInt(sArray[1]);
        double n3 = Integer.parseInt(sArray[2]) + 0.5;
        if(n1 <= n3 && n2 >= n3){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
