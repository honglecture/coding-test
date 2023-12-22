// https://www.acmicpc.net/problem/4493
// 가위 바위 보?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                String str1 = sArray[0];
                String str2 = sArray[1];
                if(!str1.equals(str2)){
                    if(str1.equals("R")){
                        if(str2.equals("S")){
                            count1++;
                        } else if(str2.equals("P")){
                            count2++;
                        }
                    } else if(str1.equals("P")){
                        if(str2.equals("R")){
                            count1++;
                        } else if(str2.equals("S")){
                            count2++;
                        }
                    } else if(str1.equals("S")){
                        if(str2.equals("P")){
                            count1++;
                        } else if(str2.equals("R")){
                            count2++;
                        }
                    }
                }
                
            }
            if(count1 == count2){
                    bw.write("TIE\n");
                } else if(count1 > count2){
                    bw.write("Player 1\n");
                } else {
                    bw.write("Player 2\n");
                }
        }
        bw.flush();
        bw.close();
    }
}