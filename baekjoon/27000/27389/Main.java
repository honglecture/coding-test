// https://www.acmicpc.net/problem/27389
// Metronome
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Integer.parseInt(bf.readLine());
        double d = n / 4;
        String result = String.format("%.2f", d);
        if(result.split("\\.")[1].charAt(1) == '0'){
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    

}
