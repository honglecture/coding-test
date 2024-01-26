// https://www.acmicpc.net/problem/4447
// 좋은놈 나쁜놈
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
            String name = bf.readLine();
            String str = name.toUpperCase();
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'B'){
                    count1++;
                } else if(c == 'G'){
                    count2++;
                }
                
            }
            if(count1 > count2){
                bw.write(name + " is A BADDY\n");
            } else if(count1 < count2){
                bw.write(name + " is GOOD\n");
            } else {
                bw.write(name + " is NEUTRAL\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
