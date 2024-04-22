// https://www.acmicpc.net/problem/21734
// SMUPC의 등장
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            String n = String.valueOf((int)str.charAt(i));
            String s = String.valueOf(str.charAt(i));
            int count = 0;
            String result = "";
            for (int j = 0; j < n.length(); j++) {
                count += Integer.parseInt(n.charAt(j) + "");
            }
            for (int j = 0; j < count; j++) {
                result += s;
            }
            bw.write(result  + "\n");
        }
        bw.flush();
        bw.close();
    }

}
