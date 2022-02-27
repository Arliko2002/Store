package com.example.store.models;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Category {
    ELECTRONICS, JEWELERY, MEN_S_CLOTHING, WOMEN_S_CLOTHING;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ELECTRONICS: return "electronics";
            case JEWELERY: return "jewelery";
            case MEN_S_CLOTHING: return "men's clothing";
            case WOMEN_S_CLOTHING: return "women's clothing";
        }
        return null;
    }

    @JsonCreator
    public static Category forValue(String value) throws IOException {
        if (value.equals("electronics")) return ELECTRONICS;
        if (value.equals("jewelery")) return JEWELERY;
        if (value.equals("men's clothing")) return MEN_S_CLOTHING;
        if (value.equals("women's clothing")) return WOMEN_S_CLOTHING;
        throw new IOException("Cannot deserialize Category");
    }
}
//