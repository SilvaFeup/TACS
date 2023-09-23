/**
 */
package Machine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Machine.MachinePackage
 * @generated
 */
public interface MachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MachineFactory eINSTANCE = Machine.impl.MachineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Water Tank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Tank</em>'.
	 * @generated
	 */
	WaterTank createWaterTank();

	/**
	 * Returns a new object of class '<em>Coffee Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coffee Maker</em>'.
	 * @generated
	 */
	CoffeeMaker createCoffeeMaker();

	/**
	 * Returns a new object of class '<em>Grinder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grinder</em>'.
	 * @generated
	 */
	Grinder createGrinder();

	/**
	 * Returns a new object of class '<em>Milk Frother</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Milk Frother</em>'.
	 * @generated
	 */
	MilkFrother createMilkFrother();

	/**
	 * Returns a new object of class '<em>Coffee Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coffee Machine</em>'.
	 * @generated
	 */
	CoffeeMachine createCoffeeMachine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MachinePackage getMachinePackage();

} //MachineFactory
