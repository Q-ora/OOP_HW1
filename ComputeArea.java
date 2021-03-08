import java.io.*;
import java.util.Scanner;

public class ComputeArea{
    public static void main(String[] args) throws IOException{  //拋出因檔案的開啟和寫入 可能的異常IOException
        Scanner scanner = new Scanner(System.in);
        float a = 0, b = 0, c = 0;
        float s = 0;
        double area = 0;
        int questionCnt = 1;

        //open file
        FileWriter fout = new FileWriter("java_result.txt");

        while(true){
            System.out.println("Please input the lengths of the three sides of the triangle:");
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            //三邊都是-1代表結束
            if(a==-1 && b==-1 && c==-1)
                break;
            
            //寫入input測資
            fout.write("Question " + questionCnt + " inputs are, " 
            + "a = " + a + ", " + "b = " + b + ", " + "c = " + c + "." + "\n");
            
            //檢查邊長是否合法
            if(a<=0 || b<=0 || c<=0
            || a+b<=c || a+c<=b || b+c<=a){
                System.out.println("The input is not legal.");
                fout.write("The input is not legal." + "\n");
                continue;
            }

            //compute area
            s = (a + b + c) / 2;
            area = Math.sqrt( (double)(s*(s-a)*(s-b)*(s-c)) );
            fout.write("The Area of this triangle is " + area + "\n");
            System.out.println("The Area of this triangle is " + area);
            System.out.println("The answer has been output to java_result.txt");

            questionCnt++;
        }

        fout.close();
    }
}