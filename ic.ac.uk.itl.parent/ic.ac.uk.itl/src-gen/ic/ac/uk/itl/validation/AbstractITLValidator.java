/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractITLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(ic.ac.uk.itl.iTL.ITLPackage.eINSTANCE);
		return result;
	}
}