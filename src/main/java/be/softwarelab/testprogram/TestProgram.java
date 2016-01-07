package be.softwarelab.testprogram;

import java.util.Locale;

public class TestProgram {
    
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TestProgram.class);
    private static final org.slf4j.Logger CONSOLE = org.slf4j.LoggerFactory.getLogger("Console");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LOGGER.info("Test Program: START");
        CONSOLE.info("Test Program: START");
        
        String sentence = null;
        String start = "This is";
        String day = "Day";
        
        sentence = start + " first " + day.toLowerCase();
        CONSOLE.info(sentence);
        
        sentence = start + " first " + day.toLowerCase(Locale.ENGLISH);
        CONSOLE.info(sentence);
        
        sentence = start + " first " + day.toLowerCase(Locale.GERMAN);
        CONSOLE.info(sentence);
        
        // TODO code application logic here
        LOGGER.info("Test Program: END");
        CONSOLE.info("Test Program: END");
    }
    
}
