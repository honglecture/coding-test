// https://www.acmicpc.net/problem/6825
// Body Mass Index
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double w = Double.parseDouble(bf.readLine());
        double h = Double.parseDouble(bf.readLine());
        double result1 = h * h;
        double result2 = w / result1;
        if(25 < result2){
            System.out.println("Overweight");
        } else if(result2 < 18.5){
            System.out.println("Underweight");
        } else {
            System.out.println("Normal weight");
        }
        bw.flush();
        bw.close();
    }

    
}