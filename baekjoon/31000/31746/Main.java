// https://www.acmicpc.net/problem/31746
// SciComLove (2024) 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder("SciComLove");
        if(n % 2 != 0){
            System.out.println(sb.reverse().toString());
        } else {
            System.out.println(sb.toString());
        }
        bw.flush();
        bw.close();
    }

    

}
