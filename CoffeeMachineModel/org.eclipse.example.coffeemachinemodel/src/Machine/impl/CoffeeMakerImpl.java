/**
 */
package Machine.impl;

import Machine.BrewStrength;
import Machine.CoffeeMaker;
import Machine.MachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coffee Maker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Machine.impl.CoffeeMakerImpl#getBrewStrength <em>Brew Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoffeeMakerImpl extends ComponentImpl implements CoffeeMaker {
	/**
	 * The default value of the '{@link #getBrewStrength() <em>Brew Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewStrength()
	 * @generated
	 * @ordered
	 */
	protected static final BrewStrength BREW_STRENGTH_EDEFAULT = BrewStrength.STRONG;

	/**
	 * The cached value of the '{@link #getBrewStrength() <em>Brew Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewStrength()
	 * @generated
	 * @ordered
	 */
	protected BrewStrength brewStrength = BREW_STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeMakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MachinePackage.Literals.COFFEE_MAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrewStrength getBrewStrength() {
		return brewStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrewStrength(BrewStrength newBrewStrength) {
		BrewStrength oldBrewStrength = brewStrength;
		brewStrength = newBrewStrength == null ? BREW_STRENGTH_EDEFAULT : newBrewStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MachinePackage.COFFEE_MAKER__BREW_STRENGTH, oldBrewStrength, brewStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MachinePackage.COFFEE_MAKER__BREW_STRENGTH:
				return getBrewStrength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MachinePackage.COFFEE_MAKER__BREW_STRENGTH:
				setBrewStrength((BrewStrength)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MachinePackage.COFFEE_MAKER__BREW_STRENGTH:
				setBrewStrength(BREW_STRENGTH_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MachinePackage.COFFEE_MAKER__BREW_STRENGTH:
				return brewStrength != BREW_STRENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (brewStrength: ");
		result.append(brewStrength);
		result.append(')');
		return result.toString();
	}

} //CoffeeMakerImpl
