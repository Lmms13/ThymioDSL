/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL.provider;

import java.util.ArrayList;
import java.util.Collection;

import ld.project2.thymioDSL.util.ThymioDSLAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThymioDSLItemProviderAdapterFactory extends ThymioDSLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThymioDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Procedure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureItemProvider procedureItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedureAdapter() {
		if (procedureItemProvider == null) {
			procedureItemProvider = new ProcedureItemProvider(this);
		}

		return procedureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.ProxSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxSensorItemProvider proxSensorItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.ProxSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProxSensorAdapter() {
		if (proxSensorItemProvider == null) {
			proxSensorItemProvider = new ProxSensorItemProvider(this);
		}

		return proxSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.BottomSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BottomSensorItemProvider bottomSensorItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.BottomSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBottomSensorAdapter() {
		if (bottomSensorItemProvider == null) {
			bottomSensorItemProvider = new BottomSensorItemProvider(this);
		}

		return bottomSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Motors} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorsItemProvider motorsItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Motors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMotorsAdapter() {
		if (motorsItemProvider == null) {
			motorsItemProvider = new MotorsItemProvider(this);
		}

		return motorsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Lights} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightsItemProvider lightsItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Lights}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLightsAdapter() {
		if (lightsItemProvider == null) {
			lightsItemProvider = new LightsItemProvider(this);
		}

		return lightsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.RGB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RGBItemProvider rgbItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.RGB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRGBAdapter() {
		if (rgbItemProvider == null) {
			rgbItemProvider = new RGBItemProvider(this);
		}

		return rgbItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Sound} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoundItemProvider soundItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Sound}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoundAdapter() {
		if (soundItemProvider == null) {
			soundItemProvider = new SoundItemProvider(this);
		}

		return soundItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Addition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionItemProvider additionItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditionAdapter() {
		if (additionItemProvider == null) {
			additionItemProvider = new AdditionItemProvider(this);
		}

		return additionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ld.project2.thymioDSL.Multiplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationItemProvider multiplicationItemProvider;

	/**
	 * This creates an adapter for a {@link ld.project2.thymioDSL.Multiplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplicationAdapter() {
		if (multiplicationItemProvider == null) {
			multiplicationItemProvider = new MultiplicationItemProvider(this);
		}

		return multiplicationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (procedureItemProvider != null) procedureItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (proxSensorItemProvider != null) proxSensorItemProvider.dispose();
		if (bottomSensorItemProvider != null) bottomSensorItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (motorsItemProvider != null) motorsItemProvider.dispose();
		if (lightsItemProvider != null) lightsItemProvider.dispose();
		if (rgbItemProvider != null) rgbItemProvider.dispose();
		if (soundItemProvider != null) soundItemProvider.dispose();
		if (expressionItemProvider != null) expressionItemProvider.dispose();
		if (additionItemProvider != null) additionItemProvider.dispose();
		if (multiplicationItemProvider != null) multiplicationItemProvider.dispose();
	}

}
