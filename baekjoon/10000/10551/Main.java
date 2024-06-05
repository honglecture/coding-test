// https://www.acmicpc.net/problem/10551
// STROJOPIS
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String[][] array = {
             {"1", "Q", "A", "Z"}
            ,{"2", "W", "S", "X"}
            ,{"3", "E", "D", "C"}
            ,{"4", "R", "F", "V", "5", "T", "G", "B"}
            ,{"6", "7", "Y", "U", "H", "J", "N", "M"}
            ,{"8", "I", "K", ","}
            ,{"9", "O", "L", "."}
            ,{"0", "P", ";", "/", "-", "=", "[", "]", "'"}
        };
        int[] answerArray = new int[8];
        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i));
            int index = -1;
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    if(array[j][k].equals(key)){
                        index = j;
                        break;
                    }
                }
                if(index != -1){
                    break;
                }
            }
            answerArray[index]++;
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }


    

}