package com.tutorialspoint.chain_of_responsibility;

/**
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request.
 * This pattern comes under behavioral patterns.
 *
 * In this pattern, normally each receiver contains reference to another receiver.
 * If one object cannot handle the request then it passes the same to the next receiver and so on.
 *
 * See <a href='https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm'>Chain of Responsibility Pattern</a>
 */
public class ChainPatternDemo {

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an denug level information");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
    }
}
