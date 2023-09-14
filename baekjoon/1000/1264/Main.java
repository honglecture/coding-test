// https://www.acmicpc.net/problem/1264
// 모음의 개수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            str = str.toLowerCase();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}