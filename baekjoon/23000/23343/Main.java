// https://www.acmicpc.net/problem/23343
// JavaScript
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String str1 = sArray[0];
        String str2 = sArray[1];
        boolean result1 = true;
        boolean result2 = true;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c >= 48 && c <= 57){
            } else {
                result1 = false;
                break;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if(c >= 48 && c <= 57){
            } else {
                result2 = false;
                break;
            }
        }
        
        if(result1 && result2){
            int result = Integer.parseInt(str1) - Integer.parseInt(str2);
            System.out.println(result);
        } else {
            System.out.println("NaN");
        }
        bw.flush();
        bw.close();
    }
    

}
