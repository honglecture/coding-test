// https://www.acmicpc.net/problem/15814
// 야바위 대장
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str = new StringBuilder(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            char c1 = str.charAt(n1);
            char c2 = str.charAt(n2);
            str.setCharAt(n1, c2);
            str.setCharAt(n2, c1);
        }
        System.out.println(str.toString());
        bw.flush();
        bw.close();
    }

    
}