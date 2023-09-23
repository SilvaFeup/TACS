/**
 */
package Machine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coffee Maker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Machine.CoffeeMaker#getBrewStrength <em>Brew Strength</em>}</li>
 * </ul>
 *
 * @see Machine.MachinePackage#getCoffeeMaker()
 * @model
 * @generated
 */
public interface CoffeeMaker extends Component {
	/**
	 * Returns the value of the '<em><b>Brew Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link Machine.BrewStrength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brew Strength</em>' attribute.
	 * @see Machine.BrewStrength
	 * @see #setBrewStrength(BrewStrength)
	 * @see Machine.MachinePackage#getCoffeeMaker_BrewStrength()
	 * @model
	 * @generated
	 */
	BrewStrength getBrewStrength();

	/**
	 * Sets the value of the '{@link Machine.CoffeeMaker#getBrewStrength <em>Brew Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brew Strength</em>' attribute.
	 * @see Machine.BrewStrength
	 * @see #getBrewStrength()
	 * @generated
	 */
	void setBrewStrength(BrewStrength value);

} // CoffeeMaker
