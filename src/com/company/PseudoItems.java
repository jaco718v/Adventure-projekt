package com.company;

public class PseudoItems {

    // These show up in roomInventory, but can't be taken.
    // E.g. "Rusty Grate", room20/21, "Pile of Rocks", room20,
    // "Huge Ceramic Jar", room17
    // "Altar" & "Tetelo's Remains", room 15

    private String shortID;
    private String pseudoName;

    public PseudoItems(String shortID, String pseudoName) {
        this.shortID=shortID;
        this.pseudoName=pseudoName;
    }

    public String getPseudoName() { return pseudoName; }
}
