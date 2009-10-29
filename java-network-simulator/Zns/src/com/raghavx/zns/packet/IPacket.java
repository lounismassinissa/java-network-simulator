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
public interface IPacket {
void recieve(Node reciever, Node prevHop);
}
