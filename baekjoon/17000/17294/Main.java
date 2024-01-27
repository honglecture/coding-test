// https://www.acmicpc.net/problem/17294
// 귀여운 수~ε٩(๑> ₃ <)۶з
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.length() < 3){
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        } else {
            boolean flag = true;
            int n1 = Integer.parseInt(String.valueOf(str.charAt(0)));
            int n2 = Integer.parseInt(String.valueOf(str.charAt(1)));
            int n3 = n2 - n1;
            for (int i = 1; i < str.length() - 1; i++) {
                int n4 = Integer.parseInt(String.valueOf(str.charAt(i)));
                int n5 = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                if(n5 - n4 != n3){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
            } else {
                System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
            }
        }
        bw.flush();
        bw.close();
    }

}
