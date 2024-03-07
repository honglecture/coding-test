// https://www.acmicpc.net/problem/18245
// 이상한 나라의 암호
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 2;
        while (true) {
            String str = bf.readLine();
            if(str.equals("Was it a cat I saw?")){
                break;
            }
            String answer = "";
            for (int i = 0; i < str.length(); i += index) {
                answer += str.charAt(i);
            }
            bw.write(answer + "\n");
            index++;
        }
        bw.flush();
        bw.close();
    }

}
