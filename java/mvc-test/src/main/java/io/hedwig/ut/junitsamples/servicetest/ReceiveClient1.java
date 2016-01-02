package io.hedwig.ut.junitsamples.servicetest;

/**
 * Created by patrick on 16/1/3.
 */
public class ReceiveClient1 implements Client {
    @Override
    public void receive(Message message) {
        System.out.println("Receive Client 1 is received!");
    }
}
