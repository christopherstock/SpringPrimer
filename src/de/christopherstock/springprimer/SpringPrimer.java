
    package de.christopherstock.springprimer;

    public class SpringPrimer
    {
        private String message;

        public void setMessage(String message)
        {
            this.message  = message;
        }

        public void getMessage()
        {
            System.out.println("Your Message is [" + this.message + "]");
        }
    }
