// https://www.acmicpc.net/problem/29064
// Обучение войск
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int count = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            if(array[i] == 1){
                count++;
            }
        }
        int goal = size % 2 == 0 ?  size / 2 : size / 2 + 1;
        if(count < goal){
            answer = goal - count;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}
