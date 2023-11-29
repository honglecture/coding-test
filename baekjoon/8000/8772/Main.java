// https://www.acmicpc.net/problem/8772
// Szyfr Cezara
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int size = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            String key = bf.readLine();
            StringBuilder answer = new StringBuilder();
            int keyChar = key.charAt(0);
            int headChar = str.charAt(0);
            int result = headChar - keyChar;
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j) - result;
                if(c < 97){
                    c += 26;
                } else if(c > 122){
                    c -= 26;
                }
                answer.append((char) c);
            }
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}