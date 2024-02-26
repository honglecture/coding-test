// https://www.acmicpc.net/problem/23627
// driip
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        // driip
        if(str.length() >= 5){
            String result = str.substring(str.length() - 5, str.length());
            if(result.equals("driip")){
                System.out.println("cute");
            } else {
                System.out.println("not cute");
            }
        } else {
            System.out.println("not cute");
        }
        bw.flush();
        bw.close();
    }

}
