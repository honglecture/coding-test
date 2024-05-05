// https://www.acmicpc.net/problem/6783
// English or French?
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
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine().toUpperCase();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'T'){
                    answer1++;
                } else if(c == 'S'){
                    answer2++;
                }
            }
        }
        if(answer1 > answer2){
            System.out.println("English");
        } else if(answer1 < answer2){
            System.out.println("French");
        } else {
            System.out.println("French");
        }
        bw.flush();
        bw.close();
    }

    
}