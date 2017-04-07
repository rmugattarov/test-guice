package rmugattarov.test_guice.impl;

import rmugattarov.test_guice.api.StringReverter;

/**
 * Created by rmugattarov on 07.04.2017.
 */
public class StringReverterImpl implements StringReverter {
    public String revert(String toInvert) {
        return new StringBuilder(toInvert).reverse().toString();
    }
}
