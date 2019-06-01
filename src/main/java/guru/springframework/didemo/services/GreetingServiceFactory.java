package guru.springframework.didemo.services;

/**
 * Created by Ledio Papa on 6/2/19
 */
public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingServiceImpl(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            case "ch":
                return new PrimaryChineseGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);
        }
    }
}
