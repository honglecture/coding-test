// https://www.acmicpc.net/problem/31261
// НАМИСЛИХ СИ ЧИСЛО
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int a = Integer.parseInt(sArray[0]);
        int b = Integer.parseInt(sArray[1]);
        int result = (b + a) * a;
        result = (result + a) * a;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    

}
