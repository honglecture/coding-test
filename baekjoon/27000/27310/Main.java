// https://www.acmicpc.net/problem/27310
// :chino_shock:
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int count1 = 0;
        int count2 = 0;
        int count3 = str.length();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ':'){
                count1++;
            } else if(c == '_'){
                count2++;
            }
        }
        count2 *= 5;
        System.out.println(count1 + count2 + count3);
        bw.flush();
        bw.close();
    }

    

}
