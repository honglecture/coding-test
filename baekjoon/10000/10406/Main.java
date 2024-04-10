// https://www.acmicpc.net/problem/10406
// The Fellowship of the Ring
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(sArray[2]);
        sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n1 <= n && n2 >= n){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


    

}



