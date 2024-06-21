// https://www.acmicpc.net/problem/26314
// Vowel Count
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int count1 = 0;
            int count2 = 0;
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count1++;
                } else {
                    count2++;
                }
            }
            if(count1 > count2){
                bw.write(str + "\n");
                bw.write(1 + "\n");
            } else {
                bw.write(str + "\n");
                bw.write(0 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
