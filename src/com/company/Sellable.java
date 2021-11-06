package com.company;

public interface Sellable {
    Double getPrice();
    Human getOwner();
    void sell(Human buyer) throws Exception;


}
