// https://www.acmicpc.net/problem/15680
// 연세대학교
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n == 0){
            bw.write("YONSEI\n");
        } else{
            bw.write("Leading the Way to the Future\n");
        }
        bw.flush();
        bw.close();
    }

}