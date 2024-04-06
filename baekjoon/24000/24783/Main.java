// https://www.acmicpc.net/problem/24783
// Number Fun
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
            int n3 = Integer.parseInt(sArray[2]);
            if(n1 + n2 == n3){
                bw.write("Possible\n");
                continue;
            }
            if(n1 * n2 == n3){
                bw.write("Possible\n");
                continue;
            }
            if(Integer.max(n1, n2) - Integer.min(n1, n2) == n3){
                bw.write("Possible\n");
                continue;
            }
            if(Integer.max(n1, n2) % Integer.min(n1, n2) == 0){
                if(Integer.max(n1, n2) / Integer.min(n1, n2) == n3){
                    bw.write("Possible\n");
                    continue;
                }
            }
            bw.write("Impossible\n");
        }
        bw.flush();
        bw.close();
    }

    

}
