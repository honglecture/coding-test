// https://www.acmicpc.net/problem/29829
// Palindroom
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < sArray.length; i++) {
            sb1.append(sArray[i]);
        }
        StringBuilder sb2 = new StringBuilder(sb1.toString()).reverse();
        int count = 0;
        int index = -1;
        String temp = "";
        for (int i = 0; i < sb1.length(); i++) {
            if(sb1.charAt(i) != sb2.charAt(i)){
                index = i;
                temp = String.valueOf(sb1.charAt(i));
                count++;
            }
        }
        if(count <= 2){
            bw.write("JAH\n");
            if(count == 2){
                sArray[sArray.length - 1 - index] = temp;
            }
            for (int i = 0; i < sArray.length; i++) {
                bw.write(sArray[i] + " ");
            }
            bw.write("\n");
        } else {
            bw.write("EI\n");
        }
        bw.flush();
        bw.close();
    }

    

}
