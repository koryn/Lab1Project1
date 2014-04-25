
public class Lab1prog2 {

	public static void main(String[] args) {
		ConvertTemp = new program2 ();
		
		convertCtoFandprint();
		convertFtoCandprint();


	}
	float convertC(float farhNum){
		return ((farhNum-32)/(180.0f/100.0f));
	}
	float convertF(float celcNum){
		return (32 + celcNum * (180.0f/100.0f));
		
		
	}
	void convertCtoFAndPrint(){
		Scannerin= new Scanner(System.in);
		float userCelcNum, farhNum;

		System.out.printf("\nPlease enter a celcius tempature and in return you will recieve a fahrenheit tempature. ");
		System.out.printf("\nPlease enter a celcius temperature:");
		userCelcNum=in.nextFloat();
		farhNum=convertF(userCelcNum);
		System.out.printf("\n%5.1 f degrees celcius is %5.1f degrees fahrenheit\n",userCelcNum, farhNum);
	}
	void convertFtoCAndPrint(){
		Scannerin=new Scanner(System.in);
		float userFarhNum, celcNum;

		System.out.printf("\nPlease enter a fahrenheit tempature and in return you will recieve a celcius tempature. ");
		System.out.printf("\nPlease enter a fahrenheit temperature:");
		userFarhNum=in.nextFloat();
		celcNum=convertC(userFarhNum);
		System.out.printf("\n%5.1 f degrees fahrenheit is %5.1f degrees celcius\n",userFarhNum, celcNum);
		in.close();
	}
}
	}

}
