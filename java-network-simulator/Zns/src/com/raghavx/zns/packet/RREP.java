/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raghavx.zns.packet;

import com.raghavx.zns.network.aodv.AODV;
import java.beans.PropertyChangeSupport;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.raghavx.zns.node.Node;

/**
 *
 * @author raghav
 */
public class RREP extends Packet implements IPacket{

    private PropertyChangeSupport pcs = new PropertyChangeSupport(source);
    private Timer rrepTimer = new Timer();
    public RREP() {
        rrepTimer.schedule(this, AODV.NET_TRAVERSAL_TIME);
    }

    @Override
    public void recieve(Node reciever, Node prevHop) {
        pcs.firePropertyChange("RREP", dest, source);
    }

    @Override
    public void run() {
        this.dest = null;
        this.source = null;
        this.pcs = null;
        this.cancel();
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(RREP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
