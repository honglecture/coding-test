// https://www.acmicpc.net/problem/6845
// Federal Voting Age
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
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            String s3 = sArray[2];
            if(s2.length() == 1){
                s2 = "0" + s2;
            }
            if(s3.length() == 1){
                s3 = "0" + s3;
            }
            int result = Integer.parseInt(s1 + s2 + s3);
            if(result <= 19890227){
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}