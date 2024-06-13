// https://www.acmicpc.net/problem/5666
// Hot Dogs
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
            if(str == null || str.equals("")){
                break;
            }
            String[] sArray = str.split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            double result = n1 / n2;
            bw.write(String.format("%.2f", result) + "\n");
        }
        bw.flush();
        bw.close();
    }
}