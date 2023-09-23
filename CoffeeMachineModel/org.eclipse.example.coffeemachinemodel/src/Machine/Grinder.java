/**
 */
package Machine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Machine.Grinder#getGrindLevel <em>Grind Level</em>}</li>
 * </ul>
 *
 * @see Machine.MachinePackage#getGrinder()
 * @model
 * @generated
 */
public interface Grinder extends Component {
	/**
	 * Returns the value of the '<em><b>Grind Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grind Level</em>' attribute.
	 * @see #setGrindLevel(int)
	 * @see Machine.MachinePackage#getGrinder_GrindLevel()
	 * @model
	 * @generated
	 */
	int getGrindLevel();

	/**
	 * Sets the value of the '{@link Machine.Grinder#getGrindLevel <em>Grind Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grind Level</em>' attribute.
	 * @see #getGrindLevel()
	 * @generated
	 */
	void setGrindLevel(int value);

} // Grinder
