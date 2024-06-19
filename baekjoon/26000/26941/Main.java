// https://www.acmicpc.net/problem/26941
// Pyramidbygge
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int key = Integer.parseInt(bf.readLine());
        int sum = 0;
        int count = 1;
        int answer = 0;
        while (true) {
            sum += count * count;
            if(key < sum){
                break;
            }
            answer++;
            count += 2;
        }
        System.out.println(Integer.max(1, answer));
        bw.flush();
        bw.close();
    }

}
