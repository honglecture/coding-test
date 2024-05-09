// https://www.acmicpc.net/problem/26552
// Reverse
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            while (true) {
                n++;
                String str = String.valueOf(n);
                boolean flag = true;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j) == '0'){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    bw.write(n + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
