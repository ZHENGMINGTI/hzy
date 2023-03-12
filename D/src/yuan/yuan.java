package yuan;
import java.util.Scanner;
public class yuan {
	    public static void main(String[] args) {
	        double radius;
	        double area;
	        Scanner input = new Scanner(System.in);
	        System.out.print("radius=");
	        radius = input.nextDouble();
	        area = Math.PI * radius *radius;
	        System.out.println("" + area);
	    }
	}

