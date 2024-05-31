// https://www.acmicpc.net/problem/13945
// Appearance Analysis
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    private static Set<String> set = new HashSet<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray =  bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 1; i < array.length - 1; i+=5) {
            for (int j = 1; j < array[i].length - 1; j+=5) {
                String[][] innerArray = new String[4][4];
                int count1 = 0;
                for (int k = i; k < i + 4; k++) {
                    int count2 = 0;
                    for (int l = j; l < j + 4; l++) {
                        innerArray[count1][count2++] = array[k][l];
                    }
                    count1++;
                }
                getAnswer(innerArray);
            }
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

    private static void getAnswer(String[][] array){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
            }
        }
        if(set.contains(sb.toString())){
            return;
        }
        sb = new StringBuilder();
        for (int i = 0; i < array[0].length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                sb.append(array[j][i]);
            }
        }
        if(set.contains(sb.toString())){
            return;
        }
        sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                sb.append(array[i][j]);
            }
        }
        if(set.contains(sb.toString())){
            return;
        }
        for (int i = array[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                sb.append(array[j][i]);
            }
        }
        if(set.contains(sb.toString())){
            return;
        }
        set.add(sb.toString());
    }

}