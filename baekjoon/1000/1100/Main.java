// https://www.acmicpc.net/problem/1100
// 하얀 칸
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[8][8];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        if(array[i][j].equals("F")){
                            answer++;
                        }
                    }
                } else {
                    if(j % 2 == 1){
                        if(array[i][j].equals("F")){
                            answer++;
                        }
                    }
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
}

// 23
// 64 => 32 => 32
// 32 => 16 16
// 16 16 => 16 8

