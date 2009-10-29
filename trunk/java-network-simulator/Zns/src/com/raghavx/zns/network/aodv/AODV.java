/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raghavx.zns.network.aodv;

import com.raghavx.zns.network.*;

/**
 *
 * @author Raghvendra
 * @refernce RFC-3561, See section 10 for variables and there values.
 */
public class AODV extends Network {

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
}
