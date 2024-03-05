// https://www.acmicpc.net/problem/27880
// Gahui and Soongsil University station
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            String[] sArray = bf.readLine().split(" ");
            String type = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(type.equals("Es")){
                answer += n * 21;
            } else {
                answer += n * 17;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
