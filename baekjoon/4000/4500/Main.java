// https://www.acmicpc.net/problem/4500
// “Bubble Gum, Bubble Gum, in the dish, how many pieces do you wish?”
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str = bf.readLine();
            int count = Integer.parseInt(bf.readLine()) - 1;
            int startIndex = 0;
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].equals(str)){
                    startIndex = j;
                    break;
                }
            }
            for (int j = 0; j < count; j++) {
                startIndex += 1;
                if(startIndex > sArray.length - 1){
                    startIndex = 0;
                }
            }
            bw.write(sArray[startIndex] + "\n");
        }
        bw.flush();
        bw.close();
    }
}