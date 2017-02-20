** int to String **
String str = Integer.toString(i);
String str = "" + i;


** String to int ** 
int i = Integer.parseInt(str);
int i = Integer.valueOf(str).intValue();


** double to String **
String str = Double.toString(d);


** long to String **
String str = Long.toString(l);


** float to String **
String str = Float.toString(f);


** String to double ** 
double d = Double.valueOf(str).doubleValue();


** String to long **
long l = Long.valueOf(str).longValue();
long l = Long.parseLong(str);


** String to float **
float f = Float.valueOf(str).floatValue();


** decimal to binary **
String binstr = Integer.toBinaryString(i);


** decimal to hexadecimal **
String hexstr = Integer.toString(i, 16);
String hexstr = Integer.toHexString(i);
Integer.toHexString( 0x10000 | i).substring(1).toUpperCase());


** hexadecimal(String) to int **
int i = Integer.valueOf("B8DA3", 16).intValue();
int i = Integer.parseInt("B8DA3", 16);


** ASCII Code to String **
String char = new Character((char)i).toString();


** Integer to ASCII Code **
int i = (int) c;


** Integer to boolean **
boolean b = (i != 0);


** boolean to Integer **
int i = (b)? 1 : 0;