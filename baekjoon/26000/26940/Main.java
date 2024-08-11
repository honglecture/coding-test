// https://www.acmicpc.net/problem/26940
// Chokladkartongen
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 1; i < array.length; i++) {
            int n1 = array[i - 1];
            int n2 = array[i];
            if(n1 < n2){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
