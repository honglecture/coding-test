// https://www.acmicpc.net/problem/23320
// 홍익 절대평가
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        int score = Integer.parseInt(sArray[0]);
        int keyNum = Integer.parseInt(sArray[1]);
        int answer1 = (array.length / 10) * (score / 10);
        int answer2 = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(n >= keyNum){
                answer2++;
            }
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }
    

}
