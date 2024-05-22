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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Procedure:'", "'Event:'", "'Actions:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'sensor_is_activated:'", "'back_left:'", "'back_right:'", "'front_right:'", "'front_center_right:'", "'front_center:'", "'front_center_left:'", "'front_left:'", "'move:'", "'lights:'", "'sound:'", "'left_motor:'", "'right_motor:'", "'top_light:'", "'on'", "'off'", "'bottom_light:'", "'('", "','", "')'", "'note:'", "'-'", "'true'", "'false'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'black'", "'white'", "'+'", "'*'", "'/'"
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

                if ( ((LA2_0>=25 && LA2_0<=27)) ) {
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
    // InternalThymioDSL.g:195:1: ruleEvent returns [EObject current=null] : ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) ) )+ ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_button_1_0 = null;

        AntlrDatatypeRuleToken lv_tap_3_0 = null;

        AntlrDatatypeRuleToken lv_mic_5_0 = null;

        EObject lv_sensor_7_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:201:2: ( ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) ) )+ ) )
            // InternalThymioDSL.g:202:2: ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) ) )+ )
            {
            // InternalThymioDSL.g:202:2: ( (otherlv_0= 'button_is_clicked:' ( (lv_button_1_0= ruleOrtogonal ) ) ) | (otherlv_2= 'robot_is_tapped:' ( (lv_tap_3_0= ruleEBoolean ) ) ) | (otherlv_4= 'sound_is_detected:' ( (lv_mic_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) ) )+ )
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
                    // InternalThymioDSL.g:281:3: (otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) ) )+
                    {
                    // InternalThymioDSL.g:281:3: (otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) ) )+
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
                    	    // InternalThymioDSL.g:282:4: otherlv_6= 'sensor_is_activated:' ( (lv_sensor_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_12); 

                    	    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getSensor_is_activatedKeyword_3_0());
                    	    			
                    	    // InternalThymioDSL.g:286:4: ( (lv_sensor_7_0= ruleSensor ) )
                    	    // InternalThymioDSL.g:287:5: (lv_sensor_7_0= ruleSensor )
                    	    {
                    	    // InternalThymioDSL.g:287:5: (lv_sensor_7_0= ruleSensor )
                    	    // InternalThymioDSL.g:288:6: lv_sensor_7_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_sensor_7_0=ruleSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensor",
                    	    							lv_sensor_7_0,
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
    // InternalThymioDSL.g:310:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalThymioDSL.g:310:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalThymioDSL.g:311:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalThymioDSL.g:317:1: ruleSensor returns [EObject current=null] : ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
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
            // InternalThymioDSL.g:323:2: ( ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) ) ) ) )
            // InternalThymioDSL.g:324:2: ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) ) ) )
            {
            // InternalThymioDSL.g:324:2: ( (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) ) ) | (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) ) ) | (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) ) ) | (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) ) ) | (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) ) ) | (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) ) ) | (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) ) ) )
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
                    // InternalThymioDSL.g:325:3: (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) ) )
                    {
                    // InternalThymioDSL.g:325:3: (otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) ) )
                    // InternalThymioDSL.g:326:4: otherlv_0= 'back_left:' ( (lv_backLeftSensor_1_0= ruleBlackWhite ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getBack_leftKeyword_0_0());
                    			
                    // InternalThymioDSL.g:330:4: ( (lv_backLeftSensor_1_0= ruleBlackWhite ) )
                    // InternalThymioDSL.g:331:5: (lv_backLeftSensor_1_0= ruleBlackWhite )
                    {
                    // InternalThymioDSL.g:331:5: (lv_backLeftSensor_1_0= ruleBlackWhite )
                    // InternalThymioDSL.g:332:6: lv_backLeftSensor_1_0= ruleBlackWhite
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getBackLeftSensorBlackWhiteParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_backLeftSensor_1_0=ruleBlackWhite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"backLeftSensor",
                    							lv_backLeftSensor_1_0,
                    							"ld.project2.ThymioDSL.BlackWhite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:351:3: (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) ) )
                    {
                    // InternalThymioDSL.g:351:3: (otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) ) )
                    // InternalThymioDSL.g:352:4: otherlv_2= 'back_right:' ( (lv_backRightSensor_3_0= ruleBlackWhite ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getBack_rightKeyword_1_0());
                    			
                    // InternalThymioDSL.g:356:4: ( (lv_backRightSensor_3_0= ruleBlackWhite ) )
                    // InternalThymioDSL.g:357:5: (lv_backRightSensor_3_0= ruleBlackWhite )
                    {
                    // InternalThymioDSL.g:357:5: (lv_backRightSensor_3_0= ruleBlackWhite )
                    // InternalThymioDSL.g:358:6: lv_backRightSensor_3_0= ruleBlackWhite
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getBackRightSensorBlackWhiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_backRightSensor_3_0=ruleBlackWhite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"backRightSensor",
                    							lv_backRightSensor_3_0,
                    							"ld.project2.ThymioDSL.BlackWhite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:377:3: (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:377:3: (otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:378:4: otherlv_4= 'front_right:' ( (lv_frontRightSensor_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getFront_rightKeyword_2_0());
                    			
                    // InternalThymioDSL.g:382:4: ( (lv_frontRightSensor_5_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:383:5: (lv_frontRightSensor_5_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:383:5: (lv_frontRightSensor_5_0= ruleEBoolean )
                    // InternalThymioDSL.g:384:6: lv_frontRightSensor_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontRightSensorEBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontRightSensor_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontRightSensor",
                    							lv_frontRightSensor_5_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:403:3: (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:403:3: (otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:404:4: otherlv_6= 'front_center_right:' ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getFront_center_rightKeyword_3_0());
                    			
                    // InternalThymioDSL.g:408:4: ( (lv_frontCenterRightSensor_7_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:409:5: (lv_frontCenterRightSensor_7_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:409:5: (lv_frontCenterRightSensor_7_0= ruleEBoolean )
                    // InternalThymioDSL.g:410:6: lv_frontCenterRightSensor_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontCenterRightSensorEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterRightSensor_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterRightSensor",
                    							lv_frontCenterRightSensor_7_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:429:3: (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:429:3: (otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:430:4: otherlv_8= 'front_center:' ( (lv_frontCenterSensor_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getFront_centerKeyword_4_0());
                    			
                    // InternalThymioDSL.g:434:4: ( (lv_frontCenterSensor_9_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:435:5: (lv_frontCenterSensor_9_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:435:5: (lv_frontCenterSensor_9_0= ruleEBoolean )
                    // InternalThymioDSL.g:436:6: lv_frontCenterSensor_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontCenterSensorEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterSensor_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterSensor",
                    							lv_frontCenterSensor_9_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalThymioDSL.g:455:3: (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:455:3: (otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:456:4: otherlv_10= 'front_center_left:' ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getFront_center_leftKeyword_5_0());
                    			
                    // InternalThymioDSL.g:460:4: ( (lv_frontCenterLeftSensor_11_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:461:5: (lv_frontCenterLeftSensor_11_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:461:5: (lv_frontCenterLeftSensor_11_0= ruleEBoolean )
                    // InternalThymioDSL.g:462:6: lv_frontCenterLeftSensor_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontCenterLeftSensorEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontCenterLeftSensor_11_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontCenterLeftSensor",
                    							lv_frontCenterLeftSensor_11_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalThymioDSL.g:481:3: (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) ) )
                    {
                    // InternalThymioDSL.g:481:3: (otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) ) )
                    // InternalThymioDSL.g:482:4: otherlv_12= 'front_left:' ( (lv_frontLeftSensor_13_0= ruleEBoolean ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getSensorAccess().getFront_leftKeyword_6_0());
                    			
                    // InternalThymioDSL.g:486:4: ( (lv_frontLeftSensor_13_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:487:5: (lv_frontLeftSensor_13_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:487:5: (lv_frontLeftSensor_13_0= ruleEBoolean )
                    // InternalThymioDSL.g:488:6: lv_frontLeftSensor_13_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrontLeftSensorEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_frontLeftSensor_13_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frontLeftSensor",
                    							lv_frontLeftSensor_13_0,
                    							"ld.project2.ThymioDSL.EBoolean");
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
    // InternalThymioDSL.g:510:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalThymioDSL.g:510:47: (iv_ruleAction= ruleAction EOF )
            // InternalThymioDSL.g:511:2: iv_ruleAction= ruleAction EOF
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
    // InternalThymioDSL.g:517:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) ) ;
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
            // InternalThymioDSL.g:523:2: ( ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) ) )
            // InternalThymioDSL.g:524:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) )
            {
            // InternalThymioDSL.g:524:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) ) | (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) ) | (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:525:3: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) )
                    {
                    // InternalThymioDSL.g:525:3: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) ) )
                    // InternalThymioDSL.g:526:4: otherlv_0= 'move:' ( (lv_move_1_0= ruleMotors ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalThymioDSL.g:530:4: ( (lv_move_1_0= ruleMotors ) )
                    // InternalThymioDSL.g:531:5: (lv_move_1_0= ruleMotors )
                    {
                    // InternalThymioDSL.g:531:5: (lv_move_1_0= ruleMotors )
                    // InternalThymioDSL.g:532:6: lv_move_1_0= ruleMotors
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
                    // InternalThymioDSL.g:551:3: (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) )
                    {
                    // InternalThymioDSL.g:551:3: (otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) ) )
                    // InternalThymioDSL.g:552:4: otherlv_2= 'lights:' ( (lv_light_3_0= ruleLights ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLightsKeyword_1_0());
                    			
                    // InternalThymioDSL.g:556:4: ( (lv_light_3_0= ruleLights ) )
                    // InternalThymioDSL.g:557:5: (lv_light_3_0= ruleLights )
                    {
                    // InternalThymioDSL.g:557:5: (lv_light_3_0= ruleLights )
                    // InternalThymioDSL.g:558:6: lv_light_3_0= ruleLights
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
                    // InternalThymioDSL.g:577:3: (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ )
                    {
                    // InternalThymioDSL.g:577:3: (otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+ )
                    // InternalThymioDSL.g:578:4: otherlv_4= 'sound:' ( (lv_sound_5_0= ruleSound ) )+
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSoundKeyword_2_0());
                    			
                    // InternalThymioDSL.g:582:4: ( (lv_sound_5_0= ruleSound ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==37) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalThymioDSL.g:583:5: (lv_sound_5_0= ruleSound )
                    	    {
                    	    // InternalThymioDSL.g:583:5: (lv_sound_5_0= ruleSound )
                    	    // InternalThymioDSL.g:584:6: lv_sound_5_0= ruleSound
                    	    {

                    	    						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
    // InternalThymioDSL.g:606:1: entryRuleMotors returns [EObject current=null] : iv_ruleMotors= ruleMotors EOF ;
    public final EObject entryRuleMotors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotors = null;


        try {
            // InternalThymioDSL.g:606:47: (iv_ruleMotors= ruleMotors EOF )
            // InternalThymioDSL.g:607:2: iv_ruleMotors= ruleMotors EOF
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
    // InternalThymioDSL.g:613:1: ruleMotors returns [EObject current=null] : (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) ) ;
    public final EObject ruleMotors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:619:2: ( (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) ) )
            // InternalThymioDSL.g:620:2: (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) )
            {
            // InternalThymioDSL.g:620:2: (otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) ) )
            // InternalThymioDSL.g:621:3: otherlv_0= 'left_motor:' ( (lv_left_1_0= ruleAddition ) ) otherlv_2= 'right_motor:' ( (lv_right_3_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMotorsAccess().getLeft_motorKeyword_0());
            		
            // InternalThymioDSL.g:625:3: ( (lv_left_1_0= ruleAddition ) )
            // InternalThymioDSL.g:626:4: (lv_left_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:626:4: (lv_left_1_0= ruleAddition )
            // InternalThymioDSL.g:627:5: lv_left_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorsAccess().getLeftAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_2=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMotorsAccess().getRight_motorKeyword_2());
            		
            // InternalThymioDSL.g:648:3: ( (lv_right_3_0= ruleAddition ) )
            // InternalThymioDSL.g:649:4: (lv_right_3_0= ruleAddition )
            {
            // InternalThymioDSL.g:649:4: (lv_right_3_0= ruleAddition )
            // InternalThymioDSL.g:650:5: lv_right_3_0= ruleAddition
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
    // InternalThymioDSL.g:671:1: entryRuleLights returns [EObject current=null] : iv_ruleLights= ruleLights EOF ;
    public final EObject entryRuleLights() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLights = null;


        try {
            // InternalThymioDSL.g:671:47: (iv_ruleLights= ruleLights EOF )
            // InternalThymioDSL.g:672:2: iv_ruleLights= ruleLights EOF
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
    // InternalThymioDSL.g:678:1: ruleLights returns [EObject current=null] : ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) ) ;
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
            // InternalThymioDSL.g:684:2: ( ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) ) )
            // InternalThymioDSL.g:685:2: ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) )
            {
            // InternalThymioDSL.g:685:2: ( () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) ) )
            // InternalThymioDSL.g:686:3: () (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) ) (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) )
            {
            // InternalThymioDSL.g:686:3: ()
            // InternalThymioDSL.g:687:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightsAccess().getLightsAction_0(),
            					current);
            			

            }

            // InternalThymioDSL.g:693:3: (otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' ) )
            // InternalThymioDSL.g:694:4: otherlv_1= 'top_light:' ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' )
            {
            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            				newLeafNode(otherlv_1, grammarAccess.getLightsAccess().getTop_lightKeyword_1_0());
            			
            // InternalThymioDSL.g:698:4: ( (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) ) | otherlv_4= 'off' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:699:5: (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) )
                    {
                    // InternalThymioDSL.g:699:5: (otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) ) )
                    // InternalThymioDSL.g:700:6: otherlv_2= 'on' ( (lv_topLight_3_0= ruleRGB ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_22); 

                    						newLeafNode(otherlv_2, grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0());
                    					
                    // InternalThymioDSL.g:704:6: ( (lv_topLight_3_0= ruleRGB ) )
                    // InternalThymioDSL.g:705:7: (lv_topLight_3_0= ruleRGB )
                    {
                    // InternalThymioDSL.g:705:7: (lv_topLight_3_0= ruleRGB )
                    // InternalThymioDSL.g:706:8: lv_topLight_3_0= ruleRGB
                    {

                    								newCompositeNode(grammarAccess.getLightsAccess().getTopLightRGBParserRuleCall_1_1_0_1_0());
                    							
                    pushFollow(FOLLOW_23);
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
                    // InternalThymioDSL.g:725:5: otherlv_4= 'off'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_23); 

                    					newLeafNode(otherlv_4, grammarAccess.getLightsAccess().getOffKeyword_1_1_1());
                    				

                    }
                    break;

            }


            }

            // InternalThymioDSL.g:731:3: (otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' ) )
            // InternalThymioDSL.g:732:4: otherlv_5= 'bottom_light:' ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' )
            {
            otherlv_5=(Token)match(input,33,FOLLOW_21); 

            				newLeafNode(otherlv_5, grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0());
            			
            // InternalThymioDSL.g:736:4: ( (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) ) | otherlv_8= 'off' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:737:5: (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) )
                    {
                    // InternalThymioDSL.g:737:5: (otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) ) )
                    // InternalThymioDSL.g:738:6: otherlv_6= 'on' ( (lv_bottomLight_7_0= ruleRGB ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_22); 

                    						newLeafNode(otherlv_6, grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0());
                    					
                    // InternalThymioDSL.g:742:6: ( (lv_bottomLight_7_0= ruleRGB ) )
                    // InternalThymioDSL.g:743:7: (lv_bottomLight_7_0= ruleRGB )
                    {
                    // InternalThymioDSL.g:743:7: (lv_bottomLight_7_0= ruleRGB )
                    // InternalThymioDSL.g:744:8: lv_bottomLight_7_0= ruleRGB
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
                    // InternalThymioDSL.g:763:5: otherlv_8= 'off'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_2); 

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
    // InternalThymioDSL.g:773:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalThymioDSL.g:773:44: (iv_ruleRGB= ruleRGB EOF )
            // InternalThymioDSL.g:774:2: iv_ruleRGB= ruleRGB EOF
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
    // InternalThymioDSL.g:780:1: ruleRGB returns [EObject current=null] : (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' ) ;
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
            // InternalThymioDSL.g:786:2: ( (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' ) )
            // InternalThymioDSL.g:787:2: (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' )
            {
            // InternalThymioDSL.g:787:2: (otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')' )
            // InternalThymioDSL.g:788:3: otherlv_0= '(' ( (lv_red_1_0= ruleAddition ) ) otherlv_2= ',' ( (lv_green_3_0= ruleAddition ) ) otherlv_4= ',' ( (lv_blue_5_0= ruleAddition ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0());
            		
            // InternalThymioDSL.g:792:3: ( (lv_red_1_0= ruleAddition ) )
            // InternalThymioDSL.g:793:4: (lv_red_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:793:4: (lv_red_1_0= ruleAddition )
            // InternalThymioDSL.g:794:5: lv_red_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getRedAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_2=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRGBAccess().getCommaKeyword_2());
            		
            // InternalThymioDSL.g:815:3: ( (lv_green_3_0= ruleAddition ) )
            // InternalThymioDSL.g:816:4: (lv_green_3_0= ruleAddition )
            {
            // InternalThymioDSL.g:816:4: (lv_green_3_0= ruleAddition )
            // InternalThymioDSL.g:817:5: lv_green_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getGreenAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_4=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getRGBAccess().getCommaKeyword_4());
            		
            // InternalThymioDSL.g:838:3: ( (lv_blue_5_0= ruleAddition ) )
            // InternalThymioDSL.g:839:4: (lv_blue_5_0= ruleAddition )
            {
            // InternalThymioDSL.g:839:4: (lv_blue_5_0= ruleAddition )
            // InternalThymioDSL.g:840:5: lv_blue_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getRGBAccess().getBlueAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    // InternalThymioDSL.g:865:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalThymioDSL.g:865:46: (iv_ruleSound= ruleSound EOF )
            // InternalThymioDSL.g:866:2: iv_ruleSound= ruleSound EOF
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
    // InternalThymioDSL.g:872:1: ruleSound returns [EObject current=null] : (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pitch_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:878:2: ( (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) ) )
            // InternalThymioDSL.g:879:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) )
            {
            // InternalThymioDSL.g:879:2: (otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) )
            // InternalThymioDSL.g:880:3: otherlv_0= 'note:' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getNoteKeyword_0());
            		
            // InternalThymioDSL.g:884:3: ( (lv_pitch_1_0= ruleAddition ) )
            // InternalThymioDSL.g:885:4: (lv_pitch_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:885:4: (lv_pitch_1_0= ruleAddition )
            // InternalThymioDSL.g:886:5: lv_pitch_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalThymioDSL.g:903:3: ( (lv_duration_2_0= ruleNoteDuration ) )
            // InternalThymioDSL.g:904:4: (lv_duration_2_0= ruleNoteDuration )
            {
            // InternalThymioDSL.g:904:4: (lv_duration_2_0= ruleNoteDuration )
            // InternalThymioDSL.g:905:5: lv_duration_2_0= ruleNoteDuration
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
    // InternalThymioDSL.g:926:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalThymioDSL.g:926:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalThymioDSL.g:927:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalThymioDSL.g:933:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:939:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalThymioDSL.g:940:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalThymioDSL.g:940:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalThymioDSL.g:941:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalThymioDSL.g:941:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:942:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_27); 

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
    // InternalThymioDSL.g:959:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalThymioDSL.g:959:47: (iv_ruleEString= ruleEString EOF )
            // InternalThymioDSL.g:960:2: iv_ruleEString= ruleEString EOF
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
    // InternalThymioDSL.g:966:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:972:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalThymioDSL.g:973:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalThymioDSL.g:973:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:974:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:982:3: this_ID_1= RULE_ID
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
    // InternalThymioDSL.g:993:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalThymioDSL.g:993:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalThymioDSL.g:994:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalThymioDSL.g:1000:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1006:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalThymioDSL.g:1007:2: (kw= 'true' | kw= 'false' )
            {
            // InternalThymioDSL.g:1007:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:1008:3: kw= 'true'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1014:3: kw= 'false'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalThymioDSL.g:1023:1: entryRuleNoteDuration returns [String current=null] : iv_ruleNoteDuration= ruleNoteDuration EOF ;
    public final String entryRuleNoteDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteDuration = null;


        try {
            // InternalThymioDSL.g:1023:52: (iv_ruleNoteDuration= ruleNoteDuration EOF )
            // InternalThymioDSL.g:1024:2: iv_ruleNoteDuration= ruleNoteDuration EOF
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
    // InternalThymioDSL.g:1030:1: ruleNoteDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'short' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleNoteDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1036:2: ( (kw= 'short' | kw= 'long' ) )
            // InternalThymioDSL.g:1037:2: (kw= 'short' | kw= 'long' )
            {
            // InternalThymioDSL.g:1037:2: (kw= 'short' | kw= 'long' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==42) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:1038:3: kw= 'short'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNoteDurationAccess().getShortKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1044:3: kw= 'long'
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
    // InternalThymioDSL.g:1053:1: entryRuleOrtogonal returns [String current=null] : iv_ruleOrtogonal= ruleOrtogonal EOF ;
    public final String entryRuleOrtogonal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrtogonal = null;


        try {
            // InternalThymioDSL.g:1053:49: (iv_ruleOrtogonal= ruleOrtogonal EOF )
            // InternalThymioDSL.g:1054:2: iv_ruleOrtogonal= ruleOrtogonal EOF
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
    // InternalThymioDSL.g:1060:1: ruleOrtogonal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) ;
    public final AntlrDatatypeRuleToken ruleOrtogonal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1066:2: ( (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) )
            // InternalThymioDSL.g:1067:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            {
            // InternalThymioDSL.g:1067:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            case 47:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:1068:3: kw= 'up'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getUpKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1074:3: kw= 'down'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getDownKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1080:3: kw= 'left'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:1086:3: kw= 'right'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getRightKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:1092:3: kw= 'center'
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
    // InternalThymioDSL.g:1101:1: entryRuleBlackWhite returns [String current=null] : iv_ruleBlackWhite= ruleBlackWhite EOF ;
    public final String entryRuleBlackWhite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlackWhite = null;


        try {
            // InternalThymioDSL.g:1101:50: (iv_ruleBlackWhite= ruleBlackWhite EOF )
            // InternalThymioDSL.g:1102:2: iv_ruleBlackWhite= ruleBlackWhite EOF
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
    // InternalThymioDSL.g:1108:1: ruleBlackWhite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleBlackWhite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1114:2: ( (kw= 'black' | kw= 'white' ) )
            // InternalThymioDSL.g:1115:2: (kw= 'black' | kw= 'white' )
            {
            // InternalThymioDSL.g:1115:2: (kw= 'black' | kw= 'white' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            else if ( (LA15_0==49) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:1116:3: kw= 'black'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getBlackKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1122:3: kw= 'white'
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


    // $ANTLR start "entryRuleAddition"
    // InternalThymioDSL.g:1131:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalThymioDSL.g:1131:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalThymioDSL.g:1132:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalThymioDSL.g:1138:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1144:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalThymioDSL.g:1145:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalThymioDSL.g:1145:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalThymioDSL.g:1146:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1154:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38||LA17_0==50) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThymioDSL.g:1155:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalThymioDSL.g:1155:4: ()
            	    // InternalThymioDSL.g:1156:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalThymioDSL.g:1162:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalThymioDSL.g:1163:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalThymioDSL.g:1163:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalThymioDSL.g:1164:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalThymioDSL.g:1164:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==50) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==38) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalThymioDSL.g:1165:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,50,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalThymioDSL.g:1176:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,38,FOLLOW_19); 

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

            	    // InternalThymioDSL.g:1189:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalThymioDSL.g:1190:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalThymioDSL.g:1190:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalThymioDSL.g:1191:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalThymioDSL.g:1213:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalThymioDSL.g:1213:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalThymioDSL.g:1214:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalThymioDSL.g:1220:1: ruleMultiplication returns [EObject current=null] : (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Number_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1226:2: ( (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* ) )
            // InternalThymioDSL.g:1227:2: (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* )
            {
            // InternalThymioDSL.g:1227:2: (this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )* )
            // InternalThymioDSL.g:1228:3: this_Number_0= ruleNumber ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Number_0=ruleNumber();

            state._fsp--;


            			current = this_Number_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1236:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=51 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalThymioDSL.g:1237:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNumber ) )
            	    {
            	    // InternalThymioDSL.g:1237:4: ()
            	    // InternalThymioDSL.g:1238:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalThymioDSL.g:1244:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalThymioDSL.g:1245:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalThymioDSL.g:1245:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalThymioDSL.g:1246:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalThymioDSL.g:1246:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==51) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==52) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalThymioDSL.g:1247:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,51,FOLLOW_19); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalThymioDSL.g:1258:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,52,FOLLOW_19); 

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

            	    // InternalThymioDSL.g:1271:4: ( (lv_right_3_0= ruleNumber ) )
            	    // InternalThymioDSL.g:1272:5: (lv_right_3_0= ruleNumber )
            	    {
            	    // InternalThymioDSL.g:1272:5: (lv_right_3_0= ruleNumber )
            	    // InternalThymioDSL.g:1273:6: lv_right_3_0= ruleNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNumberParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNumber"
    // InternalThymioDSL.g:1295:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalThymioDSL.g:1295:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalThymioDSL.g:1296:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalThymioDSL.g:1302:1: ruleNumber returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject this_Addition_2 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1308:2: ( ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // InternalThymioDSL.g:1309:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // InternalThymioDSL.g:1309:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==34) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalThymioDSL.g:1310:3: ( (lv_value_0_0= ruleEInt ) )
                    {
                    // InternalThymioDSL.g:1310:3: ( (lv_value_0_0= ruleEInt ) )
                    // InternalThymioDSL.g:1311:4: (lv_value_0_0= ruleEInt )
                    {
                    // InternalThymioDSL.g:1311:4: (lv_value_0_0= ruleEInt )
                    // InternalThymioDSL.g:1312:5: lv_value_0_0= ruleEInt
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
                    // InternalThymioDSL.g:1330:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // InternalThymioDSL.g:1330:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // InternalThymioDSL.g:1331:4: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getNumberAccess().getAdditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004400000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004004000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0018000000000002L});

}