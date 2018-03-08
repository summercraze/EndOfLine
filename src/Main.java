/*
 * This is the customized exception
 * 
 */
public class Main extends Exception
{
  private char hexChar;
  
  /*Construct an exception*/
  public Main(char hexChar)
  {
	  super("Invalid hex character: " + hexChar);
  }
  
  /*return the hexstring*/
  public char getHexstring()
  {
	  return hexChar;
  }
  
}
 /* * This is the customized exception *  */public class Main extends Exception{  private char hexChar;    /*Construct an exception*/  public Main(char hexChar){	  super("Invalid hex character: " + hexChar);  }    /*return the hexstring*/  public char getHexstring(){	  return hexChar;  }   /* * This is the customized exception *  */public class Main extends Exception{  private char hexChar;    /*Construct an exception*/  public Main(char hexChar){	  super("Invalid hex character: " + hexChar);  }    /*return the hexstring*/  public char getHexstring(){	  return hexChar;  }  }{