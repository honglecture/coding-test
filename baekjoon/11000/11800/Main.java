// https://www.acmicpc.net/problem/11800
// Tawla
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array1 = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash",  "Dosh"};
        String[] array2 = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int max = Integer.max(n1, n2);
            int min = Integer.min(n1, n2);
            if(max == min){
                bw.write("Case "+(i + 1)+": " + array1[max] + "\n");
            } else {
                String result = array2[max] + " " + array2[min];
                if(result.equals("Sheesh Bang")){
                    result = "Sheesh Beesh";
                }
                bw.write("Case "+(i + 1)+": " + result + "\n");
            }
        }
        bw.flush();
        bw.close(); 
    }

}