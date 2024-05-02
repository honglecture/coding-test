// https://www.acmicpc.net/problem/29029
// Фигурки
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int[] array = new int[4];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'N'){
                array[0]++;
            } else if(c == 'E'){
                array[1]++;
            } else if(c == 'S'){
                array[2]++;
            } else if(c == 'W'){
                array[3]++;
            }
        }
        Arrays.sort(array);
        System.out.println(size - array[array.length - 1]);
        bw.flush();
        bw.close();
    }
}
