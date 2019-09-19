package ic.ac.uk.itl.web;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import ic.ac.uk.itl.web.RunResult;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.ServiceConflictResult;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.generator.GeneratorService;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
        case "run":
          _switchResult = this.getRunService(context);
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
  
  protected XtextServiceDispatcher.ServiceDescriptor getRunService(final IServiceContext context) {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      final String resourceId = context.getParameter("resource");
      InputOutput.<String>println(resourceId);
      final String scriptId = context.getParameter("script");
      InputOutput.<String>println(scriptId);
      final String typeId = context.getParameter("type");
      final XtextWebDocumentAccess document = this.getDocumentAccess(context);
      InputOutput.<String>println("runService doing work/");
      final String path = System.getenv("HOME");
      InputOutput.<String>println(("ECHO path is" + path));
      XtextServiceDispatcher.ServiceDescriptor _serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
      final Procedure1<XtextServiceDispatcher.ServiceDescriptor> _function = (XtextServiceDispatcher.ServiceDescriptor it) -> {
        final Function0<IServiceResult> _function_1 = () -> {
          ServiceConflictResult _xtrycatchfinallyexpression = null;
          try {
            ArrayList<String> cmd = CollectionLiterals.<String>newArrayList();
            boolean _equals = Objects.equal(typeId, "py");
            if (_equals) {
              cmd = CollectionLiterals.<String>newArrayList("/usr/local/bin/python3", scriptId);
            } else {
              boolean _equals_1 = Objects.equal(typeId, "w3af");
              if (_equals_1) {
                cmd = CollectionLiterals.<String>newArrayList("/bin/bash", "-c", ((("export PATH=/usr/local/bin:$PATH" + 
                  "&& echo $PATH") + 
                  "&& /Users/gonewiththewind/w3af/w3af/w3af_console -s") + scriptId));
              }
            }
            InputOutput.<ArrayList<String>>println(cmd);
            final ProcessBuilder probuilder = new ProcessBuilder(cmd);
            final Process p = probuilder.start();
            p.waitFor();
            boolean _isAlive = p.isAlive();
            boolean _not = (!_isAlive);
            if (_not) {
              int _exitValue = p.exitValue();
              String _plus = ("exit code: " + Integer.valueOf(_exitValue));
              InputOutput.<String>println(_plus);
            }
            InputStream _inputStream = p.getInputStream();
            InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
            BufferedReader reader = new BufferedReader(_inputStreamReader);
            String readline = new String();
            int i = 0;
            String result = "";
            while (((readline = reader.readLine()) != null)) {
              String _result = result;
              result = (_result + ((" " + readline) + "\n"));
            }
            System.out.println(result);
            this.generatorService.getResult(document);
            InputOutput.<String>println("result collected");
            return new RunResult(result);
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
