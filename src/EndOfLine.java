import java.io.PrintWriter;
import java.util.Scanner;

public class EndOfLine 
{
	public static void main(String[] args) throws Exception
	{
		String currentLine = "";
		java.io.File file = new java.io.File("C:/Users/Rong/Desktop/self written code/EndOfLine/src/Main.java");
		java.io.File outputFile = new java.io.File("C:/Users/Rong/Desktop/self written code/EndOfLine/Main.java");
		try
		(
				Scanner input = new Scanner(file);
				PrintWriter output = new PrintWriter(outputFile);
				)
		{
			while(input.hasNext())
			{
				String nextLine = input.nextLine();
				if(nextLine.contains("{")) 
					output.println(currentLine + "{" );
				else if(currentLine.contains("{")) 
					output.print("");
				else
					output.println(currentLine);
				currentLine = nextLine;
			}
		}
	}
}
