// https://www.acmicpc.net/problem/10205
// 헤라클레스와 히드라
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'c'){
                    n += 1;
                } else {
                    n -= 1;
                }
            }
            bw.write("Data Set "+(i + 1)+":\n");
            bw.write(n + "\n");
            if(i != size - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}


