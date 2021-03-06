/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.itl.iTL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>W3af</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.itl.iTL.W3af#getW3af_test_type <em>W3af test type</em>}</li>
 *   <li>{@link ic.ac.uk.itl.iTL.W3af#getW3af_address <em>W3af address</em>}</li>
 *   <li>{@link ic.ac.uk.itl.iTL.W3af#getW3af_report_path <em>W3af report path</em>}</li>
 *   <li>{@link ic.ac.uk.itl.iTL.W3af#getW3af_target <em>W3af target</em>}</li>
 * </ul>
 *
 * @see ic.ac.uk.itl.iTL.ITLPackage#getW3af()
 * @model
 * @generated
 */
public interface W3af extends testing_tool
{
  /**
   * Returns the value of the '<em><b>W3af test type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W3af test type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W3af test type</em>' containment reference.
   * @see #setW3af_test_type(W3AF_TEST_TYPE)
   * @see ic.ac.uk.itl.iTL.ITLPackage#getW3af_W3af_test_type()
   * @model containment="true"
   * @generated
   */
  W3AF_TEST_TYPE getW3af_test_type();

  /**
   * Sets the value of the '{@link ic.ac.uk.itl.iTL.W3af#getW3af_test_type <em>W3af test type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W3af test type</em>' containment reference.
   * @see #getW3af_test_type()
   * @generated
   */
  void setW3af_test_type(W3AF_TEST_TYPE value);

  /**
   * Returns the value of the '<em><b>W3af address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W3af address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W3af address</em>' containment reference.
   * @see #setW3af_address(W3AF_ADDRESS)
   * @see ic.ac.uk.itl.iTL.ITLPackage#getW3af_W3af_address()
   * @model containment="true"
   * @generated
   */
  W3AF_ADDRESS getW3af_address();

  /**
   * Sets the value of the '{@link ic.ac.uk.itl.iTL.W3af#getW3af_address <em>W3af address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W3af address</em>' containment reference.
   * @see #getW3af_address()
   * @generated
   */
  void setW3af_address(W3AF_ADDRESS value);

  /**
   * Returns the value of the '<em><b>W3af report path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W3af report path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W3af report path</em>' containment reference.
   * @see #setW3af_report_path(W3AF_REPORT_ADDRESS)
   * @see ic.ac.uk.itl.iTL.ITLPackage#getW3af_W3af_report_path()
   * @model containment="true"
   * @generated
   */
  W3AF_REPORT_ADDRESS getW3af_report_path();

  /**
   * Sets the value of the '{@link ic.ac.uk.itl.iTL.W3af#getW3af_report_path <em>W3af report path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W3af report path</em>' containment reference.
   * @see #getW3af_report_path()
   * @generated
   */
  void setW3af_report_path(W3AF_REPORT_ADDRESS value);

  /**
   * Returns the value of the '<em><b>W3af target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W3af target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W3af target</em>' containment reference.
   * @see #setW3af_target(W3AF_TARGET)
   * @see ic.ac.uk.itl.iTL.ITLPackage#getW3af_W3af_target()
   * @model containment="true"
   * @generated
   */
  W3AF_TARGET getW3af_target();

  /**
   * Sets the value of the '{@link ic.ac.uk.itl.iTL.W3af#getW3af_target <em>W3af target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W3af target</em>' containment reference.
   * @see #getW3af_target()
   * @generated
   */
  void setW3af_target(W3AF_TARGET value);

} // W3af
