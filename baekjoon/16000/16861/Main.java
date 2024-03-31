// https://www.acmicpc.net/problem/16861
// Harshad Numbers
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        while (true) {
            String str = String.valueOf(n);
            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                result += Integer.parseInt(str.charAt(i) + "");
            }
            if(n % result == 0){
                break;
            }
            n++;
        }
        System.out.println(n);
        bw.flush();
        bw.close();
    }


}
