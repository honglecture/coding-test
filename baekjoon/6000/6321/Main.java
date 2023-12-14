// https://www.acmicpc.net/problem/6321
// IBM 빼기 1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j) + 1;
                if(c == 91){
                    c = 65;
                }
                result += (char) c;
            }
            bw.write("String #" + (i + 1) + "\n");
            bw.write(result +"\n");
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
   
}