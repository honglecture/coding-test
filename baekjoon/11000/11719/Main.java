// https://www.acmicpc.net/problem/11719
// 그대로 출력하기 2
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        while(true){
            if(str == null){
                break;
            }
            bw.write(str+"\n");
            str = bf.readLine();
        }
        bw.flush();
        bw.close();
    }
}