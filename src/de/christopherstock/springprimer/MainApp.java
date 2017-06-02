
    package de.christopherstock.springprimer;

    import  org.springframework.context.ApplicationContext;
    import  org.springframework.context.support.ClassPathXmlApplicationContext;

    public class MainApp
    {
        public static void main(String[] args)
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
            SpringPrimer       obj     = (SpringPrimer) context.getBean("SpringPrimer");
            obj.getMessage();
        }
    }
