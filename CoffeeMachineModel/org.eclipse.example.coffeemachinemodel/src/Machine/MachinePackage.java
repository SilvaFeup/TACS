/**
 */
package Machine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Machine.MachineFactory
 * @model kind="package"
 * @generated
 */
public interface MachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Machine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org/eclipse/example/machine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.example.machine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MachinePackage eINSTANCE = Machine.impl.MachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link Machine.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.impl.ComponentImpl
	 * @see Machine.impl.MachinePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATUS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Machine.impl.WaterTankImpl <em>Water Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.impl.WaterTankImpl
	 * @see Machine.impl.MachinePackageImpl#getWaterTank()
	 * @generated
	 */
	int WATER_TANK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK__CAPACITY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Water Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Water Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_TANK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Machine.impl.CoffeeMakerImpl <em>Coffee Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.impl.CoffeeMakerImpl
	 * @see Machine.impl.MachinePackageImpl#getCoffeeMaker()
	 * @generated
	 */
	int COFFEE_MAKER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Brew Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER__BREW_STRENGTH = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coffee Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coffee Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MAKER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Machine.impl.GrinderImpl <em>Grinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.impl.GrinderImpl
	 * @see Machine.impl.MachinePackageImpl#getGrinder()
	 * @generated
	 */
	int GRINDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRINDER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRINDER__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Grind Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRINDER__GRIND_LEVEL = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRINDER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRINDER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Machine.impl.MilkFrotherImpl <em>Milk Frother</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.impl.MilkFrotherImpl
	 * @see Machine.impl.MachinePackageImpl#getMilkFrother()
	 * @generated
	 */
	int MILK_FROTHER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILK_FROTHER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILK_FROTHER__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Frothing Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILK_FROTHER__FROTHING_SPEED = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Milk Frother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILK_FROTHER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Milk Frother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILK_FROTHER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Machine.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.impl.CoffeeMachineImpl
	 * @see Machine.impl.MachinePackageImpl#getCoffeeMachine()
	 * @generated
	 */
	int COFFEE_MACHINE = 5;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Coffee Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coffee Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Machine.BrewStrength <em>Brew Strength</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Machine.BrewStrength
	 * @see Machine.impl.MachinePackageImpl#getBrewStrength()
	 * @generated
	 */
	int BREW_STRENGTH = 6;


	/**
	 * Returns the meta object for class '{@link Machine.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Machine.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link Machine.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Machine.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link Machine.Component#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Machine.Component#isStatus()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Status();

	/**
	 * Returns the meta object for class '{@link Machine.WaterTank <em>Water Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Tank</em>'.
	 * @see Machine.WaterTank
	 * @generated
	 */
	EClass getWaterTank();

	/**
	 * Returns the meta object for the attribute '{@link Machine.WaterTank#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see Machine.WaterTank#getCapacity()
	 * @see #getWaterTank()
	 * @generated
	 */
	EAttribute getWaterTank_Capacity();

	/**
	 * Returns the meta object for class '{@link Machine.CoffeeMaker <em>Coffee Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Maker</em>'.
	 * @see Machine.CoffeeMaker
	 * @generated
	 */
	EClass getCoffeeMaker();

	/**
	 * Returns the meta object for the attribute '{@link Machine.CoffeeMaker#getBrewStrength <em>Brew Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brew Strength</em>'.
	 * @see Machine.CoffeeMaker#getBrewStrength()
	 * @see #getCoffeeMaker()
	 * @generated
	 */
	EAttribute getCoffeeMaker_BrewStrength();

	/**
	 * Returns the meta object for class '{@link Machine.Grinder <em>Grinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grinder</em>'.
	 * @see Machine.Grinder
	 * @generated
	 */
	EClass getGrinder();

	/**
	 * Returns the meta object for the attribute '{@link Machine.Grinder#getGrindLevel <em>Grind Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grind Level</em>'.
	 * @see Machine.Grinder#getGrindLevel()
	 * @see #getGrinder()
	 * @generated
	 */
	EAttribute getGrinder_GrindLevel();

	/**
	 * Returns the meta object for class '{@link Machine.MilkFrother <em>Milk Frother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milk Frother</em>'.
	 * @see Machine.MilkFrother
	 * @generated
	 */
	EClass getMilkFrother();

	/**
	 * Returns the meta object for the attribute '{@link Machine.MilkFrother#getFrothingSpeed <em>Frothing Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frothing Speed</em>'.
	 * @see Machine.MilkFrother#getFrothingSpeed()
	 * @see #getMilkFrother()
	 * @generated
	 */
	EAttribute getMilkFrother_FrothingSpeed();

	/**
	 * Returns the meta object for class '{@link Machine.CoffeeMachine <em>Coffee Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Machine</em>'.
	 * @see Machine.CoffeeMachine
	 * @generated
	 */
	EClass getCoffeeMachine();

	/**
	 * Returns the meta object for the reference list '{@link Machine.CoffeeMachine#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see Machine.CoffeeMachine#getComponents()
	 * @see #getCoffeeMachine()
	 * @generated
	 */
	EReference getCoffeeMachine_Components();

	/**
	 * Returns the meta object for enum '{@link Machine.BrewStrength <em>Brew Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Brew Strength</em>'.
	 * @see Machine.BrewStrength
	 * @generated
	 */
	EEnum getBrewStrength();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MachineFactory getMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Machine.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.impl.ComponentImpl
		 * @see Machine.impl.MachinePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STATUS = eINSTANCE.getComponent_Status();

		/**
		 * The meta object literal for the '{@link Machine.impl.WaterTankImpl <em>Water Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.impl.WaterTankImpl
		 * @see Machine.impl.MachinePackageImpl#getWaterTank()
		 * @generated
		 */
		EClass WATER_TANK = eINSTANCE.getWaterTank();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_TANK__CAPACITY = eINSTANCE.getWaterTank_Capacity();

		/**
		 * The meta object literal for the '{@link Machine.impl.CoffeeMakerImpl <em>Coffee Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.impl.CoffeeMakerImpl
		 * @see Machine.impl.MachinePackageImpl#getCoffeeMaker()
		 * @generated
		 */
		EClass COFFEE_MAKER = eINSTANCE.getCoffeeMaker();

		/**
		 * The meta object literal for the '<em><b>Brew Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COFFEE_MAKER__BREW_STRENGTH = eINSTANCE.getCoffeeMaker_BrewStrength();

		/**
		 * The meta object literal for the '{@link Machine.impl.GrinderImpl <em>Grinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.impl.GrinderImpl
		 * @see Machine.impl.MachinePackageImpl#getGrinder()
		 * @generated
		 */
		EClass GRINDER = eINSTANCE.getGrinder();

		/**
		 * The meta object literal for the '<em><b>Grind Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRINDER__GRIND_LEVEL = eINSTANCE.getGrinder_GrindLevel();

		/**
		 * The meta object literal for the '{@link Machine.impl.MilkFrotherImpl <em>Milk Frother</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.impl.MilkFrotherImpl
		 * @see Machine.impl.MachinePackageImpl#getMilkFrother()
		 * @generated
		 */
		EClass MILK_FROTHER = eINSTANCE.getMilkFrother();

		/**
		 * The meta object literal for the '<em><b>Frothing Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILK_FROTHER__FROTHING_SPEED = eINSTANCE.getMilkFrother_FrothingSpeed();

		/**
		 * The meta object literal for the '{@link Machine.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.impl.CoffeeMachineImpl
		 * @see Machine.impl.MachinePackageImpl#getCoffeeMachine()
		 * @generated
		 */
		EClass COFFEE_MACHINE = eINSTANCE.getCoffeeMachine();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COFFEE_MACHINE__COMPONENTS = eINSTANCE.getCoffeeMachine_Components();

		/**
		 * The meta object literal for the '{@link Machine.BrewStrength <em>Brew Strength</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Machine.BrewStrength
		 * @see Machine.impl.MachinePackageImpl#getBrewStrength()
		 * @generated
		 */
		EEnum BREW_STRENGTH = eINSTANCE.getBrewStrength();

	}

} //MachinePackage
