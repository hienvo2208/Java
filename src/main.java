
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        System.out.println("=============BMI===================");
        Scanner scanner = new Scanner(System.in);
        indexBmi in = new indexBmi(68,1.6);
        System.out.println("Chi so cua ban: "+in.caculateBmi());
        in.classify();
    }
}
