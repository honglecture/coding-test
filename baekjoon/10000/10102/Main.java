// https://www.acmicpc.net/problem/10102
// 개표
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A'){
                n1++;
            } else {
                n2++;
            }
        }
        if(n1 > n2){
            bw.write("A\n");
        } else if(n2 > n1){
            bw.write("B\n");
        } else {
            bw.write("Tie\n");
        }
        bw.flush();
        bw.close();
    }
}