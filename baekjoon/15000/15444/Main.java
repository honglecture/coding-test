// https://www.acmicpc.net/problem/15444
// Vera and ABCDE
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String answer1 = "";
        String answer2 = "";
        String answer3 = "";
        String answer4 = "";
        String answer5 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A'){
                answer1 += "***";
                answer2 += "*.*";
                answer3 += "***";
                answer4 += "*.*";
                answer5 += "*.*";
            } else if(c == 'B'){
                answer1 += "***";
                answer2 += "*.*";
                answer3 += "***";
                answer4 += "*.*";
                answer5 += "***";
            } else if(c == 'C'){
                answer1 += "***";
                answer2 += "*..";
                answer3 += "*..";
                answer4 += "*..";
                answer5 += "***";
            } else if(c == 'D'){
                answer1 += "***";
                answer2 += "*.*";
                answer3 += "*.*";
                answer4 += "*.*";
                answer5 += "***";
            } else if(c == 'E'){
                answer1 += "***";
                answer2 += "*..";
                answer3 += "***";
                answer4 += "*..";
                answer5 += "***";
            }
        }
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
        bw.flush();
        bw.close();
    }

    
}
