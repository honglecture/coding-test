// https://www.acmicpc.net/problem/14647
// 준오는 조류혐오야!!
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                String str = String.valueOf(array[i][j]);
                for (int k = 0; k < str.length(); k++) {
                    if(str.charAt(k) == '9'){
                        total++;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                String str = String.valueOf(array[i][j]);
                for (int k = 0; k < str.length(); k++) {
                    if(str.charAt(k) == '9'){
                        sum++;
                    }
                }
            }
            answer = Integer.max(answer, sum);
        }
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                String str = String.valueOf(array[j][i]);
                for (int k = 0; k < str.length(); k++) {
                    if(str.charAt(k) == '9'){
                        sum++;
                    }
                }
            }
            answer = Integer.max(answer, sum);
        }
        System.out.println(total - answer);
        bw.flush();
        bw.close();
    }

    
}