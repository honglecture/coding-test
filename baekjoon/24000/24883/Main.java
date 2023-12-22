// https://www.acmicpc.net/problem/24883
// 자동완성
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.equals("n") || str.equals("N")){
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
        bw.flush();
        bw.close();
    }

    

}
