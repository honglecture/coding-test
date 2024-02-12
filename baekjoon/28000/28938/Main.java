// https://www.acmicpc.net/problem/28938
// Конвейер
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            answer += n;
        }
        if(answer > 0){
            System.out.println("Right");
        } else if(answer < 0){
            System.out.println("Left");
        } else {
            System.out.println("Stay");
        }
        bw.flush();
        bw.close();
    }

  
}
