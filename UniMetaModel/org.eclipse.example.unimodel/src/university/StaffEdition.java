/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.StaffEdition#getProfessors <em>Professors</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getStaffEdition()
 * @model
 * @generated
 */
public interface StaffEdition extends EObject {
	/**
	 * Returns the value of the '<em><b>Professors</b></em>' containment reference list.
	 * The list contents are of type {@link university.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' containment reference list.
	 * @see university.UniversityPackage#getStaffEdition_Professors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professor> getProfessors();

} // StaffEdition
