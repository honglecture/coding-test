// https://www.acmicpc.net/problem/25641
// 균형 잡힌 소떡소떡
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String answer = "";
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 's'){
                n1++;
            } else {
                n2++;
            }
        }
        int startIndex = 0;
        while (true) {
            if(n1 == n2){
                break;
            }
            char c = str.charAt(startIndex++);
            if(c == 's'){
                n1--;
            } else {
                n2--;
            }
        }
        for (int i = startIndex; i < str.length(); i++) {
            answer += str.charAt(i);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
