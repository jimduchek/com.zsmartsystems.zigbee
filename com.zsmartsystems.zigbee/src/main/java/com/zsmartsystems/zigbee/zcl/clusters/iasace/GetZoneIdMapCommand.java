package com.zsmartsystems.zigbee.zcl.clusters.iasace;

import com.zsmartsystems.zigbee.zcl.ZclCommand;

/**
 * Get Zone ID Map Command value object class.
 * <p>
 * Cluster: <b>IAS ACE</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the IAS ACE cluster.
 * <p>
 * The IAS ACE cluster defines an interface to the functionality of any Ancillary
 * Control Equipment of the IAS system. Using this cluster, a ZigBee enabled ACE
 * device can access a IAS CIE device and manipulate the IAS system, on behalf of a
 * level-2 user.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class GetZoneIdMapCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public GetZoneIdMapCommand() {
        genericCommand = false;
        clusterId = 1281;
        commandId = 5;
        commandDirection = true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("GetZoneIdMapCommand [");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
