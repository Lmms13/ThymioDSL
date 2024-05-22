/*
 * generated by Xtext 2.34.0
 */
package ld.project2.serializer;

import com.google.inject.Inject;
import java.util.Set;
import ld.project2.services.ThymioDSLGrammarAccess;
import ld.project2.thymioDSL.Addition;
import ld.project2.thymioDSL.BottomSensor;
import ld.project2.thymioDSL.Event;
import ld.project2.thymioDSL.Expression;
import ld.project2.thymioDSL.Lights;
import ld.project2.thymioDSL.Model;
import ld.project2.thymioDSL.Motors;
import ld.project2.thymioDSL.Multiplication;
import ld.project2.thymioDSL.Procedure;
import ld.project2.thymioDSL.ProxSensor;
import ld.project2.thymioDSL.RGB;
import ld.project2.thymioDSL.Sound;
import ld.project2.thymioDSL.ThymioDSLPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ThymioDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ThymioDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ThymioDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ThymioDSLPackage.ACTION:
				sequence_Action(context, (ld.project2.thymioDSL.Action) semanticObject); 
				return; 
			case ThymioDSLPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case ThymioDSLPackage.BOTTOM_SENSOR:
				sequence_BottomSensor(context, (BottomSensor) semanticObject); 
				return; 
			case ThymioDSLPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case ThymioDSLPackage.EXPRESSION:
				sequence_Number(context, (Expression) semanticObject); 
				return; 
			case ThymioDSLPackage.LIGHTS:
				sequence_Lights(context, (Lights) semanticObject); 
				return; 
			case ThymioDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ThymioDSLPackage.MOTORS:
				sequence_Motors(context, (Motors) semanticObject); 
				return; 
			case ThymioDSLPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case ThymioDSLPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case ThymioDSLPackage.PROX_SENSOR:
				sequence_ProxSensor(context, (ProxSensor) semanticObject); 
				return; 
			case ThymioDSLPackage.RGB:
				sequence_RGB(context, (RGB) semanticObject); 
				return; 
			case ThymioDSLPackage.SOUND:
				sequence_Sound(context, (Sound) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (move=Motors | light=Lights | sound+=Sound+)
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, ld.project2.thymioDSL.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Number returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (operator='+' | operator='-') right=Multiplication)
	 * </pre>
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BottomSensor returns BottomSensor
	 *
	 * Constraint:
	 *     (bottomLeftSensor=BlackWhite bottomRightSensor=BlackWhite)
	 * </pre>
	 */
	protected void sequence_BottomSensor(ISerializationContext context, BottomSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR));
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBottomSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_0_1_0(), semanticObject.getBottomLeftSensor());
		feeder.accept(grammarAccess.getBottomSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_1_1_0(), semanticObject.getBottomRightSensor());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (button=Ortogonal | stimulus=Stimulus | proxSensor=ProxSensor | bottomSensor=BottomSensor)
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Lights returns Lights
	 *
	 * Constraint:
	 *     (topLight=RGB? bottomLight=RGB?)
	 * </pre>
	 */
	protected void sequence_Lights(ISerializationContext context, Lights semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     procedures+=Procedure+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Motors returns Motors
	 *
	 * Constraint:
	 *     (left=Addition right=Addition)
	 * </pre>
	 */
	protected void sequence_Motors(ISerializationContext context, Motors semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.MOTORS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.MOTORS__LEFT));
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.MOTORS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.MOTORS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMotorsAccess().getLeftAdditionParserRuleCall_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMotorsAccess().getRightAdditionParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Number returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (operator='*' | operator='/') right=Number)
	 * </pre>
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Addition returns Expression
	 *     Addition.Addition_1_0 returns Expression
	 *     Multiplication returns Expression
	 *     Multiplication.Multiplication_1_0 returns Expression
	 *     Number returns Expression
	 *
	 * Constraint:
	 *     value=EInt
	 * </pre>
	 */
	protected void sequence_Number(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (name=EString events=Event actions+=Action+)
	 * </pre>
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProxSensor returns ProxSensor
	 *
	 * Constraint:
	 *     (
	 *         frontLeftSensor=SensorStatus? 
	 *         frontCenterLeftSensor=SensorStatus? 
	 *         frontCenterSensor=SensorStatus? 
	 *         frontCenterRightSensor=SensorStatus? 
	 *         frontRightSensor=SensorStatus? 
	 *         backLeftSensor=SensorStatus? 
	 *         backRightSensor=SensorStatus?
	 *     )
	 * </pre>
	 */
	protected void sequence_ProxSensor(ISerializationContext context, ProxSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RGB returns RGB
	 *
	 * Constraint:
	 *     (red=Addition green=Addition blue=Addition)
	 * </pre>
	 */
	protected void sequence_RGB(ISerializationContext context, RGB semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.RGB__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.RGB__RED));
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.RGB__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.RGB__GREEN));
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.RGB__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.RGB__BLUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRGBAccess().getRedAdditionParserRuleCall_1_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getRGBAccess().getGreenAdditionParserRuleCall_3_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getRGBAccess().getBlueAdditionParserRuleCall_5_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sound returns Sound
	 *
	 * Constraint:
	 *     (pitch=Addition duration=NoteDuration)
	 * </pre>
	 */
	protected void sequence_Sound(ISerializationContext context, Sound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.SOUND__PITCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.SOUND__PITCH));
			if (transientValues.isValueTransient(semanticObject, ThymioDSLPackage.Literals.SOUND__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ThymioDSLPackage.Literals.SOUND__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0(), semanticObject.getPitch());
		feeder.accept(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_2_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
}
