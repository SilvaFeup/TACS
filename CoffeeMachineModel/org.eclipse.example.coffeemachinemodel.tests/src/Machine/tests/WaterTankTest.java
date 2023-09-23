/**
 */
package Machine.tests;

import Machine.MachineFactory;
import Machine.WaterTank;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Water Tank</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterTankTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaterTankTest.class);
	}

	/**
	 * Constructs a new Water Tank test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterTankTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Water Tank test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WaterTank getFixture() {
		return (WaterTank)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MachineFactory.eINSTANCE.createWaterTank());
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

} //WaterTankTest
