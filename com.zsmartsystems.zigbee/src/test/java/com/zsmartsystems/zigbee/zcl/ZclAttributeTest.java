package com.zsmartsystems.zigbee.zcl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 *
 * @author Chris Jackson
 *
 */
public class ZclAttributeTest {
    @Test
    public void testConstructor() {
        ZclAttribute attribute = new ZclAttribute(ZclClusterType.ON_OFF, 0, "Test Name",
                ZclDataType.UNSIGNED_8_BIT_INTEGER, false, false, false, false);

        assertEquals(ZclClusterType.ON_OFF, attribute.getCluster());
        assertEquals(0, attribute.getId());
        assertEquals("Test Name", attribute.getName());
        assertEquals(ZclDataType.UNSIGNED_8_BIT_INTEGER, attribute.getDataType());
        assertEquals(false, attribute.isMandatory());
        assertEquals(false, attribute.isWritable());
        assertEquals(false, attribute.isReadable());
        assertEquals(false, attribute.isReportable());
        System.out.println(attribute.toString());

        attribute = new ZclAttribute(ZclClusterType.ON_OFF, 0, "Test Name", ZclDataType.UNSIGNED_8_BIT_INTEGER, true,
                true, true, true);

        assertEquals(true, attribute.isMandatory());
        assertEquals(true, attribute.isWritable());
        assertEquals(true, attribute.isReadable());
        assertEquals(true, attribute.isReportable());
        System.out.println(attribute.toString());
    }

    @Test
    public void getLastReportTime() {
        ZclAttribute attribute = new ZclAttribute(ZclClusterType.ON_OFF, 0, "Test Name",
                ZclDataType.UNSIGNED_8_BIT_INTEGER, false, false, false, false);

        Calendar start = Calendar.getInstance();
        attribute.updateValue(0);
        Calendar stop = Calendar.getInstance();

        assertEquals(0, attribute.getLastValue());
        assertTrue(attribute.getLastReportTime().compareTo(start) >= 0);
        assertTrue(attribute.getLastReportTime().compareTo(stop) <= 0);
    }
}
