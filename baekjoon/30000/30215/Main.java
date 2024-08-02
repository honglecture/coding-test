// https://www.acmicpc.net/problem/30215
// Age Expression
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int count1 = 1;
        int answer = 0;
        while (true) {
            int count2 = 1;
            while (true) {
                int result = (count1 * n2) + (count2 * n3);
                if(result == n1){
                    answer = 1;
                    break;
                }
                if(result > n1){
                    break;
                }
                count2++;
            }
            if(answer == 1){
                break;
            }
            count1++;
            if((count1 * n2 + n3) > n1){
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
