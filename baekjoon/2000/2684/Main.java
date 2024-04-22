// https://www.acmicpc.net/problem/2684
// 동전 게임
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int[] array = new int[8];
            for (int j = 0; j < str.length() - 2; j++) {
                String result = str.charAt(j) + "" + str.charAt(j + 1) + "" + str.charAt(j + 2);
                if(result.equals("TTT")){
                    array[0]++;
                } else if(result.equals("TTH")){
                    array[1]++;
                } else if(result.equals("THT")){
                    array[2]++;
                } else if(result.equals("THH")){
                    array[3]++;
                } else if(result.equals("HTT")){
                    array[4]++;
                } else if(result.equals("HTH")){
                    array[5]++;
                } else if(result.equals("HHT")){
                    array[6]++;
                } else if(result.equals("HHH")){
                    array[7]++;
                }
            }
            for (int j = 0; j < array.length; j++) {
                bw.write(array[j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}