import java.util.*;

public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

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
	  throw new RuntimeException("ZIP Contains a non-digit");
      }
      if (zip.length() != 5)
	  throw new RuntimeException("ZIP not correct length");
      else{
	  _zip = zip;
	  _checkDigit = checkSum()%10;
      }
  }
// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      return new Barcode(_zip);
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int sum = 0;
      for (int i = 0; i < _zip.length(); i++){
	  sum += _zip.charAt(i) - '0'; // subtracting by '0' allows you to get int value of char
      }
      return sum;     
  }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String s = _zip + _checkDigit + "  |";
      String t = _zip + _checkDigit;
      for (int x = 0; x < t.length(); x++){
	  int i = t.charAt(x) - '0';
	  switch(i){
	  case 0: s += "||:::";
	      break;
	  case 1: s += ":::||";
	      break;
	  case 2: s += "::|:|";
	      break;
	  case 3: s += "::||:";
	      break;
	  case 4: s += ":|::|";
	      break;
	  case 5: s += ":|:|:";
	      break;
	  case 6: s += ":||::";
	      break;
	  case 7: s += "|:::|";
	      break;
	  case 8: s += "|::|:";
	      break;
	  case 9: s += "|:|::";
	      break;
	  default:
	      break;
	  }
      }
      return s + "|";
  }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return (Integer.valueOf(_zip + _checkDigit)).compareTo(Integer.valueOf(other._zip + other._checkDigit));
    }
    // TESTING
    
    // public static void main(String[]args) {
    // 	Barcode a = new Barcode("08451");
    // 	Barcode b = new Barcode("11111");
    // 	System.out.println(a);
    // 	System.out.println(b);
    // 	//exception check
    //  //Barcode c = new Barcode("123");
    // 	//Barcode d = new Barcode("123456");
    // 	//Barcode e = new Barcode("qwerty");
    // }

    // TESTING THE COMPARETO FUNCTIONALITY AND LIMITATIONS
    
    // public static void main(String[] args) {

    // 	// compares two Integer objects numerically
    //     String obj1 = "08451";
    // 	String obj2 = "11111";
    // 	int compared = obj1.compareTo(obj2);
	
    // 	if(compared > 0) {
    // 	    System.out.println("obj1 is greater than obj2");
    // 	}
    // 	else if(compared < 0) {
    // 	    System.out.println("obj1 is less than obj2");
    // 	}
    // 	else {
    // 	    System.out.println("obj1 is equal to obj2");
    // 	}
    // }
}
