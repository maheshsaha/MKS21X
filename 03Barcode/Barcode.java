import java.util.*;

public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String _zip;
    private int _checkDigit; //checks integrity of the barcode. If false, barcode damaged

    //Array of code
    private static String[]code = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    
    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
	try{
	    Integer.parseInt(zip);
	}
	catch (NumberFormatException e){
	    throw new IllegalArgumentException("ZIP Contains a non-digit");
      }
	if (zip.length() != 5)
	    throw new IllegalArgumentException("ZIP not correct length");
	else{
	    _zip = zip;
	    _checkDigit = checkSum(_zip)%10;
	}
    }
    
    // postcondition: computes and returns the check sum for _zip 
    private static int checkSum(String n){
	int sum = 0;
	for (int i = 0; i < n.length(); i++){
	    sum += n.charAt(i) - '0'; // subtracting by '0' allows you to get int value of char
	}
	return sum;     
    }
    
    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String t = _zip + _checkDigit + "  |";
	int x = 0;
        while (x < _zip.length()+1){
	    t += code[(_zip+_checkDigit).charAt(x)-'0'];
	    x++;
	}
	return t + "|";
    }
    
    
    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return (_zip + _checkDigit).compareTo(other._zip + other._checkDigit);
    }

    public static String toCode(String zip){
	try{
	    Integer.parseInt(zip);
	}
	catch (NumberFormatException e){
	    throw new IllegalArgumentException("ZIP Contains a non-digit");
	}
	if (zip.length() != 5)
	    throw new IllegalArgumentException("ZIP not correct length");
	zip += checkSum(zip)%10;
	String x = "|";
	for (int i = 0; i < zip.length(); i++){
	    x += code[zip.charAt(i) - '0'];
	}
	return x + "|";
    }

    private static int codeDigit(String d){ //turns one coded digit into digit
	int x = 0;
	while (x < code.length){
	    if (code[x].equals(d))
		return x;
	    x ++;
	}
	throw new IllegalArgumentException("Not a valid int/Non-barcode chars in use");
    }

    
    public static String toZip(String code){
	if (code.length() != 32)
	    throw new IllegalArgumentException("Length of barcode is not accurate");
	else if(code.charAt(0)!='|' || code.charAt(31)!='|')
	    throw new IllegalArgumentException("Left and/or rightmost characters are not '|'");
	

	//checkSum of code
	else{
	    int sum = 0;
	    int i = 1;
	    while (i < 22 && code.length() == 32){
		sum += codeDigit(code.substring(i,i+5));
		i+=5;       
	    }
	    if(codeDigit(code.substring(26,31)) != sum%10)
		throw new IllegalArgumentException("checkSum is invalid");
	    else{
		String s = "";
		int x = 1;
		while (x < code.length()-6){
		    s += codeDigit(code.substring(x, x+5));
		    x+=5;
		}
		return s;
	    }
	}
    }

    /*
length wrong
invalid set of symbols
bad checksum
side bar is wrong
invalid chars
    */
}
