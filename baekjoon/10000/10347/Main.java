// https://www.acmicpc.net/problem/10347
// Reverse Rot
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = {
            "A","B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","_","."
        };
        while (true) {
            String temp = bf.readLine();
            if(temp.equals("0")){
                break;
            }
            String[] sArray = temp.split(" ");
            int n = Integer.parseInt(sArray[0]);
            StringBuilder str = new StringBuilder(sArray[1]).reverse();
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int index = 0;
                if(c == '_'){
                    index = 26;
                } else if(c == '.'){
                    index = 27;
                } else {
                    index = c - 65;
                }
                index += n;
                if(index > array.length - 1){
                    index -= array.length;
                }
                answer.append(array[index]);
            }
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}



