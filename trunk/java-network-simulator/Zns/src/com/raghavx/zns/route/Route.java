package com.raghavx.zns.route;

import java.util.HashSet;
import java.util.Set;
import com.raghavx.zns.node.Node;

/**
 *
 * @author Raghvendra
 */
public class Route {

    private boolean invalid;
    private int hopCount;
    private int seqNumber;
    private Set preCursor;
    private long lifeTime;
    private Node destination;
    private Node source;
    private Node nextHopNode;
    public static final int INFINITE = 16;

    public Route(Node destination, Node nextHopNode, int sequenceNumber, Set<Node> precursor, int hopcount) {
        this.invalid = true;
        if (hopcount < Route.INFINITE) {
            this.hopCount = hopcount;
        } else {
            throw new RuntimeException("Hop Count Cannot be INFINITE");
        }
        this.preCursor = new HashSet<Node>();
        this.preCursor = precursor;
        this.nextHopNode = nextHopNode;
        this.destination = destination;
        this.seqNumber = sequenceNumber;
        this.lifeTime = 0L;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public int getHopCount() {
        return hopCount;
    }

    public void setHopCount(int hopCount) {
        this.hopCount = hopCount;
    }

    public long getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(long lifeTime) {
        this.lifeTime = lifeTime;
    }

    public Set getPreCursor() {
        return preCursor;
    }

    public void setPreCursor(Set preCursor) {
        this.preCursor = preCursor;
    }

    public int getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(int seqNumber) {
        this.seqNumber = seqNumber;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Route : \n Destination = " + this.getDestination() + " : Source = " + this.getSource();
    }
}
