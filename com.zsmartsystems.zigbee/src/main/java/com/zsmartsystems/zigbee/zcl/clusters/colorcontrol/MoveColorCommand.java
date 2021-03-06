package com.zsmartsystems.zigbee.zcl.clusters.colorcontrol;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Move Color Command value object class.
 * <p>
 * Cluster: <b>Color control</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Color control cluster.
 * <p>
 * This cluster provides an interface for changing the color of a light. Color is
 * specified according to the Commission Internationale de l'Éclairage (CIE)
 * specification CIE 1931 Color Space, [B4]. Color control is carried out in terms of
 * x,y values, as defined by this specification.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class MoveColorCommand extends ZclCommand {
    /**
     * RateX command message field.
     */
    private Integer rateX;

    /**
     * RateY command message field.
     */
    private Integer rateY;

    /**
     * Default constructor.
     */
    public MoveColorCommand() {
        genericCommand = false;
        clusterId = 768;
        commandId = 8;
        commandDirection = true;
    }

    /**
     * Gets RateX.
     *
     * @return the RateX
     */
    public Integer getRateX() {
        return rateX;
    }

    /**
     * Sets RateX.
     *
     * @param rateX the RateX
     */
    public void setRateX(final Integer rateX) {
        this.rateX = rateX;
    }

    /**
     * Gets RateY.
     *
     * @return the RateY
     */
    public Integer getRateY() {
        return rateY;
    }

    /**
     * Sets RateY.
     *
     * @param rateY the RateY
     */
    public void setRateY(final Integer rateY) {
        this.rateY = rateY;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(rateX, ZclDataType.SIGNED_16_BIT_INTEGER);
        serializer.serialize(rateY, ZclDataType.SIGNED_16_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        rateX = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
        rateY = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("MoveColorCommand [");
        builder.append(super.toString());
        builder.append(", rateX=");
        builder.append(rateX);
        builder.append(", rateY=");
        builder.append(rateY);
        builder.append("]");
        return builder.toString();
    }

}
