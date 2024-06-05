// https://www.acmicpc.net/problem/21966
// (중략)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        if(str.length() <= 25){
            System.out.println(str);
        } else {
            StringBuilder sb = new StringBuilder(str);
            sb.delete(sb.length() - 11, sb.length());
            sb.delete(0, 11);
            int length = sb.toString().split("\\.").length;
            if(length == 1){
                String answer = str.substring(0, 11) + "..." + str.substring(str.length() - 11, str.length());
                System.out.println(answer);
            } else {
                String answer = str.substring(0, 9) + "......" + str.substring(str.length() - 10, str.length());
                System.out.println(answer);
            }
        }
        bw.flush();
        bw.close();
    }

}
