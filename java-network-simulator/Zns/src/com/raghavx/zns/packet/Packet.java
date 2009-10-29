/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raghavx.zns.packet;

import java.util.TimerTask;
import com.raghavx.zns.node.Node;

/**
 *
 * @author raghav
 */
public abstract class Packet extends TimerTask{

    public Node source = null;
    public Node dest = null;
    public int ttl = Node.TTL_THRESHOLD;
    public int hopCount = 0;
    public int sequenceNo;
    public int type;
    

    public Packet getPacket() {
        return this;
    }

    public Packet getParentPacketvalue(Packet packet) {
        packet.source = this.source;
        packet.dest = this.dest;
        packet.ttl = this.ttl;
        packet.hopCount = this.hopCount;
        packet.sequenceNo = this.sequenceNo;
        packet.type = this.type;
        return packet;
    }

    @Override
    public String toString() {
        return "Sequence Number = " + sequenceNo + "\n"
                +"TTL = "+ ttl;
    }
}