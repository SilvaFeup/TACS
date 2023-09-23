/**
 */
package Machine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milk Frother</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Machine.MilkFrother#getFrothingSpeed <em>Frothing Speed</em>}</li>
 * </ul>
 *
 * @see Machine.MachinePackage#getMilkFrother()
 * @model
 * @generated
 */
public interface MilkFrother extends Component {
	/**
	 * Returns the value of the '<em><b>Frothing Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frothing Speed</em>' attribute.
	 * @see #setFrothingSpeed(String)
	 * @see Machine.MachinePackage#getMilkFrother_FrothingSpeed()
	 * @model
	 * @generated
	 */
	String getFrothingSpeed();

	/**
	 * Sets the value of the '{@link Machine.MilkFrother#getFrothingSpeed <em>Frothing Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frothing Speed</em>' attribute.
	 * @see #getFrothingSpeed()
	 * @generated
	 */
	void setFrothingSpeed(String value);

} // MilkFrother
