// https://www.acmicpc.net/problem/17180
// 문자열 비교하기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String str1 = getString(bf.readLine());
        String str2 = getString(bf.readLine());
        int answer = 0;
        if(str1.length() == str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                int n1 = str1.charAt(i) - 97;
                int n2 = str2.charAt(i) - 97;
                answer += Math.abs(n1 - n2);
            }
        } else {
            if(str1.length() >  str2.length()){
                for (int i = 0; i < str2.length(); i++) {
                    int n1 = str1.charAt(i) - 97;
                    int n2 = str2.charAt(i) - 97;
                    System.out.println(Math.abs(n1 - n2));
                    answer += Math.abs(n1 - n2);
                }
                for (int i = str2.length(); i < str1.length(); i++) {
                    int n1 = str1.charAt(i) - 97;
                    answer += n1;
                }
            } else {
                for (int i = 0; i < str1.length(); i++) {
                    int n1 = str1.charAt(i) - 97;
                    int n2 = str2.charAt(i) - 97;
                    answer += Math.abs(n1 - n2);
                }
                for (int i = str1.length(); i < str2.length(); i++) {
                    int n1 = str2.charAt(i) - 97;
                    answer += n1;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static String getString(String str){
        String result = "";
        String temp = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(!temp.equals(s)){
                result += temp;
                temp = s;
            }
        }
        result += temp;
        return result;
    }

}
