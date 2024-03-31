// https://www.acmicpc.net/problem/2082
// 시계
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] keyArray = new String[5][15];
        String answer = "";
        for (int i = 0; i < keyArray.length; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                keyArray[i][j] = String.valueOf(str.charAt(j));
            }
        }
        String[][][] array = {
            {
                 {"###"}
                ,{"#.#"}
                ,{"#.#"}
                ,{"#.#"}
                ,{"###"}
            }
            ,{
                {"..#"}
               ,{"..#"}
               ,{"..#"}
               ,{"..#"}
               ,{"..#"}
            }
            ,{
                {"###"}
               ,{"..#"}
               ,{"###"}
               ,{"#.."}
               ,{"###"}
            }
            ,{
                {"###"}
               ,{"..#"}
               ,{"#.#"}
               ,{"..#"}
               ,{"###"}
            }
            ,{
                {"#.#"}
               ,{"#.#"}
               ,{"###"}
               ,{"..#"}
               ,{"..#"}
            }
            ,{
                {"###"}
               ,{"#.."}
               ,{"#.#"}
               ,{"..#"}
               ,{"###"}
            }
            ,{
                {"###"}
               ,{"#.."}
               ,{"###"}
               ,{"#.#"}
               ,{"###"}
            }
            ,{
                {"###"}
               ,{"..#"}
               ,{"..#"}
               ,{"..#"}
               ,{"..#"}
            }
            ,{
                {"###"}
               ,{"#.#"}
               ,{"###"}
               ,{"#.#"}
               ,{"###"}
            }
            ,{
                {"###"}
               ,{"#.#"}
               ,{"###"}
               ,{"..#"}
               ,{"###"}
            }
        };
        for (int i = 0; i < array.length; i++) {
            
        }
        bw.flush();
        bw.close();
    }



}