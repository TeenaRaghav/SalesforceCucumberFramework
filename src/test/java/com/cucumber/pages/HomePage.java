package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class HomePage extends BasePage{
	static WebDriver driver;
	public HomePage() {
		super(driver = BaseTest.getDriver("Chrome"));
		addObject("Usermenu",By.xpath("//div[@id='userNavButton']"));
		addObject("HomeTab",By.xpath("(//a[contains(text(),'Home')])[1]"));
		addObject("DeveloperConsole",By.xpath("//a[contains(text(),'Developer Console')]"));
		addObject("Logout",By.xpath("//a[contains(text(),'Logout')]"));
		addObject("PostLink",By.xpath("//a[@class='publisherattach publisherattachTextPost withArrowAttached']"));
		addObject("PostFrame",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addObject("PostTextArea",By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		addObject("PostShare",By.className("bottomBarRight"));
		addObject("Post",By.xpath("//div[@id='0D5ak000002WD4H']//span[@class='feeditemtext cxfeeditemtext']"));
		addObject("FileLink",By.xpath("//a[@title ='File']"));
		addObject("UploadFromComputer",By.xpath("//a[@id='chatterUploadFileAction']"));
		addObject("ChooseFile",By.xpath("//input[@id='chatterFile']"));
		addObject("FileShare",By.xpath("//input[@id='publishersharebutton']"));
		addObject("File",By.className("contentFileTitle"));
		addObject("ProfileImage",By.xpath("//div[@id='photoSection']"));
		addObject("AddProfilePhoto",By.xpath("//a[contains(text(),'Add Photo')]"));
		addObject("AddPhotoFrame",By.id("uploadPhotoContentId"));
		addObject("ChoosePhoto",By.xpath( "//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		addObject("ChoosePhotoSave",By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		addObject("SavePhoto",By.xpath("//input[@id='j_id0:j_id7:save']"));
		addObject("AccountsTab",By.xpath("//a[@title='Accounts Tab']"));
	//	addObject("AccountsTab",By.id("Account_Tab"));
		addObject("PlusButton",By.id("AllTab_Tab"));
		addObject("customizemytab",By.className("btnImportant"));
		addObject("OpportunitiesTab",By.xpath("//a[contains(text(),'Opportunities')]"));
		addObject("LeadsTab",By.xpath("//a[contains(text(),'Leads')]"));
	//	addObject("ContactsTab",By.xpath("//a[@title='Contacts Tab']"));
		addObject("ContactsTab",By.xpath("//a[contains(text(),'Contacts')]"));
		addObject("SelectedTabsArea",By.xpath("//option[contains(text(),'Leads')]"));
		addObject("RemoveBtn",By.id("duel_select_0_left"));
		addObject("SaveButton",By.xpath(" //input[@value=\" Save \"]"));
		addObject("UsernameLink",By.xpath("//a[contains(text(),'Teena Raghav')]"));
		addObject("FirstAndLastNameLink",By.xpath("(//a[contains(text(),\"Teena Raghav\")])[1]"));
		addObject("CurrentDateLink",By.xpath("//a[normalize-space()='Sunday April 21, 2024']"));
		addObject("EightpmLink",By.id("p:f:j_id25:j_id61:28:j_id64"));
		addObject("SubjectComboIcon",By.className("comboboxIcon"));
		addObject("Other",By.xpath("//a[contains(text(),'Other')]"));
		addObject("EndTimeField",By.xpath("//input[@id=\"EndDateTime_time\"]"));
		addObject("NinePmFromDropdown",By.id("timePickerItem_42"));
		addObject("Savebtn1",By.xpath("(//input[@value=\" Save \"])[1]"));
		addObject("FourPmLink",By.id("p:f:j_id25:j_id61:20:j_id64"));
		addObject("SevenPmFromDropdown",By.id("timePickerItem_38"));
		addObject("Recurrence",By.xpath("//input[@id=\"IsRecurrence\"]"));
		addObject("frequency",By.xpath("//input[@id=\"rectypeftw\"]"));
		addObject("EndDate",By.xpath("//input[@id=\"RecurrenceEndDateOnly\"]"));
		addObject("NextMonthBtn",By.xpath("//img[@title='Next Month']"));
		addObject("SelectedDate",By.xpath("//td[normalize-space()='6']"));
	}

}
