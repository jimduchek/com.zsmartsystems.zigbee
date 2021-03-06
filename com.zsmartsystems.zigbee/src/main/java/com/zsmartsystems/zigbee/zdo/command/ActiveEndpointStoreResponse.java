package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zdo.ZdoResponse;

/**
 * Active Endpoint Store Response value object class.
 * <p>
 * The Active_EP_store_rsp is provided to notify a Local Device of the request
 * status from a Primary Discovery Cache device. Included in the response is a status
 * code to notify the Local Device whether the request is successful (the Primary
 * Cache Device has space to store the discovery cache data for the Local Device),
 * the request is not supported (meaning the Remote Device is not a Primary
 * Discovery Cache device), or insufficient space exists.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ActiveEndpointStoreResponse extends ZdoResponse {
    /**
     * Default constructor.
     */
    public ActiveEndpointStoreResponse() {
        clusterId = 0x8019;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ActiveEndpointStoreResponse [");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
