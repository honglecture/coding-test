// https://www.acmicpc.net/problem/18408
// 3 つの整数 (Three Integers)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int[] array = {n1, n2, n3};
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                answer1++;
            } else {
                answer2++;
            }
        }
        if(answer1 > answer2){
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        bw.flush();
        bw.close();
    }

}
