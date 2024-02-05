// https://www.acmicpc.net/problem/29766
// DKSH 찾기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int size1 = str.length();
        int size2 = 0;
        str = str.replaceAll("DKSH", "");
        size2 = str.length();
        int result = (size1 - size2) / 4;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    

}
