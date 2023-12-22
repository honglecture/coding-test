// https://www.acmicpc.net/problem/10769
// 행복한지 슬픈지
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String type1 = "\\:\\-\\)";
        String type2 = "\\:\\-\\(";
        int strLength = str.length();
        int type1Length = strLength - str.replaceAll(type1, "").length();
        int type2Length = strLength - str.replaceAll(type2, "").length();
        if(type1Length ==  type2Length){
            if(type1Length == 0){
                System.out.println("none");
            } else {
                System.out.println("unsure");
            }
        } else {
            if(type1Length > type2Length){
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }
        }
        bw.flush();
        bw.close();
    }

}