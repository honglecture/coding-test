// https://www.acmicpc.net/problem/13216
// Badminton
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int count1 = 0;
        int count2 = 0;
        int set1 = 0;
        int set2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A'){
                count1++;
            } else {
                count2++;
            }
            if(count1 == 21){
                bw.write(count1 + "-" + count2 + "\n");
                count1 = 0;
                count2 = 0;
                set1++;
            } else if(count2 == 21){
                bw.write(count1 + "-" + count2 + "\n");
                count1 = 0;
                count2 = 0;
                set2++;
            }
        }
        if(set1 > set2){
            bw.write("A\n");
        } else {
            bw.write("B\n");
        }
        bw.flush();
        bw.close();
    }
}