// https://www.acmicpc.net/problem/16408
// Poker Hand 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int maxCount = 0;
        String maxNum = "";
        for (int i = 0; i < sArray.length; i++) {
            char c1 = sArray[i].charAt(0);
            int count = 0;
            for (int j = 0; j < sArray.length; j++) {
                char c2 = sArray[j].charAt(0);
                if(c1 == c2){
                    count++;
                }
            }
            if(maxCount < count){
                maxCount = count;
                maxNum = String.valueOf(String.valueOf(c1));
            }
        }
        System.out.println(maxCount);
        bw.flush();
        bw.close();
    }

}
