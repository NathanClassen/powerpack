package org.example.powerpack;

/*
        could have some process to provide a custom list of items
        would need name and weight, would create a record for each pair

        TODO: why a record? alternatives?
        TODO: why an int? Why not an Integer?
 */
public record Item(String name, int weight) {
}
