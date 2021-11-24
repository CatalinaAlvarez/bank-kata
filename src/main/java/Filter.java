import java.io.PrintStream;
import java.util.List;

public class Filter {

    Statement statement = new Statement();
    List<String> statementList = statement.returnStatementlist();

    public void printFilterByDate(PrintStream printer, String filter){
        System.out.println("\n---FILTER BY DATE---");
        statement.statementTitle(System.out);
        for(int i = 0; i < statementList.size(); i++){
            String stringAtIndex = statementList.get(i);
            String subStringLine = stringAtIndex.substring(1,11);
            if(subStringLine.equals(filter)) printer.println(statementList.get(i));
        }
    }
}
