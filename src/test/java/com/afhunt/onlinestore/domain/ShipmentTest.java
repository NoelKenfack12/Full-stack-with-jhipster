package com.afhunt.onlinestore.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.afhunt.onlinestore.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ShipmentTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Shipment.class);
        Shipment shipment1 = new Shipment();
        shipment1.setId(1L);
        Shipment shipment2 = new Shipment();
        shipment2.setId(shipment1.getId());
        assertThat(shipment1).isEqualTo(shipment2);
        shipment2.setId(2L);
        assertThat(shipment1).isNotEqualTo(shipment2);
        shipment1.setId(null);
        assertThat(shipment1).isNotEqualTo(shipment2);
    }
}
