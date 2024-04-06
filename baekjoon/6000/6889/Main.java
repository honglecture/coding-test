// https://www.acmicpc.net/problem/6889
// Smile with Similes
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size1 = Integer.parseInt(bf.readLine());
        int size2 = Integer.parseInt(bf.readLine());
        String[] array1 = new String[size1];
        String[] array2 = new String[size2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = bf.readLine();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = bf.readLine();
        }
        for (int i = 0; i < array1.length; i++) {
            String str1 = array1[i];
            for (int j = 0; j < array2.length; j++) {
                String str2 = array2[j];
                bw.write(str1 + " as " + str2 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}