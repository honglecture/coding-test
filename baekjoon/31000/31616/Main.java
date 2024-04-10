// https://www.acmicpc.net/problem/31616
// 揃った文字 (Matched Letters) 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        boolean flag = true;
        for (int i = 1; i < str.length(); i++) {
            char c1 = str.charAt(i - 1);
            char c2 = str.charAt(i);
            if(c1 != c2){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

    

}
