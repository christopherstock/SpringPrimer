
    package de.christopherstock.springprimer;

    /*******************************************************************************************************************
    *   The java bean 'HelloWorld'.
    *
    *   @author  Christopher Stock
    *   @version 1.0
    *******************************************************************************************************************/
    public class HelloWorldBean
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
            System.out.println("");
            System.out.println("The message is [" + this.message + "]");
            System.out.println("");
        }
    }
