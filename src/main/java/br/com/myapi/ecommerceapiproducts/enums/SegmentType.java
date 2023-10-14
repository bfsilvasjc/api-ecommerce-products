package br.com.myapi.ecommerceapiproducts.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SegmentType {

    GAMER(1), REDES(2), FIBRA(3), INFORMATICA(4), CATV(5);

    private final int segmentId;

    public static int getSegmentIdBySegmentType(String segmentType) {
        for (SegmentType mapping : values()) {
            if (mapping.name().equalsIgnoreCase(segmentType)) {
                return mapping.segmentId;
            }
        }
        throw new IllegalArgumentException("Invalid segment type: " + segmentType);
    }
}
