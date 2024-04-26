// https://www.acmicpc.net/problem/23303
// 이 문제는 D2 입니다.
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.contains("d2") || str.contains("D2")){
            System.out.println("D2");
        } else {
            System.out.println("unrated");
        }
        bw.flush();
        bw.close();
    }
    

}
