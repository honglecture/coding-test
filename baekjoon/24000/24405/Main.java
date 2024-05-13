// https://www.acmicpc.net/problem/24405
// Eye of Sauron
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer1 = 0;
        int answer2 = 0;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == ')'){
                flag = false;
                continue;
            }
            if(flag){
                answer1++;
            } else {
                answer2++;
            }
        }
        if(answer1 == answer2){
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
        bw.flush();
        bw.close();
    }

}
