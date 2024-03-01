// https://www.acmicpc.net/problem/24568
// Cupcake Party
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine()) * 8;
        int n2 = Integer.parseInt(bf.readLine()) * 3;
        int sum = n1 + n2;
        int answer = sum - 28;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
