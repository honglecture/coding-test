// https://www.acmicpc.net/problem/25088
// Punched Cards
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            String[][] array = new String[y * 2 + 1][x * 2 + 1];
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[j][k] = ".";
                }
            }
            for (int j = 0; j < array.length; j+=2) {
                for (int k = 0; k < array[j].length; k++) {
                    if(k % 2 == 0){
                        array[j][k] = "+";
                    } else {
                        array[j][k] = "-";
                    }
                }
            }
            for (int j = 1; j < array.length; j+=2) {
                for (int k = 0; k < array[j].length; k++) {
                    if(k % 2 == 0){
                        array[j][k] = "|";
                    }
                }
            }
            array[0][0] = ".";
            array[0][1] = ".";
            array[1][0] = ".";
            array[1][1] = ".";
            bw.write("Case #"+(i + 1)+":\n");
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    bw.write(array[j][k] + "");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
