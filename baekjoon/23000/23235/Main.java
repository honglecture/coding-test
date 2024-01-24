// https://www.acmicpc.net/problem/23235
// The Fastest Sorting Algorithm In The World
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while (true) {
            String str = bf.readLine();
            if(str.equals("0")){
                break;
            }
            bw.write("Case "+count+": Sorting... done!\n");
            count++;
        }
        bw.flush();
        bw.close();
    }

}
