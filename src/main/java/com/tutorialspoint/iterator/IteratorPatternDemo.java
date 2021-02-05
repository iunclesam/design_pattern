package com.tutorialspoint.iterator;

/**
 * Iterator pattern is very commonly used design pattern in Java and .Net programming environment.
 * This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.
 *
 * Iterator pattern falls under behavioral pattern category.
 *
 * See <a href='https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm'>Iterator Pattern</a>
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
