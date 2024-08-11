// https://www.acmicpc.net/problem/15820
// 맞았는데 왜 틀리죠?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        String answer = "";
        if(size1 == 0){
            for (int i = 0; i < size2; i++) {
                sArray = bf.readLine().split(" ");
                if(!sArray[0].equals(sArray[1])){
                    answer = "Why Wrong!!!";
                    break;
                }
            }
            if(answer.equals("")){
                answer = "Accepted";
            }
        } else if(size2 == 0){
            for (int i = 0; i < size1; i++) {
                sArray = bf.readLine().split(" ");
                if(!sArray[0].equals(sArray[1])){
                    answer = "Wrong Answer";
                    break;
                }
            }
            if(answer.equals("")){
                answer = "Accepted";
            }
        } else {
            for (int i = 0; i < size1; i++) {
                sArray = bf.readLine().split(" ");
                if(!sArray[0].equals(sArray[1])){
                    answer = "Wrong Answer";
                    break;
                }
            }
            if(answer.equals("")){
                for (int i = 0; i < size2; i++) {
                    sArray = bf.readLine().split(" ");
                    if(!sArray[0].equals(sArray[1])){
                        answer = "Why Wrong!!!";
                        break;
                    }
                }
            }
            if(answer.equals("")){
                answer = "Accepted";
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}