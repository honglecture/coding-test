// https://www.acmicpc.net/problem/25932
// Find the Twins
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int count1 = 0;
            int count2 = 0;
            String str = "";
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                if(n == 17){
                    count1++;
                } else if(n == 18){
                    count2++;
                }
                if(j == sArray.length - 1){
                    str += n;
                } else {
                    str += n + " ";
                }
            }
            bw.write(str + "\n");
            if(count1 > 0 && count2 > 0){
                bw.write("both\n");
            } else if(count1 == 0 && count2 == 0){
                bw.write("none\n");
            } else {
                if(count1 == 1){
                    bw.write("zack\n");
                } else {
                    bw.write("mack\n");
                }
            }
            if(i != size -1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
