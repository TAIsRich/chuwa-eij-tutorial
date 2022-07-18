package com.chuwa.tutorial.t04_design_pattern.proxy.jdk_proxy;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/5/22 10:59 PM
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("Train Station selling tickets");
    }
}