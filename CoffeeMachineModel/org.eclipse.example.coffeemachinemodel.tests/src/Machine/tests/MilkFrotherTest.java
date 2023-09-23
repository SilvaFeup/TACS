/**
 */
package Machine.tests;

import Machine.MachineFactory;
import Machine.MilkFrother;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Milk Frother</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MilkFrotherTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MilkFrotherTest.class);
	}

	/**
	 * Constructs a new Milk Frother test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MilkFrotherTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Milk Frother test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MilkFrother getFixture() {
		return (MilkFrother)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MachineFactory.eINSTANCE.createMilkFrother());
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

} //MilkFrotherTest
