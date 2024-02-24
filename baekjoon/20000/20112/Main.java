// https://www.acmicpc.net/problem/20112
// 사토르 마방진
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array.length; j++) {
                str += array[i][j];
            }
            set.add(str);
        }
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array.length; j++) {
                str += array[j][i];
            }
            set.remove(str);
        }
        if(set.size() == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }

}
