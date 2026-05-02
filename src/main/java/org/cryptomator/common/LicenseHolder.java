package org.cryptomator.common;

import javax.inject.Inject;
import javax.inject.Singleton;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.value.ObservableValue;
import java.util.Optional;

@Singleton
public class LicenseHolder {

	private final BooleanBinding validLicenseProperty;

	@Inject
	public LicenseHolder() {
		this.validLicenseProperty = Bindings.createBooleanBinding(() -> true);
	}

	public boolean validateAndStoreLicense(@SuppressWarnings("unused") String licenseKey) {
		return true;
	}

	/* Observable Properties */

	public Optional<String> getLicenseKey() {
		return Optional.empty();
	}

	public ObservableValue<String> licenseSubjectProperty() {
		return Bindings.createStringBinding(() -> "");
	}

	public String getLicenseSubject() {
		return "";
	}

	public BooleanBinding validLicenseProperty() {
		return validLicenseProperty;
	}

	public boolean isValidLicense() {
		return true;
	}

}
