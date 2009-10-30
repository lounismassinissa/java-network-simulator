package com.raghavx.zns.ip;


/**
 *
 * @author Raghvendra
 */
public class IP {

    private int IPAddress[];

    public IP(String ipAddress) {
        this.IPAddress = new int[4];
        //this.lastOctate = ipAddress.lastIndexOf(".");
        if (ipAddress.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")) {
            String[] ips = ipAddress.split("\\.");
            for (int i = 0; i < ips.length; i++) {
                IPAddress[i] = Integer.parseInt(ips[i]);
                if(IPAddress[i]>254 || IPAddress[i]<1){
                    throw new IPFormatException();
                }
            }
        }else{
            throw new IPFormatException();
        }
    }

    public static IP getNextAddress(IP ipA) {
        if (ipA.IPAddress[3] < 254) {
            return new IP(ipA.IPAddress[0] + "." + ipA.IPAddress[1] + "." + ipA.IPAddress[2] + "." + (ipA.IPAddress[3] + 1));
        } else if (ipA.IPAddress[2] < 254) {
            return new IP(ipA.IPAddress[0] + "." + ipA.IPAddress[1] + "." + (ipA.IPAddress[2] + 1) + "." + 1);
        } else if (ipA.IPAddress[1] < 254) {
            return new IP(ipA.IPAddress[0] + "." + (ipA.IPAddress[1] + 1) + "." + 0 + "." + 1);
        } else if (ipA.IPAddress[0] < 254) {
            return new IP((ipA.IPAddress[0] + 1) + "." + 0 + "." + 0 + "." + 1);
        } else {
            return new IP(1 + "." + 0 + "." + 0 + "." + 1);
        }
    }

    @Override
    public boolean equals(Object obj) {

        if(getClass() != obj.getClass()) return false;
        
        IP objIP = (IP) obj;
        for (int i = 0; i < IPAddress.length; i++) {
            if (IPAddress[i] != objIP.IPAddress[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.IPAddress != null ? this.IPAddress.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < IPAddress.length; i++) {
            result.append(IPAddress[i]);
            result.append(".");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}

class IPFormatException extends RuntimeException {
    public static final long serialVersionUID = 1L;
    @Override
    public String getMessage() {
        return super.getMessage() + " Error in IP Format";
    }
}
