// https://www.acmicpc.net/problem/17930
// Hanging Out on the Terrace
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int key = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int count = 0;
        int answer = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            String type = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(type.equals("enter")){
                if(count + n <= key){
                    count += n;
                } else {
                    answer++;
                }
            } else {
                count -= n;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

   
}