// https://www.acmicpc.net/problem/31306
// Is Y a Vowel?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count1++;
            } else if(c == 'y'){
                count2++;
            }
        }
        System.out.println(count1 + " " + (count1 +count2));
        bw.flush();
        bw.close();
    }

    

}
