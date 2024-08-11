// https://www.acmicpc.net/problem/15080
// Every Second Counts
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int time1 = getTime(bf.readLine());
        int time2 = getTime(bf.readLine());
        int answer = 0;
        if(time1 > time2){
            answer += (24 * 60 * 60) - time1;
            answer += time2;
        } else {
            answer = time2 - time1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static int getTime(String str){
        int result = 0;
        String[] sArray = str.split(" : ");
        int n1 = Integer.parseInt(sArray[0]) * 60 * 60;
        int n2 = Integer.parseInt(sArray[1]) * 60;
        int n3 = Integer.parseInt(sArray[2]);
        result = n1 + n2 + n3;
        return result;
    }

    
}
