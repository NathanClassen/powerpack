package com.nhclassen.powerpack;

public class OverPackingException extends Exception {
    public OverPackingException(String itemName) {
        super("Cannot pack any \"" + itemName + "\": would exceed maximum weight capacity. Other items may be unpacked as well.");
    }
}
