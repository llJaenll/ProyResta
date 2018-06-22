package servlets;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import beans.DeliveryDTO;
import beans.DetalleDeliveryDTO;


/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class Listener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("Escuchando... : "+arg0.getSession().getId());
        
        //creamos las variables
        ArrayList<DeliveryDTO> carroC = new ArrayList<DeliveryDTO>();
        ArrayList<DetalleDeliveryDTO> carroD = new ArrayList<DetalleDeliveryDTO>();
        int cantarticulos=0;
        double totalventa=0.0;
        
        //las enviamos a nivel de sesion
        arg0.getSession().setAttribute("carroC", carroC);
        arg0.getSession().setAttribute("carroD", carroD);
        arg0.getSession().setAttribute("cantarticulos", cantarticulos);
        arg0.getSession().setAttribute("totalventa", totalventa);
        
        
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
