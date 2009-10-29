/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raghavx.zns.packet;

import com.raghavx.zns.node.Node;

/**
 *
 * @author raghav
 */
public class Data extends Packet implements IPacket {

    private String data;

    public Data(String data, Node source, Node destination) {
        this.data = data;
        this.dest = destination;
        this.source = source;
        this.type = 0;
    }

    @Override
    public void recieve(Node reciever, Node prevHop) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
