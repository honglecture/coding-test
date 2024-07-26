// https://www.acmicpc.net/problem/11609
// Class Time
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][2];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            array[i][0] = s1;
            array[i][1] = s2;
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] a1, String[] a2) {
                if(a1[1].equals(a2[1])){
                    return a1[0].compareTo(a2[0]);
                } else {
                    return a1[1].compareTo(a2[1]);
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            String s1 = array[i][0];
            String s2 = array[i][1];
            bw.write(s1 + " " + s2 + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}

