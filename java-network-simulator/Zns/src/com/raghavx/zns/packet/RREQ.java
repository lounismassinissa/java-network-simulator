/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raghavx.zns.packet;

import java.beans.PropertyChangeSupport;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.raghavx.zns.manager.ValueLogger;
import com.raghavx.zns.node.Node;

/**
 *
 * @author raghav
 */
public class RREQ extends Packet implements IPacket{


    private PropertyChangeSupport pcsSource = new PropertyChangeSupport(source);
    private PropertyChangeSupport pcsLogger = new PropertyChangeSupport(new ValueLogger());
    private Timer rreqTimer = new Timer();

    public RREQ() {
        rreqTimer.schedule(this, Node.PATH_DISCOVERY_TIME);
    }

    @Override
    public void recieve(Node reciever, Node prevHop) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        dest = null;
        source = null;
        try {
            //self destroy the object.
            this.finalize();
            pcsLogger.fireIndexedPropertyChange("RREQ", 1, null, null);
        } catch (Throwable ex) {
            Logger.getLogger(RREQ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
