// https://www.acmicpc.net/problem/14405
// 피카츄
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        str = str.replaceAll("pi", "  ");
        str = str.replaceAll("ka", "  ");
        str = str.replaceAll("chu", "   ");
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }


}