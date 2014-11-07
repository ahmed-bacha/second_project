package org.j_academy.second_project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
	
	
    public static void main( String[] args )
    {
        logger.info( "Hello World!" );
        
        DateTime now = new DateTime();
        
        logger.info( "Temps acctuel : "+now );
        
        logger.info( "Temps heure : " + now.getHourOfDay() );
        
        logger.info( "Temps minutes : "+ now.getMinuteOfHour() );
        
        
    }
}
