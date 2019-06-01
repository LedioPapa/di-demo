package guru.springframework.didemo.services;

/**
 * Created by ledio on 4/13/19
 */
public class PrimaryChineseGreetingServiceImpl implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryChineseGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String hello() {
        return greetingRepository.getChinesGreeting();
    }
}
