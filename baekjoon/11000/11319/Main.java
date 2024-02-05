// https://www.acmicpc.net/problem/11319
// Count Me In
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine().toUpperCase();
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ' '){
                    continue;
                }
                char c = str.charAt(j);
                if(c == 'A' || c == 'E'|| c == 'I'|| c == 'O'|| c == 'U'){
                    count2++;
                } else {
                    count1++;
                }
            }
            bw.write(count1 + " " + count2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}