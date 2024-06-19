// https://www.acmicpc.net/problem/11258
// Thai Lottery Checking
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[6][2];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = sArray[0];
            array[i][1] = sArray[1];
        }
        while (true) {
            String str = bf.readLine();
            if(str.equals("-1")){
                break;
            }
            int sum = 0;
            String result1 = str;
            String result2 = str.substring(0, 3);
            String restul3 = str.substring(3, str.length());
            String restul4 = str.substring(4, str.length());
            if(result1.equals(array[0][0])){
                sum += Integer.parseInt(array[0][1]);
            }
            if(result2.equals(array[1][0])){
                sum += Integer.parseInt(array[1][1]);
            }
            if(result2.equals(array[2][0])){
                sum += Integer.parseInt(array[2][1]);
            }
            if(restul3.equals(array[3][0])){
                sum += Integer.parseInt(array[3][1]);
            }
            if(restul3.equals(array[4][0])){
                sum += Integer.parseInt(array[4][1]);
            }
            if(restul4.equals(array[5][0])){
                sum += Integer.parseInt(array[5][1]);
            }
            bw.write(sum +"\n");
        }
        bw.flush();
        bw.close();
    }

    
}