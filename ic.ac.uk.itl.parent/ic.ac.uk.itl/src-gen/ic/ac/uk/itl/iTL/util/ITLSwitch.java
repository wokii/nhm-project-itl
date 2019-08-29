/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.iTL.util;

import ic.ac.uk.itl.iTL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ic.ac.uk.itl.iTL.ITLPackage
 * @generated
 */
public class ITLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ITLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ITLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ITLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ITLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.TESTING_TOOL:
      {
        testing_tool testing_tool = (testing_tool)theEObject;
        T result = casetesting_tool(testing_tool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.SPIDER:
      {
        Spider spider = (Spider)theEObject;
        T result = caseSpider(spider);
        if (result == null) result = casetesting_tool(spider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.ZAP_ADDRESS:
      {
        ZAP_ADDRESS zaP_ADDRESS = (ZAP_ADDRESS)theEObject;
        T result = caseZAP_ADDRESS(zaP_ADDRESS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.ZAP_MAX_DEPTH:
      {
        ZAP_MAX_DEPTH zaP_MAX_DEPTH = (ZAP_MAX_DEPTH)theEObject;
        T result = caseZAP_MAX_DEPTH(zaP_MAX_DEPTH);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.ZAP_API_KEY:
      {
        ZAP_API_KEY zaP_API_KEY = (ZAP_API_KEY)theEObject;
        T result = caseZAP_API_KEY(zaP_API_KEY);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.ZAP_TARGET:
      {
        ZAP_TARGET zaP_TARGET = (ZAP_TARGET)theEObject;
        T result = caseZAP_TARGET(zaP_TARGET);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.W3AF:
      {
        W3af w3af = (W3af)theEObject;
        T result = caseW3af(w3af);
        if (result == null) result = casetesting_tool(w3af);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.W3AF_REPORT_ADDRESS:
      {
        W3AF_REPORT_ADDRESS w3AF_REPORT_ADDRESS = (W3AF_REPORT_ADDRESS)theEObject;
        T result = caseW3AF_REPORT_ADDRESS(w3AF_REPORT_ADDRESS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.W3AF_ADDRESS:
      {
        W3AF_ADDRESS w3AF_ADDRESS = (W3AF_ADDRESS)theEObject;
        T result = caseW3AF_ADDRESS(w3AF_ADDRESS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.W3AF_TEST_TYPE:
      {
        W3AF_TEST_TYPE w3AF_TEST_TYPE = (W3AF_TEST_TYPE)theEObject;
        T result = caseW3AF_TEST_TYPE(w3AF_TEST_TYPE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ITLPackage.W3AF_TARGET:
      {
        W3AF_TARGET w3AF_TARGET = (W3AF_TARGET)theEObject;
        T result = caseW3AF_TARGET(w3AF_TARGET);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>testing tool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>testing tool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetesting_tool(testing_tool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpider(Spider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ZAP ADDRESS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ZAP ADDRESS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZAP_ADDRESS(ZAP_ADDRESS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ZAP MAX DEPTH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ZAP MAX DEPTH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZAP_MAX_DEPTH(ZAP_MAX_DEPTH object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ZAP API KEY</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ZAP API KEY</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZAP_API_KEY(ZAP_API_KEY object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ZAP TARGET</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ZAP TARGET</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZAP_TARGET(ZAP_TARGET object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>W3af</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>W3af</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseW3af(W3af object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>W3AF REPORT ADDRESS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>W3AF REPORT ADDRESS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseW3AF_REPORT_ADDRESS(W3AF_REPORT_ADDRESS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>W3AF ADDRESS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>W3AF ADDRESS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseW3AF_ADDRESS(W3AF_ADDRESS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>W3AF TEST TYPE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>W3AF TEST TYPE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseW3AF_TEST_TYPE(W3AF_TEST_TYPE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>W3AF TARGET</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>W3AF TARGET</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseW3AF_TARGET(W3AF_TARGET object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ITLSwitch
