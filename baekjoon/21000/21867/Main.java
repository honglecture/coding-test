// https://www.acmicpc.net/problem/21867
// Java Bitecode
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'J' || c == 'A' || c == 'V'){
                continue;
            }
            sb.append(String.valueOf(c));
        }
        if(sb.toString().length() == 0){
            System.out.println("nojava");
        } else {
            System.out.println(sb.toString());
        }
        bw.flush();
        bw.close();
    }

}
