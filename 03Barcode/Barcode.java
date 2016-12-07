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
      if (zip.length() != 5)
	  throw new RuntimeException("ZIP not correct length");
      else{
	  _zip = zip;
	  _checkDigit = _zip.checkSum();
      }
}

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){}


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int sum = 0;
      
  }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}
