// https://www.acmicpc.net/problem/30224
// Lucky 7
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String str = n + "";
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '7'){
                flag = true;
                break;
            }
        }
        if(!flag){
            if(n % 7 == 0){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            if(n % 7 == 0){
                System.out.println("3");
            } else {
                System.out.println("2");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
