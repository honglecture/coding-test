// https://www.acmicpc.net/problem/5533
// 유니크
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][3];
        int[] answerArray = new int[size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            array[i][0] = n1;
            array[i][1] = n2;
            array[i][2] = n3;
        }
        for (int i = 0; i < array[0].length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                list.add(array[j][i]);
            }
            for (int j = 0; j < array.length; j++) {
                int n = array[j][i];
                int count = 0;
                for (int k = 0; k < list.size(); k++) {
                    if(list.get(k) == n){
                        count++;
                    }
                }
                if(count == 1){
                    answerArray[j] += n;
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            System.out.println(answerArray[i]);
        }
        bw.flush();
        bw.close();
    }
}