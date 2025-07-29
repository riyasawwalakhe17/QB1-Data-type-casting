package Qtwo;

public class PrimitiveToWrapperClass {

	static int i = 10;
	static short s = 20;
	static long l = 64;
	static float f = 80;
	static byte b = 73;
	static double d = 90;
	static char c = 'R';
	static boolean bo = false;
	static String str = "$@";

	public static void main(String[] args){

	Object iObj = Integer.valueOf (i);
	Object sObj = Short.valueOf (s);
	Object lObj = Long.valueOf (l);
	Object bObj = Byte.valueOf (b);
	Object fObj = Float.valueOf (f);
	Object dObj = Double.valueOf (d);
	Object cObj = Character.valueOf (c);
	Object boObj = Boolean.valueOf (bo);
	Object strObj = String.valueOf (str);

	System.out.println("Value of Integer is: "+i);

	System.out.println("Valueof Short is: "+s);

	System.out.println("Value of Long is: "+l);

	System.out.println("Value of Float is: "+f);

	System.out.println("Value of Byte is: "+b);

	System.out.println("Value of Double is: "+d);

	System.out.println("Value of Character is: "+c);

	System.out.println("Value of Boolean is: "+bo);

	System.out.println("Value of String: "+str);

	}

}
