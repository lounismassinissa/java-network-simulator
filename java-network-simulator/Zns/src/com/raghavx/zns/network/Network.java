package com.raghavx.zns.network;

import com.raghavx.zns.node.Node;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Raghvendra
 */
public abstract class Network {

    private final Map<String, Node> nodeList = new HashMap<String, Node>();
    private NetworkSize networkSize = new NetworkSize();

    public Network(NetworkSize networkSize) {
        this.networkSize = networkSize;
    }

    public Network() {
        System.out.println("<-----Network Initialised with default values---->\n"+this);
    }

    public Map<String, Node> getNodeList() {
        return nodeList;
    }

    public int getNodeNumber() {
        return nodeList.size();
    }

    public void addNode(Node node) {
        nodeList.put(node.toString(), node);
    }

    @Override
    public String toString(){
        return "Nodes : "+getNodeNumber()+"\nSize : "+this.networkSize.toString();
    }
}
