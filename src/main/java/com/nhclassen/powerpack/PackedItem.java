package com.nhclassen.powerpack;

public record PackedItem(String name, int count) {
    @Override
    public String toString() {
        return String.format("{item : \"%s\", count : %d}", name, count);
    }
}
