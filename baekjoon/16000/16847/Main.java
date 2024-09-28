// https://www.acmicpc.net/problem/16847
// Teenage Mutant
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            String str = bf.readLine();
            String[][] array = new String[y][x];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split("");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = sArray[k]; 
                }
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                String s1 = String.valueOf(str.charAt(j));
                boolean flag = true;
                for (int k = 0; k < array.length; k++){
                    String s2 = array[k][j];
                    if(s1.equals(s2)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
            bw.write("Data Set "+(i + 1)+":\n");
            bw.write(count + "/" + x + "\n");
            if(i != testCase - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }


}
