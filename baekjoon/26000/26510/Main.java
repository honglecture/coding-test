// https://www.acmicpc.net/problem/26510
// V for Vendetta
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            int n = Integer.parseInt(array[i]);
            String[][] answerArray = new String[n][n * 2 -1];
            for (int j = 0; j < answerArray.length; j++) {
                for (int k = 0; k < answerArray[j].length; k++) {
                    answerArray[j][k] = " ";
                }
            }
            for (int j = 0; j < answerArray.length; j++) {
                answerArray[j][j] = "*";
                answerArray[j][answerArray[0].length - 1 - j] = "*";
            }
            for (int j = 0; j < answerArray.length; j++) {
                int count = 0;
                String str = "";
                for (int k = 0; k < answerArray[j].length; k++) {
                    if(j == answerArray.length - 1){
                        if(answerArray[j][k].equals("*")){
                            str += "*";
                            count++;
                        } else {
                            str += " ";
                        }
                        if(count == 1){
                            break;
                        }
                    } else {
                        if(answerArray[j][k].equals("*")){
                            str += "*";
                            count++;
                        } else {
                            str += " ";
                        }
                        if(count == 2){
                            break;
                        }
                    }
                }
                bw.write(str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
