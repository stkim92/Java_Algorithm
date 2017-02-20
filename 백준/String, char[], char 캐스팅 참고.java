String str = "한글데이터 변환하기";
char[] chr = str.toCharArray();
String change = "";
 
// 하나씩 더하는 방법
for (int i = 0; i < chr.length; i++) {
    change += Character.toString(chr[i]);
}
 
System.out.println(change);


String str = "한글데이터 변환하기";
char[] chr = str.toCharArray();
String change = "";
 
// String 클래스 이용
change = new String(chr, 0, chr.length);
 
System.out.println(change);

// 단어가 하나일때 
String change = "";
char cr = 'A';
change = String.valueOf(cr);
change = Character.toString(cr);
change = new Character(cr).toString();
         
System.out.println(change);

