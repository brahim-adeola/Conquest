package cli;

public class CommandParser
{
    private String option;
    private String filename;

    public CommandParser(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Usage: wc <option> <filename>");
            System.exit(1);
        }

        this.option = args[0];
        this.filename = args[1];
    }
    
    public String getOption()
    {
        return option;
    }

    public String getFilename()
    {
        return filename;
    }
}
