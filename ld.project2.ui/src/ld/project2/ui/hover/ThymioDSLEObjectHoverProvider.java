package ld.project2.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import ld.project2.thymioDSL.Action;
import ld.project2.thymioDSL.Addition;
import ld.project2.thymioDSL.BottomSensor;
import ld.project2.thymioDSL.Event;
import ld.project2.thymioDSL.Lights;
import ld.project2.thymioDSL.Motors;
import ld.project2.thymioDSL.Multiplication;
import ld.project2.thymioDSL.Procedure;
import ld.project2.thymioDSL.ProxSensor;
import ld.project2.thymioDSL.RGB;
import ld.project2.thymioDSL.Sound;

public class ThymioDSLEObjectHoverProvider extends DefaultEObjectHoverProvider {

    @Override
    protected String getHoverInfoAsHtml(EObject o) {
    	if (o instanceof Keyword) {
            String value = ((Keyword) o).getValue();
            if ("Procedure:".equals(value)) {
                return "Defines a procedure consisting of events and actions";
            } else if ("Event:".equals(value)) {
                return "Defines an event that can be triggered by various sources";
            } else if ("Actions:".equals(value)) {
                return "Defines the actions that the robot can perform";
            }
        }
        if (o instanceof Procedure) {
            return "Defines a procedure consisting of events and actions";
        } else if (o instanceof Event) {
            return "Defines an event that can be triggered by various sources";
        } else if (o instanceof ProxSensor) {
            return "Defines the available proximity sensors";
        } else if (o instanceof BottomSensor) {
            return "Defines the available bottom sensors";
        } else if (o instanceof Action) {
            return "Defines the actions that the robot can perform";
        } else if (o instanceof Motors) {
            return "Defines the motor configuration";
        } else if (o instanceof Lights) {
            return "Defines the lights configuration";
        } else if (o instanceof RGB) {
            return "Defines an RGB color";
        } else if (o instanceof Sound) {
            return "Defines a sound note";
        } else if (o instanceof Addition) {
            return "Defines an addition expression";
        } else if (o instanceof Multiplication) {
            return "Defines a multiplication expression";
        } else if (o instanceof Number) {
            return "Defines a number or an expression within parentheses";
        } 
        // Fallback to default behavior
        return super.getHoverInfoAsHtml(o);
    }

}
