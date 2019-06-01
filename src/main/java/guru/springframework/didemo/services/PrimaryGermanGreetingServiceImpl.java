package guru.springframework.didemo.services;

/**
 * Created by ledio on 4/13/19
 */
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String hello() {
        return greetingRepository.getGermanGreeting();
    }
}
