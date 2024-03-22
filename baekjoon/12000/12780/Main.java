// https://www.acmicpc.net/problem/12780
// 원피스
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int size1 = str1.length();
        int size2 = str1.replaceAll(str2, "").length();
        int result = (size1 - size2) / str2.length();
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
