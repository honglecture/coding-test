// https://www.acmicpc.net/problem/4714
// Lunacy
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("-1.0")){
                break;
            }
            String result1 = String.format("%.2f", Double.parseDouble(str));
            double n1 = Double.parseDouble(str) * 0.167;
            String result2 = String.format("%.2f", n1);
            bw.write("Objects weighing "+result1+" on Earth will weigh "+result2+" on the moon.\n");
        }
        bw.flush();
        bw.close();
    }
    
}