// https://www.acmicpc.net/problem/29163
// Счастье Мистера Бина
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(n % 2 == 0){
                count2++;
            } else {
                count1++;
            }
            
        }
        if(count2 > count1){
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
        bw.flush();
        bw.close();
    }

    

}
