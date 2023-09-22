/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import university.Degree;
import university.Faculty;
import university.Professor;
import university.University;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.FacultyImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link university.impl.FacultyImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link university.impl.FacultyImpl#getProfessors <em>Professors</em>}</li>
 *   <li>{@link university.impl.FacultyImpl#getName <em>Name</em>}</li>
 *   <li>{@link university.impl.FacultyImpl#getDean <em>Dean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacultyImpl extends MinimalEObjectImpl.Container implements Faculty {
	/**
	 * The cached value of the '{@link #getUniversity() <em>University</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversity()
	 * @generated
	 * @ordered
	 */
	protected University university;

	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Degree> degrees;

	/**
	 * The cached value of the '{@link #getProfessors() <em>Professors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> professors;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDean() <em>Dean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDean()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDean() <em>Dean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDean()
	 * @generated
	 * @ordered
	 */
	protected String dean = DEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacultyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.FACULTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getUniversity() {
		if (university != null && university.eIsProxy()) {
			InternalEObject oldUniversity = (InternalEObject)university;
			university = (University)eResolveProxy(oldUniversity);
			if (university != oldUniversity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.FACULTY__UNIVERSITY, oldUniversity, university));
			}
		}
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University basicGetUniversity() {
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversity(University newUniversity) {
		University oldUniversity = university;
		university = newUniversity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.FACULTY__UNIVERSITY, oldUniversity, university));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Degree> getDegrees() {
		if (degrees == null) {
			degrees = new EObjectContainmentEList<Degree>(Degree.class, this, UniversityPackage.FACULTY__DEGREES);
		}
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Professor> getProfessors() {
		if (professors == null) {
			professors = new EObjectResolvingEList<Professor>(Professor.class, this, UniversityPackage.FACULTY__PROFESSORS);
		}
		return professors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.FACULTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDean() {
		return dean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDean(String newDean) {
		String oldDean = dean;
		dean = newDean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.FACULTY__DEAN, oldDean, dean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.FACULTY__DEGREES:
				return ((InternalEList<?>)getDegrees()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityPackage.FACULTY__UNIVERSITY:
				if (resolve) return getUniversity();
				return basicGetUniversity();
			case UniversityPackage.FACULTY__DEGREES:
				return getDegrees();
			case UniversityPackage.FACULTY__PROFESSORS:
				return getProfessors();
			case UniversityPackage.FACULTY__NAME:
				return getName();
			case UniversityPackage.FACULTY__DEAN:
				return getDean();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityPackage.FACULTY__UNIVERSITY:
				setUniversity((University)newValue);
				return;
			case UniversityPackage.FACULTY__DEGREES:
				getDegrees().clear();
				getDegrees().addAll((Collection<? extends Degree>)newValue);
				return;
			case UniversityPackage.FACULTY__PROFESSORS:
				getProfessors().clear();
				getProfessors().addAll((Collection<? extends Professor>)newValue);
				return;
			case UniversityPackage.FACULTY__NAME:
				setName((String)newValue);
				return;
			case UniversityPackage.FACULTY__DEAN:
				setDean((String)newValue);
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
			case UniversityPackage.FACULTY__UNIVERSITY:
				setUniversity((University)null);
				return;
			case UniversityPackage.FACULTY__DEGREES:
				getDegrees().clear();
				return;
			case UniversityPackage.FACULTY__PROFESSORS:
				getProfessors().clear();
				return;
			case UniversityPackage.FACULTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversityPackage.FACULTY__DEAN:
				setDean(DEAN_EDEFAULT);
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
			case UniversityPackage.FACULTY__UNIVERSITY:
				return university != null;
			case UniversityPackage.FACULTY__DEGREES:
				return degrees != null && !degrees.isEmpty();
			case UniversityPackage.FACULTY__PROFESSORS:
				return professors != null && !professors.isEmpty();
			case UniversityPackage.FACULTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversityPackage.FACULTY__DEAN:
				return DEAN_EDEFAULT == null ? dean != null : !DEAN_EDEFAULT.equals(dean);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", dean: ");
		result.append(dean);
		result.append(')');
		return result.toString();
	}

} //FacultyImpl
