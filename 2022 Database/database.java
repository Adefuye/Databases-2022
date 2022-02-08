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
                        Integer.parseInt(in[i].trim());
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
}