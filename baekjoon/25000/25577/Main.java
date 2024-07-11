// https://www.acmicpc.net/problem/25577
// 열 정렬정렬 정
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int index = -1;
            int minNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int n2 = array[j];
                if(minNum > n2){
                    index = j;
                    minNum = n2;
                }
            }
            if(index != -1){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
