// https://www.acmicpc.net/problem/24569
// Fergusonball Ratings
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            int n1 = Integer.parseInt(bf.readLine()) * 5;
            int n2 = Integer.parseInt(bf.readLine()) * 3;
            int result = n1 - n2;
            if(result <= 40){
                flag = false;
            } else {
                answer++;
            }
        }
        if(flag){
            bw.write(answer +"+\n");
        } else {
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    

}
