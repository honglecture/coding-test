// https://www.acmicpc.net/problem/31067
// 다오의 경주 대회
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        sArray = bf.readLine().split(" ");
        int[] array = new int[n1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 1; i < array.length; i++) {
            int num1 = array[i - 1];
            int num2 = array[i];
            if(num1 >= num2){
                if(num1 >= num2 + n2){
                    answer = -1;
                    break;
                } else {
                    array[i] += n2;
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
