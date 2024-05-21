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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Procedure:'", "'Event:'", "'Action:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'sensor_is_activated:'", "'back_left:'", "'back_right:'", "'front_right:'", "'front_center_right:'", "'front_center:'", "'front_center_left:'", "'front_left:'", "'move:'", "'top_light:'", "'bottom_light:'", "'sound:'", "'motors:'", "'left:'", "'right:'", "'note:'", "'-'", "'true'", "'false'", "'on'", "'off'", "'('", "','", "')'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'black'", "'white'", "'covered'", "'uncovered'", "'+'", "'*'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    // InternalThymioDSL.g:107:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Action:' ( (lv_actions_5_0= ruleAction ) )+ ) ;
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
            // InternalThymioDSL.g:113:2: ( (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Action:' ( (lv_actions_5_0= ruleAction ) )+ ) )
            // InternalThymioDSL.g:114:2: (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Action:' ( (lv_actions_5_0= ruleAction ) )+ )
            {
            // InternalThymioDSL.g:114:2: (otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Action:' ( (lv_actions_5_0= ruleAction ) )+ )
            // InternalThymioDSL.g:115:3: otherlv_0= 'Procedure:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Event:' ( (lv_events_3_0= ruleEvent ) ) otherlv_4= 'Action:' ( (lv_actions_5_0= ruleAction ) )+
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
            					add(
            						current,
            						"events",
            						lv_events_3_0,
            						"ld.project2.ThymioDSL.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getActionKeyword_4());
            		
            // InternalThymioDSL.g:165:3: ( (lv_actions_5_0= ruleAction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=25 && LA2_0<=28)) ) {
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
    // InternalThymioDSL.g:195:1: ruleEvent returns [EObject current=null] : ( ( () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) ) ) | (otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) ) ) | (otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) ) ) | (otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) ) )+ ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_button_2_0 = null;

        AntlrDatatypeRuleToken lv_tap_4_0 = null;

        AntlrDatatypeRuleToken lv_mic_6_0 = null;

        EObject lv_sensor_8_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:201:2: ( ( ( () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) ) ) | (otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) ) ) | (otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) ) ) | (otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) ) )+ ) )
            // InternalThymioDSL.g:202:2: ( ( () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) ) ) | (otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) ) ) | (otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) ) ) | (otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) ) )+ )
            {
            // InternalThymioDSL.g:202:2: ( ( () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) ) ) | (otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) ) ) | (otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) ) ) | (otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) ) )+ )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:203:3: ( () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) ) )
                    {
                    // InternalThymioDSL.g:203:3: ( () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) ) )
                    // InternalThymioDSL.g:204:4: () (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) )
                    {
                    // InternalThymioDSL.g:204:4: ()
                    // InternalThymioDSL.g:205:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getEventAction_0_0(),
                    						current);
                    				

                    }

                    // InternalThymioDSL.g:211:4: (otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) ) )
                    // InternalThymioDSL.g:212:5: otherlv_1= 'button_is_clicked:' ( (lv_button_2_0= ruleOrtogonal ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_1_0());
                    				
                    // InternalThymioDSL.g:216:5: ( (lv_button_2_0= ruleOrtogonal ) )
                    // InternalThymioDSL.g:217:6: (lv_button_2_0= ruleOrtogonal )
                    {
                    // InternalThymioDSL.g:217:6: (lv_button_2_0= ruleOrtogonal )
                    // InternalThymioDSL.g:218:7: lv_button_2_0= ruleOrtogonal
                    {

                    							newCompositeNode(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_button_2_0=ruleOrtogonal();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEventRule());
                    							}
                    							set(
                    								current,
                    								"button",
                    								lv_button_2_0,
                    								"ld.project2.ThymioDSL.Ortogonal");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:238:3: (otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:238:3: (otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:239:4: otherlv_3= 'robot_is_tapped:' ( (lv_tap_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getRobot_is_tappedKeyword_1_0());
                    			
                    // InternalThymioDSL.g:243:4: ( (lv_tap_4_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:244:5: (lv_tap_4_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:244:5: (lv_tap_4_0= ruleEBoolean )
                    // InternalThymioDSL.g:245:6: lv_tap_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tap_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"tap",
                    							lv_tap_4_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:264:3: (otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:264:3: (otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:265:4: otherlv_5= 'sound_is_detected:' ( (lv_mic_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventAccess().getSound_is_detectedKeyword_2_0());
                    			
                    // InternalThymioDSL.g:269:4: ( (lv_mic_6_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:270:5: (lv_mic_6_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:270:5: (lv_mic_6_0= ruleEBoolean )
                    // InternalThymioDSL.g:271:6: lv_mic_6_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mic_6_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"mic",
                    							lv_mic_6_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:290:3: (otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) ) )+
                    {
                    // InternalThymioDSL.g:290:3: (otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalThymioDSL.g:291:4: otherlv_7= 'sensor_is_activated:' ( (lv_sensor_8_0= ruleSensor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_12); 

                    	    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getSensor_is_activatedKeyword_3_0());
                    	    			
                    	    // InternalThymioDSL.g:295:4: ( (lv_sensor_8_0= ruleSensor ) )
                    	    // InternalThymioDSL.g:296:5: (lv_sensor_8_0= ruleSensor )
                    	    {
                    	    // InternalThymioDSL.g:296:5: (lv_sensor_8_0= ruleSensor )
                    	    // InternalThymioDSL.g:297:6: lv_sensor_8_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_sensor_8_0=ruleSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensor",
                    	    							lv_sensor_8_0,
                    	    							"ld.project2.ThymioDSL.Sensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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


    // $ANTLR start "entryRuleSensor"
    // InternalThymioDSL.g:319:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalThymioDSL.g:319:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalThymioDSL.g:320:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalThymioDSL.g:326:1: ruleSensor returns [EObject current=null] : ( ( () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) ) ) | (otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) ) ) | (otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) ) ) | (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) ) | (otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) ) ) | (otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) ) ) | (otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_backLeftSensor_2_0 = null;

        AntlrDatatypeRuleToken lv_backRightSensor_4_0 = null;

        AntlrDatatypeRuleToken lv_frontRightSensor_6_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterRightSensor_8_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterSensor_10_0 = null;

        AntlrDatatypeRuleToken lv_frontCenterLeftSensor_12_0 = null;

        AntlrDatatypeRuleToken lv_frontLeftSensor_14_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:332:2: ( ( ( () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) ) ) | (otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) ) ) | (otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) ) ) | (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) ) | (otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) ) ) | (otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) ) ) | (otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) ) ) ) )
            // InternalThymioDSL.g:333:2: ( ( () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) ) ) | (otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) ) ) | (otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) ) ) | (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) ) | (otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) ) ) | (otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) ) ) | (otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) ) ) )
            {
            // InternalThymioDSL.g:333:2: ( ( () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) ) ) | (otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) ) ) | (otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) ) ) | (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) ) | (otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) ) ) | (otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) ) ) | (otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 24:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:334:3: ( () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) ) )
                    {
                    // InternalThymioDSL.g:334:3: ( () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) ) )
                    // InternalThymioDSL.g:335:4: () (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) )
                    {
                    // InternalThymioDSL.g:335:4: ()
                    // InternalThymioDSL.g:336:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSensorAccess().getSensorAction_0_0(),
                    						current);
                    				

                    }

                    // InternalThymioDSL.g:342:4: (otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) ) )
                    // InternalThymioDSL.g:343:5: otherlv_1= 'back_left:' ( (lv_backLeftSensor_2_0= ruleBlackWhite ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getBack_leftKeyword_0_1_0());
                    				
                    // InternalThymioDSL.g:347:5: ( (lv_backLeftSensor_2_0= ruleBlackWhite ) )
                    // InternalThymioDSL.g:348:6: (lv_backLeftSensor_2_0= ruleBlackWhite )
                    {
                    // InternalThymioDSL.g:348:6: (lv_backLeftSensor_2_0= ruleBlackWhite )
                    // InternalThymioDSL.g:349:7: lv_backLeftSensor_2_0= ruleBlackWhite
                    {

                    							newCompositeNode(grammarAccess.getSensorAccess().getBackLeftSensorBlackWhiteParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_backLeftSensor_2_0=ruleBlackWhite();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSensorRule());
                    							}
                    							set(
                    								current,
                    								"backLeftSensor",
                    								lv_backLeftSensor_2_0,
                    								"ld.project2.ThymioDSL.BlackWhite");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:369:3: (otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) ) )
                    {
                    // InternalThymioDSL.g:369:3: (otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) ) )
                    // InternalThymioDSL.g:370:4: otherlv_3= 'back_right:' ( (lv_backRightSensor_4_0= ruleBlackWhite ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getBack_rightKeyword_1_0());
                    			
                    // InternalThymioDSL.g:374:4: ( (lv_backRightSensor_4_0= ruleBlackWhite ) )
                    // InternalThymioDSL.g:375:5: (lv_backRightSensor_4_0= ruleBlackWhite )
                    {
                    // InternalThymioDSL.g:375:5: (lv_backRightSensor_4_0= ruleBlackWhite )
                    // InternalThymioDSL.g:376:6: lv_backRightSensor_4_0= ruleBlackWhite
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getBackRightSensorBlackWhiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_backRightSensor_4_0=ruleBlackWhite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"backRightSensor",
                    							lv_backRightSensor_4_0,
                    							"ld.project2.ThymioDSL.BlackWhite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:395:3: (otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:395:3: (otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:396:4: otherlv_5= 'front_right:' ( (lv_frontRightSensor_6_0= ruleSensorStatus ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getFront_rightKeyword_2_0());
                    			
                    // InternalThymioDSL.g:400:4: ( (lv_frontRightSensor_6_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:401:5: (lv_frontRightSensor_6_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:401:5: (lv_frontRightSensor_6_0= ruleSensorStatus )
                    // InternalThymioDSL.g:402:6: lv_frontRightSensor_6_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontRightSensor_6_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontRightSensor",
                    							lv_frontRightSensor_6_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:421:3: (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:421:3: (otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:422:4: otherlv_7= 'front_center_right:' ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getFront_center_rightKeyword_3_0());
                    			
                    // InternalThymioDSL.g:426:4: ( (lv_frontCenterRightSensor_8_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:427:5: (lv_frontCenterRightSensor_8_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:427:5: (lv_frontCenterRightSensor_8_0= ruleSensorStatus )
                    // InternalThymioDSL.g:428:6: lv_frontCenterRightSensor_8_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterRightSensor_8_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
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


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:447:3: (otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:447:3: (otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:448:4: otherlv_9= 'front_center:' ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getFront_centerKeyword_4_0());
                    			
                    // InternalThymioDSL.g:452:4: ( (lv_frontCenterSensor_10_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:453:5: (lv_frontCenterSensor_10_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:453:5: (lv_frontCenterSensor_10_0= ruleSensorStatus )
                    // InternalThymioDSL.g:454:6: lv_frontCenterSensor_10_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterSensor_10_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterSensor",
                    							lv_frontCenterSensor_10_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalThymioDSL.g:473:3: (otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:473:3: (otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:474:4: otherlv_11= 'front_center_left:' ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getFront_center_leftKeyword_5_0());
                    			
                    // InternalThymioDSL.g:478:4: ( (lv_frontCenterLeftSensor_12_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:479:5: (lv_frontCenterLeftSensor_12_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:479:5: (lv_frontCenterLeftSensor_12_0= ruleSensorStatus )
                    // InternalThymioDSL.g:480:6: lv_frontCenterLeftSensor_12_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterLeftSensor_12_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterLeftSensor",
                    							lv_frontCenterLeftSensor_12_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalThymioDSL.g:499:3: (otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) ) )
                    {
                    // InternalThymioDSL.g:499:3: (otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) ) )
                    // InternalThymioDSL.g:500:4: otherlv_13= 'front_left:' ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getFront_leftKeyword_6_0());
                    			
                    // InternalThymioDSL.g:504:4: ( (lv_frontLeftSensor_14_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:505:5: (lv_frontLeftSensor_14_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:505:5: (lv_frontLeftSensor_14_0= ruleSensorStatus )
                    // InternalThymioDSL.g:506:6: lv_frontLeftSensor_14_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontLeftSensor_14_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontLeftSensor",
                    							lv_frontLeftSensor_14_0,
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleAction"
    // InternalThymioDSL.g:528:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalThymioDSL.g:528:47: (iv_ruleAction= ruleAction EOF )
            // InternalThymioDSL.g:529:2: iv_ruleAction= ruleAction EOF
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
    // InternalThymioDSL.g:535:1: ruleAction returns [EObject current=null] : ( ( () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) ) ) | (otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) ) ) | (otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) ) ) | (otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_move_2_0 = null;

        AntlrDatatypeRuleToken lv_topLight_4_0 = null;

        AntlrDatatypeRuleToken lv_bottomLight_6_0 = null;

        EObject lv_sound_8_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:541:2: ( ( ( () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) ) ) | (otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) ) ) | (otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) ) ) | (otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) ) ) ) )
            // InternalThymioDSL.g:542:2: ( ( () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) ) ) | (otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) ) ) | (otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) ) ) | (otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) ) ) )
            {
            // InternalThymioDSL.g:542:2: ( ( () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) ) ) | (otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) ) ) | (otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) ) ) | (otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:543:3: ( () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) ) )
                    {
                    // InternalThymioDSL.g:543:3: ( () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) ) )
                    // InternalThymioDSL.g:544:4: () (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) )
                    {
                    // InternalThymioDSL.g:544:4: ()
                    // InternalThymioDSL.g:545:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActionAccess().getActionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalThymioDSL.g:551:4: (otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) ) )
                    // InternalThymioDSL.g:552:5: otherlv_1= 'move:' ( (lv_move_2_0= ruleMotor ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); 

                    					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getMoveKeyword_0_1_0());
                    				
                    // InternalThymioDSL.g:556:5: ( (lv_move_2_0= ruleMotor ) )
                    // InternalThymioDSL.g:557:6: (lv_move_2_0= ruleMotor )
                    {
                    // InternalThymioDSL.g:557:6: (lv_move_2_0= ruleMotor )
                    // InternalThymioDSL.g:558:7: lv_move_2_0= ruleMotor
                    {

                    							newCompositeNode(grammarAccess.getActionAccess().getMoveMotorParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_move_2_0=ruleMotor();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActionRule());
                    							}
                    							set(
                    								current,
                    								"move",
                    								lv_move_2_0,
                    								"ld.project2.ThymioDSL.Motor");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:578:3: (otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) ) )
                    {
                    // InternalThymioDSL.g:578:3: (otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) ) )
                    // InternalThymioDSL.g:579:4: otherlv_3= 'top_light:' ( (lv_topLight_4_0= ruleOnOff ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getTop_lightKeyword_1_0());
                    			
                    // InternalThymioDSL.g:583:4: ( (lv_topLight_4_0= ruleOnOff ) )
                    // InternalThymioDSL.g:584:5: (lv_topLight_4_0= ruleOnOff )
                    {
                    // InternalThymioDSL.g:584:5: (lv_topLight_4_0= ruleOnOff )
                    // InternalThymioDSL.g:585:6: lv_topLight_4_0= ruleOnOff
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getTopLightOnOffParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_topLight_4_0=ruleOnOff();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"topLight",
                    							lv_topLight_4_0,
                    							"ld.project2.ThymioDSL.OnOff");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:604:3: (otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) ) )
                    {
                    // InternalThymioDSL.g:604:3: (otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) ) )
                    // InternalThymioDSL.g:605:4: otherlv_5= 'bottom_light:' ( (lv_bottomLight_6_0= ruleOnOff ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getBottom_lightKeyword_2_0());
                    			
                    // InternalThymioDSL.g:609:4: ( (lv_bottomLight_6_0= ruleOnOff ) )
                    // InternalThymioDSL.g:610:5: (lv_bottomLight_6_0= ruleOnOff )
                    {
                    // InternalThymioDSL.g:610:5: (lv_bottomLight_6_0= ruleOnOff )
                    // InternalThymioDSL.g:611:6: lv_bottomLight_6_0= ruleOnOff
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getBottomLightOnOffParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bottomLight_6_0=ruleOnOff();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"bottomLight",
                    							lv_bottomLight_6_0,
                    							"ld.project2.ThymioDSL.OnOff");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:630:3: (otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) ) )
                    {
                    // InternalThymioDSL.g:630:3: (otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) ) )
                    // InternalThymioDSL.g:631:4: otherlv_7= 'sound:' ( (lv_sound_8_0= ruleSound ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSoundKeyword_3_0());
                    			
                    // InternalThymioDSL.g:635:4: ( (lv_sound_8_0= ruleSound ) )
                    // InternalThymioDSL.g:636:5: (lv_sound_8_0= ruleSound )
                    {
                    // InternalThymioDSL.g:636:5: (lv_sound_8_0= ruleSound )
                    // InternalThymioDSL.g:637:6: lv_sound_8_0= ruleSound
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sound_8_0=ruleSound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"sound",
                    							lv_sound_8_0,
                    							"ld.project2.ThymioDSL.Sound");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMotor"
    // InternalThymioDSL.g:659:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalThymioDSL.g:659:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalThymioDSL.g:660:2: iv_ruleMotor= ruleMotor EOF
            {
             newCompositeNode(grammarAccess.getMotorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotor=ruleMotor();

            state._fsp--;

             current =iv_ruleMotor; 
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
    // $ANTLR end "entryRuleMotor"


    // $ANTLR start "ruleMotor"
    // InternalThymioDSL.g:666:1: ruleMotor returns [EObject current=null] : (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:672:2: ( (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) ) )
            // InternalThymioDSL.g:673:2: (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) )
            {
            // InternalThymioDSL.g:673:2: (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) )
            // InternalThymioDSL.g:674:3: otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMotorAccess().getMotorsKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMotorAccess().getLeftKeyword_1());
            		
            // InternalThymioDSL.g:682:3: ( (lv_left_2_0= ruleAddition ) )
            // InternalThymioDSL.g:683:4: (lv_left_2_0= ruleAddition )
            {
            // InternalThymioDSL.g:683:4: (lv_left_2_0= ruleAddition )
            // InternalThymioDSL.g:684:5: lv_left_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorAccess().getLeftAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_left_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotorRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getMotorAccess().getRightKeyword_3());
            		
            // InternalThymioDSL.g:705:3: ( (lv_right_4_0= ruleAddition ) )
            // InternalThymioDSL.g:706:4: (lv_right_4_0= ruleAddition )
            {
            // InternalThymioDSL.g:706:4: (lv_right_4_0= ruleAddition )
            // InternalThymioDSL.g:707:5: lv_right_4_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorAccess().getRightAdditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_4_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotorRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
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
    // $ANTLR end "ruleMotor"


    // $ANTLR start "entryRuleSound"
    // InternalThymioDSL.g:728:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalThymioDSL.g:728:46: (iv_ruleSound= ruleSound EOF )
            // InternalThymioDSL.g:729:2: iv_ruleSound= ruleSound EOF
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
    // InternalThymioDSL.g:735:1: ruleSound returns [EObject current=null] : (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) ) )* ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_pitch_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_2_0 = null;

        EObject lv_pitch_4_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:741:2: ( (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) ) )* ) )
            // InternalThymioDSL.g:742:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) ) )* )
            {
            // InternalThymioDSL.g:742:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) ) )* )
            // InternalThymioDSL.g:743:3: otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getNoteKeyword_0());
            		
            // InternalThymioDSL.g:747:3: ( (lv_pitch_1_0= ruleAddition ) )
            // InternalThymioDSL.g:748:4: (lv_pitch_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:748:4: (lv_pitch_1_0= ruleAddition )
            // InternalThymioDSL.g:749:5: lv_pitch_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_pitch_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					add(
            						current,
            						"pitch",
            						lv_pitch_1_0,
            						"ld.project2.ThymioDSL.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalThymioDSL.g:766:3: ( (lv_duration_2_0= ruleNoteDuration ) )
            // InternalThymioDSL.g:767:4: (lv_duration_2_0= ruleNoteDuration )
            {
            // InternalThymioDSL.g:767:4: (lv_duration_2_0= ruleNoteDuration )
            // InternalThymioDSL.g:768:5: lv_duration_2_0= ruleNoteDuration
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_duration_2_0=ruleNoteDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					add(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"ld.project2.ThymioDSL.NoteDuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalThymioDSL.g:785:3: (otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalThymioDSL.g:786:4: otherlv_3= 'note:' ( (lv_pitch_4_0= ruleAddition ) ) ( (lv_duration_5_0= ruleNoteDuration ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSoundAccess().getNoteKeyword_3_0());
            	    			
            	    // InternalThymioDSL.g:790:4: ( (lv_pitch_4_0= ruleAddition ) )
            	    // InternalThymioDSL.g:791:5: (lv_pitch_4_0= ruleAddition )
            	    {
            	    // InternalThymioDSL.g:791:5: (lv_pitch_4_0= ruleAddition )
            	    // InternalThymioDSL.g:792:6: lv_pitch_4_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_pitch_4_0=ruleAddition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pitch",
            	    							lv_pitch_4_0,
            	    							"ld.project2.ThymioDSL.Addition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalThymioDSL.g:809:4: ( (lv_duration_5_0= ruleNoteDuration ) )
            	    // InternalThymioDSL.g:810:5: (lv_duration_5_0= ruleNoteDuration )
            	    {
            	    // InternalThymioDSL.g:810:5: (lv_duration_5_0= ruleNoteDuration )
            	    // InternalThymioDSL.g:811:6: lv_duration_5_0= ruleNoteDuration
            	    {

            	    						newCompositeNode(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_duration_5_0=ruleNoteDuration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"duration",
            	    							lv_duration_5_0,
            	    							"ld.project2.ThymioDSL.NoteDuration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleEInt"
    // InternalThymioDSL.g:833:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalThymioDSL.g:833:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalThymioDSL.g:834:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalThymioDSL.g:840:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:846:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalThymioDSL.g:847:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalThymioDSL.g:847:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalThymioDSL.g:848:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalThymioDSL.g:848:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:849:4: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_24); 

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
    // InternalThymioDSL.g:866:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalThymioDSL.g:866:47: (iv_ruleEString= ruleEString EOF )
            // InternalThymioDSL.g:867:2: iv_ruleEString= ruleEString EOF
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
    // InternalThymioDSL.g:873:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:879:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalThymioDSL.g:880:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalThymioDSL.g:880:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:881:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:889:3: this_ID_1= RULE_ID
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
    // InternalThymioDSL.g:900:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalThymioDSL.g:900:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalThymioDSL.g:901:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalThymioDSL.g:907:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:913:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalThymioDSL.g:914:2: (kw= 'true' | kw= 'false' )
            {
            // InternalThymioDSL.g:914:2: (kw= 'true' | kw= 'false' )
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
                    // InternalThymioDSL.g:915:3: kw= 'true'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:921:3: kw= 'false'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOnOff"
    // InternalThymioDSL.g:930:1: entryRuleOnOff returns [String current=null] : iv_ruleOnOff= ruleOnOff EOF ;
    public final String entryRuleOnOff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOnOff = null;


        try {
            // InternalThymioDSL.g:930:45: (iv_ruleOnOff= ruleOnOff EOF )
            // InternalThymioDSL.g:931:2: iv_ruleOnOff= ruleOnOff EOF
            {
             newCompositeNode(grammarAccess.getOnOffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnOff=ruleOnOff();

            state._fsp--;

             current =iv_ruleOnOff.getText(); 
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
    // $ANTLR end "entryRuleOnOff"


    // $ANTLR start "ruleOnOff"
    // InternalThymioDSL.g:937:1: ruleOnOff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'on' this_RGB_1= ruleRGB ) | kw= 'off' ) ;
    public final AntlrDatatypeRuleToken ruleOnOff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_RGB_1 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:943:2: ( ( (kw= 'on' this_RGB_1= ruleRGB ) | kw= 'off' ) )
            // InternalThymioDSL.g:944:2: ( (kw= 'on' this_RGB_1= ruleRGB ) | kw= 'off' )
            {
            // InternalThymioDSL.g:944:2: ( (kw= 'on' this_RGB_1= ruleRGB ) | kw= 'off' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:945:3: (kw= 'on' this_RGB_1= ruleRGB )
                    {
                    // InternalThymioDSL.g:945:3: (kw= 'on' this_RGB_1= ruleRGB )
                    // InternalThymioDSL.g:946:4: kw= 'on' this_RGB_1= ruleRGB
                    {
                    kw=(Token)match(input,36,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOnOffAccess().getOnKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getOnOffAccess().getRGBParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_RGB_1=ruleRGB();

                    state._fsp--;


                    				current.merge(this_RGB_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:963:3: kw= 'off'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOnOffAccess().getOffKeyword_1());
                    		

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
    // $ANTLR end "ruleOnOff"


    // $ANTLR start "entryRuleRGB"
    // InternalThymioDSL.g:972:1: entryRuleRGB returns [String current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final String entryRuleRGB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRGB = null;


        try {
            // InternalThymioDSL.g:972:43: (iv_ruleRGB= ruleRGB EOF )
            // InternalThymioDSL.g:973:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB.getText(); 
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
    // InternalThymioDSL.g:979:1: ruleRGB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleRGB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EInt_1 = null;

        AntlrDatatypeRuleToken this_EInt_3 = null;

        AntlrDatatypeRuleToken this_EInt_5 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:985:2: ( (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' ) )
            // InternalThymioDSL.g:986:2: (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' )
            {
            // InternalThymioDSL.g:986:2: (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' )
            // InternalThymioDSL.g:987:3: kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')'
            {
            kw=(Token)match(input,38,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRGBAccess().getEIntParserRuleCall_1());
            		
            pushFollow(FOLLOW_27);
            this_EInt_1=ruleEInt();

            state._fsp--;


            			current.merge(this_EInt_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRGBAccess().getCommaKeyword_2());
            		

            			newCompositeNode(grammarAccess.getRGBAccess().getEIntParserRuleCall_3());
            		
            pushFollow(FOLLOW_27);
            this_EInt_3=ruleEInt();

            state._fsp--;


            			current.merge(this_EInt_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,39,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRGBAccess().getCommaKeyword_4());
            		

            			newCompositeNode(grammarAccess.getRGBAccess().getEIntParserRuleCall_5());
            		
            pushFollow(FOLLOW_28);
            this_EInt_5=ruleEInt();

            state._fsp--;


            			current.merge(this_EInt_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,40,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRGBAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "entryRuleNoteDuration"
    // InternalThymioDSL.g:1041:1: entryRuleNoteDuration returns [String current=null] : iv_ruleNoteDuration= ruleNoteDuration EOF ;
    public final String entryRuleNoteDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteDuration = null;


        try {
            // InternalThymioDSL.g:1041:52: (iv_ruleNoteDuration= ruleNoteDuration EOF )
            // InternalThymioDSL.g:1042:2: iv_ruleNoteDuration= ruleNoteDuration EOF
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
    // InternalThymioDSL.g:1048:1: ruleNoteDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'short' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleNoteDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1054:2: ( (kw= 'short' | kw= 'long' ) )
            // InternalThymioDSL.g:1055:2: (kw= 'short' | kw= 'long' )
            {
            // InternalThymioDSL.g:1055:2: (kw= 'short' | kw= 'long' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            else if ( (LA12_0==42) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:1056:3: kw= 'short'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNoteDurationAccess().getShortKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1062:3: kw= 'long'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalThymioDSL.g:1071:1: entryRuleOrtogonal returns [String current=null] : iv_ruleOrtogonal= ruleOrtogonal EOF ;
    public final String entryRuleOrtogonal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrtogonal = null;


        try {
            // InternalThymioDSL.g:1071:49: (iv_ruleOrtogonal= ruleOrtogonal EOF )
            // InternalThymioDSL.g:1072:2: iv_ruleOrtogonal= ruleOrtogonal EOF
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
    // InternalThymioDSL.g:1078:1: ruleOrtogonal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) ;
    public final AntlrDatatypeRuleToken ruleOrtogonal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1084:2: ( (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) )
            // InternalThymioDSL.g:1085:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            {
            // InternalThymioDSL.g:1085:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt13=1;
                }
                break;
            case 44:
                {
                alt13=2;
                }
                break;
            case 45:
                {
                alt13=3;
                }
                break;
            case 46:
                {
                alt13=4;
                }
                break;
            case 47:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:1086:3: kw= 'up'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getUpKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1092:3: kw= 'down'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getDownKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1098:3: kw= 'left'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:1104:3: kw= 'right'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getRightKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:1110:3: kw= 'center'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBlackWhite"
    // InternalThymioDSL.g:1119:1: entryRuleBlackWhite returns [String current=null] : iv_ruleBlackWhite= ruleBlackWhite EOF ;
    public final String entryRuleBlackWhite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlackWhite = null;


        try {
            // InternalThymioDSL.g:1119:50: (iv_ruleBlackWhite= ruleBlackWhite EOF )
            // InternalThymioDSL.g:1120:2: iv_ruleBlackWhite= ruleBlackWhite EOF
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
    // InternalThymioDSL.g:1126:1: ruleBlackWhite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleBlackWhite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1132:2: ( (kw= 'black' | kw= 'white' ) )
            // InternalThymioDSL.g:1133:2: (kw= 'black' | kw= 'white' )
            {
            // InternalThymioDSL.g:1133:2: (kw= 'black' | kw= 'white' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            else if ( (LA14_0==49) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:1134:3: kw= 'black'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getBlackKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1140:3: kw= 'white'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1());
                    		

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


    // $ANTLR start "entryRuleSensorStatus"
    // InternalThymioDSL.g:1149:1: entryRuleSensorStatus returns [String current=null] : iv_ruleSensorStatus= ruleSensorStatus EOF ;
    public final String entryRuleSensorStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSensorStatus = null;


        try {
            // InternalThymioDSL.g:1149:52: (iv_ruleSensorStatus= ruleSensorStatus EOF )
            // InternalThymioDSL.g:1150:2: iv_ruleSensorStatus= ruleSensorStatus EOF
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
    // InternalThymioDSL.g:1156:1: ruleSensorStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'covered' | kw= 'uncovered' ) ;
    public final AntlrDatatypeRuleToken ruleSensorStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1162:2: ( (kw= 'covered' | kw= 'uncovered' ) )
            // InternalThymioDSL.g:1163:2: (kw= 'covered' | kw= 'uncovered' )
            {
            // InternalThymioDSL.g:1163:2: (kw= 'covered' | kw= 'uncovered' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            else if ( (LA15_0==51) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:1164:3: kw= 'covered'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getCoveredKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1170:3: kw= 'uncovered'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getUncoveredKeyword_1());
                    		

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


    // $ANTLR start "entryRuleAddition"
    // InternalThymioDSL.g:1179:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalThymioDSL.g:1179:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalThymioDSL.g:1180:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalThymioDSL.g:1186:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1192:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalThymioDSL.g:1193:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalThymioDSL.g:1193:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalThymioDSL.g:1194:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1202:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalThymioDSL.g:1203:4: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalThymioDSL.g:1203:4: ()
            	    // InternalThymioDSL.g:1204:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalThymioDSL.g:1214:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalThymioDSL.g:1215:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalThymioDSL.g:1215:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalThymioDSL.g:1216:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
            	    break loop16;
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
    // InternalThymioDSL.g:1238:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalThymioDSL.g:1238:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalThymioDSL.g:1239:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalThymioDSL.g:1245:1: ruleMultiplication returns [EObject current=null] : (this_Number_0= ruleNumber ( () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Number_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1251:2: ( (this_Number_0= ruleNumber ( () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) ) )* ) )
            // InternalThymioDSL.g:1252:2: (this_Number_0= ruleNumber ( () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) ) )* )
            {
            // InternalThymioDSL.g:1252:2: (this_Number_0= ruleNumber ( () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) ) )* )
            // InternalThymioDSL.g:1253:3: this_Number_0= ruleNumber ( () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Number_0=ruleNumber();

            state._fsp--;


            			current = this_Number_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1261:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThymioDSL.g:1262:4: () otherlv_2= '*' ( (lv_right_3_0= ruleNumber ) )
            	    {
            	    // InternalThymioDSL.g:1262:4: ()
            	    // InternalThymioDSL.g:1263:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalThymioDSL.g:1273:4: ( (lv_right_3_0= ruleNumber ) )
            	    // InternalThymioDSL.g:1274:5: (lv_right_3_0= ruleNumber )
            	    {
            	    // InternalThymioDSL.g:1274:5: (lv_right_3_0= ruleNumber )
            	    // InternalThymioDSL.g:1275:6: lv_right_3_0= ruleNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumberParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop17;
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
    // InternalThymioDSL.g:1297:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalThymioDSL.g:1297:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalThymioDSL.g:1298:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalThymioDSL.g:1304:1: ruleNumber returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject this_Addition_2 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1310:2: ( ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // InternalThymioDSL.g:1311:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // InternalThymioDSL.g:1311:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT||LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalThymioDSL.g:1312:3: ( (lv_value_0_0= ruleEInt ) )
                    {
                    // InternalThymioDSL.g:1312:3: ( (lv_value_0_0= ruleEInt ) )
                    // InternalThymioDSL.g:1313:4: (lv_value_0_0= ruleEInt )
                    {
                    // InternalThymioDSL.g:1313:4: (lv_value_0_0= ruleEInt )
                    // InternalThymioDSL.g:1314:5: lv_value_0_0= ruleEInt
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
                    // InternalThymioDSL.g:1332:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // InternalThymioDSL.g:1332:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // InternalThymioDSL.g:1333:4: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getNumberAccess().getAdditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,40,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004200000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000002L});

}