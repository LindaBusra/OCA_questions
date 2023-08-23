package Others.OCA.exercises1.Q063;

public class Q063 {
}


interface Exportable {
    void export(); //interface-->default access modifier is public
}


class Tool implements Exportable {

    public void export() {        //line1         //access modifier-->public >protected >default >private
        System.out.println("Tool::export");
    }
}


class ReportTool extends Tool {
    public void export() {                      // line n2   ----> it was : void export()
	        System.out.println("RTool::export");
    }



    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex) {
        ex.export();

    }
}
// What is the result?
// A. Compilation fails only at line n2.                    +
// B. RTool:exportTool::export
// C. Tool::exportTool:export
// D. Compilation fails only at line n1.
// E. Compilation fails at both line n1 and line n2.
//
// Answer: A




