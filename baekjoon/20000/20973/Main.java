// https://www.acmicpc.net/problem/20973
// Uddered but not Herd
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int answer = 0;
        int index = 0;
        while (true) {
            if(index == str2.length()){
                break;
            }
            answer++;
            for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(index);
                if(c1 == c2){
                    index++;
                }
                if(index == str2.length()){
                    break;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
