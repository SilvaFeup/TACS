/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Faculty#getUniversity <em>University</em>}</li>
 *   <li>{@link university.Faculty#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link university.Faculty#getProfessors <em>Professors</em>}</li>
 *   <li>{@link university.Faculty#getName <em>Name</em>}</li>
 *   <li>{@link university.Faculty#getDean <em>Dean</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>University</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' reference.
	 * @see #setUniversity(University)
	 * @see university.UniversityPackage#getFaculty_University()
	 * @model required="true"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link university.Faculty#getUniversity <em>University</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference list.
	 * The list contents are of type {@link university.Degree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference list.
	 * @see university.UniversityPackage#getFaculty_Degrees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Degree> getDegrees();

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' reference list.
	 * The list contents are of type {@link university.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' reference list.
	 * @see university.UniversityPackage#getFaculty_Professors()
	 * @model
	 * @generated
	 */
	EList<Professor> getProfessors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dean</em>' attribute.
	 * @see #setDean(String)
	 * @see university.UniversityPackage#getFaculty_Dean()
	 * @model
	 * @generated
	 */
	String getDean();

	/**
	 * Sets the value of the '{@link university.Faculty#getDean <em>Dean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dean</em>' attribute.
	 * @see #getDean()
	 * @generated
	 */
	void setDean(String value);

} // Faculty
