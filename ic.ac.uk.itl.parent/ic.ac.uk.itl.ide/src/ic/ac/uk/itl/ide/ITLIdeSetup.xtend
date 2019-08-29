/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.ide

import com.google.inject.Guice
import ic.ac.uk.itl.ITLRuntimeModule
import ic.ac.uk.itl.ITLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ITLIdeSetup extends ITLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ITLRuntimeModule, new ITLIdeModule))
	}
	
}
