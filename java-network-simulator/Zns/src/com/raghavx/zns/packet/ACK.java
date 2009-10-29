/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raghavx.zns.packet;

/**
 *
 * @author raghav
 */
public class ACK extends Packet{

    public ACK() {
        this.type = 4;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
