// https://www.acmicpc.net/problem/17826
// 나의 학점은?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int key = Integer.parseInt(bf.readLine());
        int rank = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                rank = i + 1;
            }
        }
        if(rank <= 5){
            System.out.println("A+");
        } else if(rank <= 15){
            System.out.println("A0");
        } else if(rank <= 30){
            System.out.println("B+");
        } else if(rank <= 35){
            System.out.println("B0");
        } else if(rank <= 45){
            System.out.println("C+");
        } else if(rank <= 48){
            System.out.println("C0");
        } else {
            System.out.println("F");
        }
        bw.flush();
        bw.close();
    }
    
}