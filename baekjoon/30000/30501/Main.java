// https://www.acmicpc.net/problem/30501
// 관공... 어찌하여 목만 오셨소...
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.contains("S")){
                bw.write(str + "\n");
                break;
            }
        }
        bw.flush();
        bw.close();
    }

    

}
