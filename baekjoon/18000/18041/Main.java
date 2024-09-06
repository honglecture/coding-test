// https://www.acmicpc.net/problem/18041
// Mountain Ranges
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        int answer = 0;
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                int n1 = array[j - 1];
                int n2 = array[j];
                if(n2 - n1 > x){
                    break;
                }
                count++;
            }
            answer = Integer.max(answer, count);
        }
        System.out.println(answer + 1);
        bw.flush();
        bw.close();
    }

}
