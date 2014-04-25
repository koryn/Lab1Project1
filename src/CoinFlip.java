
public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
String sideUp = new String();

Coin(){};
void Toss(){
	int random1	= (int)Math.random() * 2 + 1;
	if(random1 == 1)
		{sideUp = "Heads";}
	else
		{sideUp = "Tails";}
}
	String getSideUp(){
		return sideUp;
	}
	}


