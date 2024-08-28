// https://www.acmicpc.net/problem/21191
// This Ain't Your Grandpa's Checkerboard
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = true;
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i][j].equals("B")){
                    count1++;
                } else {
                    count2++;
                }
                if(array[j][i].equals("B")){
                    count3++;
                } else {
                    count4++;
                }
            }
            if(count1 != count2){
                flag = false;
                break;
            }
            if(count3 != count4){
                flag = false;
                break;
            }
        }
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if(array[i][j].equals(array[i][j - 1]) && array[i][j].equals(array[i][j + 1])){
                    flag = false;
                    break;
                }
                if(array[j][i].equals(array[j - 1][i]) && array[j][i].equals(array[j][i + 1])){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        if(flag){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
