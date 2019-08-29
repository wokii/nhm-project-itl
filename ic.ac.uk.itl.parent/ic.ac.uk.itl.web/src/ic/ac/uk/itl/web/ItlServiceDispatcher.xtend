package ic.ac.uk.itl.web

import com.google.inject.Inject
import java.io.File
import java.io.FileWriter
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.InvalidRequestException
import org.eclipse.xtext.web.server.XtextServiceDispatcher
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider
import org.eclipse.xtext.web.server.model.DocumentStateResult
import org.eclipse.xtext.web.server.generator.GeneratorService

class ItlServiceDispatcher extends XtextServiceDispatcher {

    @Inject IResourceBaseProvider resourceBaseProvider
    
    @Inject
    GeneratorService generatorService;

    override protected createServiceDescriptor(String serviceType, IServiceContext context) {
        switch serviceType {
           
            case 'generate':
            	getCompileService(context)
           
            default:
                super.createServiceDescriptor(serviceType, context)
        }
    }
	
 
	
	protected def getCompileService(IServiceContext context) throws InvalidRequestException {
		val resourceId = context.getParameter('resource')
		if (resourceId === null)
			throw new InvalidRequestException('The parameter \'resource\' is required.')
		
		val document = getDocumentAccess(context)
		println(document)
		new ServiceDescriptor => [
			service = [
				try {
					generatorService.getResult(document)
				} catch (Throwable throwable) {
					handleError(throwable)
				}
			]
		]
	}
	
	



}
