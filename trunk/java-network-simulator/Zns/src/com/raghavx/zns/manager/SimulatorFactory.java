
package com.raghavx.zns.manager;

import com.raghavx.zns.network.Network;
import com.raghavx.zns.network.ip.IP;
import com.raghavx.zns.node.Node;
import com.raghavx.zns.route.Route;
import com.raghavx.zns.trust.Trust;

/**
 *
 * @author raghav
 */
public abstract class SimulatorFactory {

    public SimulatorFactory getInstance(){
        return this;
        
    }
    /*
    public Route createRoute() {
        return new Route();
    }
    */
    public Node createNode(IP ip) {
        return new Node(ip);
    }

    public Network createNetwork() {
        return new Network();
    }

    public Trust createTrust(IP ip){
        return new Trust(ip);
    }
}