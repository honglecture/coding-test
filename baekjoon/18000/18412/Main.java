// https://www.acmicpc.net/problem/18412
// 文字列の反転 (Inversion of a String)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]) - 1;
        int n3 = Integer.parseInt(sArray[2]) - 1;
        String str = bf.readLine();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        
        str1 = str.substring(0, n2);
        str2 = new StringBuilder(str.substring(n2, n3 + 1)).reverse().toString();
        str3 = str.substring(n3 + 1, str.length());
        System.out.println(str1 + str2 + str3);
        bw.flush();
        bw.close();
    }

}
