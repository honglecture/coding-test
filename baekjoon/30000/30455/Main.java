// https://www.acmicpc.net/problem/30455
// 이제는 더 이상 물러날 곳이 없다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n % 2 == 0){
            System.out.println("Duck");
        } else {
            System.out.println("Goose");
        }
        bw.flush();
        bw.close();
    }

    

}
