// https://www.acmicpc.net/problem/10185
// Focus
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            double result1 = n1 * n2;
            double result2 = (result1 / n1) + (result1 / n2);
            double result3 = result1 / result2;
            String answer = String.format("%.1f", result3);
            bw.write("f = " + answer  + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}


