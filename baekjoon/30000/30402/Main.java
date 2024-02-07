// https://www.acmicpc.net/problem/30402
// 감마선을 맞은 컴퓨터
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[15][15];
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String s = array[i][j];
                if(s.equals("w")){
                    answer = "chunbae";
                } else if(s.equals("b")){
                    answer = "nabi";
                } else if(s.equals("g")){
                    answer = "yeongcheol";
                }
                if(!answer.equals("")){
                    break;
                }
            }
            if(!answer.equals("")){
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
