/**
 */
package Machine.impl;

import Machine.MachinePackage;
import Machine.MilkFrother;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milk Frother</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Machine.impl.MilkFrotherImpl#getFrothingSpeed <em>Frothing Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MilkFrotherImpl extends ComponentImpl implements MilkFrother {
	/**
	 * The default value of the '{@link #getFrothingSpeed() <em>Frothing Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrothingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String FROTHING_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrothingSpeed() <em>Frothing Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrothingSpeed()
	 * @generated
	 * @ordered
	 */
	protected String frothingSpeed = FROTHING_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilkFrotherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MachinePackage.Literals.MILK_FROTHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrothingSpeed() {
		return frothingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrothingSpeed(String newFrothingSpeed) {
		String oldFrothingSpeed = frothingSpeed;
		frothingSpeed = newFrothingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MachinePackage.MILK_FROTHER__FROTHING_SPEED, oldFrothingSpeed, frothingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MachinePackage.MILK_FROTHER__FROTHING_SPEED:
				return getFrothingSpeed();
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
			case MachinePackage.MILK_FROTHER__FROTHING_SPEED:
				setFrothingSpeed((String)newValue);
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
			case MachinePackage.MILK_FROTHER__FROTHING_SPEED:
				setFrothingSpeed(FROTHING_SPEED_EDEFAULT);
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
			case MachinePackage.MILK_FROTHER__FROTHING_SPEED:
				return FROTHING_SPEED_EDEFAULT == null ? frothingSpeed != null : !FROTHING_SPEED_EDEFAULT.equals(frothingSpeed);
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
		result.append(" (frothingSpeed: ");
		result.append(frothingSpeed);
		result.append(')');
		return result.toString();
	}

} //MilkFrotherImpl
