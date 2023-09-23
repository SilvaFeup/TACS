/**
 */
package Machine.tests;

import Machine.CoffeeMaker;
import Machine.MachineFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coffee Maker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoffeeMakerTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoffeeMakerTest.class);
	}

	/**
	 * Constructs a new Coffee Maker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeMakerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Coffee Maker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CoffeeMaker getFixture() {
		return (CoffeeMaker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MachineFactory.eINSTANCE.createCoffeeMaker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CoffeeMakerTest
