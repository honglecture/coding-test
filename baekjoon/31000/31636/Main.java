// https://www.acmicpc.net/problem/31636
// 三連続 (Three Consecutive)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        if(str.contains("ooo")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

    

}
