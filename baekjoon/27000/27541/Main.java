// https://www.acmicpc.net/problem/27541
// 末尾の文字 (Last Letter)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        char c = str.charAt(str.length() - 1);
        if(c == 'G'){
            System.out.println(str.substring(0, str.length() - 1));
        } else {
            System.out.println(str + "G");
        }
        bw.flush();
        bw.close();
    }

    

}
