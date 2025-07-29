package Qfour;

public class ExplicitTypeCasting {

	public static void main(String[] args){

		short shortValue = 1000;
		byte shortInbyte = (byte)shortValue;
		System.out.println("short to byte: "+shortInbyte);

		char charValue = 'R';
		short charInshort = (short)charValue;
		System.out.println("char to short: "+charInshort);

		int intValue = 65;
		char intInchar = (char)intValue;
		System.out.println("int to char: "+intInchar);

		long longValue = 20;
		int longInint = (int)longValue;
		System.out.println("long to int: "+longInint);

		float floatValue = 8;
		long floatInlong = (long)floatValue;
		System.out.println("float to long: "+floatInlong);

		double doubleValue = 456.78;
		float doubleInfloat = (float)doubleValue;
		System.out.println("double to float: "+doubleInfloat);


		}

}
