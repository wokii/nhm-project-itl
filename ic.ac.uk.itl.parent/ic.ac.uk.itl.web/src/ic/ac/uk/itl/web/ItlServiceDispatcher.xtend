package ic.ac.uk.itl.web

import com.google.inject.Inject
import java.io.File
import java.io.FileWriter
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.InvalidRequestException
import org.eclipse.xtext.web.server.XtextServiceDispatcher
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider
import org.eclipse.xtext.web.server.generator.GeneratorService
import java.io.BufferedReader
import java.io.InputStreamReader

class ItlServiceDispatcher extends XtextServiceDispatcher {

    @Inject IResourceBaseProvider resourceBaseProvider
    
    @Inject
    GeneratorService generatorService;

    override protected createServiceDescriptor(String serviceType, IServiceContext context) {
        switch serviceType {
           
            case 'generate':
            	getCompileService(context)
            case 'run':
            	
            	getRunService(context)
           
            default:
                super.createServiceDescriptor(serviceType, context)
        }
    }
	
	protected def getRunService(IServiceContext context) {
		val resourceId = context.getParameter('resource')
		println(resourceId)
		val scriptId = context.getParameter('script')
		println(scriptId)
		val typeId = context.getParameter('type')
		val document = getDocumentAccess(context)
		println("runService doing work/")
		val path = System.getenv("HOME");
		println("ECHO path is" + path);
		new ServiceDescriptor => [
			service = [
				try {
					
					var cmd = newArrayList();
					if (typeId =="py"){
						cmd=newArrayList("/usr/local/bin/python3", scriptId);
					} else if (typeId =='w3af') {
						cmd =newArrayList("/bin/bash", "-c", "export PATH=/usr/local/bin:$PATH"+
						"&& echo $PATH"+ 
						"&& /Users/gonewiththewind/w3af/w3af/w3af_console -s" + scriptId);
						//cmd=newArrayList("/bin/bash", "-c", "/Users/gonewiththewind/w3af/w3af/w3af_console -s "+scriptId);
					}
					println(cmd);
					val probuilder = new ProcessBuilder(cmd);
       				val p = probuilder.start();
					
					p.waitFor();
					
					if (!p.alive){
						println("exit code: "+p.exitValue)
					}
					var reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			        var readline = new String();
			        var i = 0;
			        var result = "";
			        while ((readline = reader.readLine()) !== null) {
			            result += (" " + readline) + "\n";
			        }
	        		System.out.println(result);
					generatorService.getResult(document)
					println("result collected")
					return new RunResult(result)
				} catch (Throwable throwable) {
					handleError(throwable)
				}
			]
		]
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
//					println("generatorService.getResult(document) class name")
//					println(generatorService.getResult(document).getClass().getSimpleName())
					generatorService.getResult(document)
				} catch (Throwable throwable) {
					handleError(throwable)
				}
			]
		]
	}
	
	
	



}
