// https://www.acmicpc.net/problem/16485
// 작도하자! - ②
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Integer.parseInt(sArray[0]);
        double n2 = Integer.parseInt(sArray[1]);
        double result = n1 / n2;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    


}
