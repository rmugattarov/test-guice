package rmugattarov.test_guice.impl;

import com.google.inject.Inject;
import rmugattarov.test_guice.api.StringReverter;
import rmugattarov.test_guice.api.StringService;

/**
 * Created by rmugattarov on 07.04.2017.
 */
public class StringServiceImpl implements StringService {

    private final StringReverter stringReverter;

    @Inject
    public StringServiceImpl(StringReverter stringReverter) {
        this.stringReverter = stringReverter;
    }

    public String processString(String toProcess) {
        return stringReverter.revert(toProcess);
    }
}
