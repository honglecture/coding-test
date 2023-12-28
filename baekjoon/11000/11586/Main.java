// https://www.acmicpc.net/problem/11586
// Puyo Puyo
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        int type = Integer.parseInt(bf.readLine());
        if(type == 1){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    bw.write(array[i][j]+"");
                }
                bw.write("\n");
            }
        } else if(type == 2){
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j >= 0; j--) {
                    bw.write(array[i][j]+"");
                }
                bw.write("\n");
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                for (int j = 0; j < array.length; j++) {
                    bw.write(array[i][j]+"");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}

