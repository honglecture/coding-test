// https://www.acmicpc.net/problem/15354
// Aron
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String result = "";
        int answer = 1;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(i == 0){
                result = str;
            } else {
                if(!result.equals(str)){
                    result = str;
                    answer++;
                }
            }
        }
        System.out.println(answer + 1);
        bw.flush();
        bw.close();
    }

    
}
