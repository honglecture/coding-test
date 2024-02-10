// https://www.acmicpc.net/problem/16674
// 2018년을 되돌아보며
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        boolean flag = true;
        int[] array = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(str.charAt(i) + "");
            array[n]++;
            if(n != 2 && n != 0 && n != 1 && n != 8){
                flag = false;
            }
        }

        if(!flag){
            System.out.println("0");
        } else {
            int count2 = array[2];
            int count0 = array[0];
            int count1 = array[1];
            int count8 = array[8];
            if(count2 == 0 || count0 == 0 || count1 == 0 || count8 == 0){
                System.out.println("1");
            } else {
                if(count2 == count0 && count0 == count1 && count1 == count8){
                    System.out.println("8");
                } else {
                    System.out.println("2");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
