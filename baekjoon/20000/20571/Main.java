// https://www.acmicpc.net/problem/20571
// Elevators
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String type = sArray[0];
        int key = Integer.parseInt(sArray[1]);
        int answer = 0;
        if(type.equals("residential")){
            if(key >= 16){
                answer = 4;
            } else if(key >= 11){
                answer = 3;
            } else if(key >= 6){
                answer = 2;
            } else if(key >= 2){
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(type.equals("commercial")){
            if(key >= 15){
                answer = 3;
            } else if(key >= 8){
                answer = 2;
            } else if(key >= 2){
                answer = 1;
            } else {
                answer = 0;
            }
        } else {
            if(key >= 17){
                answer = 5;
            } else if(key >= 13){
                answer = 4;
            } else if(key >= 9){
                answer = 3;
            } else if(key >= 5){
                answer = 2;
            } else if(key >= 2){
                answer = 1;
            } else {
                answer = 0;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
