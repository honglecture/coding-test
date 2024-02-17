// https://www.acmicpc.net/problem/25904
// 안녕 클레오파트라 세상에서 제일가는 포테이토칩
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int index = 0;
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        while (true) {
            if(array[index] < x){
                break;
            }
            x++;
            index++;
            if(index == array.length){
                index = 0;
            }
        }
        System.out.println(index + 1);
        bw.flush();
        bw.close();
    }

}
