// https://www.acmicpc.net/problem/15233
// Final Score
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int countA = 0;
        int countB = 0;
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            setA.add(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            setB.add(sArray[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            String name = sArray[i];
            if(setA.contains(name)){
                countA++;
            } else if(setB.contains(name)){
                countB++;
            }
        }
        if(countA > countB){
            System.out.println("A");
        } else if(countA < countB){
            System.out.println("B");
        } else {
            System.out.println("TIE");
        }
        bw.flush();
        bw.close();
    }

    
}
