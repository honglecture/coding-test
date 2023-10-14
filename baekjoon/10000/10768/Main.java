// https://www.acmicpc.net/problem/10768
// 특별한 날
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        if(m == 2 && d == 18){
            bw.write("Special\n");
        } else {
            if(m < 2){
                bw.write("Before\n");
            } else if(m > 2) {
                bw.write("After\n");
            } else {
                if(d < 18){
                    bw.write("Before\n");
                } else {
                    bw.write("After\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}