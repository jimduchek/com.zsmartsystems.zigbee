package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zdo.ZdoRequest;

/**
 * Management Permit Joining Request value object class.
 * <p>
 * The Mgmt_Permit_Joining_req is generated from a Local Device requesting that
 * a remote device or devices allow or disallow association. The
 * Mgmt_Permit_Joining_req is generated by a management application or
 * commissioning tool which directs the request to a remote device(s) where the
 * NLME-PERMIT-JOINING.request is executed using the PermitDuration
 * parameter supplied by Mgmt_Permit_Joining_req. Additionally, if the remote
 * device is the Trust Center and TC_Significance is set to 1, the Trust Center
 * authentication policy will be affected. The addressing may be unicast or
 * "broadcast to all routers and coordinator".
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ManagementPermitJoiningRequest extends ZdoRequest {
    /**
     * PermitDuration command message field.
     */
    private Integer permitDuration;

    /**
     * TC_Significance command message field.
     */
    private Boolean tcSignificance;

    /**
     * Default constructor.
     */
    public ManagementPermitJoiningRequest() {
        clusterId = 0x0036;
    }

    /**
     * Gets PermitDuration.
     *
     * @return the PermitDuration
     */
    public Integer getPermitDuration() {
        return permitDuration;
    }

    /**
     * Sets PermitDuration.
     *
     * @param permitDuration the PermitDuration
     */
    public void setPermitDuration(final Integer permitDuration) {
        this.permitDuration = permitDuration;
    }

    /**
     * Gets TC_Significance.
     *
     * @return the TC_Significance
     */
    public Boolean getTcSignificance() {
        return tcSignificance;
    }

    /**
     * Sets TC_Significance.
     *
     * @param tcSignificance the TC_Significance
     */
    public void setTcSignificance(final Boolean tcSignificance) {
        this.tcSignificance = tcSignificance;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        super.serialize(serializer);

        serializer.serialize(permitDuration, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(tcSignificance, ZclDataType.BOOLEAN);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        super.deserialize(deserializer);

        permitDuration = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        tcSignificance = (Boolean) deserializer.deserialize(ZclDataType.BOOLEAN);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ManagementPermitJoiningRequest [");
        builder.append(super.toString());
        builder.append(", permitDuration=");
        builder.append(permitDuration);
        builder.append(", tcSignificance=");
        builder.append(tcSignificance);
        builder.append("]");
        return builder.toString();
    }

}
