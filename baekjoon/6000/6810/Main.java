// https://www.acmicpc.net/problem/6810
// ISBN
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int sum = (n1 * 1) + (n2 * 3) + (n3 * 1) + 91;
        System.out.println("The 1-3-sum is " + sum);
        bw.flush();
        bw.close();
    }

    
}