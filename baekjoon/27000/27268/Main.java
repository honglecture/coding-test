// https://www.acmicpc.net/problem/27268
// Рамки
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(sArray[2]);
        String[][] array = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        int count = 97;
        for (int i = 0; i < size; i++) {
            String key = String.valueOf((char)count++);
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]) - 1;
            int n3 = Integer.parseInt(sArray[2]) - 1;
            int n4 = Integer.parseInt(sArray[3]) - 1;
            for (int j = n1; j <= n3; j++) {
                for (int k = n2; k <= n4; k++) {
                    if(j == n1 || j == n3){
                        array[j][k] = key;
                    } else {
                        if(k == n2 || k == n4){
                            array[j][k] = key;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    

}
