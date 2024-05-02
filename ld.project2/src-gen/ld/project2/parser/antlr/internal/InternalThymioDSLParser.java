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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Procedure:'", "'Event:'", "'Actions:'", "'when:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'sensor_is_activated:'", "'bottom_left:'", "'bottom_right:'", "'northwest:'", "'northnorthwest:'", "'north:'", "'northnortheast:'", "'northeast:'", "'move:'", "'toplight:'", "'bottomlight:'", "'sound:'", "'motors:'", "'left:'", "'right:'", "'Note'", "'Pitch:'", "'-'", "'true'", "'false'", "'on'", "'off'", "'('", "','", "')'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'black'", "'white'", "'covered'", "'uncovered'", "'+'", "'*'"
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
    public static final int T__13=13;
    public static final int T__14=14;
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
            					add(
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

                if ( (LA2_0==26) ) {
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
    // InternalThymioDSL.g:195:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'when:' (otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) ) )? (otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) ) )? (otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) ) )? (otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_button_3_0 = null;

        AntlrDatatypeRuleToken lv_tap_5_0 = null;

        AntlrDatatypeRuleToken lv_mic_7_0 = null;

        EObject lv_sensor_9_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:201:2: ( ( () otherlv_1= 'when:' (otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) ) )? (otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) ) )? (otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) ) )? (otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) ) )? ) )
            // InternalThymioDSL.g:202:2: ( () otherlv_1= 'when:' (otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) ) )? (otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) ) )? (otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) ) )? (otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) ) )? )
            {
            // InternalThymioDSL.g:202:2: ( () otherlv_1= 'when:' (otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) ) )? (otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) ) )? (otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) ) )? (otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) ) )? )
            // InternalThymioDSL.g:203:3: () otherlv_1= 'when:' (otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) ) )? (otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) ) )? (otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) ) )? (otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) ) )?
            {
            // InternalThymioDSL.g:203:3: ()
            // InternalThymioDSL.g:204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getWhenKeyword_1());
            		
            // InternalThymioDSL.g:214:3: (otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalThymioDSL.g:215:4: otherlv_2= 'button_is_clicked:' ( (lv_button_3_0= ruleOrtogonal ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventAccess().getButton_is_clickedKeyword_2_0());
                    			
                    // InternalThymioDSL.g:219:4: ( (lv_button_3_0= ruleOrtogonal ) )
                    // InternalThymioDSL.g:220:5: (lv_button_3_0= ruleOrtogonal )
                    {
                    // InternalThymioDSL.g:220:5: (lv_button_3_0= ruleOrtogonal )
                    // InternalThymioDSL.g:221:6: lv_button_3_0= ruleOrtogonal
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_button_3_0=ruleOrtogonal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"button",
                    							lv_button_3_0,
                    							"ld.project2.ThymioDSL.Ortogonal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:239:3: (otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:240:4: otherlv_4= 'robot_is_tapped:' ( (lv_tap_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getRobot_is_tappedKeyword_3_0());
                    			
                    // InternalThymioDSL.g:244:4: ( (lv_tap_5_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:245:5: (lv_tap_5_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:245:5: (lv_tap_5_0= ruleEBoolean )
                    // InternalThymioDSL.g:246:6: lv_tap_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_tap_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"tap",
                    							lv_tap_5_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:264:3: (otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:265:4: otherlv_6= 'sound_is_detected:' ( (lv_mic_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getSound_is_detectedKeyword_4_0());
                    			
                    // InternalThymioDSL.g:269:4: ( (lv_mic_7_0= ruleEBoolean ) )
                    // InternalThymioDSL.g:270:5: (lv_mic_7_0= ruleEBoolean )
                    {
                    // InternalThymioDSL.g:270:5: (lv_mic_7_0= ruleEBoolean )
                    // InternalThymioDSL.g:271:6: lv_mic_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_mic_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"mic",
                    							lv_mic_7_0,
                    							"ld.project2.ThymioDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:289:3: (otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:290:4: otherlv_8= 'sensor_is_activated:' ( (lv_sensor_9_0= ruleSensor ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getSensor_is_activatedKeyword_5_0());
                    			
                    // InternalThymioDSL.g:294:4: ( (lv_sensor_9_0= ruleSensor ) )
                    // InternalThymioDSL.g:295:5: (lv_sensor_9_0= ruleSensor )
                    {
                    // InternalThymioDSL.g:295:5: (lv_sensor_9_0= ruleSensor )
                    // InternalThymioDSL.g:296:6: lv_sensor_9_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sensor_9_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"sensor",
                    							lv_sensor_9_0,
                    							"ld.project2.ThymioDSL.Sensor");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSensor"
    // InternalThymioDSL.g:318:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalThymioDSL.g:318:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalThymioDSL.g:319:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalThymioDSL.g:325:1: ruleSensor returns [EObject current=null] : ( () (otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) ) )? (otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) ) )? (otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) ) )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_bottomLeftSensor_2_0 = null;

        AntlrDatatypeRuleToken lv_bottomRightSensor_4_0 = null;

        AntlrDatatypeRuleToken lv_northWest_6_0 = null;

        AntlrDatatypeRuleToken lv_northNorthWest_8_0 = null;

        AntlrDatatypeRuleToken lv_north_10_0 = null;

        AntlrDatatypeRuleToken lv_northNorthEast_12_0 = null;

        AntlrDatatypeRuleToken lv_northEast_14_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:331:2: ( ( () (otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) ) )? (otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) ) )? (otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) ) )? ) )
            // InternalThymioDSL.g:332:2: ( () (otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) ) )? (otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) ) )? (otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) ) )? )
            {
            // InternalThymioDSL.g:332:2: ( () (otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) ) )? (otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) ) )? (otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) ) )? )
            // InternalThymioDSL.g:333:3: () (otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) ) )? (otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) ) )? (otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) ) )? (otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) ) )? (otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) ) )? (otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) ) )? (otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) ) )?
            {
            // InternalThymioDSL.g:333:3: ()
            // InternalThymioDSL.g:334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            // InternalThymioDSL.g:340:3: (otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:341:4: otherlv_1= 'bottom_left:' ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getBottom_leftKeyword_1_0());
                    			
                    // InternalThymioDSL.g:345:4: ( (lv_bottomLeftSensor_2_0= ruleBlackWhite ) )
                    // InternalThymioDSL.g:346:5: (lv_bottomLeftSensor_2_0= ruleBlackWhite )
                    {
                    // InternalThymioDSL.g:346:5: (lv_bottomLeftSensor_2_0= ruleBlackWhite )
                    // InternalThymioDSL.g:347:6: lv_bottomLeftSensor_2_0= ruleBlackWhite
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_bottomLeftSensor_2_0=ruleBlackWhite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"bottomLeftSensor",
                    							lv_bottomLeftSensor_2_0,
                    							"ld.project2.ThymioDSL.BlackWhite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:365:3: (otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:366:4: otherlv_3= 'bottom_right:' ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getBottom_rightKeyword_2_0());
                    			
                    // InternalThymioDSL.g:370:4: ( (lv_bottomRightSensor_4_0= ruleBlackWhite ) )
                    // InternalThymioDSL.g:371:5: (lv_bottomRightSensor_4_0= ruleBlackWhite )
                    {
                    // InternalThymioDSL.g:371:5: (lv_bottomRightSensor_4_0= ruleBlackWhite )
                    // InternalThymioDSL.g:372:6: lv_bottomRightSensor_4_0= ruleBlackWhite
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_bottomRightSensor_4_0=ruleBlackWhite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"bottomRightSensor",
                    							lv_bottomRightSensor_4_0,
                    							"ld.project2.ThymioDSL.BlackWhite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:390:3: (otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:391:4: otherlv_5= 'northwest:' ( (lv_northWest_6_0= ruleSensorStatus ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getNorthwestKeyword_3_0());
                    			
                    // InternalThymioDSL.g:395:4: ( (lv_northWest_6_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:396:5: (lv_northWest_6_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:396:5: (lv_northWest_6_0= ruleSensorStatus )
                    // InternalThymioDSL.g:397:6: lv_northWest_6_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getNorthWestSensorStatusParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_northWest_6_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"northWest",
                    							lv_northWest_6_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:415:3: (otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:416:4: otherlv_7= 'northnorthwest:' ( (lv_northNorthWest_8_0= ruleSensorStatus ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getNorthnorthwestKeyword_4_0());
                    			
                    // InternalThymioDSL.g:420:4: ( (lv_northNorthWest_8_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:421:5: (lv_northNorthWest_8_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:421:5: (lv_northNorthWest_8_0= ruleSensorStatus )
                    // InternalThymioDSL.g:422:6: lv_northNorthWest_8_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getNorthNorthWestSensorStatusParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_northNorthWest_8_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"northNorthWest",
                    							lv_northNorthWest_8_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:440:3: (otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:441:4: otherlv_9= 'north:' ( (lv_north_10_0= ruleSensorStatus ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getNorthKeyword_5_0());
                    			
                    // InternalThymioDSL.g:445:4: ( (lv_north_10_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:446:5: (lv_north_10_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:446:5: (lv_north_10_0= ruleSensorStatus )
                    // InternalThymioDSL.g:447:6: lv_north_10_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getNorthSensorStatusParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_north_10_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"north",
                    							lv_north_10_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:465:3: (otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:466:4: otherlv_11= 'northnortheast:' ( (lv_northNorthEast_12_0= ruleSensorStatus ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getNorthnortheastKeyword_6_0());
                    			
                    // InternalThymioDSL.g:470:4: ( (lv_northNorthEast_12_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:471:5: (lv_northNorthEast_12_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:471:5: (lv_northNorthEast_12_0= ruleSensorStatus )
                    // InternalThymioDSL.g:472:6: lv_northNorthEast_12_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getNorthNorthEastSensorStatusParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_northNorthEast_12_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"northNorthEast",
                    							lv_northNorthEast_12_0,
                    							"ld.project2.ThymioDSL.SensorStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThymioDSL.g:490:3: (otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:491:4: otherlv_13= 'northeast:' ( (lv_northEast_14_0= ruleSensorStatus ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getNortheastKeyword_7_0());
                    			
                    // InternalThymioDSL.g:495:4: ( (lv_northEast_14_0= ruleSensorStatus ) )
                    // InternalThymioDSL.g:496:5: (lv_northEast_14_0= ruleSensorStatus )
                    {
                    // InternalThymioDSL.g:496:5: (lv_northEast_14_0= ruleSensorStatus )
                    // InternalThymioDSL.g:497:6: lv_northEast_14_0= ruleSensorStatus
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getNorthEastSensorStatusParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_northEast_14_0=ruleSensorStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"northEast",
                    							lv_northEast_14_0,
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleAction"
    // InternalThymioDSL.g:519:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalThymioDSL.g:519:47: (iv_ruleAction= ruleAction EOF )
            // InternalThymioDSL.g:520:2: iv_ruleAction= ruleAction EOF
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
    // InternalThymioDSL.g:526:1: ruleAction returns [EObject current=null] : (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotor ) ) otherlv_2= 'toplight:' ( (lv_topLight_3_0= ruleOnOff ) ) otherlv_4= 'bottomlight:' ( (lv_bottomLight_5_0= ruleOnOff ) ) otherlv_6= 'sound:' ( (lv_sound_7_0= ruleSound ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_move_1_0 = null;

        AntlrDatatypeRuleToken lv_topLight_3_0 = null;

        AntlrDatatypeRuleToken lv_bottomLight_5_0 = null;

        EObject lv_sound_7_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:532:2: ( (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotor ) ) otherlv_2= 'toplight:' ( (lv_topLight_3_0= ruleOnOff ) ) otherlv_4= 'bottomlight:' ( (lv_bottomLight_5_0= ruleOnOff ) ) otherlv_6= 'sound:' ( (lv_sound_7_0= ruleSound ) ) ) )
            // InternalThymioDSL.g:533:2: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotor ) ) otherlv_2= 'toplight:' ( (lv_topLight_3_0= ruleOnOff ) ) otherlv_4= 'bottomlight:' ( (lv_bottomLight_5_0= ruleOnOff ) ) otherlv_6= 'sound:' ( (lv_sound_7_0= ruleSound ) ) )
            {
            // InternalThymioDSL.g:533:2: (otherlv_0= 'move:' ( (lv_move_1_0= ruleMotor ) ) otherlv_2= 'toplight:' ( (lv_topLight_3_0= ruleOnOff ) ) otherlv_4= 'bottomlight:' ( (lv_bottomLight_5_0= ruleOnOff ) ) otherlv_6= 'sound:' ( (lv_sound_7_0= ruleSound ) ) )
            // InternalThymioDSL.g:534:3: otherlv_0= 'move:' ( (lv_move_1_0= ruleMotor ) ) otherlv_2= 'toplight:' ( (lv_topLight_3_0= ruleOnOff ) ) otherlv_4= 'bottomlight:' ( (lv_bottomLight_5_0= ruleOnOff ) ) otherlv_6= 'sound:' ( (lv_sound_7_0= ruleSound ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0());
            		
            // InternalThymioDSL.g:538:3: ( (lv_move_1_0= ruleMotor ) )
            // InternalThymioDSL.g:539:4: (lv_move_1_0= ruleMotor )
            {
            // InternalThymioDSL.g:539:4: (lv_move_1_0= ruleMotor )
            // InternalThymioDSL.g:540:5: lv_move_1_0= ruleMotor
            {

            					newCompositeNode(grammarAccess.getActionAccess().getMoveMotorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_move_1_0=ruleMotor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_1_0,
            						"ld.project2.ThymioDSL.Motor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToplightKeyword_2());
            		
            // InternalThymioDSL.g:561:3: ( (lv_topLight_3_0= ruleOnOff ) )
            // InternalThymioDSL.g:562:4: (lv_topLight_3_0= ruleOnOff )
            {
            // InternalThymioDSL.g:562:4: (lv_topLight_3_0= ruleOnOff )
            // InternalThymioDSL.g:563:5: lv_topLight_3_0= ruleOnOff
            {

            					newCompositeNode(grammarAccess.getActionAccess().getTopLightOnOffParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_topLight_3_0=ruleOnOff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"topLight",
            						lv_topLight_3_0,
            						"ld.project2.ThymioDSL.OnOff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getBottomlightKeyword_4());
            		
            // InternalThymioDSL.g:584:3: ( (lv_bottomLight_5_0= ruleOnOff ) )
            // InternalThymioDSL.g:585:4: (lv_bottomLight_5_0= ruleOnOff )
            {
            // InternalThymioDSL.g:585:4: (lv_bottomLight_5_0= ruleOnOff )
            // InternalThymioDSL.g:586:5: lv_bottomLight_5_0= ruleOnOff
            {

            					newCompositeNode(grammarAccess.getActionAccess().getBottomLightOnOffParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_bottomLight_5_0=ruleOnOff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"bottomLight",
            						lv_bottomLight_5_0,
            						"ld.project2.ThymioDSL.OnOff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getSoundKeyword_6());
            		
            // InternalThymioDSL.g:607:3: ( (lv_sound_7_0= ruleSound ) )
            // InternalThymioDSL.g:608:4: (lv_sound_7_0= ruleSound )
            {
            // InternalThymioDSL.g:608:4: (lv_sound_7_0= ruleSound )
            // InternalThymioDSL.g:609:5: lv_sound_7_0= ruleSound
            {

            					newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_sound_7_0=ruleSound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					add(
            						current,
            						"sound",
            						lv_sound_7_0,
            						"ld.project2.ThymioDSL.Sound");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMotor"
    // InternalThymioDSL.g:630:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalThymioDSL.g:630:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalThymioDSL.g:631:2: iv_ruleMotor= ruleMotor EOF
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
    // InternalThymioDSL.g:637:1: ruleMotor returns [EObject current=null] : (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:643:2: ( (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) ) )
            // InternalThymioDSL.g:644:2: (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) )
            {
            // InternalThymioDSL.g:644:2: (otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) ) )
            // InternalThymioDSL.g:645:3: otherlv_0= 'motors:' otherlv_1= 'left:' ( (lv_left_2_0= ruleAddition ) ) otherlv_3= 'right:' ( (lv_right_4_0= ruleAddition ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getMotorAccess().getMotorsKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getMotorAccess().getLeftKeyword_1());
            		
            // InternalThymioDSL.g:653:3: ( (lv_left_2_0= ruleAddition ) )
            // InternalThymioDSL.g:654:4: (lv_left_2_0= ruleAddition )
            {
            // InternalThymioDSL.g:654:4: (lv_left_2_0= ruleAddition )
            // InternalThymioDSL.g:655:5: lv_left_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getMotorAccess().getLeftAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getMotorAccess().getRightKeyword_3());
            		
            // InternalThymioDSL.g:676:3: ( (lv_right_4_0= ruleAddition ) )
            // InternalThymioDSL.g:677:4: (lv_right_4_0= ruleAddition )
            {
            // InternalThymioDSL.g:677:4: (lv_right_4_0= ruleAddition )
            // InternalThymioDSL.g:678:5: lv_right_4_0= ruleAddition
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
    // InternalThymioDSL.g:699:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalThymioDSL.g:699:46: (iv_ruleSound= ruleSound EOF )
            // InternalThymioDSL.g:700:2: iv_ruleSound= ruleSound EOF
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
    // InternalThymioDSL.g:706:1: ruleSound returns [EObject current=null] : (otherlv_0= 'Note' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) ) )* ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_pitch_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_2_0 = null;

        EObject lv_pitch_5_0 = null;

        AntlrDatatypeRuleToken lv_duration_6_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:712:2: ( (otherlv_0= 'Note' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) ) )* ) )
            // InternalThymioDSL.g:713:2: (otherlv_0= 'Note' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) ) )* )
            {
            // InternalThymioDSL.g:713:2: (otherlv_0= 'Note' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) ) )* )
            // InternalThymioDSL.g:714:3: otherlv_0= 'Note' ( (lv_pitch_1_0= ruleAddition ) ) ( (lv_duration_2_0= ruleNoteDuration ) ) (otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getNoteKeyword_0());
            		
            // InternalThymioDSL.g:718:3: ( (lv_pitch_1_0= ruleAddition ) )
            // InternalThymioDSL.g:719:4: (lv_pitch_1_0= ruleAddition )
            {
            // InternalThymioDSL.g:719:4: (lv_pitch_1_0= ruleAddition )
            // InternalThymioDSL.g:720:5: lv_pitch_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalThymioDSL.g:737:3: ( (lv_duration_2_0= ruleNoteDuration ) )
            // InternalThymioDSL.g:738:4: (lv_duration_2_0= ruleNoteDuration )
            {
            // InternalThymioDSL.g:738:4: (lv_duration_2_0= ruleNoteDuration )
            // InternalThymioDSL.g:739:5: lv_duration_2_0= ruleNoteDuration
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalThymioDSL.g:756:3: (otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalThymioDSL.g:757:4: otherlv_3= 'Note' otherlv_4= 'Pitch:' ( (lv_pitch_5_0= ruleAddition ) ) ( (lv_duration_6_0= ruleNoteDuration ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_36); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSoundAccess().getNoteKeyword_3_0());
            	    			
            	    otherlv_4=(Token)match(input,34,FOLLOW_32); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSoundAccess().getPitchKeyword_3_1());
            	    			
            	    // InternalThymioDSL.g:765:4: ( (lv_pitch_5_0= ruleAddition ) )
            	    // InternalThymioDSL.g:766:5: (lv_pitch_5_0= ruleAddition )
            	    {
            	    // InternalThymioDSL.g:766:5: (lv_pitch_5_0= ruleAddition )
            	    // InternalThymioDSL.g:767:6: lv_pitch_5_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_pitch_5_0=ruleAddition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pitch",
            	    							lv_pitch_5_0,
            	    							"ld.project2.ThymioDSL.Addition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalThymioDSL.g:784:4: ( (lv_duration_6_0= ruleNoteDuration ) )
            	    // InternalThymioDSL.g:785:5: (lv_duration_6_0= ruleNoteDuration )
            	    {
            	    // InternalThymioDSL.g:785:5: (lv_duration_6_0= ruleNoteDuration )
            	    // InternalThymioDSL.g:786:6: lv_duration_6_0= ruleNoteDuration
            	    {

            	    						newCompositeNode(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_duration_6_0=ruleNoteDuration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSoundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"duration",
            	    							lv_duration_6_0,
            	    							"ld.project2.ThymioDSL.NoteDuration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalThymioDSL.g:808:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalThymioDSL.g:808:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalThymioDSL.g:809:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalThymioDSL.g:815:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:821:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalThymioDSL.g:822:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalThymioDSL.g:822:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalThymioDSL.g:823:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalThymioDSL.g:823:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:824:4: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_37); 

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
    // InternalThymioDSL.g:841:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalThymioDSL.g:841:47: (iv_ruleEString= ruleEString EOF )
            // InternalThymioDSL.g:842:2: iv_ruleEString= ruleEString EOF
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
    // InternalThymioDSL.g:848:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:854:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalThymioDSL.g:855:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalThymioDSL.g:855:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalThymioDSL.g:856:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:864:3: this_ID_1= RULE_ID
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
    // InternalThymioDSL.g:875:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalThymioDSL.g:875:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalThymioDSL.g:876:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalThymioDSL.g:882:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:888:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalThymioDSL.g:889:2: (kw= 'true' | kw= 'false' )
            {
            // InternalThymioDSL.g:889:2: (kw= 'true' | kw= 'false' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalThymioDSL.g:890:3: kw= 'true'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:896:3: kw= 'false'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalThymioDSL.g:905:1: entryRuleOnOff returns [String current=null] : iv_ruleOnOff= ruleOnOff EOF ;
    public final String entryRuleOnOff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOnOff = null;


        try {
            // InternalThymioDSL.g:905:45: (iv_ruleOnOff= ruleOnOff EOF )
            // InternalThymioDSL.g:906:2: iv_ruleOnOff= ruleOnOff EOF
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
    // InternalThymioDSL.g:912:1: ruleOnOff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'on' this_RBG_1= ruleRBG ) | kw= 'off' ) ;
    public final AntlrDatatypeRuleToken ruleOnOff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_RBG_1 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:918:2: ( ( (kw= 'on' this_RBG_1= ruleRBG ) | kw= 'off' ) )
            // InternalThymioDSL.g:919:2: ( (kw= 'on' this_RBG_1= ruleRBG ) | kw= 'off' )
            {
            // InternalThymioDSL.g:919:2: ( (kw= 'on' this_RBG_1= ruleRBG ) | kw= 'off' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalThymioDSL.g:920:3: (kw= 'on' this_RBG_1= ruleRBG )
                    {
                    // InternalThymioDSL.g:920:3: (kw= 'on' this_RBG_1= ruleRBG )
                    // InternalThymioDSL.g:921:4: kw= 'on' this_RBG_1= ruleRBG
                    {
                    kw=(Token)match(input,38,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOnOffAccess().getOnKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getOnOffAccess().getRBGParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_RBG_1=ruleRBG();

                    state._fsp--;


                    				current.merge(this_RBG_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:938:3: kw= 'off'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRBG"
    // InternalThymioDSL.g:947:1: entryRuleRBG returns [String current=null] : iv_ruleRBG= ruleRBG EOF ;
    public final String entryRuleRBG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRBG = null;


        try {
            // InternalThymioDSL.g:947:43: (iv_ruleRBG= ruleRBG EOF )
            // InternalThymioDSL.g:948:2: iv_ruleRBG= ruleRBG EOF
            {
             newCompositeNode(grammarAccess.getRBGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRBG=ruleRBG();

            state._fsp--;

             current =iv_ruleRBG.getText(); 
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
    // $ANTLR end "entryRuleRBG"


    // $ANTLR start "ruleRBG"
    // InternalThymioDSL.g:954:1: ruleRBG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleRBG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EInt_1 = null;

        AntlrDatatypeRuleToken this_EInt_3 = null;

        AntlrDatatypeRuleToken this_EInt_5 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:960:2: ( (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' ) )
            // InternalThymioDSL.g:961:2: (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' )
            {
            // InternalThymioDSL.g:961:2: (kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')' )
            // InternalThymioDSL.g:962:3: kw= '(' this_EInt_1= ruleEInt kw= ',' this_EInt_3= ruleEInt kw= ',' this_EInt_5= ruleEInt kw= ')'
            {
            kw=(Token)match(input,40,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRBGAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRBGAccess().getEIntParserRuleCall_1());
            		
            pushFollow(FOLLOW_40);
            this_EInt_1=ruleEInt();

            state._fsp--;


            			current.merge(this_EInt_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,41,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRBGAccess().getCommaKeyword_2());
            		

            			newCompositeNode(grammarAccess.getRBGAccess().getEIntParserRuleCall_3());
            		
            pushFollow(FOLLOW_40);
            this_EInt_3=ruleEInt();

            state._fsp--;


            			current.merge(this_EInt_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,41,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRBGAccess().getCommaKeyword_4());
            		

            			newCompositeNode(grammarAccess.getRBGAccess().getEIntParserRuleCall_5());
            		
            pushFollow(FOLLOW_41);
            this_EInt_5=ruleEInt();

            state._fsp--;


            			current.merge(this_EInt_5);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,42,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRBGAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleRBG"


    // $ANTLR start "entryRuleNoteDuration"
    // InternalThymioDSL.g:1016:1: entryRuleNoteDuration returns [String current=null] : iv_ruleNoteDuration= ruleNoteDuration EOF ;
    public final String entryRuleNoteDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteDuration = null;


        try {
            // InternalThymioDSL.g:1016:52: (iv_ruleNoteDuration= ruleNoteDuration EOF )
            // InternalThymioDSL.g:1017:2: iv_ruleNoteDuration= ruleNoteDuration EOF
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
    // InternalThymioDSL.g:1023:1: ruleNoteDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'short' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleNoteDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1029:2: ( (kw= 'short' | kw= 'long' ) )
            // InternalThymioDSL.g:1030:2: (kw= 'short' | kw= 'long' )
            {
            // InternalThymioDSL.g:1030:2: (kw= 'short' | kw= 'long' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            else if ( (LA19_0==44) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalThymioDSL.g:1031:3: kw= 'short'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNoteDurationAccess().getShortKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1037:3: kw= 'long'
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
    // InternalThymioDSL.g:1046:1: entryRuleOrtogonal returns [String current=null] : iv_ruleOrtogonal= ruleOrtogonal EOF ;
    public final String entryRuleOrtogonal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrtogonal = null;


        try {
            // InternalThymioDSL.g:1046:49: (iv_ruleOrtogonal= ruleOrtogonal EOF )
            // InternalThymioDSL.g:1047:2: iv_ruleOrtogonal= ruleOrtogonal EOF
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
    // InternalThymioDSL.g:1053:1: ruleOrtogonal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) ;
    public final AntlrDatatypeRuleToken ruleOrtogonal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1059:2: ( (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' ) )
            // InternalThymioDSL.g:1060:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            {
            // InternalThymioDSL.g:1060:2: (kw= 'up' | kw= 'down' | kw= 'left' | kw= 'right' | kw= 'center' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 47:
                {
                alt20=3;
                }
                break;
            case 48:
                {
                alt20=4;
                }
                break;
            case 49:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalThymioDSL.g:1061:3: kw= 'up'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getUpKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1067:3: kw= 'down'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getDownKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:1073:3: kw= 'left'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getLeftKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:1079:3: kw= 'right'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrtogonalAccess().getRightKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:1085:3: kw= 'center'
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


    // $ANTLR start "entryRuleBlackWhite"
    // InternalThymioDSL.g:1094:1: entryRuleBlackWhite returns [String current=null] : iv_ruleBlackWhite= ruleBlackWhite EOF ;
    public final String entryRuleBlackWhite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlackWhite = null;


        try {
            // InternalThymioDSL.g:1094:50: (iv_ruleBlackWhite= ruleBlackWhite EOF )
            // InternalThymioDSL.g:1095:2: iv_ruleBlackWhite= ruleBlackWhite EOF
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
    // InternalThymioDSL.g:1101:1: ruleBlackWhite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleBlackWhite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1107:2: ( (kw= 'black' | kw= 'white' ) )
            // InternalThymioDSL.g:1108:2: (kw= 'black' | kw= 'white' )
            {
            // InternalThymioDSL.g:1108:2: (kw= 'black' | kw= 'white' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            else if ( (LA21_0==51) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalThymioDSL.g:1109:3: kw= 'black'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBlackWhiteAccess().getBlackKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1115:3: kw= 'white'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalThymioDSL.g:1124:1: entryRuleSensorStatus returns [String current=null] : iv_ruleSensorStatus= ruleSensorStatus EOF ;
    public final String entryRuleSensorStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSensorStatus = null;


        try {
            // InternalThymioDSL.g:1124:52: (iv_ruleSensorStatus= ruleSensorStatus EOF )
            // InternalThymioDSL.g:1125:2: iv_ruleSensorStatus= ruleSensorStatus EOF
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
    // InternalThymioDSL.g:1131:1: ruleSensorStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'covered' | kw= 'uncovered' ) ;
    public final AntlrDatatypeRuleToken ruleSensorStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalThymioDSL.g:1137:2: ( (kw= 'covered' | kw= 'uncovered' ) )
            // InternalThymioDSL.g:1138:2: (kw= 'covered' | kw= 'uncovered' )
            {
            // InternalThymioDSL.g:1138:2: (kw= 'covered' | kw= 'uncovered' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            else if ( (LA22_0==53) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalThymioDSL.g:1139:3: kw= 'covered'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorStatusAccess().getCoveredKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:1145:3: kw= 'uncovered'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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
    // InternalThymioDSL.g:1154:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalThymioDSL.g:1154:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalThymioDSL.g:1155:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalThymioDSL.g:1161:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1167:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalThymioDSL.g:1168:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalThymioDSL.g:1168:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalThymioDSL.g:1169:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1177:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==54) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalThymioDSL.g:1178:4: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalThymioDSL.g:1178:4: ()
            	    // InternalThymioDSL.g:1179:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalThymioDSL.g:1189:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalThymioDSL.g:1190:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalThymioDSL.g:1190:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalThymioDSL.g:1191:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
    // InternalThymioDSL.g:1220:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1226:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalThymioDSL.g:1227:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalThymioDSL.g:1227:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalThymioDSL.g:1228:3: this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalThymioDSL.g:1236:3: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==55) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalThymioDSL.g:1237:4: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalThymioDSL.g:1237:4: ()
            	    // InternalThymioDSL.g:1238:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalThymioDSL.g:1248:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalThymioDSL.g:1249:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalThymioDSL.g:1249:5: (lv_right_3_0= rulePrimary )
            	    // InternalThymioDSL.g:1250:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ld.project2.ThymioDSL.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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


    // $ANTLR start "entryRulePrimary"
    // InternalThymioDSL.g:1272:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalThymioDSL.g:1272:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalThymioDSL.g:1273:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalThymioDSL.g:1279:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject this_Addition_2 = null;



        	enterRule();

        try {
            // InternalThymioDSL.g:1285:2: ( ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // InternalThymioDSL.g:1286:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // InternalThymioDSL.g:1286:2: ( ( (lv_value_0_0= ruleEInt ) ) | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==35) ) {
                alt25=1;
            }
            else if ( (LA25_0==40) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalThymioDSL.g:1287:3: ( (lv_value_0_0= ruleEInt ) )
                    {
                    // InternalThymioDSL.g:1287:3: ( (lv_value_0_0= ruleEInt ) )
                    // InternalThymioDSL.g:1288:4: (lv_value_0_0= ruleEInt )
                    {
                    // InternalThymioDSL.g:1288:4: (lv_value_0_0= ruleEInt )
                    // InternalThymioDSL.g:1289:5: lv_value_0_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getPrimaryAccess().getValueEIntParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryRule());
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
                    // InternalThymioDSL.g:1307:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // InternalThymioDSL.g:1307:3: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // InternalThymioDSL.g:1308:4: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_41);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010800000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000002L});

}