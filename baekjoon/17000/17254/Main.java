// https://www.acmicpc.net/problem/17254
// 키보드 이벤트
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        String[][] array = new String[size][3];
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            array[i][0] = sArray[0];
            array[i][1] = sArray[1];
            array[i][2] = sArray[2];
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] a1, String[] a2) {
                int n1 = Integer.parseInt(a1[0]);
                int n2 = Integer.parseInt(a2[0]);
                int n3 = Integer.parseInt(a1[1]);
                int n4 = Integer.parseInt(a2[1]);
                if(n3 == n4){
                    return n1 - n2;
                } else {
                    return n3 - n4;
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            answer += array[i][2];
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
