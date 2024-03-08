// https://www.acmicpc.net/problem/22155
// Простая задача
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 < 2 && n2 < 3){
                bw.write("Yes\n");
            } else if(n1 < 3 && n2 < 2){
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
