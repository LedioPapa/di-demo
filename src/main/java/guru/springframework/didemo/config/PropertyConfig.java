package guru.springframework.didemo.config;

import guru.springframework.didemo.exampleBeans.FakeDataSource;
import guru.springframework.didemo.exampleBeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by Ledio Papa on 6/8/19
 */
@Configuration
public class PropertyConfig {

    @Autowired
    Environment env;

    //setting an environment var on intelliJ PROPERTY_NAME will override this
    @Value("${property.name}")
    String name;

    @Value("${property.password}")
    String password;

    @Value("${property.url}")
    String url;

    @Value("${ledio.jms.username}")
    String jmsUsername;

    @Value("${ledio.jms.password}")
    String jmsPassword;

    @Value("${ledio.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setName(env.getProperty("NAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
