// https://www.acmicpc.net/problem/17388
// 와글와글 숭고한
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        if(n1 + n2 + n3 >= 100){
            bw.write("OK\n");
        } else {
            int min = Integer.min(n1, Integer.min(n2, n3));
            if(min == n1){
                bw.write("Soongsil\n");
            } else if(min == n2){
                bw.write("Korea\n");
            }  else {
                bw.write("Hanyang\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
