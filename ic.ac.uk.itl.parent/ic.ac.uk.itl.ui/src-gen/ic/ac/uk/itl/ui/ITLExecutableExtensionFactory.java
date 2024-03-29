/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.ui;

import com.google.inject.Injector;
import ic.ac.uk.itl.ui.internal.ItlActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ITLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ItlActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ItlActivator activator = ItlActivator.getInstance();
		return activator != null ? activator.getInjector(ItlActivator.IC_AC_UK_ITL_ITL) : null;
	}

}
