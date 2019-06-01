package guru.springframework.didemo.services;

/**
 * Created by ledio on 4/13/19
 */
public class PrimaryGreetingServiceImpl implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String hello() {
        return greetingRepository.getEnglishGreeting();
    }
}
