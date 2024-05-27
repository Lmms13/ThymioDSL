package ld.project2.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.xbase.testing.CompilationTestHelper

@ExtendWith(InjectionExtension)
@InjectWith(ThymioDSLInjectorProvider)
class ThymioDSLCodeGenTest {
	
	@Inject extension CompilationTestHelper
	
	//loading "follow_line" file
	@Test
	def void testValidThymioFile1(){
		'''
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
		'''.assertCompilesTo(
			'''
			var notes[6]
			var durations[6]
			var note_index = 6
			var note_count = 6
			var wave[142]
			var i
			var wave_phase
			var wave_intensity
			
			# setup threshold for detecting claps
			mic.threshold = 250
			
			# reset outputs
			call sound.system(-1)
			call leds.top(0,0,0)
			call leds.bottom.left(0,0,0)
			call leds.bottom.right(0,0,0)
			call leds.circle(0,0,0,0,0,0,0,0)
			
			# when a note is finished, play the next note
			onevent sound.finished
				if note_index != note_count then
					call sound.freq(notes[note_index], durations[note_index])
					note_index += 1
				end
				
			onevent buttons
			when button.center== 1 do
			motor.left.target = 0
			motor.right.target = 0
			end
			
			onevent prox
			
			
			
			
			
			
			
			when prox.ground.delta[0] >= 450 and prox.ground.delta[1] <= 400 do
			call leds.top(32,0,0)
			call leds.bottom.left(0,0,32)
			call leds.bottom.right(0,0,32)
			motor.left.target = 500
			motor.right.target = 0
			end
			
			when prox.ground.delta[0] <= 400 and prox.ground.delta[1] >= 450 do
			call leds.top(0,0,32)
			call leds.bottom.left(32,0,0)
			call leds.bottom.right(32,0,0)
			motor.left.target = 0
			motor.right.target = 500
			end
			
			when prox.ground.delta[0] <= 400 and prox.ground.delta[1] <= 400 do
			call leds.top(0,32,0)
			call leds.bottom.left(0,32,0)
			call leds.bottom.right(0,32,0)
			motor.left.target = 500
			motor.right.target = 500
			end
			
			when prox.ground.delta[0] >= 450 and prox.ground.delta[1] >= 450 do
			motor.left.target = 500
			motor.right.target = 0
			end
			

			onevent tap

			onevent mic
			'''
		)
	}
	
	//loading "full_display" file
	@Test
	def void testValidThymioFile2(){
		'''
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
					
		Procedure: detect_left_wall
			Event: 
				proximity_sensor_is_activated: 
					front_left: close
					front_center_left: close
					front_center: close
			Actions:
				move:
					left_motor: 500
					right_motor: 0
				lights:
					top_light: on (0, 0, 32)
					bottom_light: on (0, 0, 32)
					
		Procedure: detect_near_left_wall
			Event: 
				proximity_sensor_is_activated: 
					front_left: very_close
					front_center_left: very_close
					front_center: very_close
			Actions:
				move:
					left_motor: 500
					right_motor: -500
				lights:
					top_light: on (32, 0, 0)
					bottom_light: on (32, 0, 0)
					
		Procedure: detect_right_wall
			Event: 
				proximity_sensor_is_activated: 
					front_center: close
					front_center_right: close
					front_right: close 
			Actions:
				move:
					left_motor: 0
					right_motor: 500
				lights:
					top_light: on (0, 0, 32)
					bottom_light: on (0, 0, 32)
					
		Procedure: detect_near_right_wall
			Event: 
				proximity_sensor_is_activated: 
					front_center: very_close
					front_center_right: very_close
					front_right: very_close
			Actions:
				move:
					left_motor: -500
					right_motor: 500
				lights:
					top_light: on (32, 0, 0)
					bottom_light: on (32, 0, 0)
					
		Procedure: force_right_turn
			Event:
				button_is_clicked: right
			Actions:
				move:
					left_motor: 500
					right_motor: -500
					
		Procedure: force_left_turn
			Event:
				button_is_clicked: right
			Actions:
				move:
					left_motor: -500
					right_motor: 500
					
		Procedure: force_reverse
			Event:
				button_is_clicked: down
			Actions:
				move:
					left_motor: -250*2
					right_motor: -100*5
		
		Procedure: turn_lights_off
			Event:
				robot_detects_stimulus: tap
			Actions:
				lights:
					top_light: off
					bottom_light: off
		
		Procedure: play_music
			Event:
				robot_detects_stimulus: sound
			Actions:
				sound:
					note: 5 long
					note: 2*2 short
					note: 3000/(500+500) long
					note: 0 long
					note: 1+1 short
					note: -1*-1 long
		'''.assertCompilesTo(
			'''
			var notes[6]
			var durations[6]
			var note_index = 6
			var note_count = 6
			var wave[142]
			var i
			var wave_phase
			var wave_intensity
			
			# setup threshold for detecting claps
			mic.threshold = 250
			
			# reset outputs
			call sound.system(-1)
			call leds.top(0,0,0)
			call leds.bottom.left(0,0,0)
			call leds.bottom.right(0,0,0)
			call leds.circle(0,0,0,0,0,0,0,0)
			
			# when a note is finished, play the next note
			onevent sound.finished
				if note_index != note_count then
					call sound.freq(notes[note_index], durations[note_index])
					note_index += 1
				end
				
			onevent buttons
			when button.center== 1 do
			motor.left.target = 0
			motor.right.target = 0
			end
			when button.right== 1 do
			motor.left.target = 500
			motor.right.target = -500
			end
			when button.right== 1 do
			motor.left.target = -500
			motor.right.target = 500
			end
			when button.backward== 1 do
			motor.left.target = -500
			motor.right.target = -500
			end
			
			onevent prox
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			when prox.ground.delta[0] >= 450 and prox.ground.delta[1] <= 400 do
			call leds.top(32,0,0)
			call leds.bottom.left(0,0,32)
			call leds.bottom.right(0,0,32)
			motor.left.target = 500
			motor.right.target = 0
			end
			
			when prox.ground.delta[0] <= 400 and prox.ground.delta[1] >= 450 do
			call leds.top(0,0,32)
			call leds.bottom.left(32,0,0)
			call leds.bottom.right(32,0,0)
			motor.left.target = 0
			motor.right.target = 500
			end
			
			when prox.ground.delta[0] <= 400 and prox.ground.delta[1] <= 400 do
			call leds.top(0,32,0)
			call leds.bottom.left(0,32,0)
			call leds.bottom.right(0,32,0)
			motor.left.target = 500
			motor.right.target = 500
			end
			
			when prox.ground.delta[0] >= 450 and prox.ground.delta[1] >= 450 do
			motor.left.target = 500
			motor.right.target = 0
			end
			
			when prox.horizontal[0] <= 1000 and prox.horizontal[1] <= 1000 and prox.horizontal[2] <= 1000 do
			motor.left.target = 500
			motor.right.target = 0
			call leds.top(0,0,32)
			call leds.bottom.left(0,0,32)
			call leds.bottom.right(0,0,32)
			end
			
			when prox.horizontal[0] >= 2000 and prox.horizontal[1] >= 2000 and prox.horizontal[2] >= 2000 do
			motor.left.target = 500
			motor.right.target = -500
			call leds.top(32,0,0)
			call leds.bottom.left(32,0,0)
			call leds.bottom.right(32,0,0)
			end
			
			when prox.horizontal[2] <= 1000 and prox.horizontal[3] <= 1000 and prox.horizontal[4] <= 1000 do
			motor.left.target = 0
			motor.right.target = 500
			call leds.top(0,0,32)
			call leds.bottom.left(0,0,32)
			call leds.bottom.right(0,0,32)
			end
			
			when prox.horizontal[2] >= 2000 and prox.horizontal[3] >= 2000 and prox.horizontal[4] >= 2000 do
			motor.left.target = -500
			motor.right.target = 500
			call leds.top(32,0,0)
			call leds.bottom.left(32,0,0)
			call leds.bottom.right(32,0,0)
			end
			
			
			
			
			
			
			
			onevent tap
			call leds.top(0,0,0)
			call leds.bottom.left(0,0,0)
			call leds.bottom.right(0,0,0)
			
			onevent mic
			call math.copy(notes[0:5], [524, 440, 370, 0, 311, 262])
			call math.copy(notes[0:5], [14, 7, 14, 14, 7, 14])
			note_index = 1
			note_count = 6
			call sound.freq(notes[0], durations[0])
			'''
		)
	}
	
}