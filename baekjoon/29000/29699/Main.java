// https://www.acmicpc.net/problem/29699
// Welcome to SMUPC!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "WelcomeToSMUPC";
        int n = Integer.parseInt(bf.readLine()) - 1;
        // 14
        System.out.println(str.charAt(n % 14));
        bw.flush();
        bw.close();
    }

    

}
