package src.main.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Four phases of text processing to do. Write a method for each one.
 *
 * public void print()  - write a method that reads the contents of a file, line by line, and creates a String object,
 * making sure all the newlines are preserved. use BufferedReader to do the reading.
 *
 * For the sake of this lab, words are not and do not have punctuation.
 *
 * public WCResult wc(String input)
 * commonly called "wc"; count the number of characters in a file, number of words, number of lines.
 * Returns an object of class WCResult (a POJO) which consists of the three longs you counted.
 *
 * public FrequencyMap wordFrequency(String input)
 * word count. words in a file, produce a map with (String word, Long numOfTimes). FrequencyMap returning a HashMap might be what you're
 * looking for here, or maybe something else.
 *
 * public FrequencyMap letterFrequency(String input)
 * letter frequency, write a program that collects the frequency of each letter within the input.
*/

public class WordForWord {



    // You'll need to setup some instance variables for the phases of processing
    // you need to do on the text in the file(s).
    // And where SHOULD those POJO classes go? Inner classes? Separate public classes?
    // The decision depends on how you envision using the methods in this class.


    public static void main(String[] args) throws FileNotFoundException {

//        WordForWord wfw = new WordForWord();
//        wfw.loadFile("testdata1.txt");
//        wfw.processAll();
//        System.out.println(wfw);
//        Scanner words = new Scanner(new FileInputStream("testdata1.txt"));
//        String words=wfw.loadFile().split(" ");
        String str = "Alice is girl and Bob is boy";
        HashMap<String , Integer> map = new HashMap<>();
        String[] words = str.split(" ");


        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word+1));
            }else{map.put(word,1);
                System.out.println(map);
            }

        }


    }

//    public String toString() {
//       return "File content: "+ fileContent; // create a brief report on what you found out about the file contents.
//    }

    private void processAll() {
    }

    private void loadFile(String file) {
        StringBuilder content = new StringBuilder();

    }

}
