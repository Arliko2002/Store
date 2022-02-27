package com.example.store.models;
import com.fasterxml.jackson.annotation.*;

public class Rating {
    private double rate;
    private long count;

    @JsonProperty("rate")
    public double getRate() { return rate; }
    @JsonProperty("rate")
    public void setRate(double value) { this.rate = value; }

    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }
}
