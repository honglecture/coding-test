// https://www.acmicpc.net/problem/8941
// 7종 경기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        double carbon = 12.01;
        double hydrogen = 1.008;
        double oxygen = 16.00;
        double nitrogen = 14.01;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            double sum = 0;
            String type = "";
            String num = "";
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'C' || c == 'H' || c == 'O' || c == 'N'){
                    if(type.equals("")){
                        type = String.valueOf(c);
                    } else {
                        double result = num.equals("") ? 1.0 : Double.parseDouble(num);
                        if(type.equals("C")){
                            sum += carbon * result;
                        } else if(type.equals("H")){
                            sum += hydrogen * result;
                        } else if(type.equals("O")){
                            sum += oxygen * result;
                        } else if(type.equals("N")){
                            sum += nitrogen * result;
                        }
                        type = "";
                        num = "";
                    }
                } else {
                    num += String.valueOf(c);
                }
            }
            double result = num.equals("") ? 1.0 : Double.parseDouble(num);
            bw.write(num + "\n");
            if(type.equals("C")){
                sum += carbon * result;
            } else if(type.equals("H")){
                sum += hydrogen * result;
            } else if(type.equals("O")){
                sum += oxygen * result;
            } else if(type.equals("N")){
                sum += nitrogen * result;
            }
            
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}