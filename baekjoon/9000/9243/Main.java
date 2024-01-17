// https://www.acmicpc.net/problem/9243
// 파일 완전 삭제
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String answer = "";
        if(n % 2 != 0){
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if(c == '1'){
                    answer += "0";
                } else {
                    answer += "1";
                }
            }
        } else {
            answer = str1;
        }
        if(answer.equals(str2)){
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Deletion failed");
        }
        bw.flush();
        bw.close();
    }

}
