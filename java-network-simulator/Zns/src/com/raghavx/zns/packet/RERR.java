/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raghavx.zns.packet;

import com.raghavx.zns.network.aodv.AODV;
import java.beans.PropertyChangeSupport;
import java.util.Timer;
import com.raghavx.zns.node.Node;

/**
 *
 * @author raghav
 */
public class RERR extends Packet implements IPacket{

    private PropertyChangeSupport pcsSource = new PropertyChangeSupport(source);
    private PropertyChangeSupport pcsDestination = new PropertyChangeSupport(dest);
    private Timer rerrTimer = new Timer();

    public RERR() {

        rerrTimer.schedule(this, AODV.PATH_DISCOVERY_TIME);
        
    }

    @Override
    public void recieve(Node reciever, Node prevHop) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        pcsSource.firePropertyChange("RERR_DESTROYED", null, null);
        source = null;
        dest = null;
        //destroy this object
    }

}
