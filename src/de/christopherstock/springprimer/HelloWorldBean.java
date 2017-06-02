
    package de.christopherstock.springprimer;

    import  org.springframework.beans.factory.*;

    /*******************************************************************************************************************
    *   The java bean 'HelloWorld'.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class HelloWorldBean implements InitializingBean, DisposableBean
    {
        /***************************************************************************************************************
        *   The field 'message' being defined in the beans.xml file.
        *   Needs to be defined for the bean to be initialized successfully!
        ***************************************************************************************************************/
        private String message;

        /***************************************************************************************************************
        *   The setter for the 'message' field.
        *   Needs to be defined for the bean to be initialized successfully!
        *
        *   @param message The message to set.
        ***************************************************************************************************************/
        public void setMessage(String message)
        {
            this.message  = message;
        }

        /***************************************************************************************************************
        *   Outputs the 'message' field.
        ***************************************************************************************************************/
        public void printMessage()
        {
            System.out.println("The message is [" + this.message + "]");
        }

        /***************************************************************************************************************
        *   Being invoked after the properties have been set.
        ***************************************************************************************************************/
        public void afterPropertiesSet()
        {
            System.out.println("afterPropertiesSet() has been invoked!");
        }

        /***************************************************************************************************************
        *   Being invoked by the corresponding argument in the beans.xml file.
        ***************************************************************************************************************/
        public void init()
        {
            System.out.println("init() has been invoked!");
        }

        /***************************************************************************************************************
        *   Being invoked when the bean is being destroyed.
        ***************************************************************************************************************/
        public void destroy()
        {
            System.out.println("destroy() has been invoked!");
        }
    }
