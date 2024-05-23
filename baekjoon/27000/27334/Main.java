// https://www.acmicpc.net/problem/27334
// マラソン大会 (Marathon Race)
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[][] array = new int[size][2];
        for (int i = 0; i < sArray.length; i++) {
            array[i][0] = Integer.parseInt(sArray[i]);
            array[i][1] = i + 1;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] answerArray = new int[size + 1];
        int rank = 1;
        int count = 1;
        int beforeScore = -1;
        for (int i = 0; i < array.length; i++) {
            int score = array[i][0];
            int index = array[i][1];
            if(beforeScore == -1){
                answerArray[index] = rank;
                beforeScore = score;
            } else {
                if(beforeScore == score){
                    
                    answerArray[index] = rank;
                    count++;
                } else {
                    rank += count;
                    
                    answerArray[index] = rank;
                    count = 1;
                    beforeScore = score;
                }
            }
        }
        for (int i = 1; i < answerArray.length; i++) {
            System.out.println(answerArray[i]);
        }
        bw.flush();
        bw.close();
    }

    

}
