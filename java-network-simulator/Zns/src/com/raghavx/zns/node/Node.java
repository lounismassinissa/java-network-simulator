package com.raghavx.zns.node;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;
import com.raghavx.zns.network.ip.IP;
import com.raghavx.zns.network.mobility.Coordinates;
import com.raghavx.zns.trust.Trust;

/**
 *
 * @author Raghvendra
 * @refernce RFC-3561, See section 10 for variables and there values.
 *
 */
public class Node implements PropertyChangeListener {

    private PropertyChangeSupport pcs;
    private IP ip;
    private int RREQ_ID;
    private Coordinates coordinates;
    private int[] speed = {0,0,0};
    private Map precursorList;
    private Trust trust;
    public static final int ACTIVE_ROUTE_TIMEOUT = 3000; //3000 ms
    public static final int ALLOWED_HELLO_LOSS = 2;
    public static final int HELLO_INTERVAL = 1000; //1000 ms
    public static final int LOCAL_ADD_TTL = 2;
    public static final int NET_DIAMETER = 35;
    public static final int NODE_TRAVERSAL_TIME = 40;// 40 ms
    public static final int RERR_RATELIMIT = 10;
    public static final int RREQ_RETRIES = 2;
    public static final int RREQ_RATELIMIT = 10;
    public static final int TIMEOUT_BUFFER = 2;
    public static final int TTL_START = 1;
    public static final int TTL_INCREMENT = 2;
    public static final int TTL_THRESHOLD = 7;
    public static final int MY_ROUTE_TIMEOUT = 2 * ACTIVE_ROUTE_TIMEOUT;
    public static final int NET_TRAVERSAL_TIME = 2 * NODE_TRAVERSAL_TIME * NET_DIAMETER;
    public static final int BLACKLIST_TIMEOUT = RREQ_RETRIES * NET_TRAVERSAL_TIME;
    public static final double MAX_REPAIR_TTL = 0.3 * NET_DIAMETER;
    public static final int NEXT_HOP_WAIT = NET_TRAVERSAL_TIME + 10;
    public static final int PATH_DISCOVERY_TIME = 2 * NET_TRAVERSAL_TIME;
    public int DELETE_PERIOD;
    public int MIN_REPAIR_TTL;
    public int TTL_VALUE;

    public Node(IP ip) {
        this.pcs = new PropertyChangeSupport(this);
        this.trust = new Trust(ip);
        pcs.addPropertyChangeListener("TRUST",this);
        pcs.addPropertyChangeListener("RREQ", this);
        pcs.addPropertyChangeListener("RREP", this);
        pcs.addPropertyChangeListener("RRER",this);
        this.ip = ip;
        this.precursorList = new HashMap();
        this.coordinates = new Coordinates(0, 0, 0,this.speed); // initial node location is 0,0,0

    }

    @Override
    public String toString() {
        return ip.toString();
    }
    /** @Reference RFC-3561 section 6.3
     * A node disseminates a RREQ when it determines that it needs a route
     * to a destination and does not have one available.  This can happen if
     * the destination is previously unknown to the node, or if a previously
     * valid route to the destination expires or is marked as invalid.
     */
    public void disseminateRREQ(){

    }

    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
