// https://www.acmicpc.net/problem/9954
// Cedric's Cypher
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            StringBuilder sb = new StringBuilder();
            String temp = String.valueOf(str.charAt(str.length() - 1));
            int key = temp.charAt(0) - 65;
            for (int i = 0; i < str.length() - 1; i++) {
                char c = str.charAt(i);
                if(c >= 65 && c <= 90){
                    c -= key;
                    if(c < 65){
                        c += 26;
                    }
                    sb.append(String.valueOf(c));
                } else if(c >= 97 && c <= 122){
                    c -= key;
                    if(c < 97){
                        c += 26;
                    }
                    sb.append(String.valueOf(c));
                } else {
                    sb.append(String.valueOf(c));
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}