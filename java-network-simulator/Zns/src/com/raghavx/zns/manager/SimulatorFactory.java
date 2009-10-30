
package com.raghavx.zns.manager;

import com.raghavx.zns.ip.IP;
import com.raghavx.zns.trust.Trust;

/**
 *
 * @author raghav
 */
public abstract class SimulatorFactory {


    /*
    public Route createRoute() {
        return new Route();
    }
    */




    public Trust createTrust(IP ip){
        return new Trust(ip);
    }
}