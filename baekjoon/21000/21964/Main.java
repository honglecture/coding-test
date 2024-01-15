// https://www.acmicpc.net/problem/21964
// 선린인터넷고등학교 교가
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        System.out.println(str.substring(str.length() - 5));
        bw.flush();
        bw.close();
    }

}
