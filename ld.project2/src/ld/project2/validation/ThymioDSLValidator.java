/*
 * generated by Xtext 2.34.0
 */
package ld.project2.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import ld.project2.thymioDSL.Action;
import ld.project2.thymioDSL.Addition;
import ld.project2.thymioDSL.Expression;
import ld.project2.thymioDSL.Lights;
import ld.project2.thymioDSL.Model;
import ld.project2.thymioDSL.Motors;
import ld.project2.thymioDSL.Multiplication;
import ld.project2.thymioDSL.Procedure;
import ld.project2.thymioDSL.ProxSensor;
import ld.project2.thymioDSL.Sound;
import ld.project2.thymioDSL.ThymioDSLPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ThymioDSLValidator extends AbstractThymioDSLValidator {
	
	//helper function, it's public because I needed to use it elsewhere
	public int evaluateExpression(Expression e) {
		if(e instanceof Addition) {
			Addition a = (Addition) e;
			if(a.getOperator().equals("+")) {
				return evaluateExpression(a.getLeft()) + evaluateExpression(a.getRight());
			}
			else {
				return evaluateExpression(a.getLeft()) - evaluateExpression(a.getRight());				
			}
		}
		else if(e instanceof Multiplication) {
			Multiplication m = (Multiplication) e;
			if(m.getOperator().equals("*")) {
				return evaluateExpression(m.getLeft()) * evaluateExpression(m.getRight());
			}
			else {
				return (int) (evaluateExpression(m.getLeft()) / evaluateExpression(m.getRight()));				
			}
		}
		else {
			return e.getValue();
		}
	}
	
	//ignore this function, it's here for convenience 
	public int computePitch(int n) {
		switch (n){
			case 1:
				return 262;
			case 2:
				return 311;
			case 3:
				return 370;
			case 4:
				return 440;
			case 5:
				return 524;
			default:
				return 0;
		}
	}
	
	//ignore this function, it's here for convenience 
	public String proxSensorInAseba(ProxSensor s){
		StringBuilder sb = new StringBuilder();
		sb.append("when ");
		if(s.getFrontLeftSensor() != null && !s.getFrontLeftSensor().equals("far")) {
			sb.append(s.getFrontLeftSensor().equals("close")?"prox.horizontal[0] <= 1000":"prox.horizontal[0] >= 2000");
			sb.append(" and ");
		}
		if(s.getFrontCenterLeftSensor() != null && !s.getFrontCenterLeftSensor().equals("far")) {
			sb.append(s.getFrontCenterLeftSensor().equals("close")?"prox.horizontal[1] <= 1000":"prox.horizontal[1] >= 2000");
			sb.append(" and ");
		}
		if(s.getFrontCenterSensor() != null && !s.getFrontCenterSensor().equals("far")) {
			sb.append(s.getFrontCenterSensor().equals("close")?"prox.horizontal[2] <= 1000":"prox.horizontal[2] >= 2000");
			sb.append(" and ");
		}
		if(s.getFrontCenterRightSensor() != null && !s.getFrontCenterRightSensor().equals("far")) {
			sb.append(s.getFrontCenterRightSensor().equals("close")?"prox.horizontal[3] <= 1000":"prox.horizontal[3] >= 2000");
			sb.append(" and ");
		}
		if(s.getFrontRightSensor() != null && !s.getFrontRightSensor().equals("far")) {
			sb.append(s.getFrontRightSensor().equals("close")?"prox.horizontal[4] <= 1000":"prox.horizontal[4] >= 2000");
			sb.append(" and ");
		}
		if(s.getBackLeftSensor() != null && !s.getBackLeftSensor().equals("far")) {
			sb.append(s.getBackLeftSensor().equals("close")?"prox.horizontal[5] <= 1000":"prox.horizontal[5] >= 2000");
			sb.append(" and ");
		}
		if(s.getBackRightSensor() != null && !s.getBackRightSensor().equals("far")) {
			sb.append(s.getBackRightSensor().equals("close")?"prox.horizontal[6] <= 1000":"prox.horizontal[6] >= 2000");
		}
		if(sb.toString().endsWith(" and ")) {
			sb.delete(sb.length() - 5 ,sb.length());
		}
		sb.append(" do" + System.lineSeparator());
		return sb.toString();
	}
	
	public static final String INVALID_RGB_RED = "invalidRGBRed";
	public static final String INVALID_RGB_GREEN = "invalidRGBGreen";
	public static final String INVALID_RGB_BLUE = "invalidRGBBlue";

	@Check(CheckType.NORMAL)
	public void checkRGB(Action action) {
		if(action.getLight() != null) {
			Lights lights = action.getLight();
			if(lights.getTopLight() != null) {
				int r = evaluateExpression(lights.getTopLight().getRed());
				if(r < 0 || r > 32)
					error("red must be between 0 and 32"
							, lights.getTopLight()
							, ThymioDSLPackage.eINSTANCE.getRGB_Red()
							, INVALID_RGB_RED
							, "" + r);
				int g = evaluateExpression(lights.getTopLight().getGreen());
				if(g < 0 || g > 32)
					error("green must be between 0 and 32"
							, lights.getTopLight()
							, ThymioDSLPackage.eINSTANCE.getRGB_Green()
							, INVALID_RGB_GREEN
							, "" + g);
				int b = evaluateExpression(lights.getTopLight().getBlue());
				if(b < 0 || b > 32)
					error("blue must be between 0 and 32"
							, lights.getTopLight()
							, ThymioDSLPackage.eINSTANCE.getRGB_Blue()
							, INVALID_RGB_BLUE
							, "" + b);
			}
			if(lights.getBottomLight() != null) {
				int r = evaluateExpression(lights.getBottomLight().getRed());
				if(r < 0 || r > 32)
					error("red must be between 0 and 32"
							, lights.getBottomLight()
							, ThymioDSLPackage.eINSTANCE.getRGB_Red()
							, INVALID_RGB_RED
							, "" + r);
				int g = evaluateExpression(lights.getBottomLight().getGreen());
				if(g < 0 || g > 32)
					error("green must be between 0 and 32"
							, lights.getBottomLight()
							, ThymioDSLPackage.eINSTANCE.getRGB_Green()
							, INVALID_RGB_GREEN
							, "" + g);
				int b = evaluateExpression(lights.getBottomLight().getBlue());
				if(b < 0 || b > 32)
					error("blue must be between 0 and 32"
							, lights.getBottomLight()
							, ThymioDSLPackage.eINSTANCE.getRGB_Blue()
							, INVALID_RGB_BLUE
							, "" + b);
			}
		}
	}
	
	public static final String INVALID_MOTORS_LEFT = "invalidLeftMotor";
	public static final String INVALID_MOTORS_RIGHT = "invalidRightMotor";
	
	@Check(CheckType.NORMAL)
	public void checkMotors(Action action) {
		if(action.getMove() != null) {
			Motors motors = action.getMove();
			if(motors.getLeft() != null) {
				int left = evaluateExpression(motors.getLeft());
				if(left < -500 || left > 500)
					error("motor values must be between -500 and 500"
							, action.getMove()
							, ThymioDSLPackage.eINSTANCE.getMotors_Left()
							, INVALID_MOTORS_LEFT
							, "" + left);
			}
			if(motors.getRight() != null) {
				int right = evaluateExpression(motors.getRight());
				if(right < -500 || right > 500)
					error("motor values must be between -500 and 500"
							, action.getMove()
							, ThymioDSLPackage.eINSTANCE.getMotors_Right()
							, INVALID_MOTORS_RIGHT
							, "" + right);
			}
		}
	}
	
	private boolean duplicateActions(Action a1, Action a2) {
		if(a1.getLight() != null && a2.getLight() != null) {
			return true;
		}
		else if(a1.getMove() != null && a2.getMove() != null) {
			return true;
		}
		else if(!a1.getSound().isEmpty() && !a2.getSound().isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static final String DUPLICATE_ACTIONS = "duplicateActions";
	
	@Check(CheckType.NORMAL)
	public void checkDuplicateActions(Procedure procedure) {
		EList<Action> actions = procedure.getActions();
		for(int i = 0; i < actions.size(); i++) {
			for(int j = 0; j < actions.size(); j++) {
				if(i != j) {
					if(duplicateActions(actions.get(i), actions.get(j)))
							error("one event can't trigger the same action more than once"
									, actions.get(j)
									, ThymioDSLPackage.eINSTANCE.getAction().getEReferences().get(ThymioDSLPackage.eINSTANCE.getAction().getEReferences().size() - 1)
									, DUPLICATE_ACTIONS);
				}
			}
		}
	}
	
	public static final String NOTE_LIMIT_REACHED = "noteLimitReached";
	
	@Check(CheckType.NORMAL)
	public void checkNoteLimit(Action action) {
		if(action.getSound().size() > 6)
			error("the maximum number of notes is 6"
					, action
					, ThymioDSLPackage.eINSTANCE.getAction_Sound()
					, NOTE_LIMIT_REACHED);
	}
	
	public static final String INVALID_PITCH = "invalidPitch";
	
	@Check(CheckType.NORMAL)
	public void checkPitch(Action action) {
		if(!action.getSound().isEmpty()) {
			for(Sound s: action.getSound()) {
				int pitch = evaluateExpression(s.getPitch());
				if(pitch < 0 || pitch > 5)
					error("pitch values must be between 0 and 5"
					, s
					, ThymioDSLPackage.eINSTANCE.getSound_Pitch()
					, INVALID_PITCH
					, "" + pitch);
			}
		}
	}
	
	public static final String DUPLICATE_PROCEDURE = "duplicateProcedure";
	
	@Check(CheckType.NORMAL)
	public void checkDuplicateProcedure(Model model) {
		for(Procedure p1: model.getProcedures()) {
			for(Procedure p2: model.getProcedures()) {
				if(!p1.equals(p2) && p1.getName().equals(p2.getName()))
					error("different procedures can't have the same name"
							, p2
							, ThymioDSLPackage.eINSTANCE.getProcedure_Name()
							, DUPLICATE_PROCEDURE);
			}
		}
	}	
}
