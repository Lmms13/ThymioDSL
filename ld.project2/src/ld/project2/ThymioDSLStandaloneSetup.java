/*
 * generated by Xtext 2.34.0
 */
package ld.project2;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ThymioDSLStandaloneSetup extends ThymioDSLStandaloneSetupGenerated {

	public static void doSetup() {
		new ThymioDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
