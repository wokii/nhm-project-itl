/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.iTL.impl;

import ic.ac.uk.itl.iTL.ITLPackage;
import ic.ac.uk.itl.iTL.W3AF_ADDRESS;
import ic.ac.uk.itl.iTL.W3AF_REPORT_ADDRESS;
import ic.ac.uk.itl.iTL.W3AF_TARGET;
import ic.ac.uk.itl.iTL.W3AF_TEST_TYPE;
import ic.ac.uk.itl.iTL.W3af;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>W3af</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.itl.iTL.impl.W3afImpl#getW3af_test_type <em>W3af test type</em>}</li>
 *   <li>{@link ic.ac.uk.itl.iTL.impl.W3afImpl#getW3af_address <em>W3af address</em>}</li>
 *   <li>{@link ic.ac.uk.itl.iTL.impl.W3afImpl#getW3af_report_path <em>W3af report path</em>}</li>
 *   <li>{@link ic.ac.uk.itl.iTL.impl.W3afImpl#getW3af_target <em>W3af target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W3afImpl extends testing_toolImpl implements W3af
{
  /**
   * The cached value of the '{@link #getW3af_test_type() <em>W3af test type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW3af_test_type()
   * @generated
   * @ordered
   */
  protected W3AF_TEST_TYPE w3af_test_type;

  /**
   * The cached value of the '{@link #getW3af_address() <em>W3af address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW3af_address()
   * @generated
   * @ordered
   */
  protected W3AF_ADDRESS w3af_address;

  /**
   * The cached value of the '{@link #getW3af_report_path() <em>W3af report path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW3af_report_path()
   * @generated
   * @ordered
   */
  protected W3AF_REPORT_ADDRESS w3af_report_path;

  /**
   * The cached value of the '{@link #getW3af_target() <em>W3af target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW3af_target()
   * @generated
   * @ordered
   */
  protected W3AF_TARGET w3af_target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected W3afImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ITLPackage.Literals.W3AF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public W3AF_TEST_TYPE getW3af_test_type()
  {
    return w3af_test_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW3af_test_type(W3AF_TEST_TYPE newW3af_test_type, NotificationChain msgs)
  {
    W3AF_TEST_TYPE oldW3af_test_type = w3af_test_type;
    w3af_test_type = newW3af_test_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_TEST_TYPE, oldW3af_test_type, newW3af_test_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW3af_test_type(W3AF_TEST_TYPE newW3af_test_type)
  {
    if (newW3af_test_type != w3af_test_type)
    {
      NotificationChain msgs = null;
      if (w3af_test_type != null)
        msgs = ((InternalEObject)w3af_test_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_TEST_TYPE, null, msgs);
      if (newW3af_test_type != null)
        msgs = ((InternalEObject)newW3af_test_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_TEST_TYPE, null, msgs);
      msgs = basicSetW3af_test_type(newW3af_test_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_TEST_TYPE, newW3af_test_type, newW3af_test_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public W3AF_ADDRESS getW3af_address()
  {
    return w3af_address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW3af_address(W3AF_ADDRESS newW3af_address, NotificationChain msgs)
  {
    W3AF_ADDRESS oldW3af_address = w3af_address;
    w3af_address = newW3af_address;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_ADDRESS, oldW3af_address, newW3af_address);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW3af_address(W3AF_ADDRESS newW3af_address)
  {
    if (newW3af_address != w3af_address)
    {
      NotificationChain msgs = null;
      if (w3af_address != null)
        msgs = ((InternalEObject)w3af_address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_ADDRESS, null, msgs);
      if (newW3af_address != null)
        msgs = ((InternalEObject)newW3af_address).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_ADDRESS, null, msgs);
      msgs = basicSetW3af_address(newW3af_address, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_ADDRESS, newW3af_address, newW3af_address));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public W3AF_REPORT_ADDRESS getW3af_report_path()
  {
    return w3af_report_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW3af_report_path(W3AF_REPORT_ADDRESS newW3af_report_path, NotificationChain msgs)
  {
    W3AF_REPORT_ADDRESS oldW3af_report_path = w3af_report_path;
    w3af_report_path = newW3af_report_path;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_REPORT_PATH, oldW3af_report_path, newW3af_report_path);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW3af_report_path(W3AF_REPORT_ADDRESS newW3af_report_path)
  {
    if (newW3af_report_path != w3af_report_path)
    {
      NotificationChain msgs = null;
      if (w3af_report_path != null)
        msgs = ((InternalEObject)w3af_report_path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_REPORT_PATH, null, msgs);
      if (newW3af_report_path != null)
        msgs = ((InternalEObject)newW3af_report_path).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_REPORT_PATH, null, msgs);
      msgs = basicSetW3af_report_path(newW3af_report_path, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_REPORT_PATH, newW3af_report_path, newW3af_report_path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public W3AF_TARGET getW3af_target()
  {
    return w3af_target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW3af_target(W3AF_TARGET newW3af_target, NotificationChain msgs)
  {
    W3AF_TARGET oldW3af_target = w3af_target;
    w3af_target = newW3af_target;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_TARGET, oldW3af_target, newW3af_target);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW3af_target(W3AF_TARGET newW3af_target)
  {
    if (newW3af_target != w3af_target)
    {
      NotificationChain msgs = null;
      if (w3af_target != null)
        msgs = ((InternalEObject)w3af_target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_TARGET, null, msgs);
      if (newW3af_target != null)
        msgs = ((InternalEObject)newW3af_target).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ITLPackage.W3AF__W3AF_TARGET, null, msgs);
      msgs = basicSetW3af_target(newW3af_target, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ITLPackage.W3AF__W3AF_TARGET, newW3af_target, newW3af_target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ITLPackage.W3AF__W3AF_TEST_TYPE:
        return basicSetW3af_test_type(null, msgs);
      case ITLPackage.W3AF__W3AF_ADDRESS:
        return basicSetW3af_address(null, msgs);
      case ITLPackage.W3AF__W3AF_REPORT_PATH:
        return basicSetW3af_report_path(null, msgs);
      case ITLPackage.W3AF__W3AF_TARGET:
        return basicSetW3af_target(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ITLPackage.W3AF__W3AF_TEST_TYPE:
        return getW3af_test_type();
      case ITLPackage.W3AF__W3AF_ADDRESS:
        return getW3af_address();
      case ITLPackage.W3AF__W3AF_REPORT_PATH:
        return getW3af_report_path();
      case ITLPackage.W3AF__W3AF_TARGET:
        return getW3af_target();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ITLPackage.W3AF__W3AF_TEST_TYPE:
        setW3af_test_type((W3AF_TEST_TYPE)newValue);
        return;
      case ITLPackage.W3AF__W3AF_ADDRESS:
        setW3af_address((W3AF_ADDRESS)newValue);
        return;
      case ITLPackage.W3AF__W3AF_REPORT_PATH:
        setW3af_report_path((W3AF_REPORT_ADDRESS)newValue);
        return;
      case ITLPackage.W3AF__W3AF_TARGET:
        setW3af_target((W3AF_TARGET)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ITLPackage.W3AF__W3AF_TEST_TYPE:
        setW3af_test_type((W3AF_TEST_TYPE)null);
        return;
      case ITLPackage.W3AF__W3AF_ADDRESS:
        setW3af_address((W3AF_ADDRESS)null);
        return;
      case ITLPackage.W3AF__W3AF_REPORT_PATH:
        setW3af_report_path((W3AF_REPORT_ADDRESS)null);
        return;
      case ITLPackage.W3AF__W3AF_TARGET:
        setW3af_target((W3AF_TARGET)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ITLPackage.W3AF__W3AF_TEST_TYPE:
        return w3af_test_type != null;
      case ITLPackage.W3AF__W3AF_ADDRESS:
        return w3af_address != null;
      case ITLPackage.W3AF__W3AF_REPORT_PATH:
        return w3af_report_path != null;
      case ITLPackage.W3AF__W3AF_TARGET:
        return w3af_target != null;
    }
    return super.eIsSet(featureID);
  }

} //W3afImpl
