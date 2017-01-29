package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Chris Jackson
 *
 */
public enum EmberInitialSecurityBitmask {
    EMBER_FLAG_UNKNOWN(0xFFFFF),
    /**
     * This enables ZigBee Standard Security on the node.
     */
    EMBER_STANDARD_SECURITY_MODE(0x0000),
    /**
     * This enables Distributed Trust Center Mode for the device forming the network. (Previously known as
     * EMBER_NO_TRUST_CENTER_MODE)
     */
    EMBER_DISTRIBUTED_TRUST_CENTER_MODE(0x0002),
    /**
     * This enables a Global Link Key for the Trust Center. All nodes will share the same Trust Center Link Key.
     */
    EMBER_TRUST_CENTER_GLOBAL_LINK_KEY(0x0004),
    /**
     * This enables devices that perform MAC Association with a pre-configured Network Key to join the network. It is
     * only set on the Trust Center.
     */
    EMBER_PRECONFIGURED_NETWORK_KEY_MODE(0x0008),
    /**
     * This denotes that the ::EmberInitialSecurityState::preconfiguredTrustCenterEui64 has a value in it containing the
     * trust center EUI64. The device will only join a network and accept commands from a trust center with that EUI64.
     * Normally this bit is NOT set, and the EUI64 of the trust center is learned during the join process. When
     * commissioning a device to join onto an existing network, which is using a trust center, and without sending any
     * messages, this bit must be set and the field ::EmberInitialSecurityState::preconfiguredTrustCenterEui64 must be
     * populated with the appropriate EUI64.
     */
    EMBER_HAVE_TRUST_CENTER_EUI64(0x0040),
    /**
     * This denotes that the preconfiguredKey is not the actual Link Key but a Secret Key known only to the Trust
     * Center. It is hashed with the IEEE Address of the destination device in order to create the actual Link Key used
     * in encryption. This is bit is only used by the Trust Center. The joining device need not set this.
     */
    EMBER_TRUST_CENTER_USES_HASHED_LINK_KEY(0x0084),
    /**
     * This denotes that the preconfiguredKey element has valid data that should be used to configure the initial
     * security state.
     */
    EMBER_HAVE_PRECONFIGURED_KEY(0x0100),
    /**
     * This denotes that the networkKey element has valid data that should be used to configure the initial security
     * state.
     */
    EMBER_HAVE_NETWORK_KEY(0x0200),
    /**
     * This denotes to a joining node that it should attempt to acquire a Trust Center Link Key during joining. This is
     * only necessary if the device does not have a pre-configured key.
     */
    EMBER_GET_LINK_KEY_WHEN_JOINING(0x0400),
    /**
     * This denotes that a joining device should only accept an encrypted network key from the Trust Center (using its
     * preconfigured key). A key sent in-the-clear by the Trust Center will be rejected and the join will fail. This
     * option is only valid when utilizing a pre-configured key.
     */
    EMBER_REQUIRE_ENCRYPTED_KEY(0x0800),
    /**
     * This denotes whether the device should NOT reset its outgoing frame counters (both NWK and APS) when
     * ::emberSetInitialSecurityState() is called. Normally it is advised to reset the frame counter before joining a
     * new network. However in cases where a device is joining to the same network a again (but not using
     * ::emberRejoinNetwork()) it should keep the NWK and APS frame counters stored in its tokens.
     */
    EMBER_NO_FRAME_COUNTER_RESET(0x1000),
    /**
     * This denotes that the device should obtain its preconfigured key from an installation code stored in the
     * manufacturing token. The token contains a value that will be hashed to obtain the actual preconfigured key. If
     * that token is not valid, then the call to emberSetInitialSecurityState() will fail.
     */
    EMBER_GET_PRECONFIGURED_KEY_FROM_INSTALL_CODE(0x2000);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, EmberInitialSecurityBitmask> codeMapping;

    private int key;

    private EmberInitialSecurityBitmask(int key) {
        this.key = key;
    }

    private static void initMapping() {
        codeMapping = new HashMap<Integer, EmberInitialSecurityBitmask>();
        for (EmberInitialSecurityBitmask s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    /**
     * Lookup function based on the EzspNetworkScanType type code. Returns null
     * if the code does not exist.
     *
     * @param i
     *            the code to lookup
     * @return enumeration value of the alarm type.
     */
    public static EmberInitialSecurityBitmask getEzspNetworkScanType(int i) {
        if (codeMapping == null) {
            initMapping();
        }

        if (codeMapping.get(i) == null) {
            return EMBER_FLAG_UNKNOWN;
        }

        return codeMapping.get(i);
    }

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }
}