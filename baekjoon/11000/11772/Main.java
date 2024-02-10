// https://www.acmicpc.net/problem/11772
// POT
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int n1 = Integer.parseInt(str.substring(0, str.length() - 1));
            int n2 = Integer.parseInt(str.charAt(str.length() - 1) + "");
            sum += Math.pow(n1, n2);
        }
        System.out.println(sum);
        bw.flush();
        bw.close(); 
    }

}