// https://www.acmicpc.net/problem/4581
// Voting
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            int countY = 0;
            int countN = 0;
            int countA = 0;
            int countP = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == 'A'){
                    countA++;
                } else if(c == 'P'){
                    countP++;
                } else if(c == 'Y'){
                    countY++;
                } else if(c == 'N'){
                    countN++;
                }
            }
            if(countA >= str.length() - countA){
                bw.write("need quorum\n");
                continue;
            }
            if(countY > countN){
                bw.write("yes\n");
            } else if(countY < countN){
                bw.write("no\n");
            } else {
                bw.write("tie\n");
            }
        }
        bw.flush();
        bw.close();
    }

   
}