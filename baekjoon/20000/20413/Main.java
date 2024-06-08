// https://www.acmicpc.net/problem/20413
// MVP 다이아몬드 (Easy)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        String str = bf.readLine();
        int[] minArray = new int[5];;
        minArray[0] = array[0] - 1;
        minArray[1] = array[1] - 1;
        minArray[2] = array[2] - 1;
        minArray[3] = array[3] - 1;
        minArray[4] = array[3];
        int beforeSum = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals("B")){
                beforeSum = minArray[0] - beforeSum;
                answer += beforeSum;
            } else if(s.equals("S")){
                beforeSum = minArray[1] - beforeSum;
                answer += beforeSum;
            } else if(s.equals("G")){
                beforeSum = minArray[2] - beforeSum;
                answer += beforeSum;
            } else if(s.equals("P")){
                beforeSum = minArray[3] - beforeSum;
                answer += beforeSum;
            } else if(s.equals("D")){
                answer += minArray[4];
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
