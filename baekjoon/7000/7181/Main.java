// https://www.acmicpc.net/problem/7181
// Mõttemeister
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String key = bf.readLine();
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int result1 = 0;
            int result2 = 0;
            boolean[] visitArray = new boolean[4];
            for (int j = 0; j < str.length(); j++) {
                char c1 = str.charAt(j);
                for (int k = 0; k < key.length(); k++) {
                    char c2 = key.charAt(k);
                    if(visitArray[k]){
                        continue;
                    }
                    if(c1 == c2){
                        visitArray[k] = true;
                        result1++;
                        break;
                    }
                }
            }
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == key.charAt(j)){
                    result2++;
                }
            }
            bw.write(result1 + " " + result2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}