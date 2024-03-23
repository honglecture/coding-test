// https://www.acmicpc.net/problem/15272
// Hissing Microphone
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.contains("ss")){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
        bw.flush();
        bw.close();
    }

    
}
