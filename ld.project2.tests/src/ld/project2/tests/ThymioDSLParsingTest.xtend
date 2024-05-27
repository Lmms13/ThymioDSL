/*
 * generated by Xtext 2.34.0
 */
package ld.project2.tests

import com.google.inject.Inject
import ld.project2.thymioDSL.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ThymioDSLInjectorProvider)
class ThymioDSLParsingTest {
	//this class includes tests for parsing and for
	//validation. The first section includes the 
	//parsing tests, and the second includes the 
	//validation tests.
	
	@Inject
	ParseHelper<Model> parseHelper
	
	
	/////////////////////PARSING TESTS/////////////////////
	
	//loading the "follow_line" program
	@Test
	def void loadValidModel() {
		val result = parseHelper.parse('''
			Procedure: steer_right
				Event: 
					bottom_sensor_detects_color: 
						left: white
						right: black		
				Actions:
					lights:
						top_light: on (16*(20/(5+5)),0,0)
						bottom_light: on (0,0,16*(20/(5+5)))
					move:
						left_motor: 500
						right_motor: 0
				
			Procedure: steer_left
				Event: 
					bottom_sensor_detects_color: 
						left: black
						right: white		
				Actions:
					lights:
						top_light: on (0,0,16*(20/(5+5)))
						bottom_light: on (16*(20/(5+5)),0,0)
					move:
						left_motor: 0
						right_motor: 500
				
			Procedure: follow_line
				Event: 
					bottom_sensor_detects_color: 
						left: black
						right: black		
				Actions:
					lights:
						top_light: on (0,16*(20/(5+5)),0)
						bottom_light: on (0,16*(20/(5+5)),0)
					move:
						left_motor: 500
						right_motor: 500
						
			Procedure: u_turn
				Event: 
					bottom_sensor_detects_color: 
						left: white
						right: white		
				Actions:
					move:
						left_motor: 500
						right_motor: 0
						
			Procedure: stop
				Event: 
					button_is_clicked: center
				Actions:
					move:
						left_motor: 641798 * 0
						right_motor: 641798 * 0
						
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	//loading the first procedure of "follow_line" 
	//but without an event. It shouldn't parse, so
	//we use assertFalse
	@Test
	def void loadProcedureWithoutEvent() {
		val result = parseHelper.parse('''
			Procedure: steer_right
				Event: 		
				Actions:
					lights:
						top_light: on (16*(20/(5+5)),0,0)
						bottom_light: on (0,0,16*(20/(5+5)))
					move:
						left_motor: 500
						right_motor: 0
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertFalse(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	//loading the first procedure of "follow_line" 
	//but without defining bottom_light. Both lights
	//must be defined when the "lights" action is used.
	//Asserting False again.
	@Test
	def void loadMissingBottomLight() {
		val result = parseHelper.parse('''
			Procedure: steer_right
				Event: 
					bottom_sensor_detects_color: 
						left: white
						right: black		
				Actions:
					lights:
						top_light: on (16*(20/(5+5)),0,0)
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertFalse(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	//loading the first procedure of "follow_line" 
	//but "Actions" is misspelled. Asserting False
	//again.
	@Test
	def void loadTypoInActions() {
		val result = parseHelper.parse('''
			Procedure: steer_right
				Event: 
					bottom_sensor_detects_color: 
						left: white
						right: black		
				Action:
					lights:
						top_light: on (16*(20/(5+5)),0,0)
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertFalse(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	//loading the first procedure of "follow_line" 
	//but "bottom_light" is set to "off". It shouldn't
	//receive any RGB expressions. Asserting False.
	@Test
	def void loadLightsOffWithRGB() {
		val result = parseHelper.parse('''
			Procedure: steer_right
				Event: 
					bottom_sensor_detects_color: 
						left: white
						right: black		
				Action:
					lights:
						top_light: on (16*(20/(5+5)),0,0)
						bottom_light: off (0,0,16*(20/(5+5)))
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertFalse(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	//loading the first procedure of "follow_line" 
	//but a String is being parsed when an Expression
	//is expected. Asserting False. 
	@Test
	def void loadInvalidInputType() {
		val result = parseHelper.parse('''
			Procedure: steer_right
				Event: 
					bottom_sensor_detects_color: 
						left: white
						right: black		
				Actions:
					move:
						left_motor: fast
						right_motor: 0
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertFalse(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	/////////////////////VALIDATION TESTS/////////////////////
	
}
