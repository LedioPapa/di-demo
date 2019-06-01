package guru.springframework.didemo.services;

import org.springframework.stereotype.Repository;

/**
 * Created by Ledio Papa on 6/2/19
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Yo!!! from primary service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo von dem Dienst, der die deutsche Sprache implementiert";
    }

    @Override
    public String getChinesGreeting() {
        return "NIHAO...ZAIJIAN";
    }
}
