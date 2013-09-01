package com.test.web.localization;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

/**
 * Localized EXCEPTION log fields
 * 
 * @author AritraChatterjee
 * 
 */
@BaseName("exception")
@LocaleData(@Locale("en_US"))
public enum ExceptionMessage {
	RUNTIME_ERROR;
}
