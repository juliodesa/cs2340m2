package edu.gatech.oad.antlab.person;

/**
 * A simple class for person 4
 * returns their name and a
 * modified string
 *
 * @author Bob
 * @version 1.1
 */
public class Person4 {
    /**
     * Holds the persons real name
     */
    private String name;

    /**
     * The constructor, takes in the persons
     * name
     *
     * @param pname the person's real name
     */
    public Person4(String pname) {
        name = pname;
    }

    /**
     * This method should return a string
     * where each character is 1 greater
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is empty.");
        }
        String in = input;
        String output = "";
        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(i);
            char nextLetter = 'a';
            switch (ch) {
                case 'a':
                    nextLetter = 'b';
                    break;
                case 'b':
                    nextLetter = 'c';
                    break;
                case 'c':
                    nextLetter = 'd';
                    break;
                case 'd':
                    nextLetter = 'e';
                    break;
                case 'e':
                    nextLetter = 'f';
                    break;
                case 'f':
                    nextLetter = 'g';
                    break;
                case 'g':
                    nextLetter = 'h';
                    break;
                case 'h':
                    nextLetter = 'i';
                    break;
                case 'i':
                    nextLetter = 'j';
                    break;
                case 'j':
                    nextLetter = 'k';
                    break;
                case 'k':
                    nextLetter = 'l';
                    break;
                case 'l':
                    nextLetter = 'm';
                    break;
                case 'm':
                    nextLetter = 'n';
                    break;
                case 'n':
                    nextLetter = 'o';
                    break;
                case 'o':
                    nextLetter = 'p';
                    break;
                case 'p':
                    nextLetter = 'q';
                    break;
                case 'q':
                    nextLetter = 'r';
                    break;
                case 'r':
                    nextLetter = 's';
                    break;
                case 's':
                    nextLetter = 't';
                    break;
                case 't':
                    nextLetter = 'u';
                    break;
                case 'u':
                    nextLetter = 'v';
                    break;
                case 'v':
                    nextLetter = 'w';
                    break;
                case 'w':
                    nextLetter = 'x';
                    break;
                case 'x':
                    nextLetter = 'y';
                    break;
                case 'y':
                    nextLetter = 'z';
                    break;
                case 'z':
                    nextLetter = 'a';
                    break;
                case '1':
                    nextLetter = '2';
                    break;
                case '2':
                    nextLetter = '3';
                    break;
                case '3':
                    nextLetter = '4';
                    break;
                case '4':
                    nextLetter = '5';
                    break;
                case '5':
                    nextLetter = '6';
                    break;
                case '6':
                    nextLetter = '7';
                    break;
                case '7':
                    nextLetter = '8';
                    break;
                case '8':
                    nextLetter = '9';
                    break;
                case '9':
                    nextLetter = '0';
                    break;
            }
            output = output + nextLetter;
        }
        return output;
    }


    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     * object
     */
    public String toString(String input) {
        return name + calc(input);
    }

}