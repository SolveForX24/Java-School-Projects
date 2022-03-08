package com.company;

public class RoomCarpet {
    // Class object will remain constant.
    private RoomDimension roomDimensionObj;

    // The cost can be initialized variably.
    private double cost;

    // Constructor
    public RoomCarpet (RoomDimension roomDimensionObj, double s) {
        this.roomDimensionObj = roomDimensionObj;
        cost = s;
    }

    public double getTotalCost() {
        return cost * roomDimensionObj.area();
    }
}
