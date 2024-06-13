// https://www.acmicpc.net/problem/27930
// 당신은 운명을 믿나요?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb1 = new StringBuilder("KOREA");
        StringBuilder sb2 = new StringBuilder("YONSEI");
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(sb1.charAt(0) == c){
                sb1.deleteCharAt(0);
                if(sb1.length() == 0){
                    answer = "KOREA";
                    break;
                }
            }
            if(sb2.charAt(0) == c){
                sb2.deleteCharAt(0);
                if(sb2.length() == 0){
                    answer = "YONSEI";
                    break;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
