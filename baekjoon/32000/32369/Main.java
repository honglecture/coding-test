// https://www.acmicpc.net/problem/32369
// 양파 실험
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int n1 = Integer.parseInt(sArray[1]);
        int n2 = Integer.parseInt(sArray[2]);
        int answer1 = 1;
        int answer2 = 1;
        for (int i = 0; i < size; i++) {
            answer1 += n1;
            answer2 += n2;
            if(answer1 < answer2){
                int temp = answer1;
                answer1 = answer2;
                answer2 = temp;
            }
            if(answer1 == answer2){
                answer2 -= 1;
            }
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }


}
