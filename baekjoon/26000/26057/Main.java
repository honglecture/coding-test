// https://www.acmicpc.net/problem/26057
// Большой удой
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int result =  n1 - n2;
        System.out.println(n2 - result);
        bw.flush();
        bw.close();
    }

}
