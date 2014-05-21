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

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;

/**
 * @author nickmarcucci
 *
 */
@PushEndpoint("/counter")
public class CounterResource {
 
    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String count) {
        return count;
    }
}          