// https://www.acmicpc.net/problem/11365
// !밀비 급일
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringBuilder str = new StringBuilder(bf.readLine());
            if(str.toString().equals("END")){
                break;
            }
            bw.write(str.reverse() + "\n");
        }

        bw.flush();
        bw.close();
    }
}