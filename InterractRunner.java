import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Kolyambo on 03.07.2017.
 */
public class InterractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try{
                Calculator calc = new Calculator();
                String exit = "no";
                while(!exit.equals("yes")){
                    System.out.println("Enter first arg : ");
                    String first = reader.next();
                    System.out.println("Enter second arg : ");
                    String second = reader.next();
                    calc.summ(Integer.valueOf(first),Integer.valueOf(second));
                    calc.cleanResult();
                    System.out.println("Exit : yes/no ");
                    exit = reader.next();
                }

        }finally {
            reader.close();
        }
    }
}
