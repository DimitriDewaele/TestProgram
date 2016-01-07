package be.softwarelab.testprogram;

public class TestProgram {
    
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TestProgram.class);
    private static final org.slf4j.Logger CONSOLE = org.slf4j.LoggerFactory.getLogger("Console");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LOGGER.info("Test Program: START");
        CONSOLE.info("Test Program: START");
        // TODO code application logic here
        LOGGER.info("Test Program: END");
        CONSOLE.info("Test Program: END");
    }
    
}
