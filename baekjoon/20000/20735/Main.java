// https://www.acmicpc.net/problem/20735
// Fifty Shades of Pink
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String uStr = str.toUpperCase();
            if(uStr.contains("PINK") || uStr.contains("ROSE")){
                answer++;
            }
        }
        if(answer != 0){
            System.out.println(answer);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }
        bw.flush();
        bw.close();
    }
    

}
