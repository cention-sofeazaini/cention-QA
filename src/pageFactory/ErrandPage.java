package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrandPage {

	WebDriver driver;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='internalCommentMsgundefined']")
	WebElement collabText;
	
	@FindBy(how = How.CLASS_NAME, using = "icon-collaboration-fill")
	WebElement openCollabToggle;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_closeAcquireErrand']")
	WebElement closeAcquireErrand;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='collab-recipients-tooltip']")
	WebElement collabQuery;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tab_reply']")
	WebElement replyButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tab_internal-comment']")
	WebElement internalCommentTab;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tab_question']")
	WebElement questionButton;
	
	@FindBy(how = How.CLASS_NAME, using = "text")
	WebElement textInInternalComment;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_edit']")
	WebElement editInternalCommentButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='new']")
	WebElement newInternalCommentButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tab_collaborate']")
	WebElement collaborateButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='clickable_title_COLLABORATION']")
	WebElement openCollaborateDropDown;
	
	//@FindBy(how = How.CSS, using = "div.msg.errand-message-group.collaboration.collapsed > div.message-group > div.waiting-on-message.ee-thread > label > i.icon-chevron-down")
	@FindBy(how = How.CLASS_NAME, using ="expand-ee-thread")
	WebElement expandCollaborateThread;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='reopenErrand']")
	WebElement reopenButton;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tab_forward-to-external']")
	WebElement forwardToExternalButton;
	
	//@FindBy(how = How.CSS, using =".waiting-on-message.ee-thread")
	@FindBy(how = How.CSS, using = "span.errand-id")
	WebElement errandIdField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tagpicker_to']")
	WebElement replyToField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_subjectReply']")
	WebElement subjectField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tagpicker_cc']")
	WebElement ccField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tagpicker_bcc']")
	WebElement bccField;
	
	@FindBy(how = How.CSS, using = ".cke_wysiwyg_frame.cke_reset")
	WebElement answerIframe;
	
	@FindBy(how = How.CSS, using = "iframe.cke_wysiwyg_frame.cke_reset")
	WebElement chatAnswerIframe;
	
	@FindBy(how = How.ID, using = "QA_replyEditor_ckeditorv5")
	//@FindBy(how = How.CSS, using = ".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders")
	WebElement answerField;
	
	@FindBy(how = How.ID, using = "QA_replyEditor_chatEditor")
	WebElement chatAnswerField;
	
	@FindBy(how = How.CSS, using = "body#QA_replyEditor_ckeditorv5.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders > div")
	WebElement getAnswerField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_btn_send']")
	WebElement sendButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='chat-send-btn']")
	WebElement chatSendButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_btn_save']")
	WebElement saveButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_btn_send-to-all']")
	WebElement sendToAllButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tagData']/div/div/div/ul/li/a")
	WebElement addTagLink;
	
	@FindBy(how = How.CLASS_NAME, using = "errand-tags-list")
	WebElement errandTagList;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='drilldown_dd_Automation tag_338']")
	WebElement singleLevelTag;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='drilldown_dd_Automation tag_346']")
	WebElement extraTag;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='drilldown_dd_AutomationLevel1_343']")
	WebElement tagFirstLevel;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='drilldown_dd_AutomationLevel2_344']")
	WebElement tagSecondLevel;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='drilldown_dd_AutomationLevel3_345']")
	WebElement tagThirdLevel;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tag_btn_confirm']")
	WebElement tagConfirmButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tagpicker_forward']")
	WebElement forwardToField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='moveFolder']")
	WebElement moveToFolder;
	
	//@FindBy(how = How.CSS, using = "[data-qa-id='forwardAgent']")
	@FindBy(how = How.CSS, using = "i.icon-arrow-with-member")
	WebElement forwardToAgent;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-one-itemswathi agent']")
	WebElement selectForwardAgent;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-one-itemAswathi agent']")
	WebElement selectForwardAgent2;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-serialSelect-[object Object]']")
	WebElement moveToArea;
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-one-itemS&G Support']")
	WebElement areaSGSupportDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='moveFolder']/div/h6")
	WebElement salesFolderDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-one-itemSales folder']")
	WebElement salesFolder;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='returnErrand']")
	WebElement returnErrand;
	
	@FindBy(how = How.XPATH, using = "//div[@id='errand-info-holder']/div/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/span[2]")
	WebElement labelToField;
	
	
	@FindBy(how = How.CLASS_NAME, using = "icon-caution")
	WebElement highPriority;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ErrandList']/div[2]/div[2]/div[1]/span")
	WebElement errandIdWithoutOpening;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_signature']")
	WebElement signature;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_salutations']")
	WebElement salutation;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_Salutation_AutoSalutation_278']")
	WebElement selectSalutationName;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_Salutation_Good Day_236']")
	WebElement selectRandomSalutationName;
	
	@FindBy(how = How.CSS, using = "div.signature-preview > div")
	WebElement salutationNameInAnswerField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_Signature_AutoSignature_279']")
	WebElement selectSignatureName;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_Signature_Thanks & Regards_193']")
	WebElement selectRandomSignatureName;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/main/div[2]/div/div/section/div[3]/div[3]/div/div[3]/div[2]/div/div[2]/div/form/div[4]/div")
	WebElement signatureNameInAnswerField;
	
	@FindBy(how = How.CLASS_NAME, using = "signature-preview")
	WebElement facebookSignatureName;
	
	@FindBy(how = How.ID, using = "QA_replyEditor_ckeditorv5")
	WebElement textAreaInternalComment;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='clickable_title_INTERNAL COMMENT']")
	WebElement internalCommentDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_showMoreAct']")
	WebElement internalCommentActions;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_delete']")
	WebElement deleteInInternalComment;
	
	@FindBy(how = How.CSS, using = "div.modal-footer > button.btn-blue")
	WebElement deleteInInternalCommentYes;
	
	@FindBy(how = How.CSS, using = "div.modal-footer > button.btn.btn-grey")
	WebElement deleteInInternalCommentNo;
	
	@FindBy(how = How.CLASS_NAME, using = "dt-msg-collapse")
	WebElement allInternalMessagesDropDown;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='reply-switcher']")
	WebElement replySectionDropDropDown;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_knowledgeBasePopup']")
	WebElement openKnowledgeBase;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='kb-select-folder']")
	WebElement knowledgeBaseListArrow;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='select-list-Automation Knowledge Answer']")
	WebElement automationKnowledgeAnswer;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='kb-select-sub-folder']")
	WebElement selectAutomationKnowledgeAnswerFolder;
	
	@FindBy(how = How.CSS, using = "#container > div > div.knowledge-base-backdrop.popup.open > div > div.knowledge-base-sidebar > div.toggle-tabs > div > div:nth-child(2) > div > div:nth-child(2) > div > div.toggle-btn.folder-sprite")
	WebElement selectSubCategoryfolder;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='kb-add-answer']")
	WebElement addAlternativeAnswerButton;
	
	@FindBy(how = How.CSS, using = "#email-reply > form > div.block-checkboxes > div.right-sidebar > div > div.reply-editor-action.errand-file > a > i")
	
	//@FindBy(how = How.CSS, using = ".block-checkboxes:nth-child(7) .icon-staple")
	WebElement attachFilesButton;
	
	
	
	
	@FindBy(how = How.CSS, using = "div:nth-child(1) > .actions .icon-staple")
	WebElement chatAttachFilesButton;
	
	
	@FindBy(how = How.CSS, using = ".btn.btn-default.btn-file.btn-fileupload")
	WebElement browseButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='archiveFiles']")
	WebElement fileArchiveButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-one-itemAuotImage.jpg']")
	WebElement addFileArchiveFile1;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd-one-itemAutomationCention.txt']")
	WebElement addFileArchiveFile2;
	
	@FindBy(how = How.CSS, using = ".spellchecker-icon")
	WebElement spellCheckButton;
	
	
	
	@FindBy(how = How.CSS, using = "#errand-info-holder > div.errand-box-attachments > div:nth-child(2) > div:nth-child(2) > div.agent-item-image-desc > span")
	WebElement attachedFile;
	
	@FindBy(how = How.CSS, using = "div.errand-box-attachments-agent-single-item > div.agent-item-image-desc > span > a")
	WebElement attachedFilename;
	
	@FindBy(how = How.CSS, using = "#archiveFiles > div")
	WebElement fileArchiveList;
	
	@FindBy(how = How.CSS, using = "#errand-info-holder > div.errand-box-attachments > div:nth-child(2)")
	WebElement attachmentsRow;
	
	@FindBy(how = How.CLASS_NAME, using = "errand-box-attachments-agent-single-item")
	WebElement attachmentsByAgent;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_showErrandAttachment']")
	WebElement showAttachmentsTopPlusButton;
	
	@FindBy(how = How.CSS, using = "span.errand-attachment-list.serial")
	WebElement attachedFiles;
	
	@FindBy(how = How.CLASS_NAME, using = "checkbox checkbox-checked")
	WebElement removeAttachmentsByAgent;
	
	
	@FindBy(how = How.CSS, using = "div#errand-info-holder > div.errand-box-attachments > div.item-wrapper.attachment-row > div.attachment-row-group > div.errand-box-attachments-agent-single-item > div.agent-item-image-desc > div:nth-child(3)")
	WebElement attachmentsTimeOnPanel;
	
	
	
	@FindBy(how = How.CSS, using = "#QA_recipient_to > div > span > span.tag-input-container > span > a")
	WebElement removeReplyAddress;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='btn-OpenContactCard']")
	WebElement contactCardLink;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_inputValue']")
	WebElement contactNameInput;
	
	@FindBy(how = How.CLASS_NAME, using = "jq-selectbox__select-text")
	WebElement contactCardChannelName;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_selectChannel']")
	WebElement contactCardChanneldropdown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='select-list-Email']")
	WebElement selectEmailChannel;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='select-list-Voice']")
	WebElement selectVoiceChannel;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_addContactBtn']")
	WebElement contactCardAddButton;
	
	@FindBy(how = How.CSS, using = " div.card-list > table > tbody")
	WebElement savedContactName;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_closeContactCard']")
	WebElement closeContactCard;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_errandInfo_from']")
	WebElement contactCardNameonOpenErrandPage;
	
	@FindBy(how = How.XPATH, using = "div.conversation-name > div > span")
	WebElement contactCardNameonErrandPageList;

	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_edit_card_name']")
	WebElement editContactCardNameButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_inputName']")
	WebElement editContactCardNameField;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_alert_btn_1']")
	WebElement saveAndLeave;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='setPriority']")
	WebElement setPriority;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='deleteErrand']")
	WebElement deleteErrandButton;
	
	@FindBy(how = How.CSS, using = "div.modal-footer > button.btn-blue")
	WebElement yesDeleteErrandButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_tag_btn_confirm']")
	WebElement confirmTag;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='closeErrand']")
	WebElement closeErrandButton;
	
	@FindBy(how = How.CSS, using = "#page-wrapper > section > div.app-content > div.app-inner-content")
	WebElement openContent;
	
	@FindBy(how = How.CSS, using = "div.modal-footer > button.btn-blue")
	WebElement confirmForwardToArea;
	
	@FindBy(how = How.CSS, using = "div.modal-footer > button.btn-blue")
	WebElement confirmDeleteErrand;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='partial']")
	WebElement partialAnswerCheckBox;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_templates']")
	WebElement clickTemplatesLink;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_Assist_Templates_Automation Template_54']")
	WebElement selectAutomationTemplate;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'good')]")
	WebElement selectCorrectWord;
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,' Online')]")
	WebElement chatOnlineStatus;
	
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_acquired_status']")
	WebElement errandStatus;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='acquireErrand']")
	WebElement acquireButton;
	
	@FindBy(how = How.CSS, using = "td.errand-status > span > a.owned > div.tooltip-content.status.owned > div.content")
	WebElement ownedErrandStatus;
	
	@FindBy(how = How.CSS, using = "td.errand-status > span > a.acquired > div.tooltip-content.status.acquired > div.content")
	WebElement acquiredErrandStatus;
	
	@FindBy(how = How.CSS, using = "td.errand-status > span > a.handled > div.tooltip-content.status.handled > div.content")
	WebElement handledErrandStatus;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_showActHistory']")
	WebElement showActionsButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='clickable_title_Forward To External']")
	WebElement forwardToExternalDropDown;
	
	@FindBy(how = How.CLASS_NAME, using = "high-priority")
	WebElement errandlist;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_ErrandCb_Manual']")
	WebElement emailErrandCheckbox;
			
	//@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_showMoreAct']")
	@FindBy(how = How.CSS, using = "div.msg.errand-message-group.collaboration.collapsed > div.message-group > div.errand-message.my > div > div.errand-message-content > div.errand-message-meta > ul > li")
	WebElement showMoreActionsButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_print']")
	WebElement showMoreActionsPrint;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_clone']")
	WebElement showMoreActionsCopy;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_edit']")
	WebElement showMoreActionsEdit;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_delete']")
	WebElement showMoreActionsDelete;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_openAcquiredErrands']")
	WebElement openOtherContacts;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_ErrandCbundefined']")
	WebElement openErrandCheckbox;
	
	@FindBy(how = How.CSS, using = "div.aquired-errands-aquire > button.btn-blue")
	WebElement acquireErrandsButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_query_info']")
	WebElement acquiredErrandsOnAnswerBox;
	
	@FindBy(how = How.CSS, using = "div.add-information > div.card-data-protection.card-info > div.add-information-title")
	WebElement dataProtection;
	
	
	@FindBy(how = How.CSS, using = "div.data-portability > div.label-type > form > div.label-row > button.btn-blue")
	WebElement grantAccessButton;
	
	@FindBy(how = How.CSS, using = "div.data-anonymize > div.data-anonymize-checker > label > input[type=checkbox]")
	WebElement rightToForgottenCheckBox;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='gdpr_anonymize_btn']")
	WebElement AnonymizeButton;
	
	@FindBy(how = How.CSS, using = "div.export-log > div")
	WebElement AnonymizeAction;
	
	@FindBy(how = How.CLASS_NAME, using = "errand-message-textbox")
	WebElement anonymizedMessages;
	
	@FindBy(how = How.CSS, using = "div.errand-message-info > div.errand-message-name")
	WebElement errandMessageName;
		
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_clientName']")
	WebElement userIconName;
	
	@FindBy(how = How.XPATH, using = "//div[@id='errand-info-holder']/div/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/span[2]")
	WebElement fromField;
	
	//@FindBy(how = How.CSS, using = "div#ErrandList.app-inner-content > div.conversation.read")
	@FindBy(how = How.CLASS_NAME, using = "info-thickbox")
	//@FindBy(how = How.CSS, using = "[data-custom-scrollbar='true']")
	WebElement scrollBar;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_ErrandChat0']")
	WebElement chatFirstErrand;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='wf-action-close']")
	WebElement actionToolsClose;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='wf-action-print']")
	WebElement actionToolsPrint;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='msg-text-box-errand-client']")
	WebElement clientMessage;
	
	@FindBy(how = How.CSS, using = "div.channel-select > i.icon-chevron-down")
	WebElement selectChannelDropDown;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='dd_list_line']")
	WebElement selectLineChannel;
	
	//@FindBy(how = How.CSS, using = "[data-qa-id='QA_errandInfo_channel']")
	@FindBy(how = How.CSS, using = "div.column.user-info > div.channel-info > span.errand-channel")	
	WebElement errandInfoChannel;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_edited-card_name']")
	WebElement contactCradName;

	@FindBy(how = How.CLASS_NAME, using = "waiting modal-body")
	WebElement wantToAcquireALLErrandsDialoguebox;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_alert_btn_1']")
	WebElement acceptwantToAcquireALLErrandsDialoguebox;
	
	@FindBy(how = How.CLASS_NAME, using = "cke_combo_button")
	WebElement fontButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='msg-text-box-errand-agent']")
	WebElement messageFromAgent;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_anonymize_errand0']")
	WebElement anonymizeButton;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_cc_openHistory']")
	WebElement openHistory;
	
	@FindBy(how = How.CSS, using = "[data-qa-id='QA_msgAction_resend']")
	WebElement collaborationResend;
	
	public ErrandPage(WebDriver driver)
	{
		this.driver = driver;
		

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);
	}
	
	public void clickInternalCommentTab(){
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(this.internalCommentTab)).click();
	}
	
}
