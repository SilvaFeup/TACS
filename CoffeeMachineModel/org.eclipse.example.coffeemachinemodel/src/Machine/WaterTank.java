/**
 */
package Machine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Tank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Machine.WaterTank#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see Machine.MachinePackage#getWaterTank()
 * @model
 * @generated
 */
public interface WaterTank extends Component {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(double)
	 * @see Machine.MachinePackage#getWaterTank_Capacity()
	 * @model
	 * @generated
	 */
	double getCapacity();

	/**
	 * Sets the value of the '{@link Machine.WaterTank#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(double value);

} // WaterTank
