
    package de.christopherstock.springprimer;

    import  org.springframework.context.support.ClassPathXmlApplicationContext;

    /*******************************************************************************************************************
    *   The main class that contains the application's point of entry.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class SpringPrimer
    {
        /***************************************************************************************************************
        *   The static main method is the application's entry point.
        *
        *   @param args All arguments from the calling instance.
        ***************************************************************************************************************/
        public static void main(String[] args)
        {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
            HelloWorldBean                 bean    = (HelloWorldBean)context.getBean("HelloWorldBean");

            bean.printMessage();

            context.close();
        }
    }
