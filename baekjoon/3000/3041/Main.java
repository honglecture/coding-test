// https://www.acmicpc.net/problem/3041
// N-퍼즐
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String[][] array = {
             {"A", "B", "C", "D"}
            ,{"E", "F", "G", "H"}
            ,{"I",  "J", "K", "L"}
            ,{"M", "N", "O", "."}
        };
        String[][] answerArray = new String[4][4];
        for (int i = 0; i < answerArray.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                answerArray[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray.length; j++) {
                if(answerArray[i][j].equals(".")){
                    continue;
                }
                if(!answerArray[i][j].equals(array[i][j])){
                    String s = answerArray[i][j];
                    int y = 0;
                    int x = 0;
                    for (int k = 0; k < array.length; k++) {
                        for (int l = 0; l < array.length; l++) {
                            if(s.equals(array[k][l])){
                                y = k;
                                x = l;
                                break;
                            }
                        }
                    }
                    answer += Math.abs(i - y) + Math.abs(j - x);
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
}