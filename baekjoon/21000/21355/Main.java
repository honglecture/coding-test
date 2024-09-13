// https://www.acmicpc.net/problem/21355
// Personnummer
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String[] sArray;
        String answer = "";
        if(str.charAt(6) == '+'){
            sArray = str.split("\\+");
            // 40 ~39;
            int y = Integer.parseInt(sArray[0].substring(0, 2));
            if(y >= 20 && y <= 99){
                answer = "18" + sArray[0] + sArray[1];
            } else {
                answer = "19" + sArray[0] + sArray[1];
            }
        } else {
            sArray = str.split("\\-");
            int y = Integer.parseInt(sArray[0].substring(0, 2));
            if(y >= 20 && y<= 99){
                answer = "19" + sArray[0] + sArray[1];
            } else {
                answer = "20" + sArray[0] + sArray[1];
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
