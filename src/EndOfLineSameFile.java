/*
 * End of line version two
 * In this version, a old file would be rewritten
 * with the new end of brace
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EndOfLineSameFile 
{
	public static void main(String[] args) throws IOException 
	{
        //initialize the String that would be read
		String s,currentLine = " ";

		//initalize the writer
		FileWriter inputFileWriter = new FileWriter("C:/Users/Rong/Desktop/self written code/EndOfLine/src/Main.java", true);
		BufferedWriter outputFileWriter =new BufferedWriter(inputFileWriter);

		try
		{
			//initialize the reader
			FileReader inputFileReader = new FileReader("C:/Users/Rong/Desktop/self written code/EndOfLine/src/Main.java");
			BufferedReader outputFileReader=new BufferedReader(inputFileReader);

			//reading the file while there is no empty file
			while((s = outputFileReader.readLine())!=null)
			{
				//same logic like the last code
				String nextLine = s;
				if(nextLine.contains("{")) 
					outputFileWriter.write(currentLine + "{" );
				else if(currentLine.contains("{")) 
					outputFileWriter.write("");
				else
					outputFileWriter.write(currentLine);
				currentLine = nextLine;
			}
			outputFileReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File was not found!");
		}
		catch(IOException e)    
		{
			System.out.println("No file found!");
		}
		outputFileWriter.close();
	}
}
