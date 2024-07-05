// https://www.acmicpc.net/problem/29736
// 브실이와 친구가 되고 싶어
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int k = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int answer = 0;
        for (int i = start; i <= end; i++) {
            if(i >= k - x && i <= k + x){
                answer++;
            }
        }
        if(answer == 0){
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }

    

}
