/**
 */
package Machine.impl;

import Machine.Grinder;
import Machine.MachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Machine.impl.GrinderImpl#getGrindLevel <em>Grind Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrinderImpl extends ComponentImpl implements Grinder {
	/**
	 * The default value of the '{@link #getGrindLevel() <em>Grind Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrindLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int GRIND_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrindLevel() <em>Grind Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrindLevel()
	 * @generated
	 * @ordered
	 */
	protected int grindLevel = GRIND_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MachinePackage.Literals.GRINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGrindLevel() {
		return grindLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrindLevel(int newGrindLevel) {
		int oldGrindLevel = grindLevel;
		grindLevel = newGrindLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MachinePackage.GRINDER__GRIND_LEVEL, oldGrindLevel, grindLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MachinePackage.GRINDER__GRIND_LEVEL:
				return getGrindLevel();
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
			case MachinePackage.GRINDER__GRIND_LEVEL:
				setGrindLevel((Integer)newValue);
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
			case MachinePackage.GRINDER__GRIND_LEVEL:
				setGrindLevel(GRIND_LEVEL_EDEFAULT);
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
			case MachinePackage.GRINDER__GRIND_LEVEL:
				return grindLevel != GRIND_LEVEL_EDEFAULT;
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
		result.append(" (grindLevel: ");
		result.append(grindLevel);
		result.append(')');
		return result.toString();
	}

} //GrinderImpl
