// https://www.acmicpc.net/problem/27329
// 繰り返し文字列 (Repeating String)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String str1 = str.substring(0, size / 2);
        String str2 = str.substring(size / 2, size);
        if(str1.equals(str2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

    

}
