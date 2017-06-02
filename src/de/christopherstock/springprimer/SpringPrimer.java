
    package de.christopherstock.springprimer;

    import  org.springframework.beans.factory.*;
    import  org.springframework.context.*;
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

            SpringPrimerExample spe   = new SpringPrimerExample();

            HelloWorldBean      bean1 = (HelloWorldBean)context.getBean("HelloWorldBean");
            HelloWorldBean      bean2 = (HelloWorldBean)context.getBean("HelloWorldBean");

            bean1.setMessage("Overridden bean message..");

            bean1.printMessage();
            bean2.printMessage();

            ApplicationContext  d;
            BeanFactory         bf;

            context.close();
        }
    }
