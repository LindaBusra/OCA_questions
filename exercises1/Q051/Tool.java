package Others.OCA.exercises1.Q051;

class Tool implements  Exportable {


    public void export() {            //line n1    it was: protected void export() -->Compilation fails at line n1

        System.out.println("Tool :: export");

    }

}