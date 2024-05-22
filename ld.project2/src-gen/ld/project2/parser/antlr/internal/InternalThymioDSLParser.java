package ld.project2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ld.project2.services.ThymioDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThymioDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Procedure:'", "'Event:'", "'Actions:'", "'button_is_clicked:'", "'robot_detects_stimulus:'", "'proximity_sensor_is_activated:'", "'bottom_sensor_detects_color:'", "'front_left:'", "'front_center_left:'", "'front_center:'", "'front_center_right:'", "'front_right:'", "'back_left:'", "'back_right:'", "'left:'", "'right:'", "'move:'", "'lights:'", "'sound:'", "'left_motor:'", "'right_motor:'", "'top_light:'", "'on'", "'off'", "'bottom_light:'", "'('", "','", "')'", "'note:'", "'-'", "'tap'", "'sound'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'very_close'", "'close'", "'far'", "'black'", "'white'", "'any'", "'+'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalThymioDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThymioDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThymioDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalThymioDSL.g"; }



     	private ThymioDSLGrammarAccess grammarAccess;

        public InternalThymioDSLParser(TokenStream input, ThymioDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ThymioDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalThymioDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalThymioDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalThymioDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalThymioDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_procedures_0_0= ruleProcedure ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:77:2: ( ( (lv_procedures_0_0= ruleProcedure ) )+ )
            // InternalThymioDSL.g:78:2: ( (lv_procedures_0_0= ruleProcedure ) )+
            {
            // InternalThymioDSL.g:78:2: ( (lv_procedures_0_0= ruleProcedure ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalThymioDSL.g:79:3: (lv_procedures_0_0= ruleProcedure )
            	    {
            	    // InternalThymioDSL.g:79:3: (lv_procedures_0_0= ruleProcedure )
            	    // InternalThymioDSL.g:80:4: lv_procedures_0_0= ruleProcedure
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProceduresProcedureParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_procedures_0_0=ruleProcedure();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"procedures",
            	    					lv_procedures_0_0,
            	    					"ld.project2.ThymioDSL.Procedure");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcedure"
    // InternalThymioDSL.g:100:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalThymioDSL.g:100:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalThymioDSL.g:101:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalThymioDSL.g:107:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Actions:' ( (lv_actions_5_0= ruleAction ) )+ ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_events_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:113:2: ( (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Actions:' ( (lv_actions_5_0= ruleAction ) )+ ) )
            // InternalThymioDSL.g:114:2: (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Actions:' ( (lv_actions_5_0= ruleAction ) )+ )
            {
            // InternalThymioDSL.g:114:2: (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Actions:' ( (lv_actions_5_0= ruleAction ) )+ )
            // InternalThymioDSL.g:115:3: otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Actions:' ( (lv_actions_5_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
            		
            // InternalThymioDSL.g:119:3: ( (lv_name_1_0= ruleEString ) )
            // InternalThymioDSL.g:120:4: (lv_name_1_0= ruleEString )
            {
            // InternalThymioDSL.g:120:4: (lv_name_1_0= ruleEString )
            // InternalThymioDSL.g:121:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ld.project2.ThymioDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getEventKeyword_2());
            		
            // InternalThymioDSL.g:142:3: ( (lv_events_3_0= ruleEvent ) )
            // InternalThymioDSL.g:143:4: (lv_events_3_0= ruleEvent )
            {
            // InternalThymioDSL.g:143:4: (lv_events_3_0= ruleEvent )
            // InternalThymioDSL.g:144:5: lv_events_3_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getEventsEventParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_events_3_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"events",
            						lv_events_3_0,
            						"ld.project2.ThymioDSL.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getActionsKeyword_4());
            		
            // InternalThymioDSL.g:165:3: ( (lv_actions_5_0= ruleAction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=27 && LA2_0<=29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalThymioDSL.g:166:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalThymioDSL.g:166:4: (lv_actions_5_0= ruleAction )
            	    // InternalThymioDSL.g:167:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"ld.project2.ThymioDSL.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleEvent"
    // InternalThymioDSL.g:188:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalThymioDSL.g:188:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalThymioDSL.g:189:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalThymioDSL.g:195:1: ruleEvent returns [EObject current=null] : ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) ) ) | (otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) ) ) | (otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_button_1_0 = null;

        AntlrDatatypeRuleToken lv_stimulus_3_0 = null;

        EObject lv_proxSensor_5_0 = null;

        EObject lv_bottomSensor_7_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:201:2: ( ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) ) ) | (otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) ) ) | (otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) ) ) ) )
            // InternalThymioDSL.g:202:2: ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) ) ) | (otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) ) ) | (otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) ) ) )
            {
            // InternalThymioDSL.g:202:2: ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) ) ) | (otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) ) ) | (otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalThymioDSL.g:203:3: (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) )
                    {
                    // InternalThymioDSL.g:203:3: (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) )
                    // InternalThymioDSL.g:204:4: otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_0());
                    			
                    // InternalThymioDSL.g:208:4: ( (lv_button_1_0= ruleOrtogonal ) )
                    // InternalThymioDSL.g:209:5: (lv_button_1_0= ruleOrtogonal )
                    {
                    // InternalThymioDSL.g:209:5: (lv_button_1_0= ruleOrtogonal )
                    // InternalThymioDSL.g:210:6: lv_button_1_0= ruleOrtogonal
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_button_1_0=ruleOrtogonal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"button",
                    							lv_button_1_0,
                    							"ld.project2.ThymioDSL.Ortogonal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:229:3: (otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) ) )
                    {
                    // InternalThymioDSL.g:229:3: (otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) ) )
                    // InternalThymioDSL.g:230:4: otherlv_2= 'robot_detects_stimulus:' ( (lv_stimulus_3_0= ruleStimulus ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventAccess().getRobot_detects_stimulusKeyword_1_0());
                    			
                    // InternalThymioDSL.g:234:4: ( (lv_stimulus_3_0= ruleStimulus ) )
                    // InternalThymioDSL.g:235:5: (lv_stimulus_3_0= ruleStimulus )
                    {
                    // InternalThymioDSL.g:235:5: (lv_stimulus_3_0= ruleStimulus )
                    // InternalThymioDSL.g:236:6: lv_stimulus_3_0= ruleStimulus
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getStimulusStimulusParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stimulus_3_0=ruleStimulus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"stimulus",
                    							lv_stimulus_3_0,
                    							"ld.project2.ThymioDSL.Stimulus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:255:3: (otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) ) )
                    {
                    // InternalThymioDSL.g:255:3: (otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) ) )
                    // InternalThymioDSL.g:256:4: otherlv_4= 'proximity_sensor_is_activated:' ( (lv_proxSensor_5_0= ruleProxSensor ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getProximity_sensor_is_activatedKeyword_2_0());
                    			
                    // InternalThymioDSL.g:260:4: ( (lv_proxSensor_5_0= ruleProxSensor ) )
                    // InternalThymioDSL.g:261:5: (lv_proxSensor_5_0= ruleProxSensor )
                    {
                    // InternalThymioDSL.g:261:5: (lv_proxSensor_5_0= ruleProxSensor )
                    // InternalThymioDSL.g:262:6: lv_proxSensor_5_0= ruleProxSensor
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getProxSensorProxSensorParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_proxSensor_5_0=ruleProxSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"proxSensor",
                    							lv_proxSensor_5_0,
                    							"ld.project2.ThymioDSL.ProxSensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:281:3: (otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) ) )
                    {
                    // InternalThymioDSL.g:281:3: (otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) ) )
                    // InternalThymioDSL.g:282:4: otherlv_6= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_7_0= ruleBottomSensor ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getBottom_sensor_detects_colorKeyword_3_0());
                    			
                    // InternalThymioDSL.g:286:4: ( (lv_bottomSensor_7_0= ruleBottomSensor ) )
                    // InternalThymioDSL.g:287:5: (lv_bottomSensor_7_0= ruleBottomSensor )
                    {
                    // InternalThymioDSL.g:287:5: (lv_bottomSensor_7_0= ruleBottomSensor )
                    // InternalThymioDSL.g:288:6: lv_bottomSensor_7_0= ruleBottomSensor
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getBottomSensorBottomSensorParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bottomSensor_7_0=ruleBottomSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"bottomSensor",
                    							lv_bottomSensor_7_0,
                    							"ld.project2.ThymioDSL.BottomSensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleProxSensor"
    // InternalThymioDSL.g:310:1: entryRuleProxSensor returns [EObject current=null] : iv_ruleProxSensor= ruleProxSensor EOF ;
    public final EObject entryRuleProxSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxSensor = null;


        try {
            // InternalThymioDSL.g:310:51: (iv_ruleProxSensor= ruleProxSensor EOF )
            // InternalThymioDSL.g:311:2: iv_ruleProxSensor= ruleProxSensor EOF
            {
             newCompositeNode(grammarAccess.getProxSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProxSensor=ruleProxSensor();

            state._fsp--;

             current =iv_ruleProxSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProxSensor"


    // $ANTLR start "ruleProxSensor"
    // InternalThymioDSL.g:317:1: ruleProxSensor returns [EObject current=null] : ( () (otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) ) )? (otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) ) )? (otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) ) )? ) ;
    public final EObject ruleProxSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_frontLeftSensor_2_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterLeftSensor_4_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterSensor_6_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterRightSensor_8_0 = null;

        AntlrDatatypeRuleToken lv_frontRightSensor_10_0 = null;

        AntlrDatatypeRuleToken lv_backLeftSensor_12_0 = null;

        AntlrDatatypeRuleToken lv_backRightSensor_14_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:323:2: ( ( () (otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) ) )? (otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) ) )? (otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) ) )? ) )
            // InternalThymioDSL.g:324:2: ( () (otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) ) )? (otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) ) )? (otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) ) )? )
            {
            // InternalThymioDSL.g:324:2: ( () (otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) ) )? (otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) ) )? (otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) ) )? )
            // InternalThymioDSL.g:325:3: () (otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) ) )? (otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) ) )? (otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) ) )?
            {
            // InternalThymioDSL.g:325:3: ()
            // InternalThymioDSL.g:326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProxSensorAccess().getProxSensorAction_0(),
            					current);
            			

            }

            // InternalThymioDSL.g:332:3: (otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:333:4: otherlv_1= 'front_left:' ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getProxSensorAccess().getFront_leftKeyword_1_0());
                    			
                    // InternalThymioDSL.g:337:4: ( (lv_frontLeftSensor_2_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:338:5: (lv_frontLeftSensor_2_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:338:5: (lv_frontLeftSensor_2_0= ruleSensorStatus )
                    // InternalThymioDSL.g:339:6: lv_frontLeftSensor_2_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_frontLeftSensor_2_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontLeftSensor",
                    							lv_frontLeftSensor_2_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:357:3: (otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:358:4: otherlv_3= 'front_center_left:' ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getProxSensorAccess().getFront_center_leftKeyword_2_0());
                    			
                    // InternalThymioDSL.g:362:4: ( (lv_frontCenterLeftSensor_4_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:363:5: (lv_frontCenterLeftSensor_4_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:363:5: (lv_frontCenterLeftSensor_4_0= ruleSensorStatus )
                    // InternalThymioDSL.g:364:6: lv_frontCenterLeftSensor_4_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_frontCenterLeftSensor_4_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterLeftSensor",
                    							lv_frontCenterLeftSensor_4_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:382:3: (otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:383:4: otherlv_5= 'front_center:' ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getProxSensorAccess().getFront_centerKeyword_3_0());
                    			
                    // InternalThymioDSL.g:387:4: ( (lv_frontCenterSensor_6_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:388:5: (lv_frontCenterSensor_6_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:388:5: (lv_frontCenterSensor_6_0= ruleSensorStatus )
                    // InternalThymioDSL.g:389:6: lv_frontCenterSensor_6_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_frontCenterSensor_6_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterSensor",
                    							lv_frontCenterSensor_6_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:407:3: (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:408:4: otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getProxSensorAccess().getFront_center_rightKeyword_4_0());
                    			
                    // InternalThymioDSL.g:412:4: ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:413:5: (lv_frontCenterRightSensor_8_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:413:5: (lv_frontCenterRightSensor_8_0= ruleSensorStatus )
                    // InternalThymioDSL.g:414:6: lv_frontCenterRightSensor_8_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_frontCenterRightSensor_8_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterRightSensor",
                    							lv_frontCenterRightSensor_8_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:432:3: (otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:433:4: otherlv_9= 'front_right:' ( (lv_frontRightSensor_10_0= ruleSensorStatus ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getProxSensorAccess().getFront_rightKeyword_5_0());
                    			
                    // InternalThymioDSL.g:437:4: ( (lv_frontRightSensor_10_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:438:5: (lv_frontRightSensor_10_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:438:5: (lv_frontRightSensor_10_0= ruleSensorStatus )
                    // InternalThymioDSL.g:439:6: lv_frontRightSensor_10_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_frontRightSensor_10_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontRightSensor",
                    							lv_frontRightSensor_10_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:457:3: (otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:458:4: otherlv_11= 'back_left:' ( (lv_backLeftSensor_12_0= ruleSensorStatus ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getProxSensorAccess().getBack_leftKeyword_6_0());
                    			
                    // InternalThymioDSL.g:462:4: ( (lv_backLeftSensor_12_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:463:5: (lv_backLeftSensor_12_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:463:5: (lv_backLeftSensor_12_0= ruleSensorStatus )
                    // InternalThymioDSL.g:464:6: lv_backLeftSensor_12_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getBackLeftSensorSensorStatusParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_backLeftSensor_12_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"backLeftSensor",
                    							lv_backLeftSensor_12_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:482:3: (otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:483:4: otherlv_13= 'back_right:' ( (lv_backRightSensor_14_0= ruleSensorStatus ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getProxSensorAccess().getBack_rightKeyword_7_0());
                    			
                    // InternalThymioDSL.g:487:4: ( (lv_backRightSensor_14_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:488:5: (lv_backRightSensor_14_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:488:5: (lv_backRightSensor_14_0= ruleSensorStatus )
                    // InternalThymioDSL.g:489:6: lv_backRightSensor_14_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getBackRightSensorSensorStatusParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_backRightSensor_14_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"backRightSensor",
                    							lv_backRightSensor_14_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProxSensor"


    // $ANTLR start "entryRuleBottomSensor"
    // InternalThymioDSL.g:511:1: entryRuleBottomSensor returns [EObject current=null] : iv_ruleBottomSensor= ruleBottomSensor EOF ;
    public final EObject entryRuleBottomSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBottomSensor = null;


        try {
            // InternalThymioDSL.g:511:53: (iv_ruleBottomSensor= ruleBottomSensor EOF )
            // InternalThymioDSL.g:512:2: iv_ruleBottomSensor= ruleBottomSensor EOF
            {
             newCompositeNode(grammarAccess.getBottomSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBottomSensor=ruleBottomSensor();

            state._fsp--;

             current =iv_ruleBottomSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBottomSensor"


    // $ANTLR start "ruleBottomSensor"
    // InternalThymioDSL.g:518:1: ruleBottomSensor returns [EObject current=null] : ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) ) ;
    public final EObject ruleBottomSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_bottomLeftSensor_1_0 = null;

        AntlrDatatypeRuleToken lv_bottomRightSensor_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:524:2: ( ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) ) )
            // InternalThymioDSL.g:525:2: ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) )
            {
            // InternalThymioDSL.g:525:2: ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) )
            // InternalThymioDSL.g:526:3: (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) )
            {
            // InternalThymioDSL.g:526:3: (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) )
            // InternalThymioDSL.g:527:4: otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); 

            				newLeafNode(otherlv_0, grammarAccess.getBottomSensorAccess().getLeftKeyword_0_0());
            			
            // InternalThymioDSL.g:531:4: ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) )
            // InternalThymioDSL.g:532:5: (lv_bottomLeftSensor_1_0= ruleBlackWhite )
            {
            // InternalThymioDSL.g:532:5: (lv_bottomLeftSensor_1_0= ruleBlackWhite )
            // InternalThymioDSL.g:533:6: lv_bottomLeftSensor_1_0= ruleBlackWhite
            {

            						newCompositeNode(grammarAccess.getBottomSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_22);
            lv_bottomLeftSensor_1_0=ruleBlackWhite();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBottomSensorRule());
            						}
            						set(
            							current,
            							"bottomLeftSensor",
            							lv_bottomLeftSensor_1_0,
            							"ld.project2.ThymioDSL.BlackWhite");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalThymioDSL.g:551:3: (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) )
            // InternalThymioDSL.g:552:4: otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) )
            {
            otherlv_2=(Token)match(input,26,FOLLOW_21); 

            				newLeafNode(otherlv_2, grammarAccess.getBottomSensorAccess().getRightKeyword_1_0());
            			
            // InternalThymioDSL.g:556:4: ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) )
            // InternalThymioDSL.g:557:5: (lv_bottomRightSensor_3_0= ruleBlackWhite )
            {
            // InternalThymioDSL.g:557:5: (lv_bottomRightSensor_3_0= ruleBlackWhite )
            // InternalThymioDSL.g:558:6: lv_bottomRightSensor_3_0= ruleBlackWhite
            {

            						newCompositeNode(grammarAccess.getBottomSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_bottomRightSensor_3_0=ruleBlackWhite();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBottomSensorRule());
            						}
            						set(
            							current,
            							"bottomRightSensor",
            							lv_bottomRightSensor_3_0,
            							"ld.project2.ThymioDSL.BlackWhite");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBottomSensor"


    // $ANTLR start "entryRuleAction"
    // InternalThymioDSL.g:580:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalThymioDSL.g:580:47: (iv_ruleAction= ruleAction EOF )
            // InternalThymioDSL.g:581:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalThymioDSL.g:587:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_move_1_0 = null;

        EObject lv_light_3_0 = null;

        EObject lv_sound_5_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:593:2: ( ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) ) )
            // InternalThymioDSL.g:594:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) )
            {
            // InternalThymioDSL.g:594:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:595:3: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) )
                    {
                    // InternalThymioDSL.g:595:3: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) )
                    // InternalThymioDSL.g:596:4: otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalThymioDSL.g:600:4: ( (lv_move_1_0= ruleMotors ) )
                    // InternalThymioDSL.g:601:5: (lv_move_1_0= ruleMotors )
                    {
                    // InternalThymioDSL.g:601:5: (lv_move_1_0= ruleMotors )
                    // InternalThymioDSL.g:602:6: lv_move_1_0= ruleMotors
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getMoveMotorsParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_move_1_0=ruleMotors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_1_0,
                    							"ld.project2.ThymioDSL.Motors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:621:3: (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) )
                    {
                    // InternalThymioDSL.g:621:3: (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) )
                    // InternalThymioDSL.g:622:4: otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLightsKeyword_1_0());
                    			
                    // InternalThymioDSL.g:626:4: ( (lv_light_3_0= ruleLights ) )
                    // InternalThymioDSL.g:627:5: (lv_light_3_0= ruleLights )
                    {
                    // InternalThymioDSL.g:627:5: (lv_light_3_0= ruleLights )
                    // InternalThymioDSL.g:628:6: lv_light_3_0= ruleLights
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getLightLightsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_light_3_0=ruleLights();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"light",
                    							lv_light_3_0,
                    							"ld.project2.ThymioDSL.Lights");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:647:3: (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ )
                    {
                    // InternalThymioDSL.g:647:3: (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ )
                    // InternalThymioDSL.g:648:4: otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSoundKeyword_2_0());
                    			
                    // InternalThymioDSL.g:652:4: ( (lv_sound_5_0= ruleSound ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==39) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalThymioDSL.g:653:5: (lv_sound_5_0= ruleSound )
                    	    {
                    	    // InternalThymioDSL.g:653:5: (lv_sound_5_0= ruleSound )
                    	    // InternalThymioDSL.g:654:6: lv_sound_5_0= ruleSound
                    	    {

                    	    						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
                    	    lv_sound_5_0=ruleSound();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sound",
                    	    							lv_sound_5_0,
                    	    							"ld.project2.ThymioDSL.Sound");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMotors"
    // InternalThymioDSL.g:676:1: entryRuleMotors returns [EObject current=null] : iv_ruleMotors= ruleMotors EOF ;
    public final EObject entryRuleMotors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotors = null;


        try {
            // InternalThymioDSL.g:676:47: (iv_ruleMotors= ruleMotors EOF )
            // InternalThymioDSL.g:677:2: iv_ruleMotors= ruleMotors EOF
            {
             newCompositeNode(grammarAccess.getMotorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotors=ruleMotors();

            state._fsp--;

             current =iv_ruleMotors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMotors"


    // $ANTLR start "ruleMotors"
    // InternalThymioDSL.g:683:1: ruleMotors returns [EObject current=null] : (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) ) ;
    public final EObject ruleMotors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:689:2: ( (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) ) )
            // InternalThymioDSL.g:690:2: (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) )
            {
            // InternalThymioDSL.g:690:2: (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) )
            // InternalThymioDSL.g:691:3: otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMotorsAccess().getLeft_motorKeyword_0());
            		
            // InternalThymioDSL.g:695:3: ( (lv_left_1_0= ruleAddition ) )
            // InternalThymioDSL.g:696:4: (lv_left_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:696:4: (lv_left_1_0= ruleAddition )
            // InternalThymioDSL.g:697:5: lv_left_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorsAccess().getLeftAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_left_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotorsRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getMotorsAccess().getRight_motorKeyword_2());
            		
            // InternalThymioDSL.g:718:3: ( (lv_right_3_0= ruleAddition ) )
            // InternalThymioDSL.g:719:4: (lv_right_3_0= ruleAddition )
            {
            // InternalThymioDSL.g:719:4: (lv_right_3_0= ruleAddition )
            // InternalThymioDSL.g:720:5: lv_right_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorsAccess().getRightAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotorsRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMotors"


    // $ANTLR start "entryRuleLights"
    // InternalThymioDSL.g:741:1: entryRuleLights returns [EObject current=null] : iv_ruleLights= ruleLights EOF ;
    public final EObject entryRuleLights() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLights = null;


        try {
            // InternalThymioDSL.g:741:47: (iv_ruleLights= ruleLights EOF )
            // InternalThymioDSL.g:742:2: iv_ruleLights= ruleLights EOF
            {
             newCompositeNode(grammarAccess.getLightsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLights=ruleLights();

            state._fsp--;

             current =iv_ruleLights; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLights"


    // $ANTLR start "ruleLights"
    // InternalThymioDSL.g:748:1: ruleLights returns [EObject current=null] : ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) ) ;
    public final EObject ruleLights() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_topLight_3_0 = null;

        EObject lv_bottomLight_7_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:754:2: ( ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) ) )
            // InternalThymioDSL.g:755:2: ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) )
            {
            // InternalThymioDSL.g:755:2: ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) )
            // InternalThymioDSL.g:756:3: () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) )
            {
            // InternalThymioDSL.g:756:3: ()
            // InternalThymioDSL.g:757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightsAccess().getLightsAction_0(),
            					current);
            			

            }

            // InternalThymioDSL.g:763:3: (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) )
            // InternalThymioDSL.g:764:4: otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' )
            {
            otherlv_1=(Token)match(input,32,FOLLOW_29); 

            				newLeafNode(otherlv_1, grammarAccess.getLightsAccess().getTop_lightKeyword_1_0());
            			
            // InternalThymioDSL.g:768:4: ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:769:5: (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) )
                    {
                    // InternalThymioDSL.g:769:5: (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) )
                    // InternalThymioDSL.g:770:6: otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_30); 

                    						newLeafNode(otherlv_2, grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0());
                    					
                    // InternalThymioDSL.g:774:6: ( (lv_topLight_3_0= ruleRGB ) )
                    // InternalThymioDSL.g:775:7: (lv_topLight_3_0= ruleRGB )
                    {
                    // InternalThymioDSL.g:775:7: (lv_topLight_3_0= ruleRGB )
                    // InternalThymioDSL.g:776:8: lv_topLight_3_0= ruleRGB
                    {

                    								newCompositeNode(grammarAccess.getLightsAccess().getTopLightRGBParserRuleCall_1_1_0_1_0());
                    							
                    pushFollow(FOLLOW_31);
                    lv_topLight_3_0=ruleRGB();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getLightsRule());
                    								}
                    								set(
                    									current,
                    									"topLight",
                    									lv_topLight_3_0,
                    									"ld.project2.ThymioDSL.RGB");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:795:5: otherlv_4= 'off'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_31); 

                    					newLeafNode(otherlv_4, grammarAccess.getLightsAccess().getOffKeyword_1_1_1());
                    				

                    }
                    break;

            }


            }

            // InternalThymioDSL.g:801:3: (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) )
            // InternalThymioDSL.g:802:4: otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' )
            {
            otherlv_5=(Token)match(input,35,FOLLOW_29); 

            				newLeafNode(otherlv_5, grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0());
            			
            // InternalThymioDSL.g:806:4: ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:807:5: (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) )
                    {
                    // InternalThymioDSL.g:807:5: (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) )
                    // InternalThymioDSL.g:808:6: otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_30); 

                    						newLeafNode(otherlv_6, grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0());
                    					
                    // InternalThymioDSL.g:812:6: ( (lv_bottomLight_7_0= ruleRGB ) )
                    // InternalThymioDSL.g:813:7: (lv_bottomLight_7_0= ruleRGB )
                    {
                    // InternalThymioDSL.g:813:7: (lv_bottomLight_7_0= ruleRGB )
                    // InternalThymioDSL.g:814:8: lv_bottomLight_7_0= ruleRGB
                    {

                    								newCompositeNode(grammarAccess.getLightsAccess().getBottomLightRGBParserRuleCall_2_1_0_1_0());
                    							
                    pushFollow(FOLLOW_2);
                    lv_bottomLight_7_0=ruleRGB();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getLightsRule());
                    								}
                    								set(
                    									current,
                    									"bottomLight",
                    									lv_bottomLight_7_0,
                    									"ld.project2.ThymioDSL.RGB");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:833:5: otherlv_8= 'off'
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getLightsAccess().getOffKeyword_2_1_1());
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLights"


    // $ANTLR start "entryRuleRGB"
    // InternalThymioDSL.g:843:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalThymioDSL.g:843:44: (iv_ruleRGB= ruleRGB EOF )
            // InternalThymioDSL.g:844:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalThymioDSL.g:850:1: ruleRGB returns [EObject current=null] : (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_red_1_0 = null;

        EObject lv_green_3_0 = null;

        EObject lv_blue_5_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:856:2: ( (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' ) )
            // InternalThymioDSL.g:857:2: (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' )
            {
            // InternalThymioDSL.g:857:2: (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' )
            // InternalThymioDSL.g:858:3: otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0());
            		
            // InternalThymioDSL.g:862:3: ( (lv_red_1_0= ruleAddition ) )
            // InternalThymioDSL.g:863:4: (lv_red_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:863:4: (lv_red_1_0= ruleAddition )
            // InternalThymioDSL.g:864:5: lv_red_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getRedAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_red_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRGBRule());
            					}
            					set(
            						current,
            						"red",
            						lv_red_1_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRGBAccess().getCommaKeyword_2());
            		
            // InternalThymioDSL.g:885:3: ( (lv_green_3_0= ruleAddition ) )
            // InternalThymioDSL.g:886:4: (lv_green_3_0= ruleAddition )
            {
            // InternalThymioDSL.g:886:4: (lv_green_3_0= ruleAddition )
            // InternalThymioDSL.g:887:5: lv_green_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getGreenAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_green_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRGBRule());
            					}
            					set(
            						current,
            						"green",
            						lv_green_3_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getRGBAccess().getCommaKeyword_4());
            		
            // InternalThymioDSL.g:908:3: ( (lv_blue_5_0= ruleAddition ) )
            // InternalThymioDSL.g:909:4: (lv_blue_5_0= ruleAddition )
            {
            // InternalThymioDSL.g:909:4: (lv_blue_5_0= ruleAddition )
            // InternalThymioDSL.g:910:5: lv_blue_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getBlueAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_blue_5_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRGBRule());
            					}
            					set(
            						current,
            						"blue",
            						lv_blue_5_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRGBAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "entryRuleSound"
    // InternalThymioDSL.g:935:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalThymioDSL.g:935:46: (iv_ruleSound= ruleSound EOF )
            // InternalThymioDSL.g:936:2: iv_ruleSound= ruleSound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSound=ruleSound();

            state._fsp--;

             current =iv_ruleSound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalThymioDSL.g:942:1: ruleSound returns [EObject current=null] : (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pitch_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:948:2: ( (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) ) )
            // InternalThymioDSL.g:949:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) )
            {
            // InternalThymioDSL.g:949:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) )
            // InternalThymioDSL.g:950:3: otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getNoteKeyword_0());
            		
            // InternalThymioDSL.g:954:3: ( (lv_pitch_1_0= ruleAddition ) )
            // InternalThymioDSL.g:955:4: (lv_pitch_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:955:4: (lv_pitch_1_0= ruleAddition )
            // InternalThymioDSL.g:956:5: lv_pitch_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_pitch_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					set(
            						current,
            						"pitch",
            						lv_pitch_1_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalThymioDSL.g:973:3: ( (lv_duration_2_0= ruleNoteDuration ) )
            // InternalThymioDSL.g:974:4: (lv_duration_2_0= ruleNoteDuration )
            {
            // InternalThymioDSL.g:974:4: (lv_duration_2_0= ruleNoteDuration )
            // InternalThymioDSL.g:975:5: lv_duration_2_0= ruleNoteDuration
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_duration_2_0=ruleNoteDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"ld.project2.ThymioDSL.NoteDuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleEInt"
    // InternalThymioDSL.g:996:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalThymioDSL.g:996:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalThymioDSL.g:997:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalThymioDSL.g:1003:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1009:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalThymioDSL.g:1010:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalThymioDSL.g:1010:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalThymioDSL.g:1011:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalThymioDSL.g:1011:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:1012:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalThymioDSL.g:1029:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalThymioDSL.g:1029:47: (iv_ruleEString= ruleEString EOF )
            // InternalThymioDSL.g:1030:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalThymioDSL.g:1036:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1042:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalThymioDSL.g:1043:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalThymioDSL.g:1043:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalThymioDSL.g:1044:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1052:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStimulus"
    // InternalThymioDSL.g:1063:1: entryRuleStimulus returns [String current=null] : iv_ruleStimulus= ruleStimulus EOF ;
    public final String entryRuleStimulus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStimulus = null;


        try {
            // InternalThymioDSL.g:1063:48: (iv_ruleStimulus= ruleStimulus EOF )
            // InternalThymioDSL.g:1064:2: iv_ruleStimulus= ruleStimulus EOF
            {
             newCompositeNode(grammarAccess.getStimulusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStimulus=ruleStimulus();

            state._fsp--;

             current =iv_ruleStimulus.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStimulus"


    // $ANTLR start "ruleStimulus"
    // InternalThymioDSL.g:1070:1: ruleStimulus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'tap' | kw= 'sound' ) ;
    public final AntlrDatatypeRuleToken ruleStimulus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1076:2: ( (kw= 'tap' | kw= 'sound' ) )
            // InternalThymioDSL.g:1077:2: (kw= 'tap' | kw= 'sound' )
            {
            // InternalThymioDSL.g:1077:2: (kw= 'tap' | kw= 'sound' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            else if ( (LA17_0==42) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalThymioDSL.g:1078:3: kw= 'tap'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStimulusAccess().getTapKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1084:3: kw= 'sound'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStimulusAccess().getSoundKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStimulus"


    // $ANTLR start "entryRuleNoteDuration"
    // InternalThymioDSL.g:1093:1: entryRuleNoteDuration returns [String current=null] : iv_ruleNoteDuration= ruleNoteDuration EOF ;
    public final String entryRuleNoteDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteDuration = null;


        try {
            // InternalThymioDSL.g:1093:52: (iv_ruleNoteDuration= ruleNoteDuration EOF )
            // InternalThymioDSL.g:1094:2: iv_ruleNoteDuration= ruleNoteDuration EOF
            {
             newCompositeNode(grammarAccess.getNoteDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoteDuration=ruleNoteDuration();

            state._fsp--;

             current =iv_ruleNoteDuration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoteDuration"


    // $ANTLR start "ruleNoteDuration"
    // InternalThymioDSL.g:1100:1: ruleNoteDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'short' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleNoteDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1106:2: ( (kw= 'short' | kw= 'long' ) )
            // InternalThymioDSL.g:1107:2: (kw= 'short' | kw= 'long' )
            {
            // InternalThymioDSL.g:1107:2: (kw= 'short' | kw= 'long' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            else if ( (LA18_0==44) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalThymioDSL.g:1108:3: kw= 'short'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNoteDurationAccess().getShortKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1114:3: kw= 'long'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNoteDurationAccess().getLongKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteDuration"


    // $ANTLR start "entryRuleOrtogonal"
    // InternalThymioDSL.g:1123:1: entryRuleOrtogonal returns [String current=null] : iv_ruleOrtogonal= ruleOrtogonal EOF ;
    public final String entryRuleOrtogonal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrtogonal = null;


        try {
            // InternalThymioDSL.g:1123:49: (iv_ruleOrtogonal= ruleOrtogonal EOF )
            // InternalThymioDSL.g:1124:2: iv_ruleOrtogonal= ruleOrtogonal EOF
            {
             newCompositeNode(grammarAccess.getOrtogonalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrtogonal=ruleOrtogonal();

            state._fsp--;

             current =iv_ruleOrtogonal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrtogonal"


    // $ANTLR start "ruleOrtogonal"
    // InternalThymioDSL.g:1130:1: ruleOrtogonal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) ;
    public final AntlrDatatypeRuleToken ruleOrtogonal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1136:2: ( (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) )
            // InternalThymioDSL.g:1137:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            {
            // InternalThymioDSL.g:1137:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 46:
                {
                alt19=2;
                }
                break;
            case 47:
                {
                alt19=3;
                }
                break;
            case 48:
                {
                alt19=4;
                }
                break;
            case 49:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalThymioDSL.g:1138:3: kw= 'up'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getUpKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1144:3: kw= 'down'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getDownKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1150:3: kw= 'left'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:1156:3: kw= 'right'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getRightKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:1162:3: kw= 'center'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getCenterKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrtogonal"


    // $ANTLR start "entryRuleSensorStatus"
    // InternalThymioDSL.g:1171:1: entryRuleSensorStatus returns [String current=null] : iv_ruleSensorStatus= ruleSensorStatus EOF ;
    public final String entryRuleSensorStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSensorStatus = null;


        try {
            // InternalThymioDSL.g:1171:52: (iv_ruleSensorStatus= ruleSensorStatus EOF )
            // InternalThymioDSL.g:1172:2: iv_ruleSensorStatus= ruleSensorStatus EOF
            {
             newCompositeNode(grammarAccess.getSensorStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorStatus=ruleSensorStatus();

            state._fsp--;

             current =iv_ruleSensorStatus.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorStatus"


    // $ANTLR start "ruleSensorStatus"
    // InternalThymioDSL.g:1178:1: ruleSensorStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'very_close' | kw= 'close' | kw= 'far' ) ;
    public final AntlrDatatypeRuleToken ruleSensorStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1184:2: ( (kw= 'very_close' | kw= 'close' | kw= 'far' ) )
            // InternalThymioDSL.g:1185:2: (kw= 'very_close' | kw= 'close' | kw= 'far' )
            {
            // InternalThymioDSL.g:1185:2: (kw= 'very_close' | kw= 'close' | kw= 'far' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt20=1;
                }
                break;
            case 51:
                {
                alt20=2;
                }
                break;
            case 52:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalThymioDSL.g:1186:3: kw= 'very_close'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getVery_closeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1192:3: kw= 'close'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getCloseKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1198:3: kw= 'far'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getFarKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorStatus"


    // $ANTLR start "entryRuleBlackWhite"
    // InternalThymioDSL.g:1207:1: entryRuleBlackWhite returns [String current=null] : iv_ruleBlackWhite= ruleBlackWhite EOF ;
    public final String entryRuleBlackWhite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlackWhite = null;


        try {
            // InternalThymioDSL.g:1207:50: (iv_ruleBlackWhite= ruleBlackWhite EOF )
            // InternalThymioDSL.g:1208:2: iv_ruleBlackWhite= ruleBlackWhite EOF
            {
             newCompositeNode(grammarAccess.getBlackWhiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlackWhite=ruleBlackWhite();

            state._fsp--;

             current =iv_ruleBlackWhite.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlackWhite"


    // $ANTLR start "ruleBlackWhite"
    // InternalThymioDSL.g:1214:1: ruleBlackWhite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'black' | kw= 'white' | kw= 'any' ) ;
    public final AntlrDatatypeRuleToken ruleBlackWhite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1220:2: ( (kw= 'black' | kw= 'white' | kw= 'any' ) )
            // InternalThymioDSL.g:1221:2: (kw= 'black' | kw= 'white' | kw= 'any' )
            {
            // InternalThymioDSL.g:1221:2: (kw= 'black' | kw= 'white' | kw= 'any' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt21=1;
                }
                break;
            case 54:
                {
                alt21=2;
                }
                break;
            case 55:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalThymioDSL.g:1222:3: kw= 'black'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getBlackKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1228:3: kw= 'white'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1234:3: kw= 'any'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getAnyKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlackWhite"


    // $ANTLR start "entryRuleAddition"
    // InternalThymioDSL.g:1243:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalThymioDSL.g:1243:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalThymioDSL.g:1244:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalThymioDSL.g:1250:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1256:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalThymioDSL.g:1257:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalThymioDSL.g:1257:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalThymioDSL.g:1258:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1266:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40||LA23_0==56) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalThymioDSL.g:1267:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalThymioDSL.g:1267:4: ()
            	    // InternalThymioDSL.g:1268:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalThymioDSL.g:1274:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalThymioDSL.g:1275:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalThymioDSL.g:1275:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalThymioDSL.g:1276:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalThymioDSL.g:1276:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==56) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==40) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalThymioDSL.g:1277:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,56,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalThymioDSL.g:1288:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,40,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalThymioDSL.g:1301:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalThymioDSL.g:1302:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalThymioDSL.g:1302:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalThymioDSL.g:1303:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ld.project2.ThymioDSL.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalThymioDSL.g:1325:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalThymioDSL.g:1325:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalThymioDSL.g:1326:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalThymioDSL.g:1332:1: ruleMultiplication returns [EObject current=null] : (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Number_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1338:2: ( (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* ) )
            // InternalThymioDSL.g:1339:2: (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* )
            {
            // InternalThymioDSL.g:1339:2: (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* )
            // InternalThymioDSL.g:1340:3: this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Number_0=ruleNumber();

            state._fsp--;


            			current = this_Number_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1348:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=57 && LA25_0<=58)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalThymioDSL.g:1349:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) )
            	    {
            	    // InternalThymioDSL.g:1349:4: ()
            	    // InternalThymioDSL.g:1350:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalThymioDSL.g:1356:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalThymioDSL.g:1357:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalThymioDSL.g:1357:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalThymioDSL.g:1358:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalThymioDSL.g:1358:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==57) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==58) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalThymioDSL.g:1359:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,57,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalThymioDSL.g:1370:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,58,FOLLOW_27); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalThymioDSL.g:1383:4: ( (lv_right_3_0= ruleNumber ) )
            	    // InternalThymioDSL.g:1384:5: (lv_right_3_0= ruleNumber )
            	    {
            	    // InternalThymioDSL.g:1384:5: (lv_right_3_0= ruleNumber )
            	    // InternalThymioDSL.g:1385:6: lv_right_3_0= ruleNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumberParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ld.project2.ThymioDSL.Number");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNumber"
    // InternalThymioDSL.g:1407:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalThymioDSL.g:1407:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalThymioDSL.g:1408:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalThymioDSL.g:1414:1: ruleNumber returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject this_Addition_2 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1420:2: ( ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // InternalThymioDSL.g:1421:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // InternalThymioDSL.g:1421:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==40) ) {
                alt26=1;
            }
            else if ( (LA26_0==36) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalThymioDSL.g:1422:3: ( (lv_value_0_0= ruleEInt ) )
                    {
                    // InternalThymioDSL.g:1422:3: ( (lv_value_0_0= ruleEInt ) )
                    // InternalThymioDSL.g:1423:4: (lv_value_0_0= ruleEInt )
                    {
                    // InternalThymioDSL.g:1423:4: (lv_value_0_0= ruleEInt )
                    // InternalThymioDSL.g:1424:5: lv_value_0_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"ld.project2.ThymioDSL.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1442:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // InternalThymioDSL.g:1442:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // InternalThymioDSL.g:1443:4: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getNumberAccess().getAdditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_33);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000011000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100010000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0600000000000002L});

}