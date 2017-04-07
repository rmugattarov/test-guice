package rmugattarov.test_guice.modules;

import com.google.inject.AbstractModule;
import rmugattarov.test_guice.api.StringReverter;
import rmugattarov.test_guice.impl.StringReverterImpl;

/**
 * Created by rmugattarov on 07.04.2017.
 */
public class StringServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StringReverter.class).to(StringReverterImpl.class);
    }
}
