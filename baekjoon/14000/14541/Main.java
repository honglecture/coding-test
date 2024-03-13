// https://www.acmicpc.net/problem/14541
// Speed Limit
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.charAt(str.length() - 1) == ' '){
                str = str.substring(0, str.length() - 1);
            }
            if(str.equals("-1")){
                break;
            }
            int size = Integer.parseInt(str);
            int[][] array = new int[size][2];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                String[] sArray = bf.readLine().split(" ");
                array[i][0] = Integer.parseInt(sArray[0]);
                array[i][1] = Integer.parseInt(sArray[1]);
            }
            sum += array[0][0] * array[0][1];
            for (int i = 1; i < array.length; i++) {
                sum += array[i][0] * (array[i][1] - array[i - 1][1]);
            }
            bw.write(sum + " miles \n");
        }
        bw.flush();
        bw.close();
    }

    
}

