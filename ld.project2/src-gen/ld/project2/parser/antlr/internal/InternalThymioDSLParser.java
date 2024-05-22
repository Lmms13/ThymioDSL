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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Procedure:'", "'Event:'", "'Actions:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'proximity_sensor_is_activated:'", "'bottom_sensor_detects_color:'", "'back_left:'", "'back_right:'", "'front_right:'", "'front_center_right:'", "'front_center:'", "'front_center_left:'", "'front_left:'", "'left:'", "'right:'", "'move:'", "'lights:'", "'sound:'", "'left_motor:'", "'right_motor:'", "'top_light:'", "'on'", "'off'", "'bottom_light:'", "'('", "','", "')'", "'note:'", "'-'", "'true'", "'false'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'very_close'", "'close'", "'far'", "'black'", "'white'", "'any'", "'+'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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

                if ( ((LA2_0>=28 && LA2_0<=30)) ) {
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
    // InternalThymioDSL.g:195:1: ruleEvent returns [EObject current=null] : ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+ ) | (otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+ ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_button_1_0 = null;

        AntlrDatatypeRuleToken lv_tap_3_0 = null;

        AntlrDatatypeRuleToken lv_mic_5_0 = null;

        EObject lv_proxSensor_7_0 = null;

        EObject lv_bottomSensor_9_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:201:2: ( ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+ ) | (otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+ ) ) )
            // InternalThymioDSL.g:202:2: ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+ ) | (otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+ ) )
            {
            // InternalThymioDSL.g:202:2: ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+ ) | (otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+ ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
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
                    // InternalThymioDSL.g:229:3: (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:229:3: (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:230:4: otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventAccess().getRobot_is_tappedKeyword_1_0());
                    			
                    // InternalThymioDSL.g:234:4: ( (lv_tap_3_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:235:5: (lv_tap_3_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:235:5: (lv_tap_3_0= ruleEBoolean )
                    // InternalThymioDSL.g:236:6: lv_tap_3_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tap_3_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"tap",
                    							lv_tap_3_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:255:3: (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:255:3: (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:256:4: otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getSound_is_detectedKeyword_2_0());
                    			
                    // InternalThymioDSL.g:260:4: ( (lv_mic_5_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:261:5: (lv_mic_5_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:261:5: (lv_mic_5_0= ruleEBoolean )
                    // InternalThymioDSL.g:262:6: lv_mic_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mic_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"mic",
                    							lv_mic_5_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:281:3: (otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+ )
                    {
                    // InternalThymioDSL.g:281:3: (otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+ )
                    // InternalThymioDSL.g:282:4: otherlv_6= 'proximity_sensor_is_activated:' ( (lv_proxSensor_7_0= ruleProxSensor ) )+
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getProximity_sensor_is_activatedKeyword_3_0());
                    			
                    // InternalThymioDSL.g:286:4: ( (lv_proxSensor_7_0= ruleProxSensor ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=19 && LA3_0<=25)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalThymioDSL.g:287:5: (lv_proxSensor_7_0= ruleProxSensor )
                    	    {
                    	    // InternalThymioDSL.g:287:5: (lv_proxSensor_7_0= ruleProxSensor )
                    	    // InternalThymioDSL.g:288:6: lv_proxSensor_7_0= ruleProxSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getProxSensorProxSensorParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_proxSensor_7_0=ruleProxSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"proxSensor",
                    	    							lv_proxSensor_7_0,
                    	    							"ld.project2.ThymioDSL.ProxSensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:307:3: (otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+ )
                    {
                    // InternalThymioDSL.g:307:3: (otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+ )
                    // InternalThymioDSL.g:308:4: otherlv_8= 'bottom_sensor_detects_color:' ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getBottom_sensor_detects_colorKeyword_4_0());
                    			
                    // InternalThymioDSL.g:312:4: ( (lv_bottomSensor_9_0= ruleBottomSensor ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==26) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalThymioDSL.g:313:5: (lv_bottomSensor_9_0= ruleBottomSensor )
                    	    {
                    	    // InternalThymioDSL.g:313:5: (lv_bottomSensor_9_0= ruleBottomSensor )
                    	    // InternalThymioDSL.g:314:6: lv_bottomSensor_9_0= ruleBottomSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getBottomSensorBottomSensorParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_bottomSensor_9_0=ruleBottomSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bottomSensor",
                    	    							lv_bottomSensor_9_0,
                    	    							"ld.project2.ThymioDSL.BottomSensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleProxSensor"
    // InternalThymioDSL.g:336:1: entryRuleProxSensor returns [EObject current=null] : iv_ruleProxSensor= ruleProxSensor EOF ;
    public final EObject entryRuleProxSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProxSensor = null;


        try {
            // InternalThymioDSL.g:336:51: (iv_ruleProxSensor= ruleProxSensor EOF )
            // InternalThymioDSL.g:337:2: iv_ruleProxSensor= ruleProxSensor EOF
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
    // InternalThymioDSL.g:343:1: ruleProxSensor returns [EObject current=null] : ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) ) ) ) ;
    public final EObject ruleProxSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_backLeftSensor_1_0 = null;

        AntlrDatatypeRuleToken lv_backRightSensor_3_0 = null;

        AntlrDatatypeRuleToken lv_frontRightSensor_5_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterRightSensor_7_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterSensor_9_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterLeftSensor_11_0 = null;

        AntlrDatatypeRuleToken lv_frontLeftSensor_13_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:349:2: ( ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) ) ) ) )
            // InternalThymioDSL.g:350:2: ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) ) ) )
            {
            // InternalThymioDSL.g:350:2: ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:351:3: (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:351:3: (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:352:4: otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleSensorStatus ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getProxSensorAccess().getBack_leftKeyword_0_0());
                    			
                    // InternalThymioDSL.g:356:4: ( (lv_backLeftSensor_1_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:357:5: (lv_backLeftSensor_1_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:357:5: (lv_backLeftSensor_1_0= ruleSensorStatus )
                    // InternalThymioDSL.g:358:6: lv_backLeftSensor_1_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getBackLeftSensorSensorStatusParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_backLeftSensor_1_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"backLeftSensor",
                    							lv_backLeftSensor_1_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:377:3: (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:377:3: (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:378:4: otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleSensorStatus ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getProxSensorAccess().getBack_rightKeyword_1_0());
                    			
                    // InternalThymioDSL.g:382:4: ( (lv_backRightSensor_3_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:383:5: (lv_backRightSensor_3_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:383:5: (lv_backRightSensor_3_0= ruleSensorStatus )
                    // InternalThymioDSL.g:384:6: lv_backRightSensor_3_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getBackRightSensorSensorStatusParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_backRightSensor_3_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"backRightSensor",
                    							lv_backRightSensor_3_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:403:3: (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:403:3: (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:404:4: otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleSensorStatus ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getProxSensorAccess().getFront_rightKeyword_2_0());
                    			
                    // InternalThymioDSL.g:408:4: ( (lv_frontRightSensor_5_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:409:5: (lv_frontRightSensor_5_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:409:5: (lv_frontRightSensor_5_0= ruleSensorStatus )
                    // InternalThymioDSL.g:410:6: lv_frontRightSensor_5_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontRightSensor_5_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontRightSensor",
                    							lv_frontRightSensor_5_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:429:3: (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:429:3: (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:430:4: otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getProxSensorAccess().getFront_center_rightKeyword_3_0());
                    			
                    // InternalThymioDSL.g:434:4: ( (lv_frontCenterRightSensor_7_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:435:5: (lv_frontCenterRightSensor_7_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:435:5: (lv_frontCenterRightSensor_7_0= ruleSensorStatus )
                    // InternalThymioDSL.g:436:6: lv_frontCenterRightSensor_7_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterRightSensor_7_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterRightSensor",
                    							lv_frontCenterRightSensor_7_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:455:3: (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:455:3: (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:456:4: otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getProxSensorAccess().getFront_centerKeyword_4_0());
                    			
                    // InternalThymioDSL.g:460:4: ( (lv_frontCenterSensor_9_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:461:5: (lv_frontCenterSensor_9_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:461:5: (lv_frontCenterSensor_9_0= ruleSensorStatus )
                    // InternalThymioDSL.g:462:6: lv_frontCenterSensor_9_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterSensor_9_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterSensor",
                    							lv_frontCenterSensor_9_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalThymioDSL.g:481:3: (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:481:3: (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:482:4: otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getProxSensorAccess().getFront_center_leftKeyword_5_0());
                    			
                    // InternalThymioDSL.g:486:4: ( (lv_frontCenterLeftSensor_11_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:487:5: (lv_frontCenterLeftSensor_11_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:487:5: (lv_frontCenterLeftSensor_11_0= ruleSensorStatus )
                    // InternalThymioDSL.g:488:6: lv_frontCenterLeftSensor_11_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterLeftSensor_11_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterLeftSensor",
                    							lv_frontCenterLeftSensor_11_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalThymioDSL.g:507:3: (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:507:3: (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:508:4: otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getProxSensorAccess().getFront_leftKeyword_6_0());
                    			
                    // InternalThymioDSL.g:512:4: ( (lv_frontLeftSensor_13_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:513:5: (lv_frontLeftSensor_13_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:513:5: (lv_frontLeftSensor_13_0= ruleSensorStatus )
                    // InternalThymioDSL.g:514:6: lv_frontLeftSensor_13_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getProxSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontLeftSensor_13_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProxSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontLeftSensor",
                    							lv_frontLeftSensor_13_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
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
    // $ANTLR end "ruleProxSensor"


    // $ANTLR start "entryRuleBottomSensor"
    // InternalThymioDSL.g:536:1: entryRuleBottomSensor returns [EObject current=null] : iv_ruleBottomSensor= ruleBottomSensor EOF ;
    public final EObject entryRuleBottomSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBottomSensor = null;


        try {
            // InternalThymioDSL.g:536:53: (iv_ruleBottomSensor= ruleBottomSensor EOF )
            // InternalThymioDSL.g:537:2: iv_ruleBottomSensor= ruleBottomSensor EOF
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
    // InternalThymioDSL.g:543:1: ruleBottomSensor returns [EObject current=null] : ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) ) ;
    public final EObject ruleBottomSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_bottomLeftSensor_1_0 = null;

        AntlrDatatypeRuleToken lv_bottomRightSensor_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:549:2: ( ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) ) )
            // InternalThymioDSL.g:550:2: ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) )
            {
            // InternalThymioDSL.g:550:2: ( (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) ) )
            // InternalThymioDSL.g:551:3: (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) ) (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) )
            {
            // InternalThymioDSL.g:551:3: (otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) ) )
            // InternalThymioDSL.g:552:4: otherlv_0= 'left:' ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            				newLeafNode(otherlv_0, grammarAccess.getBottomSensorAccess().getLeftKeyword_0_0());
            			
            // InternalThymioDSL.g:556:4: ( (lv_bottomLeftSensor_1_0= ruleBlackWhite ) )
            // InternalThymioDSL.g:557:5: (lv_bottomLeftSensor_1_0= ruleBlackWhite )
            {
            // InternalThymioDSL.g:557:5: (lv_bottomLeftSensor_1_0= ruleBlackWhite )
            // InternalThymioDSL.g:558:6: lv_bottomLeftSensor_1_0= ruleBlackWhite
            {

            						newCompositeNode(grammarAccess.getBottomSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_18);
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

            // InternalThymioDSL.g:576:3: (otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) ) )
            // InternalThymioDSL.g:577:4: otherlv_2= 'right:' ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) )
            {
            otherlv_2=(Token)match(input,27,FOLLOW_17); 

            				newLeafNode(otherlv_2, grammarAccess.getBottomSensorAccess().getRightKeyword_1_0());
            			
            // InternalThymioDSL.g:581:4: ( (lv_bottomRightSensor_3_0= ruleBlackWhite ) )
            // InternalThymioDSL.g:582:5: (lv_bottomRightSensor_3_0= ruleBlackWhite )
            {
            // InternalThymioDSL.g:582:5: (lv_bottomRightSensor_3_0= ruleBlackWhite )
            // InternalThymioDSL.g:583:6: lv_bottomRightSensor_3_0= ruleBlackWhite
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
    // InternalThymioDSL.g:605:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalThymioDSL.g:605:47: (iv_ruleAction= ruleAction EOF )
            // InternalThymioDSL.g:606:2: iv_ruleAction= ruleAction EOF
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
    // InternalThymioDSL.g:612:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) ) ;
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
            // InternalThymioDSL.g:618:2: ( ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) ) )
            // InternalThymioDSL.g:619:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) )
            {
            // InternalThymioDSL.g:619:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:620:3: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) )
                    {
                    // InternalThymioDSL.g:620:3: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) )
                    // InternalThymioDSL.g:621:4: otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalThymioDSL.g:625:4: ( (lv_move_1_0= ruleMotors ) )
                    // InternalThymioDSL.g:626:5: (lv_move_1_0= ruleMotors )
                    {
                    // InternalThymioDSL.g:626:5: (lv_move_1_0= ruleMotors )
                    // InternalThymioDSL.g:627:6: lv_move_1_0= ruleMotors
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
                    // InternalThymioDSL.g:646:3: (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) )
                    {
                    // InternalThymioDSL.g:646:3: (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) )
                    // InternalThymioDSL.g:647:4: otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLightsKeyword_1_0());
                    			
                    // InternalThymioDSL.g:651:4: ( (lv_light_3_0= ruleLights ) )
                    // InternalThymioDSL.g:652:5: (lv_light_3_0= ruleLights )
                    {
                    // InternalThymioDSL.g:652:5: (lv_light_3_0= ruleLights )
                    // InternalThymioDSL.g:653:6: lv_light_3_0= ruleLights
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
                    // InternalThymioDSL.g:672:3: (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ )
                    {
                    // InternalThymioDSL.g:672:3: (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ )
                    // InternalThymioDSL.g:673:4: otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSoundKeyword_2_0());
                    			
                    // InternalThymioDSL.g:677:4: ( (lv_sound_5_0= ruleSound ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==40) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalThymioDSL.g:678:5: (lv_sound_5_0= ruleSound )
                    	    {
                    	    // InternalThymioDSL.g:678:5: (lv_sound_5_0= ruleSound )
                    	    // InternalThymioDSL.g:679:6: lv_sound_5_0= ruleSound
                    	    {

                    	    						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
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
    // InternalThymioDSL.g:701:1: entryRuleMotors returns [EObject current=null] : iv_ruleMotors= ruleMotors EOF ;
    public final EObject entryRuleMotors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotors = null;


        try {
            // InternalThymioDSL.g:701:47: (iv_ruleMotors= ruleMotors EOF )
            // InternalThymioDSL.g:702:2: iv_ruleMotors= ruleMotors EOF
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
    // InternalThymioDSL.g:708:1: ruleMotors returns [EObject current=null] : (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) ) ;
    public final EObject ruleMotors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:714:2: ( (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) ) )
            // InternalThymioDSL.g:715:2: (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) )
            {
            // InternalThymioDSL.g:715:2: (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) )
            // InternalThymioDSL.g:716:3: otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMotorsAccess().getLeft_motorKeyword_0());
            		
            // InternalThymioDSL.g:720:3: ( (lv_left_1_0= ruleAddition ) )
            // InternalThymioDSL.g:721:4: (lv_left_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:721:4: (lv_left_1_0= ruleAddition )
            // InternalThymioDSL.g:722:5: lv_left_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorsAccess().getLeftAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_2=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMotorsAccess().getRight_motorKeyword_2());
            		
            // InternalThymioDSL.g:743:3: ( (lv_right_3_0= ruleAddition ) )
            // InternalThymioDSL.g:744:4: (lv_right_3_0= ruleAddition )
            {
            // InternalThymioDSL.g:744:4: (lv_right_3_0= ruleAddition )
            // InternalThymioDSL.g:745:5: lv_right_3_0= ruleAddition
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
    // InternalThymioDSL.g:766:1: entryRuleLights returns [EObject current=null] : iv_ruleLights= ruleLights EOF ;
    public final EObject entryRuleLights() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLights = null;


        try {
            // InternalThymioDSL.g:766:47: (iv_ruleLights= ruleLights EOF )
            // InternalThymioDSL.g:767:2: iv_ruleLights= ruleLights EOF
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
    // InternalThymioDSL.g:773:1: ruleLights returns [EObject current=null] : ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) ) ;
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
            // InternalThymioDSL.g:779:2: ( ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) ) )
            // InternalThymioDSL.g:780:2: ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) )
            {
            // InternalThymioDSL.g:780:2: ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) )
            // InternalThymioDSL.g:781:3: () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) )
            {
            // InternalThymioDSL.g:781:3: ()
            // InternalThymioDSL.g:782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightsAccess().getLightsAction_0(),
            					current);
            			

            }

            // InternalThymioDSL.g:788:3: (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) )
            // InternalThymioDSL.g:789:4: otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' )
            {
            otherlv_1=(Token)match(input,33,FOLLOW_25); 

            				newLeafNode(otherlv_1, grammarAccess.getLightsAccess().getTop_lightKeyword_1_0());
            			
            // InternalThymioDSL.g:793:4: ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:794:5: (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) )
                    {
                    // InternalThymioDSL.g:794:5: (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) )
                    // InternalThymioDSL.g:795:6: otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_26); 

                    						newLeafNode(otherlv_2, grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0());
                    					
                    // InternalThymioDSL.g:799:6: ( (lv_topLight_3_0= ruleRGB ) )
                    // InternalThymioDSL.g:800:7: (lv_topLight_3_0= ruleRGB )
                    {
                    // InternalThymioDSL.g:800:7: (lv_topLight_3_0= ruleRGB )
                    // InternalThymioDSL.g:801:8: lv_topLight_3_0= ruleRGB
                    {

                    								newCompositeNode(grammarAccess.getLightsAccess().getTopLightRGBParserRuleCall_1_1_0_1_0());
                    							
                    pushFollow(FOLLOW_27);
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
                    // InternalThymioDSL.g:820:5: otherlv_4= 'off'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_27); 

                    					newLeafNode(otherlv_4, grammarAccess.getLightsAccess().getOffKeyword_1_1_1());
                    				

                    }
                    break;

            }


            }

            // InternalThymioDSL.g:826:3: (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) )
            // InternalThymioDSL.g:827:4: otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' )
            {
            otherlv_5=(Token)match(input,36,FOLLOW_25); 

            				newLeafNode(otherlv_5, grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0());
            			
            // InternalThymioDSL.g:831:4: ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:832:5: (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) )
                    {
                    // InternalThymioDSL.g:832:5: (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) )
                    // InternalThymioDSL.g:833:6: otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_26); 

                    						newLeafNode(otherlv_6, grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0());
                    					
                    // InternalThymioDSL.g:837:6: ( (lv_bottomLight_7_0= ruleRGB ) )
                    // InternalThymioDSL.g:838:7: (lv_bottomLight_7_0= ruleRGB )
                    {
                    // InternalThymioDSL.g:838:7: (lv_bottomLight_7_0= ruleRGB )
                    // InternalThymioDSL.g:839:8: lv_bottomLight_7_0= ruleRGB
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
                    // InternalThymioDSL.g:858:5: otherlv_8= 'off'
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_2); 

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
    // InternalThymioDSL.g:868:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalThymioDSL.g:868:44: (iv_ruleRGB= ruleRGB EOF )
            // InternalThymioDSL.g:869:2: iv_ruleRGB= ruleRGB EOF
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
    // InternalThymioDSL.g:875:1: ruleRGB returns [EObject current=null] : (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' ) ;
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
            // InternalThymioDSL.g:881:2: ( (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' ) )
            // InternalThymioDSL.g:882:2: (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' )
            {
            // InternalThymioDSL.g:882:2: (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' )
            // InternalThymioDSL.g:883:3: otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0());
            		
            // InternalThymioDSL.g:887:3: ( (lv_red_1_0= ruleAddition ) )
            // InternalThymioDSL.g:888:4: (lv_red_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:888:4: (lv_red_1_0= ruleAddition )
            // InternalThymioDSL.g:889:5: lv_red_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getRedAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRGBAccess().getCommaKeyword_2());
            		
            // InternalThymioDSL.g:910:3: ( (lv_green_3_0= ruleAddition ) )
            // InternalThymioDSL.g:911:4: (lv_green_3_0= ruleAddition )
            {
            // InternalThymioDSL.g:911:4: (lv_green_3_0= ruleAddition )
            // InternalThymioDSL.g:912:5: lv_green_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getGreenAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getRGBAccess().getCommaKeyword_4());
            		
            // InternalThymioDSL.g:933:3: ( (lv_blue_5_0= ruleAddition ) )
            // InternalThymioDSL.g:934:4: (lv_blue_5_0= ruleAddition )
            {
            // InternalThymioDSL.g:934:4: (lv_blue_5_0= ruleAddition )
            // InternalThymioDSL.g:935:5: lv_blue_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getBlueAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_6=(Token)match(input,39,FOLLOW_2); 

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
    // InternalThymioDSL.g:960:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalThymioDSL.g:960:46: (iv_ruleSound= ruleSound EOF )
            // InternalThymioDSL.g:961:2: iv_ruleSound= ruleSound EOF
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
    // InternalThymioDSL.g:967:1: ruleSound returns [EObject current=null] : (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pitch_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:973:2: ( (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) ) )
            // InternalThymioDSL.g:974:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) )
            {
            // InternalThymioDSL.g:974:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) )
            // InternalThymioDSL.g:975:3: otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getNoteKeyword_0());
            		
            // InternalThymioDSL.g:979:3: ( (lv_pitch_1_0= ruleAddition ) )
            // InternalThymioDSL.g:980:4: (lv_pitch_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:980:4: (lv_pitch_1_0= ruleAddition )
            // InternalThymioDSL.g:981:5: lv_pitch_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalThymioDSL.g:998:3: ( (lv_duration_2_0= ruleNoteDuration ) )
            // InternalThymioDSL.g:999:4: (lv_duration_2_0= ruleNoteDuration )
            {
            // InternalThymioDSL.g:999:4: (lv_duration_2_0= ruleNoteDuration )
            // InternalThymioDSL.g:1000:5: lv_duration_2_0= ruleNoteDuration
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
    // InternalThymioDSL.g:1021:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalThymioDSL.g:1021:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalThymioDSL.g:1022:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalThymioDSL.g:1028:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1034:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalThymioDSL.g:1035:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalThymioDSL.g:1035:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalThymioDSL.g:1036:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalThymioDSL.g:1036:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:1037:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_31); 

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
    // InternalThymioDSL.g:1054:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalThymioDSL.g:1054:47: (iv_ruleEString= ruleEString EOF )
            // InternalThymioDSL.g:1055:2: iv_ruleEString= ruleEString EOF
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
    // InternalThymioDSL.g:1061:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1067:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalThymioDSL.g:1068:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalThymioDSL.g:1068:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:1069:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1077:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalThymioDSL.g:1088:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalThymioDSL.g:1088:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalThymioDSL.g:1089:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalThymioDSL.g:1095:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1101:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalThymioDSL.g:1102:2: (kw= 'true' | kw= 'false' )
            {
            // InternalThymioDSL.g:1102:2: (kw= 'true' | kw= 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            else if ( (LA13_0==43) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:1103:3: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1109:3: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleNoteDuration"
    // InternalThymioDSL.g:1118:1: entryRuleNoteDuration returns [String current=null] : iv_ruleNoteDuration= ruleNoteDuration EOF ;
    public final String entryRuleNoteDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteDuration = null;


        try {
            // InternalThymioDSL.g:1118:52: (iv_ruleNoteDuration= ruleNoteDuration EOF )
            // InternalThymioDSL.g:1119:2: iv_ruleNoteDuration= ruleNoteDuration EOF
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
    // InternalThymioDSL.g:1125:1: ruleNoteDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'short' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleNoteDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1131:2: ( (kw= 'short' | kw= 'long' ) )
            // InternalThymioDSL.g:1132:2: (kw= 'short' | kw= 'long' )
            {
            // InternalThymioDSL.g:1132:2: (kw= 'short' | kw= 'long' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            else if ( (LA14_0==45) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:1133:3: kw= 'short'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNoteDurationAccess().getShortKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1139:3: kw= 'long'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalThymioDSL.g:1148:1: entryRuleOrtogonal returns [String current=null] : iv_ruleOrtogonal= ruleOrtogonal EOF ;
    public final String entryRuleOrtogonal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrtogonal = null;


        try {
            // InternalThymioDSL.g:1148:49: (iv_ruleOrtogonal= ruleOrtogonal EOF )
            // InternalThymioDSL.g:1149:2: iv_ruleOrtogonal= ruleOrtogonal EOF
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
    // InternalThymioDSL.g:1155:1: ruleOrtogonal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) ;
    public final AntlrDatatypeRuleToken ruleOrtogonal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1161:2: ( (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) )
            // InternalThymioDSL.g:1162:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            {
            // InternalThymioDSL.g:1162:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt15=1;
                }
                break;
            case 47:
                {
                alt15=2;
                }
                break;
            case 48:
                {
                alt15=3;
                }
                break;
            case 49:
                {
                alt15=4;
                }
                break;
            case 50:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:1163:3: kw= 'up'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getUpKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1169:3: kw= 'down'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getDownKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1175:3: kw= 'left'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:1181:3: kw= 'right'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getRightKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:1187:3: kw= 'center'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalThymioDSL.g:1196:1: entryRuleSensorStatus returns [String current=null] : iv_ruleSensorStatus= ruleSensorStatus EOF ;
    public final String entryRuleSensorStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSensorStatus = null;


        try {
            // InternalThymioDSL.g:1196:52: (iv_ruleSensorStatus= ruleSensorStatus EOF )
            // InternalThymioDSL.g:1197:2: iv_ruleSensorStatus= ruleSensorStatus EOF
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
    // InternalThymioDSL.g:1203:1: ruleSensorStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'very_close' | kw= 'close' | kw= 'far' ) ;
    public final AntlrDatatypeRuleToken ruleSensorStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1209:2: ( (kw= 'very_close' | kw= 'close' | kw= 'far' ) )
            // InternalThymioDSL.g:1210:2: (kw= 'very_close' | kw= 'close' | kw= 'far' )
            {
            // InternalThymioDSL.g:1210:2: (kw= 'very_close' | kw= 'close' | kw= 'far' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt16=1;
                }
                break;
            case 52:
                {
                alt16=2;
                }
                break;
            case 53:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalThymioDSL.g:1211:3: kw= 'very_close'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getVery_closeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1217:3: kw= 'close'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getCloseKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1223:3: kw= 'far'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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
    // InternalThymioDSL.g:1232:1: entryRuleBlackWhite returns [String current=null] : iv_ruleBlackWhite= ruleBlackWhite EOF ;
    public final String entryRuleBlackWhite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlackWhite = null;


        try {
            // InternalThymioDSL.g:1232:50: (iv_ruleBlackWhite= ruleBlackWhite EOF )
            // InternalThymioDSL.g:1233:2: iv_ruleBlackWhite= ruleBlackWhite EOF
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
    // InternalThymioDSL.g:1239:1: ruleBlackWhite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'black' | kw= 'white' | kw= 'any' ) ;
    public final AntlrDatatypeRuleToken ruleBlackWhite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1245:2: ( (kw= 'black' | kw= 'white' | kw= 'any' ) )
            // InternalThymioDSL.g:1246:2: (kw= 'black' | kw= 'white' | kw= 'any' )
            {
            // InternalThymioDSL.g:1246:2: (kw= 'black' | kw= 'white' | kw= 'any' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt17=1;
                }
                break;
            case 55:
                {
                alt17=2;
                }
                break;
            case 56:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalThymioDSL.g:1247:3: kw= 'black'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getBlackKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1253:3: kw= 'white'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1259:3: kw= 'any'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

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
    // InternalThymioDSL.g:1268:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalThymioDSL.g:1268:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalThymioDSL.g:1269:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalThymioDSL.g:1275:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1281:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalThymioDSL.g:1282:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalThymioDSL.g:1282:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalThymioDSL.g:1283:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1291:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41||LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalThymioDSL.g:1292:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalThymioDSL.g:1292:4: ()
            	    // InternalThymioDSL.g:1293:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalThymioDSL.g:1299:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalThymioDSL.g:1300:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalThymioDSL.g:1300:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalThymioDSL.g:1301:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalThymioDSL.g:1301:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==57) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==41) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalThymioDSL.g:1302:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,57,FOLLOW_23); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalThymioDSL.g:1313:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,41,FOLLOW_23); 

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

            	    // InternalThymioDSL.g:1326:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalThymioDSL.g:1327:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalThymioDSL.g:1327:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalThymioDSL.g:1328:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop19;
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
    // InternalThymioDSL.g:1350:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalThymioDSL.g:1350:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalThymioDSL.g:1351:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalThymioDSL.g:1357:1: ruleMultiplication returns [EObject current=null] : (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Number_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1363:2: ( (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* ) )
            // InternalThymioDSL.g:1364:2: (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* )
            {
            // InternalThymioDSL.g:1364:2: (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* )
            // InternalThymioDSL.g:1365:3: this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Number_0=ruleNumber();

            state._fsp--;


            			current = this_Number_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1373:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=58 && LA21_0<=59)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalThymioDSL.g:1374:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) )
            	    {
            	    // InternalThymioDSL.g:1374:4: ()
            	    // InternalThymioDSL.g:1375:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalThymioDSL.g:1381:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalThymioDSL.g:1382:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalThymioDSL.g:1382:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalThymioDSL.g:1383:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalThymioDSL.g:1383:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==58) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==59) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalThymioDSL.g:1384:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,58,FOLLOW_23); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalThymioDSL.g:1395:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,59,FOLLOW_23); 

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

            	    // InternalThymioDSL.g:1408:4: ( (lv_right_3_0= ruleNumber ) )
            	    // InternalThymioDSL.g:1409:5: (lv_right_3_0= ruleNumber )
            	    {
            	    // InternalThymioDSL.g:1409:5: (lv_right_3_0= ruleNumber )
            	    // InternalThymioDSL.g:1410:6: lv_right_3_0= ruleNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumberParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop21;
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
    // InternalThymioDSL.g:1432:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalThymioDSL.g:1432:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalThymioDSL.g:1433:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalThymioDSL.g:1439:1: ruleNumber returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject this_Addition_2 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1445:2: ( ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // InternalThymioDSL.g:1446:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // InternalThymioDSL.g:1446:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT||LA22_0==41) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalThymioDSL.g:1447:3: ( (lv_value_0_0= ruleEInt ) )
                    {
                    // InternalThymioDSL.g:1447:3: ( (lv_value_0_0= ruleEInt ) )
                    // InternalThymioDSL.g:1448:4: (lv_value_0_0= ruleEInt )
                    {
                    // InternalThymioDSL.g:1448:4: (lv_value_0_0= ruleEInt )
                    // InternalThymioDSL.g:1449:5: lv_value_0_0= ruleEInt
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
                    // InternalThymioDSL.g:1467:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // InternalThymioDSL.g:1467:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // InternalThymioDSL.g:1468:4: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getNumberAccess().getAdditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000022000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200020000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0C00000000000002L});

}