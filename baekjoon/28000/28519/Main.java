// https://www.acmicpc.net/problem/28519
// Планеты двух измерений
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 != n2){
            System.out.println(Integer.min(n1, n2) * 2 + 1);
        } else {
            System.out.println(Integer.min(n1, n2) * 2);
        }
        
        bw.flush();
        bw.close();
    }

  
}
