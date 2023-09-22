/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Degree#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link university.Degree#getCourses <em>Courses</em>}</li>
 *   <li>{@link university.Degree#getName <em>Name</em>}</li>
 *   <li>{@link university.Degree#getDescription <em>Description</em>}</li>
 *   <li>{@link university.Degree#getDurationYears <em>Duration Years</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getDegree()
 * @model
 * @generated
 */
public interface Degree extends EObject {
	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' reference.
	 * @see #setFaculty(Faculty)
	 * @see university.UniversityPackage#getDegree_Faculty()
	 * @model required="true"
	 * @generated
	 */
	Faculty getFaculty();

	/**
	 * Sets the value of the '{@link university.Degree#getFaculty <em>Faculty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty</em>' reference.
	 * @see #getFaculty()
	 * @generated
	 */
	void setFaculty(Faculty value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link university.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see university.UniversityPackage#getDegree_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getDegree_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Degree#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see university.UniversityPackage#getDegree_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link university.Degree#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Duration Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Years</em>' attribute.
	 * @see #setDurationYears(int)
	 * @see university.UniversityPackage#getDegree_DurationYears()
	 * @model
	 * @generated
	 */
	int getDurationYears();

	/**
	 * Sets the value of the '{@link university.Degree#getDurationYears <em>Duration Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Years</em>' attribute.
	 * @see #getDurationYears()
	 * @generated
	 */
	void setDurationYears(int value);

} // Degree
