package swiss.opentransportdata.ojp.adapter.model.common.response;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

public interface Translation {

    static Locale mapToLocale(String language) {
        if (StringUtils.isNotBlank(language)) {
            // TODO perhaps add Switzerland for de, fr, it ?
            return Locale.forLanguageTag(language);
        }
        return null;
    }

    /**
     * @return translation for String's (if any) defaulted by underlying system.
     */
    Locale getResponseTranslation();
}
