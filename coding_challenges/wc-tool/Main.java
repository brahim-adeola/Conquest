import cli.CommandParser;
import service.WCService;
import model.WCResult;


public statuc void main(String[] args)
{
    //parse command line arguments
    CommandParser parser = new CommandParser(args);
    String option = parser.getOption();
    String filename = parser.getFilename();
    
    // call the service layer
    WCService service = new WCService();
    WCResult result = service.process(option, filename);

    // print result
    System.out.println(rasult);
}
