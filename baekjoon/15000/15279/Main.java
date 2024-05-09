// https://www.acmicpc.net/problem/15279
// Heart Rate
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            double result2 = (60 * n1) / n2;
            double result1 = result2 - (result2 / n1);
            double result3 = result2 + (result2 / n1);
            bw.write(result1 + " " + result2 + " " + result3 + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
