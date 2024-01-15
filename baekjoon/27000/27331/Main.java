// https://www.acmicpc.net/problem/27331
// 2 桁の整数 (Two-digit Integer)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        System.out.println(str1 + str2);
        bw.flush();
        bw.close();
    }

    

}
