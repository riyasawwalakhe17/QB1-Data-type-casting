package Qthree;

public class ImplicitTypeCasting {

	public static void main(String[] args){

		byte byteValue = 10;
		short byteInshort = byteValue;
		System.out.println("byte to short: "+byteInshort);

		short shortValue = 65;
		char shortInchar = (char)shortValue;
		System.out.println("short to char: "+shortInchar);

		char charValue = 'R';
		int charInint = charValue;
		System.out.println("char to int: "+charInint);

		int intValue = 1000;
		long intInlong = intValue;
		System.out.println("int to long: "+intInlong);

		long longValue = 42000;
		float longInfloat = longValue;
		System.out.println("long to float: "+longInfloat);

		float floatValue = 92.32f;
		double floatIndouble = floatValue;
		System.out.println("float to double: "+floatIndouble);


		}

}
