// https://www.acmicpc.net/problem/26489
// Correct
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result = "gum gum for jay jay";
        int answer = 0;
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            if(str.equals(result)){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
