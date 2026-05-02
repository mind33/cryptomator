package org.cryptomator.common;

import org.cryptomator.common.settings.Settings;

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
	public LicenseHolder(@SuppressWarnings("unused") LicenseChecker licenseChecker, @SuppressWarnings("unused") Settings settings) {
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
		return Bindings.createStringBinding(() -> null);
	}

	public String getLicenseSubject() {
		return null;
	}

	public BooleanBinding validLicenseProperty() {
		return validLicenseProperty;
	}

	public boolean isValidLicense() {
		return true;
	}

}
