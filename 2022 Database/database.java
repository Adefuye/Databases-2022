import java.io.*;

public class database{

    public static void main(String[] args)
    {
        File f = new File("outputFile.txt");
        for(String s: args)
        {
           readFile(s);
        }
    }



    public static void readFile(String input){
        String inputFile = input;
        BufferedReader reader = null;
        String line= "";

        try{
            reader = new BufferedReader(new FileReader(inputFile));
            FileWriter outputWriter = new FileWriter("outputFile.txt");

            while((line = reader.readLine()) != null){
                String output = "";
                String[] in = line.split(",");

                for(int i = 0; i < in.length; i++){
                    try{
                        Integer.parseInt(in[i]);
                        output+="Integer";
                    }
                    catch(Exception e){
                        output+="Text";
                    }
                    if(i < in.length-1){
                        output+=", ";
                    }
                }
                outputWriter.write(output + "\n");
            }
            outputWriter.close();
        }
        catch(Exception e){
            System.out.println("READER FAIL");
        }
    }

    public void writeFile(){
        //write the file to a .txt

    }

    //Declare a variable to write results to an output file
    //Read the file

    //For each line in the file:
    //	Initialize an output string
    //	Split the values on the commas, i.e., line.split(",")
    //	For each value:
    //		If it is an integer, add "Numeric" to the output string			
    //		Else, assume it is string and add "Text" to the output string
    //	Write the output string to the output file.


}