/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.web

import org.eclipse.xtext.web.server.XtextServiceDispatcher
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider
import org.eclipse.xtext.web.server.persistence.ResourceBaseProviderImpl
import com.google.inject.Binder

/**
 * Use this class to register additional components to be used within the web application.
 */
class ITLWebModule extends AbstractITLWebModule {
	def Class<? extends XtextServiceDispatcher> bindXtextServiceDispatcher() {
		ItlServiceDispatcher
	}
	def void configureIResourceBaseProvider(Binder binder) {
		binder.bind(IResourceBaseProvider).toInstance(
		new ResourceBaseProviderImpl("./booster-files"))
	}
}
