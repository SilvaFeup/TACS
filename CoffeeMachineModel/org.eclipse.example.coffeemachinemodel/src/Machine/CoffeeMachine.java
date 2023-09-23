/**
 */
package Machine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coffee Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Machine.CoffeeMachine#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see Machine.MachinePackage#getCoffeeMachine()
 * @model
 * @generated
 */
public interface CoffeeMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link Machine.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see Machine.MachinePackage#getCoffeeMachine_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

} // CoffeeMachine
