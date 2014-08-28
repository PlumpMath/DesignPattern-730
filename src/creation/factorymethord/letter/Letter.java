/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.factorymethord.letter;

/**
 * http://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Factory_method
 * @author dengxt
 */
public abstract class Letter {

    //Sometimes there is cache here.
    // Factory Method
    public static Letter getLetter(char aTheLetter) {
        if (aTheLetter == 'a'
                || aTheLetter == 'e'
                || aTheLetter == 'i'
                || aTheLetter == 'o'
                || aTheLetter == 'u'
                || aTheLetter == 'A'
                || aTheLetter == 'E'
                || aTheLetter == 'I'
                || aTheLetter == 'O'
                || aTheLetter == 'U') {
            return new Vowel(aTheLetter);
        } else {
            return new Consonant(aTheLetter);
        }
    }
    // Our new abstracted field. We'll make it protected so that subclasses can see it,
    // and we rename it from "i" to "f", following our naming convention.
    protected char fTheLetter;

    // Our new constructor. It can't actually be used to instantiate an instance
    // of Letter, but our sub classes can invoke it with super
    protected Letter(char aTheLetter) {
        this.fTheLetter = aTheLetter;
    }

    // The new method we're abstracting up to remove redundant code in the sub classes
    public char getChar() {
        return this.fTheLetter;
    }
    // Same old abstract methods that define part of our client facing interface

    public abstract boolean isVowel();

    public abstract boolean isConsonant();

    // The local subclasses with the redundant code moved up.
    private static class Vowel extends Letter {

        // Constructor delegates to the super constructor
        Vowel(char aTheLetter) {
            super(aTheLetter);
        }

        // Still need to implement the abstract methods
        public boolean isVowel() {
            return true;
        }

        public boolean isConsonant() {
            return false;
        }
    } // End local class Vowel

    private static class Consonant extends Letter {

        Consonant(char aTheLetter) {
            super(aTheLetter);
        }

        public boolean isVowel() {
            return false;
        }

        public boolean isConsonant() {
            return true;
        }
    } // End local class Consonant
} // End toplevel class Letter

