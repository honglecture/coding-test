// https://www.acmicpc.net/problem/13775
// Virus
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()) - 1;
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            
            if(index >= 97 && index <= 122){
                n++;
                if(n > 25){
                    n = 1;
                }
                index -= n;
                if(index < 97){
                    index += 26;
                }
                answer += String.valueOf((char) index);
            } else {
                answer += String.valueOf((char) index);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}