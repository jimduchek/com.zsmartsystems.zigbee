package com.zsmartsystems.zigbee.zcl.clusters.onoff;

import com.zsmartsystems.zigbee.zcl.ZclCommand;

/**
 * Toggle Command value object class.
 * <p>
 * Cluster: <b>On/Off</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the On/Off cluster.
 * <p>
 * Attributes and commands for switching devices between ‘On’ and ‘Off’ states.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ToggleCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public ToggleCommand() {
        genericCommand = false;
        clusterId = 6;
        commandId = 2;
        commandDirection = true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ToggleCommand [");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
