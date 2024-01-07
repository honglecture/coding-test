// https://www.acmicpc.net/problem/12813
// 이진수 연산
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        String result5 = "";
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1 == '1' && c2 == '1'){
                result1 += "1";
            } else {
                result1 += "0";
            }
            if(c1 == '1' || c2 == '1'){
                result2 += "1";
            } else {
                result2 += "0";
            }
            if(c1 != c2){
                result3 += "1";
            } else {
                result3 += "0";
            }
            if(c1 == '1'){
                result4 += "0";
            } else {
                result4 += "1";
            }
            if(c2 == '1'){
                result5 += "0";
            } else {
                result5 += "1";
            }
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        bw.flush();
        bw.close();
    }

}
