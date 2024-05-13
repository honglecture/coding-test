// https://www.acmicpc.net/problem/15087
// DRM Message
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2, str.length());
        String result1 = getString1(str1);
        String result2 = getString1(str2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result1.length(); i++) {
            int n1 = result1.charAt(i) - 65;
            int n2 = result2.charAt(i) - 65;
            int n3 = n1 + n2 + 65;
            if(n3 > 90){
                n3 -= 26;
            }
            sb.append(String.valueOf((char) n3));
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

    private static String getString1(String str){
        String result = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 65;
            sum += n;
        }
        int key = sum % 26;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) + key;
            if(n > 90){
                n -= 26;
            }
            result += String.valueOf((char) n);
        }
        return result;
    }

    
}
