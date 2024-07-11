// https://www.acmicpc.net/problem/23731
// Physics Experiment
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        while (true) {
            boolean flag = false;
            String str = String.valueOf(n);
            String sum = "1";
            for (int i = str.length() - 1; i >= 0; i--) {
                int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
                if(temp >= 5){

                }
            }
            if(!flag){
                break;
            }
        }
        bw.flush();
        bw.close();
    }

}
