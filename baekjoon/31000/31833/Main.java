// https://www.acmicpc.net/problem/31833
// 온데간데없을뿐더러
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        String str1 = "";
        String str2 = "";
        long n1 = 0;
        long n2 = 0;
        for (int i = 0; i < sArray1.length; i++) {
            str1 += sArray1[i];
            str2 += sArray2[i];
        }
        n1 = Long.parseLong(str1);
        n2 = Long.parseLong(str2);
        System.out.println(Math.min(n1, n2));
        bw.flush();
        bw.close();
    }

    

}
