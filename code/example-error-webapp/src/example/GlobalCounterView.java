//==============================================================================
//                      UNCLASSIFIED
//==============================================================================
// Developed by University of Dayton Research Institute 2014
// Distribution authorized to U.S. Government agencies and their contractors;
// administrative/operational use, July 2011.
// Other requests for this software must be referred to:
// JUIAF
// ATTN:  DIA/DT
// 2460 Defense Way
// Charlottesville, VA 22911
//==============================================================================
//                       UNCLASSIFIED
//==============================================================================
package example;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

/**
 * @author nickmarcucci
 *
 */
@ManagedBean
@ApplicationScoped
public class GlobalCounterView implements Serializable
{
    private static final long serialVersionUID = 7636090576045869972L;
    private volatile int count;
    
    public int getCount() {
        return count;
    }
 
    public void setCount(int count) {
        this.count = count;
    }
     
    public void increment() {
        count++;
         
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/counter", String.valueOf(count));
    }
}
