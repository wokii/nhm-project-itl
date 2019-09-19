package ic.ac.uk.itl.web
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.web.server.IServiceResult

@Data
class RunResult implements IServiceResult {
	
	String result;
	
}