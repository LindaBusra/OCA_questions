package Others.OCA.exercises1.Q221;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);
    }
}

/*
What is the result?
A. [green, red, yellow, cyan]
B. [green, blue, yellow, cyan]  +
C. [green, red, cyan, yellow]
D. An IndexOutOfBoundsException is thrown at runtime
 */