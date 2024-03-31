// https://www.acmicpc.net/problem/17598
// Animal King Election
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < 9; i++) {
            String str = bf.readLine();
            if(str.equals("Lion")){
                answer1++;
            } else {
                answer2++;
            }
        }
        if(answer1 > answer2){
            System.out.println("Lion");
        } else {
            System.out.println("Tiger");
        }
        bw.flush();
        bw.close();
    }

}
