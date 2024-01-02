// https://www.acmicpc.net/problem/16968
// A → B
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int result = 0;
        if(str.charAt(0) == 'd'){
            result = 10;
        } else {
            result = 26;
        }
        for (int i = 1; i < str.length(); i++) {
            char c1 = str.charAt(i - 1);
            char c2 = str.charAt(i);
            if(c1 == c2){
                if(c2 == 'd'){
                    int temp = result;
                    result *= 10;
                    result -= temp;
                } else {
                    int temp = result;
                    result *= 26;
                    result -= temp;
                }
            } else {
                if(c2 == 'd'){
                    result *= 10;
                } else {
                    result *= 26;
                }
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
