// https://www.acmicpc.net/problem/5087
// Card Cutting
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
            String[] sArray = str.split(" ");
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < sArray.length - 1; i++) {
                String s = sArray[i];
                if(s.equals("A")){
                    count1++;
                } else {
                    int n = Integer.parseInt(sArray[i]);
                    if(n % 2 == 0){
                        count2++;
                    } else {
                        count1++;
                    }
                }
            }
            if(count1 > count2){
                bw.write("Cheryl\n");
            } else if (count1 < count2){
                bw.write("Tania\n");
            } else {
                bw.write("Draw\n");
            }
        }
        bw.flush();
        bw.close();
    }
}