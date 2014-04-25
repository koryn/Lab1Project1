import java.util.Scanner;
public class Lab1proj1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qty [] = new int [5];
		float price [] = {400.00f, 220.00f, 35.20f, 300.00f, 150.00f};
		float total [] = new float [5];
		//string name [];
		float subtotal, grandtotal, tax;
		grandtotal = subtotal = tax = 0;
		
		
		// Declaration
		System.out.printf("Enter quantity of TV's sold     ");
		qty[0] = in.nextInt();
		System.out.printf("Enter quantity of VCR's sold    ");
		qty[1] = in.nextInt();
		System.out.printf("Enter quantity of Remotes sold  ");
		qty[2] = in.nextInt();
		System.out.printf("Enter quantity of CD's sold     ");
		qty[3] = in.nextInt();
		System.out.printf("Enter quantity of Tape's sold   ");
		qty[4] = in.nextInt();
		for(int x=0; x<5; x++)
		{
			total[x]= qty[x]* price[x];
			subtotal += total[x];
		
		tax = 0.0825f * subtotal;
		grandtotal = subtotal + tax;
		
		System.out.printf("QTY    DESC     PRICE     TOTAL " );
		System.out.printf("%d", qty[x]);
		System.out.printf("%s", qty[x]);
		System.out.printf("%d", qty[x]);
		System.out.printf("%d", qty[x]);
		System.out.printf("%d", qty[x]);
		
} }}

