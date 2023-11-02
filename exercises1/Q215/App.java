package Others.OCA.exercises1.Q215;

class LogFileException extends Exception {}
class AccessViolationException extends RuntimeException {}


public class App {

    public static void main(String[] args) {

        App obj = new App();

        try{
            obj.open();
            obj.process();
            //insert code here
        } catch (Exception e) {
            System.out.println("Completed.");
        }
    }


    public void process() throws LogFileException {     //I added throws LogFileException
        System.out.println("Processed");
        throw new LogFileException();
    }

    public void open() {
        System.out.println("Opened.");
        throw new AccessViolationException();
    }


    //output: Opened.
    //Completed.
}

/*
Which action fixes the compiler error?
A. At line 17, add throws AccessViolationException
B. At line 13, add throws LogFileException +
C. At line 2, replace throws LogFileException with throws AccessViolationException
D. At line 7, insert throw new LogFileException ();
 */