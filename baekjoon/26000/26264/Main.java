// https://www.acmicpc.net/problem/26264
// 빅데이터? 정보보호!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int totalSize = str.length();
        int size1 = str.replaceAll("security", "").length();
        int size2 = str.replaceAll("bigdata", "").length();
        int answer1 = (size2) / 8;
        int answer2 = (size1) / 7;
        if(answer1 > answer2){
            bw.write("security!\n");
        } else if(answer1 < answer2){
            bw.write("bigdata?\n");
        } else {
            bw.write("bigdata? security!\n");
        }
        bw.flush();
        bw.close();
    }

}
