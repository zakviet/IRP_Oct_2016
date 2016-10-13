

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyLIstener
 *
 */
@WebListener
public class MyLIstener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyLIstener() {
        // TODO Auto-generated constructor stub
    }

	public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	public void contextInitialized(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	
    	ServletContext context = event.getServletContext();
    	
    	String data =  context.getInitParameter("data");
    	System.out.println("from listener");
    	context.setAttribute("data", data);
    	
    	
    }
	
}
