// https://www.acmicpc.net/problem/11809
// YODA
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String max = "";
        String min = "";
        String answer1 = "";
        String answer2 = "";
        int type = 0;
        if(str1.length() > str2.length()){
            max = str1;
            min = str2;
            type = 1;
        } else if(str1.length() == str2.length()){
            max = str1;
            min = str2;
            type = 2;
        } else {
            max = str2;
            min = str1;
            type = 3;
        }
        int size = max.length() - min.length();
        for (int i = 0; i < size; i++) {
            min = " " + min;
        }
        for (int i = 0; i < min.length(); i++){
            if(min.charAt(i) == ' '){
                answer1 += Integer.parseInt(String.valueOf(max.charAt(i)));
                continue;
            }
            int n1 = Integer.parseInt(String.valueOf(max.charAt(i)));
            int n2 = Integer.parseInt(String.valueOf(min.charAt(i)));
            if(n1 > n2){
                answer1 += n1;
            } else if(n1 < n2){
                answer2 += n2;
            } else {
                if(!answer1.equals("0")){
                    answer1 += n1;
                }
                if(!answer2.equals("0")){
                    answer2 += n1;
                }
            }
        }
        if(answer1.equals("")){
            answer1 = "YODA";
        }
        if(answer2.equals("")){
            answer2 = "YODA";
        }
        if(type == 1 || type == 2){
            System.out.println(answer1);
            System.out.println(answer2);
        } else {
            System.out.println(answer2);
            System.out.println(answer1);
        }
        bw.flush();
        bw.close(); 
    }

}