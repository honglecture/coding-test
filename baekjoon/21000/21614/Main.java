// https://www.acmicpc.net/problem/21614
// Secret Instructions
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String d = "";
        while (true) {
            String str = bf.readLine();
            if(str.equals("99999")){
                break;
            }
            int sum = Integer.parseInt(String.valueOf(str.charAt(0))) + Integer.parseInt(String.valueOf(str.charAt(1)));
            String num = str.substring(2, str.length());
            String answer = "";
            if(sum == 0){
                answer = d + " " + num;
            } else {
                if(sum % 2 == 0){
                    d = "right";
                } else {
                    d = "left";
                }
                answer = d + " " + num;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
