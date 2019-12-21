package ru.job4j.stragery;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Triangle implements Shape {

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +");
        pic.append(System.lineSeparator());
        pic.append("  +  +");
        pic.append(System.lineSeparator());
        pic.append(" +     +");
        pic.append(System.lineSeparator());
        pic.append("++++++++");
        return pic.toString();
    }
}
