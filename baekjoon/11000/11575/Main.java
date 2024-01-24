// https://www.acmicpc.net/problem/11575
// Affine Cipher
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int a = Integer.parseInt(sArray[0]);
            int b = Integer.parseInt(sArray[1]);
            String str = bf.readLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j) - 65;
                int result = (a * c + b) % 26;
                char answer = (char) (result + 65);
                sb.append(String.valueOf(answer));
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}

