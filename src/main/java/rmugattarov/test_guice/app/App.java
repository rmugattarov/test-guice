package rmugattarov.test_guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import rmugattarov.test_guice.impl.StringServiceImpl;
import rmugattarov.test_guice.modules.StringServiceModule;

/**
 * Created by rmugattarov on 07.04.2017.
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new StringServiceModule());
        StringServiceImpl stringService = injector.getInstance(StringServiceImpl.class);
        System.out.println(stringService.processString("ABC"));
    }
}
