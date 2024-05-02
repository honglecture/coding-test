// https://www.acmicpc.net/problem/7597
// Tennis
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
            int answer1 = 0;
            int answer2 = 0;
            int count1 = 0;
            int count2 = 0;
            if(str.equals("#")){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == 'A'){
                    count1++;
                } else {
                    count2++;
                }
                if(count1 > count2){
                    if(count1 == 4){
                        if(count2 <= 2){
                            answer1++;
                            count1 = 0;
                            count2 = 0;
                        }
                    } else if(count1 > 4){
                        if(count1 - count2 >= 2){
                            answer1++;
                            count1 = 0;
                            count2 = 0;
                        }
                    }
                } else if(count2 > count1){
                    if(count2 == 4){
                        if(count1 <= 2){
                            answer2++;
                            count1 = 0;
                            count2 = 0;
                        }
                    } else if(count2 > 4){
                        if(count2 - count1 >= 2){
                            answer2++;
                            count1 = 0;
                            count2 = 0;
                        }
                    }
                }
            }
            bw.write("A " + answer1 + " B " + answer2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}