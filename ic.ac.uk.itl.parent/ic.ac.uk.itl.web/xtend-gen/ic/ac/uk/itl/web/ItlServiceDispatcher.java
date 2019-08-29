package ic.ac.uk.itl.web;

import com.google.inject.Inject;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.generator.GeneratorService;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ItlServiceDispatcher extends XtextServiceDispatcher {
  @Inject
  private IResourceBaseProvider resourceBaseProvider;
  
  @Inject
  private GeneratorService generatorService;
  
  @Override
  protected XtextServiceDispatcher.ServiceDescriptor createServiceDescriptor(final String serviceType, final IServiceContext context) {
    XtextServiceDispatcher.ServiceDescriptor _switchResult = null;
    if (serviceType != null) {
      switch (serviceType) {
        case "generate":
          _switchResult = this.getCompileService(context);
          break;
        default:
          _switchResult = super.createServiceDescriptor(serviceType, context);
          break;
      }
    } else {
      _switchResult = super.createServiceDescriptor(serviceType, context);
    }
    return _switchResult;
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getCompileService(final IServiceContext context) throws InvalidRequestException {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      final String resourceId = context.getParameter("resource");
      if ((resourceId == null)) {
        throw new InvalidRequestException("The parameter \'resource\' is required.");
      }
      final XtextWebDocumentAccess document = this.getDocumentAccess(context);
      InputOutput.<XtextWebDocumentAccess>println(document);
      XtextServiceDispatcher.ServiceDescriptor _serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
      final Procedure1<XtextServiceDispatcher.ServiceDescriptor> _function = (XtextServiceDispatcher.ServiceDescriptor it) -> {
        final Function0<IServiceResult> _function_1 = () -> {
          IServiceResult _xtrycatchfinallyexpression = null;
          try {
            _xtrycatchfinallyexpression = this.generatorService.getResult(document);
          } catch (final Throwable _t) {
            if (_t instanceof Throwable) {
              final Throwable throwable = (Throwable)_t;
              _xtrycatchfinallyexpression = this.handleError(it, throwable);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          return _xtrycatchfinallyexpression;
        };
        it.setService(_function_1);
      };
      _xblockexpression = ObjectExtensions.<XtextServiceDispatcher.ServiceDescriptor>operator_doubleArrow(_serviceDescriptor, _function);
    }
    return _xblockexpression;
  }
}
