// https://www.acmicpc.net/problem/3765
// Celebrity jeopardy
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}

