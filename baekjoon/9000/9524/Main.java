// https://www.acmicpc.net/problem/9524
// Beautiful Yekaterinburg
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "1723";
        int index = Integer.parseInt(bf.readLine()) - 1;
        System.out.println(String.valueOf(str.charAt(index)));
        bw.flush();
        bw.close();
    }
   

}

