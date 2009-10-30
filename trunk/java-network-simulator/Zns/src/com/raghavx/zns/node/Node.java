package com.raghavx.zns.node;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;
import com.raghavx.zns.ip.IP;
import com.raghavx.zns.mobility.Coordinates;
import com.raghavx.zns.trust.Trust;

/**
 *
 * @author Raghvendra
 * 
 *
 */
public abstract class Node implements PropertyChangeListener {

    private PropertyChangeSupport pcs;
    private IP ip;
    private int RREQ_ID;
    private Coordinates coordinates;
    private int[] speed = {0,0,0};
    private Map neighborList;
    private Trust trust;


    public Node(IP ip) {
        this.pcs = new PropertyChangeSupport(this);
        this.ip = ip;
        this.neighborList = new HashMap();
        this.coordinates = new Coordinates(0, 0, 0,this.speed); // initial node location is 0,0,0

    }

    @Override
    public String toString() {
        return ip.toString();
    }

    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
