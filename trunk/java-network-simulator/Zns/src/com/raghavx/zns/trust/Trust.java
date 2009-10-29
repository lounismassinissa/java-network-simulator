
package com.raghavx.zns.trust;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;
import com.raghavx.zns.network.ip.IP;
import com.raghavx.zns.node.Node;


/**
 *
 * @author Raghvendra
 */
public class Trust implements PropertyChangeListener{

    private Map trustValue;
    private Map recRREQ;
    private Map sentRREQ;
    private Map recRREP;
    private Map sentRREP;

  

    public Trust(IP ip) {
        this.trustValue = new HashMap<String, Double>();
    }

    private boolean updateTrust(IP ip, double newTrustValue) {
        return false;
    }

    public double calculateTrust(Node node) {
        return 0.0;
    }

    private double Tn(double behaviourConstant, double currentTrust){
        return 1-(1-currentTrust)/behaviourConstant;
    }

    private double TnMalicious(double alpha, double beta, double currentTrust){
        return currentTrust/(Math.pow(beta, alpha));
    }

    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
