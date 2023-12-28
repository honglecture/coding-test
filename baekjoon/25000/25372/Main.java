// https://www.acmicpc.net/problem/25372
// 성택이의 은밀한 비밀번호
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.length() >= 6 && str.length() <= 9){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
