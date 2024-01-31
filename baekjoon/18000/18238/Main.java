// https://www.acmicpc.net/problem/18238
// ZOAC 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int n = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int nextN = str.charAt(i) - 65;
            int n1 = Math.abs(n - nextN + 25);
            int n2 = Math.abs(nextN - n);
            System.out.println(nextN + " " + n1 + " " + n2);
            if(n1 > n2){
                count += n2;
            } else if(n1 < n2){
                count += n1;
            } else {
                count += n1;
            }
            n = nextN;
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
