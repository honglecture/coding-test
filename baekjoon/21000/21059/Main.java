// https://www.acmicpc.net/problem/21022
// Methodic Multiplication
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c == 'S'){
                count1++;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if(c == 'S'){
                count2++;
            }
        }
        int result = count1 * count2;
        StringBuilder sb = new StringBuilder();
        if(result == 0){
            System.out.println("0");
        } else {
            for (int i = 0; i < result; i++) {
                sb.append("S(");
            }
            sb.append("0");
            for (int i = 0; i < result; i++) {
                sb.append(")");
            }
            System.out.println(sb.toString());
        }
        bw.flush();
        bw.close();
    }

}
