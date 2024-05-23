// https://www.acmicpc.net/problem/15239
// Password check
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            boolean flag = true;
            if(size < 12){
                flag = false;
            }
            boolean check1 = false;
            boolean check2 = false;
            boolean check3 = false;
            boolean check4 = false;
            for (int j = 0; j < str.length(); j++) {
                int n = str.charAt(j);
                if(n >= 65 && n <= 90){
                    check1 = true;
                    break;
                }
            }
            for (int j = 0; j < str.length(); j++) {
                int n = str.charAt(j);
                if(n >= 97 && n <= 122){
                    check2 = true;
                    break;
                }
            }
            for (int j = 0; j < str.length(); j++) {
                int n = str.charAt(j);
                if(n >= 48 && n <= 57){
                    check3 = true;
                    break;
                }
            }
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '+' || c == '_' || c == ')' || c == '(' || c == '*' || c == '&' || c == '^' || c == '%' || c == '$'
                || c == '#' || c == '@' || c == '!' || c == '.' || c == '/' || c == ',' || c == ';' || c == '{'  || c == '}'){
                    check4 = true;
                    break;
                }
            }
            if(!check1){
                flag = false;
            }
            if(!check2){
                flag = false;
            }
            if(!check3){
                flag = false;
            }
            if(!check4){
                flag = false;
            }
            if(flag){
                bw.write("valid\n");
            } else {
                bw.write("invalid\n");
            }
            
        }
        bw.flush();
        bw.close();
    }

    
}
