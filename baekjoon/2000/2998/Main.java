// https://www.acmicpc.net/problem/2998
// 8진수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";
        String[] array = {
              "000"
            , "001"
            , "010"
            , "011"
            , "100"
            , "101"
            , "110"
            , "111"
        };
        String str = bf.readLine();
        if(str.length() % 3 == 1){
            str = "00" + str;
        } else if(str.length() % 3 == 2){
            str = "0" + str;
        }
        for (int i = 0; i < str.length(); i+=3) {
            String result = str.charAt(i) +""+ str.charAt(i + 1) +""+ str.charAt(i + 2);
            int n = Integer.parseInt(result, 2);
            answer += n;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}