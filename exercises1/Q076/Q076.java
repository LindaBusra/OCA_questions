package Others.OCA.exercises1.Q076;

public class Q076 {
}

abstract class Planet{
    protected void revolve(){

    }
    abstract void rotate();
}


class Earth extends Planet{
    protected void revolve(){ //protected or public

    }
     protected void rotate(){ //make a protected

    }
}


/*
abstract class Planet{
    protected void revolve(){

    }
    abstract void rotate();
}
class Earth extends Planet{
    private void revolve(){ //protected

    }
    private void rotate(){ //make a protected

    }
}


/*
Which two modifications enable the code to compile? or question might be three modifications
A. Make the method at line 8 protected.
B.	Make the method at line 8 public.
C.	Make the method at line 10 protected.
D.	Make the method at line 4 public.
E.	Make the method at line 2 public.
Answer: AC veya BC ikiside calisir
 */
