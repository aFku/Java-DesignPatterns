package org.rcbg.afku;

import java.util.ArrayList;
import java.util.List;

public class YoutubeAccount implements ISubscriber{

    private final String accountName;
    private final List<ISubscriber> subscribers = new ArrayList<>();
    private final List<String> movies = new ArrayList<>();

    public YoutubeAccount(String accountName){
        this.accountName = accountName;
    }

    public void addSubscriber(ISubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(ISubscriber subscriber){
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(String movieName){
        for(ISubscriber subscriber : this.subscribers){
            subscriber.update(this.accountName, movieName);
        }
    }

    public void uploadNewMovie(String movieName){
        movies.add(movieName);
        this.notifySubscribers(movieName);
    }

    @Override
    public void update(String accountName, String movieName) {
        System.out.println(String.format("[ACCOUNT: %s] Channel: %s - uploaded new movie: %s", this.accountName, accountName, movieName));
    }
}
