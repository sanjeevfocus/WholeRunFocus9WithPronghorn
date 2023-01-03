package com.focus.Pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.sound.midi.SysexMessage;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.grid.common.RegistrationRequest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

import net.sourceforge.htmlunit.corejs.javascript.ast.Jump;

public class DesignWorkFLowOptionsPage extends BaseEngine
{
	
	//String yesterdayDate;

	@FindBy(xpath="//span[contains(@class,'icon-settings icon-font1')]")
	private static WebElement settingsMenu; 
	
	@FindBy(xpath="//a[@id='74']//span[contains(text(),'Design Workflow')]")
	private static WebElement designWorkflowbtn; 
	
	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Design Workflow')]")
	private static WebElement designWorkflowLabel; 
	
	@FindBy(xpath="//span[@id='btnClear']//i[@class='icon-save icon-font6']")
	private static WebElement saveBtn; 
	
	@FindBy(xpath="//i[@class='icon icon-clear icon-font6']")
	private static WebElement clearBtn; 
	
	@FindBy(xpath="//i[@class='icon-delete icon-font6']")
	private static WebElement deleteBtn; 
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement closeBtn;
	
	@FindBy(xpath="//input[@id='optWorkflow']")
	private static WebElement workflowNameTxt; 
	
	@FindBy(xpath="//*[@id='optWorkflow_input_settings']/span")
	private static WebElement workFlowNameSettingsBtn; 
					    
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_heading']")
					private static WebElement workflowNameCustomizeDisplayColoumnLabel;
					         
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_container']")
					private static WebElement workflowNameContainerTxt;
					
					@FindBy(xpath="///*[@id='optWorkflow_customize_popup_footer']/div/div/input[1]")
					private static WebElement workFlowNameStandardFieldsBtn;
					
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_list']")
							    private static WebElement workFlowNameFiledDropdown;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_header']")
							    private static WebElement workFlowNameHeaderTxt;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_alignment']")
							    private static WebElement workFlowNameAlignmentDropdown;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_width']")
							    private static WebElement workFlowNameWidthTxt;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[3]")
								private static WebElement workFlowNameStandardFieldsOkBtn;
								
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[4]")
								private static WebElement workFlowNameStandardFieldsCancelBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[2]")
					private static WebElement workFlowNameDeleteColoumnBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[3]")
					private static WebElement workFlowNameOkBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[4]")
					private static WebElement workFlowNameCancelBtn;
	

	//LeftSide Fields
	
	@FindBy(xpath="//div[@id='DocumentIcon']//span[@class='iconbar']")
	private static WebElement workFlowHOpenMenuBtn; 					
						
						
	@FindBy(xpath="//div[@id='idDocumentDiv']//span[@class='iconbar']")
	private static WebElement workFlowHideMenuBtn; 
	
	@FindBy(xpath="//div[@id='idDocumentDiv']//div[1]//ul[1]//li[1]//span[1]")
	private static WebElement receiptsDragAndDrop; 
	
	@FindBy(xpath="//div[@class='row rowMargin']//div[2]//ul[1]//li[1]//span[1]")
	private static WebElement paymentsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Petty Cash')]")
	private static WebElement pettyCashDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Post-Dated Receipts')]")
	private static WebElement postDatedReceiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Post-Dated Payments')]")
	private static WebElement postDatedPaymentsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Vouchers')]")
	private static WebElement purchasesVouchersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock adjustment')]")
	private static WebElement stockAdjustmentDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Returns')]")
	private static WebElement purchasesReturnsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Orders')]")
	private static WebElement purchasesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Job orders')]")
	private static WebElement jobordersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Receipt Notes')]")
	private static WebElement materialReceiptNotesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Invoices')]")
	private static WebElement salesInvoicesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Cash Sales')]")
	private static WebElement cashSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Hire-Purchase Sales')]")
	private static WebElement hirePurchaseSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'POS Sales')]")
	private static WebElement posSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Returns')]")
	private static WebElement salesReturnsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Orders')]")
	private static WebElement salesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Production Order')]")
	private static WebElement productionOrderDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Delivery Notes')]")
	private static WebElement deliveryNotesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Non-Standard Journal Entries')]")
	private static WebElement nonStandardJournalEntriesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Inter-Departmental JV')]")
	private static WebElement interDepartmentalJVDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Debit Notes (Linewise)')]")
	private static WebElement debitNotesLineWiseDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Credit Notes (Linewise)/Payroll')]")
	private static WebElement creditNotesLineWiseDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Fixed Asset Depreciation Voucher')]")
	private static WebElement fixedAssetDepreciationVoucherDragAndDrop; 
	
	@FindBy(xpath="//div[16]//ul[1]//li[1]//span[1]")
	private static WebElement journalEntriesDragAndDrop; 
	
	@FindBy(xpath="//div[17]//ul[1]//li[1]//span[1]")
	private static WebElement debitNotesDragAndDrop; 
	
	@FindBy(xpath="//*[@id='DocumentDiv']/div[18]/ul/li/span")
	private static WebElement creditNotesDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Payroll Postings')]")
	private static WebElement payrollPostingsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Balances')]")
	private static WebElement openingBalancesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Shortages in Stock')]")
	private static WebElement shortagesInStockDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Excesses in Stocks')]")
	private static WebElement excessesInStocksDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock Transfer')]")
	private static WebElement stockTransferDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Stocks')]")
	private static WebElement openingStocksDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Issues to Production')]")
	private static WebElement issuesToProductionDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Receipts from production')]")
	private static WebElement receiptsFromproductionDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Returns from Shop Floor')]")
	private static WebElement returnsFromShopFloorDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Work Issues')]")
	private static WebElement jobWorkIssuesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Work Receipts')]")
	private static WebElement jobWorkReceiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Quotations')]")
	private static WebElement purchasesQuotationsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Quotations')]")
	private static WebElement salesQuotationsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Order')]")
	private static WebElement jobOrderDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Production Process')]")
	private static WebElement productionProcessDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Requisition')]")
	private static WebElement materialRequisitionDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Request For Quote')]")
	private static WebElement requestForQuoteDragAndDrop;
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Forex JV')]")
	private static WebElement forexJVDragAndDrop;
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Auto Sales Order')]")
	private static WebElement autoSalesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Auto Sales Invoice')]")
	private static WebElement autoSalesInvoiceDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Invoice N')]")
	private static WebElement salesInvoiceNDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Vouchers N')]")
	private static WebElement purchaseVoucherNDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Voucher New Two')]")
	private static WebElement purchaseVoucherNewTwoDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock Transfer New')]")
	private static WebElement stockTransferNewDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Stocks New')]")
	private static WebElement openingStocksNewDragAndDrop; 
	
	@FindBy(xpath="//div[@id='idDocumentDiv']//input[@placeholder='Search']")
	private static WebElement searchTxt; 
	
	//Expands Buttons
	
	
	@FindBy(xpath="//*[@id='icon_5']")
	private static WebElement purchaseVouchersExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_7']")
	private static WebElement purchaseOrdersExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_9']")
	private static WebElement salesInvoicesExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_11']")
	private static WebElement salesOrdersExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_14']")
	private static WebElement nonStandardJournalEntriesExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_17']")
	private static WebElement creditNotesExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_24']")
	private static WebElement receiptsFromProductionExpandBtn;


	
	//Body Fields After Drag Then On Flow Chart Link  Layer

	//For the First element which Drags From List TO Screen The Id Property Changes And Remaining Will Be same
	
	@FindBy(xpath="//div[@class='flowchart-operator-title ui-draggable-handle']")  //As it Is First One Selected Drag On FlowChart Is Same Id Property For Every Element
	private static WebElement FirstDraggedElement; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts')]")
	private static WebElement draggedReceipts; 
	
	@FindBy(xpath="//*[@id='id_prog_spanPlus']")
	private static WebElement programmableExpandBtn; 
	
	@FindBy(xpath="//span[contains(text(),' Programmable Field')]")
	private static WebElement programmableFiledBtn; 
	
	@FindBy(xpath="//p[contains(text(),'Programmable Field')]")
	private static WebElement programmableTab; 
	
	@FindBy(xpath="//p[contains(text(),'Name')]")
	private static WebElement nameTab; 
	
	@FindBy(xpath="//*[@id='formulaControl_textbox']")
	private static WebElement formulaControlTxt; 
	
	@FindBy(xpath="//*[@id='formulaControl_Ok']")
	private static WebElement formulaControlOkBtn; 
	
	@FindBy(xpath="//*[@id='id_customize_rearrange_Okbtn']")
	private static WebElement reArrangeFormulaOkBtn; 
	
	
	
	@FindBy(xpath="//div[contains(text(),'Payments')]")
	private static WebElement draggedPayments; 
	
	@FindBy(xpath="//div[contains(text(),'Petty Cash')]")
	private static WebElement draggedPettyCash; 
	
	@FindBy(xpath="//div[contains(text(),'Post-Dated Receipts')]")
	private static WebElement draggedPostDatedReceipts; 
	
	@FindBy(xpath="//div[contains(text(),'Post-Dated Payments')]")
	private static WebElement draggedPostDatedPayments; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Vouchers')]")
	private static WebElement draggedPurchasesVouchers; 
	
	@FindBy(xpath="//div[contains(text(),'Stock adjustment')]")
	private static WebElement draggedStockAdjustment; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Returns')]")
	private static WebElement draggedPurchasesReturns; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Orders')]")
	private static WebElement draggedPurchasesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Job orders')]")
	private static WebElement draggedJoborders; 
	
	@FindBy(xpath="//div[contains(text(),'Material Receipt Notes')]")
	private static WebElement draggedMaterialReceiptNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Invoices')]")
	private static WebElement draggedSalesInvoices; 
	
	@FindBy(xpath="//div[contains(text(),'Cash Sales')]")
	private static WebElement draggedCashSales; 
	
	@FindBy(xpath="//div[contains(text(),'Hire-Purchase Sales')]")
	private static WebElement draggedHirePurchaseSales; 
	
	@FindBy(xpath="//div[contains(text(),'POS Sales')]")
	private static WebElement draggedPOSSales; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Returns')]")
	private static WebElement draggedSalesReturns; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Orders')]")
	private static WebElement draggedSalesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Production Order')]")
	private static WebElement draggedProductionOrder; 
	
	@FindBy(xpath="//div[contains(text(),'Delivery Notes')]")
	private static WebElement draggedDeliveryNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Non-Standard Journal Entries')]")
	private static WebElement draggedNonStandardJournalEntries; 
	
	@FindBy(xpath="//div[contains(text(),'Inter-Departmental JV')]")
	private static WebElement draggedInterDepartmentalJV; 
	
	@FindBy(xpath="//div[contains(text(),'Debit Notes (Linewise)')]")
	private static WebElement draggedDebitNotesLineWise; 
	
	@FindBy(xpath="//div[contains(text(),'Credit Notes (Linewise)/Payroll')]")
	private static WebElement draggedCreditNotesLineWise; 
	
	@FindBy(xpath="//div[contains(text(),'Fixed Asset Depreciation Voucher')]")
	private static WebElement draggedFixedAssetDepreciationVoucher; 
	
	@FindBy(xpath="///div[contains(text(),'Journal Entries')]")
	private static WebElement draggedJournalEntries; 
	
	@FindBy(xpath="//div[contains(text(),'Debit Notes')]")
	private static WebElement draggedDebitNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Credit Notes')]")
	private static WebElement draggedCreditNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Payroll Postings')]")
	private static WebElement draggedPayrollPostings; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Balances')]")
	private static WebElement draggedOpeningBalances; 
	
	@FindBy(xpath="//div[contains(text(),'Shortages in Stock')]")
	private static WebElement draggedShortagesInStock; 
	
	@FindBy(xpath="//div[contains(text(),'Excesses in Stocks')]")
	private static WebElement draggedExcessesInStocks; 
	
	@FindBy(xpath="//div[contains(text(),'Stock Transfer')]")
	private static WebElement draggedStockTransfer; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Stocks')]")
	private static WebElement draggedOpeningStocks; 
	
	@FindBy(xpath="//div[contains(text(),'Issues to Production')]")
	private static WebElement draggedIssuesToProduction; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts from production')]")
	private static WebElement draggedReceiptsFromproduction; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts from production')]")
	private static WebElement draggedReturnsFromShopFloor; 
	
	@FindBy(xpath="//div[contains(text(),'Job Work Issues')]")
	private static WebElement draggedJobWorkIssues; 
	
	@FindBy(xpath="//div[contains(text(),'Job Work Receipts')]")
	private static WebElement draggedJobWorkReceipts; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Quotations')]")
	private static WebElement draggedPurchasesQuotations; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Quotations')]")
	private static WebElement draggedSalesQuotations; 
	
	@FindBy(xpath="//div[contains(text(),'Job Order')]")
	private static WebElement draggedJobOrder; 
	
	@FindBy(xpath="//div[contains(text(),'Production Process')]")
	private static WebElement draggedProductionProcess; 
	
	@FindBy(xpath="//div[contains(text(),'Material Requisition')]")
	private static WebElement draggedMaterialRequisition ; 
	
	@FindBy(xpath="//div[contains(text(),'Request For Quote')]")
	private static WebElement draggedRequestForQuote; 
	
	@FindBy(xpath="//div[contains(text(),'Forex JV')]")
	private static WebElement draggedForexJV; 
	
	/*@FindBy(xpath="//div[contains(text(),'Purchase Voucher New')]")
	private static WebElement draggedPurchseVoucherNew; 
	
	@FindBy(xpath="//div[contains(text(),'Purchase Voucher New Two')]")
	private static WebElement draggedPurchseVoucherNewTwo; */
	
	@FindBy(xpath="//div[contains(text(),'Stock Transfer New')]")
	private static WebElement draggedStockTransferNew; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Stocks New')]")
	private static WebElement draggedOpeningStocksNew; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Invoice')]")
	private static WebElement draggedAutoSalesInvoices; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Invoices Two')]")
	private static WebElement draggedAutoSalesInvoicesTwo; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Order')]")
	private static WebElement draggedAutoSalesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Purchase Vouchers N')]")
	private static WebElement draggedPurchasesVouchersN;
	
	@FindBy(xpath="//div[contains(text(),'Sales Invoice N')]")
	private static WebElement draggedSalesInvoicesN;
	
	
	
	

	// Link and Delete of Dragged Options
	
	//body[@class='custom_scrollbar']/ul[1]/li[1]
	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[1]")
	private static WebElement draggedlinkBtn; 
	
	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[2]")
	private static WebElement draggeddeleteBtn; 
	
	//li[@class='context-menu-item context-menu-visible']//span[contains(text(),'Delete')]
	
	
	//Connection Between Nodes
	
	//While Deleting or adding Link  to Nodes,the link id is also Updated to the NextLine Number.
	
	@FindBy(xpath="//*[@id='line0']")
	private static WebElement link0TO1; 
	
	@FindBy(xpath="//*[@id='line1']")
	private static WebElement link1TO2; 
	
	@FindBy(xpath="//*[@id='line2']")
	private static WebElement link2TO3; 
	
	@FindBy(xpath="//*[@id='line3']")
	private static WebElement link3TO4; 
	
	@FindBy(xpath="//*[@id='line4']")
	private static WebElement link4TO5; 
	
	@FindBy(xpath="//*[@id='line5']")
	private static WebElement link5TO6; 
	
	@FindBy(xpath="//*[@id='line6']")
	private static WebElement link6TO7; 
	
	@FindBy(xpath="//*[@id='line7']")
	private static WebElement link7TO8; 
	
	@FindBy(xpath="//*[@id='line8']")
	private static WebElement link8TO9; 
	
	
	
	//Connections  Node to Node Points Fields
	
	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode0Left; 
	
	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode1Left; 
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode2Left;
	
	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode3Left; 
	
	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode4Left; 
	
	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode5Left;
	
	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode6Left; 
	
	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode7Left; 
	
	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode8Left;
	
	
	
	
	
	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode0Right; 
	
	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode1Right; 
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode2Right; 
	
	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode3Right; 
	
	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode4Right; 
	
	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode5Right; 
	
	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode6Right; 
	
	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode7Right; 
	
	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode8Right; 
	
	
	
	
	//RightSide Fields
	
	//LinkSetting---Definition Tab   {Work Flow Setting-------------->Link Setting}
	
	@FindBy(xpath="//div[@id='settingIcon']//span[@class='iconbar']")
	private static WebElement rightSideExpandBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Definition')]")
	private static WebElement DefinitionTab; 
	
	@FindBy(xpath="//select[@id='DDLLinkValue']")
	private static WebElement DefinitionLinkValueDropdown; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[1]//li[1]//input[1]")
	private static WebElement dateChkBox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[2]//li[1]//input[1]")
	private static WebElement customerAccountChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicewareHouseChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	private static WebElement autosalesOrderandInvoicewareHouseChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	private static WebElement narrationChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicenarrationChkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement itemchkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	private static WebElement materialRequiitionAndPquotationsitemchkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	private static WebElement salesOrderandInvoiceitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement purchaseOrderandPvoucheritemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	private static WebElement purchaseOrderandPvoucherUnitchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement purchaseVoucherAndPReturnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	private static WebElement purchaseVoucherNAndMRNitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement mrnAndPurchaseReturnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement salesInvoicenAndDeliveryNotesitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	private static WebElement salesInvoiceAndSalesRetutrnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	private static WebElement stockTransferAndSalesInvoiceNitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	private static WebElement unitsChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	private static WebElement salesOrderandInvoiceunitsChkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	private static WebElement quantityChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicequantityChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	private static WebElement voucherQtyhkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicevoucherQtyhkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	private static WebElement reserveChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicereserveChkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	private static WebElement rateChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicerateChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement grossChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicegrossChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[1]//li[1]//input[1]")
	private static WebElement voucherGrossChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[2]//li[1]//input[1]")
	private static WebElement netChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[3]//li[1]//input[1]")
	private static WebElement voucherNetChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[4]//li[1]//input[1]")
	private static WebElement userChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[5]//li[1]//input[1]")
	private static WebElement roleChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[6]//li[1]//input[1]")
	private static WebElement user1Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[7]//li[1]//input[1]")
	private static WebElement user2Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[8]//li[1]//input[1]")
	private static WebElement user3Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[9]//li[1]//input[1]")
	private static WebElement user4Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[10]//li[1]//input[1]")
	private static WebElement user5Chkbox; 
	


	//Link Setting -----Setting Tab

	@FindBy(xpath="//a[contains(text(),'Setting')]")
	private static WebElement settingTab; 
	
	@FindBy(xpath="//input[@id='chkRaiseLinkDoc']")
	private static WebElement raiseLinkDocumentWhenbaseIsSavedChkbox; 
	
	@FindBy(xpath="//input[@id='idNegative']")
	private static WebElement tolerance1Txt; 
	
	@FindBy(xpath="//input[@id='idPossitive']")
	private static WebElement tolerance2Txt; 
	
	@FindBy(xpath="//select[@id='ddlTolearenceType']")
	private static WebElement tolearenceTypeDropdown; 
	
	@FindBy(xpath="//select[@id='ddlReleaseto']")
	private static WebElement relatesToDropdown; 
	
	@FindBy(xpath="//input[@id='AutoCloseTxt']")
	private static WebElement autoCloseTxt; 
	
	@FindBy(xpath="//select[@id='ddlActions']")
	private static WebElement settinglinkValueDropdown; 
	
	@FindBy(xpath="//select[@id='ddlLoadpendingDoc']")
	private static WebElement loadpendingDocumentsDropdown; 
	
	@FindBy(xpath="//select[@id='ddlBasedOnfiled']")
	private static WebElement loadFieldsDropdown; 
	
	
	
	
	
	//Link Settings-----Properties
	
	@FindBy(xpath="//a[contains(text(),'Properties')]")
	private static WebElement propertiesTab; 
	
	@FindBy(xpath="//input[@id='chkUseItemWisetolerance']")
	private static WebElement useItemWiseToleranceWhenAvailableChkBox;
	
	@FindBy(xpath="//input[@id='chkConsolidateondocument']")
	private static WebElement checkConsolidateDocWhenDisplayingInSelectionChkBox;
	
	@FindBy(xpath="//input[@id='ChkStockLink']")
	private static WebElement checkstockWhileLinkingChkbox; 
	
	@FindBy(xpath="//input[@id='chkCannotExceedBase']")
	private static WebElement cannotExceedTheBaseValueChkbox; 
	
	@FindBy(xpath="//input[@id='chkBaseDocCannotEdited']")
	private static WebElement baseDocumentCannotBeEditedAfterItIsLinkedChkbox; 
	
	@FindBy(xpath="//input[@id='chkUseLinkForLoading']")
	private static WebElement useThisLinkOnlyForLoadingChkbox; 
	
	@FindBy(xpath="//input[@id='chkLoadBaseDocDtlsAtLinking']")
	private static WebElement loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox; 
	
	@FindBy(xpath="//input[@id='chkCloseLinkAfterDueDt']")
	private static WebElement closeLinkAfterTheDueDateElapsesChkbox; 
	
	@FindBy(xpath="//input[@id='chkLinkIsMandatory']")
	private static WebElement linkIsMandatoryChkbox; 
	
	@FindBy(xpath="//input[@id='chkLinkIsOptional']")
	private static WebElement linkIsOptionalIfTheDocumentIsLinkedToAnotherbasedocumentChkbox; 
	
	@FindBy(xpath="//input[@id='chkDoNotClubCommonBase']")
	private static WebElement doNotClubWithCommonBaseChkbox; 
	
	@FindBy(xpath="//*[@id='chkBaseDocCannotEdited']")
	private static WebElement baseDocCannotEditedBaseChkbox; 
	
	@FindBy(xpath="//input[@id='chkDoNotAllowSelection']")
	private static WebElement doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox; 
	
	@FindBy(xpath="//input[@id='chkRecheckBeforeTheSavingIflink']")
	private static WebElement recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox; 
	
	@FindBy(xpath="//input[@id='chkAllowbackdatedlinking']")
	private static WebElement allowBackdatedLinkingChkbox;
	
	@FindBy(xpath="//input[@id='chkDonotupdatelinkunlessQCisdone']")
	private static WebElement doNotUpdateLinkUnlessQCIsDoneChkbox;
	
	
	
	
	//Footer Fields oF Link Settings
	
	@FindBy(xpath="//button[contains(text(),'Map')]")
	private static WebElement MapBtn; 
	
	           //Map POp  Grid items to be write.
				
				@FindBy(xpath="//h5[contains(text(),'Link Mapping')]")
				private static WebElement linkMappingLabel; 
				
				@FindBy(xpath="//div[@class='modal-footer']//button[@class='Fbutton'][contains(text(),'Ok')]")
				private static WebElement linkMappingOkBtn; 
				
				@FindBy(xpath="//button[contains(text(),'Close')]")
				private static WebElement linkMappingCloseBtn; 
	
	@FindBy(xpath="//div[@class='col-lg-12']//button[@class='Fbutton'][contains(text(),'Ok')]")
	private static WebElement OkBtn; 
	
	@FindBy(xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
	private static WebElement CancelBtn; 
	
	
	
	
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	 
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	
	
	@FindBy(xpath="//select[@id='ddlCompany']")
	private static WebElement companyDropDownList;
	
	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;
	
	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
	
	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	
	@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;
		
	@FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
	 		    
	@FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
	
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
	//DataManagement menu
	@FindBy (xpath="//*[@id='25']/span")
    private static WebElement dataMangementMenu;
	
		@FindBy (xpath="//*[@id='26']/span")
		private static WebElement backup;
			
		@FindBy (xpath="//*[@id='27']/span")
		private static WebElement restore;
		
		@FindBy (xpath="//*[@id='111']/span")
		private static WebElement reindex;
		
		@FindBy (xpath="//*[@id='115']/span")
		private static WebElement eraseAll;
		
		@FindBy (xpath="//*[@id='216']/span")
		private static WebElement lockAndUnlock;
		
	
	@FindBy (xpath="//input[@id='idEraseTransaction']")
	private static WebElement eraseTranscationsRadio;
	
	@FindBy (xpath="//span[contains(text(),'Ok')]")
	private static WebElement eraseAllOkBtn;
	
	@FindBy (xpath="//ul[@class='nav navbar-nav navbar-right']//i[@class='icon-font6 icon-close']")
	private static WebElement eraseAllCancelBtn;
		
		
	@FindBy (xpath="//button[@class='btn Fbutton']")
	private static WebElement folderpathExpandBtn;
	
	@FindBy (xpath="//div[@id='RestoreControls']//div[1]//div[1]")
	private static WebElement restoreCompanyBtn;
	
	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Yes')]")
	private static WebElement overRideYesBtn;
	
	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'No')]")
	private static WebElement overRideNoBtn;
	
	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
	private static WebElement overRideCancelBtn;
		
	
	@FindBy(xpath="//label[@id='lblitem']")
	private static WebElement batchItemName;
	
	@FindBy(xpath="//label[@id='lblTotalQty']")
	private static WebElement batchTotalQtyAmt;
	
	@FindBy(xpath="//label[@id='lblAdjustQty']")
	private static WebElement batchAdjustQtyAmt;
	
	
	@FindBy(xpath="//label[@id='lblBalnceQty']")
	private static WebElement batchBalanceAmt;
	
	@FindBy(xpath="//div[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 P_ingBottom')]//div[2]//input[1]")
	private static WebElement batchExipiringInRadioBtn;
	             
	@FindBy(xpath="//section[@id='page_Content']//div[@class='row']//div//div[3]//input[1]")
	private static WebElement batchExipiringAfetrRadioBtn;
	
	@FindBy(xpath="//input[@id='txtWithin']")
	private static WebElement batchWithInTxt;
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_control_heading_6']")
	private static WebElement batchTableHeaderRateColumn;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-1']")
	private static WebElement batchTable1stRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-2']")
	private static WebElement batchTable1stRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-5']")
	private static WebElement batchTable1stRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-6']")
	private static WebElement batchTable1stRow4thCol;
	               
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-8']")
	private static WebElement batchTable1stRow5thCol;
	
	@FindBy(xpath="//input[@id='MRPBatch_AdjBatchQty']")
	private static WebElement enter_BatchTableQtyAdjusted;
	
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-13']")
	private static WebElement batchTable1stRow6thCol;
	
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_2-1']")
	private static WebElement batchTable2ndRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-2']")
	private static WebElement batchTable2ndRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-5']")
	private static WebElement batchTable2ndRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-6']")
	private static WebElement batchTable2ndRow4thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-7']")
	private static WebElement batchTable2ndRow5thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-13']")
	private static WebElement batchTable2ndRow6thCol;
	
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_3-1']")
	private static WebElement batchTable3rdRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-2']")
	private static WebElement batchTable3rdRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-5']")
	private static WebElement batchTable3rdRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-6']")
	private static WebElement batchTable3rdRow4thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-7']")
	private static WebElement batchTable3rdRow5thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-13']")
	private static WebElement batchTable3rdRow6thCol;
	
	
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_4-1']")
	private static WebElement batchTable4thRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-2']")
	private static WebElement batchTable4thRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-5']")
	private static WebElement batchTable4thRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-6']")
	private static WebElement batchTable4thRow4thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-7']")
	private static WebElement batchTable4thRow5thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-13']")
	private static WebElement batchTable4thRow6thCol;
	
	@FindBy(xpath="//*[@id='MRPBatch_AdjBatchQty']")
	private static WebElement batchTableEnterQtyAdjusted;
	
	
	/*@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr")
	private static List<WebElement> batchPopupTable;*/
	
	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']")
	private static WebElement batchPopupTable;
	
	@FindBy(xpath="//i[@class='icon-refresh icon-font7']")
	private static WebElement batchRefreshBtn;
	
	@FindBy(xpath="//input[@id='Batch_Search']")
	private static WebElement batchSearchTxt;
	
	@FindBy(xpath="//input[@class='Fcheckbox']")
	private static WebElement batchShowAllAvalibleBatches;
	
	@FindBy(xpath="//label[contains(text(),'Customization')]")
	private static WebElement batchCustomizationIcon;
	
	/*@FindBy(xpath="//label[contains(text(),'Pick On FIFO')]")
	private static WebElement batchPickOnFIFOIcon;*/
	
	@FindBy(xpath="//div[@class='btnhighlight theme_button_color P_LeftRight10'][2]")
	private static WebElement batchPickOnFIFOIcon;
	
	@FindBy(xpath="//label[@id='div_Ok']")
	private static WebElement batchOkIcon;

	@FindBy(xpath="//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12']//div[6]//label[1]")
	private static WebElement batchTotalAdjustedQty;
	
	@FindBy(xpath="//*[@id='MBatch_Content']/div[3]/div/div[3]/div[4]/label")
	private static WebElement batchCancelIcon;
	
	@FindBy(xpath="//*[@id='MBatch_Content']/div[1]/div[2]/span/i")
	private static WebElement batchCloseIcon;
	
	@FindBy(xpath="//*[@id='MBatch_Content']/div[2]/div/div[5]/div/div[3]")
	private static WebElement batchTotalQuantity;
	
	
		
	@FindBy (xpath="//div[@id='BackUpControls']/ul/li/div[1]")
	private static WebElement backupBtn;
	
	
	public static void checkUserFriendlyMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	        try
	        {
	                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
	                String actErrorMessage=errorMessage.getText();
	                
	                try
	                {
	                
		                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		                errorMessageCloseBtn.click();
		                
		                System.out.println("ValidationMessage  :  "+actErrorMessage);
		                
	                }
	                catch(Exception ee)
	                {
	                	
	                	System.out.println("ValidationMessage  :  "+actErrorMessage);
	                	
	                }
	               
	                
	               
	        }
	        catch(Exception e)
	        {
	                System.err.println("Error Message NOT Found or NOT Clickable");
	                System.err.println(e.getMessage());
	                
	                String Exception=e.getMessage();
	            
	        }
	}
	
	public boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage="Voucher saved successfully";
			String expErrorMessage1=": "+docno;
			
			System.out.println("SavingMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage+" "+expErrorMessage1);
			
			if(actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1))
			{
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
					
					return  true;
				}
				catch(Exception ee)
				{
					return true;
				}
				
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}
	
	 public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage=ExpMessage;
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
				
				return actErrorMessage;
			}
			catch(Exception ee)
			{
				
				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
				
				return actErrorMessage;
			}
		}
		catch(Exception e)
		{
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());
	                
			String Exception=e.getMessage();
			
			return Exception;	
		} 
	  }	
			
	 
	 
	 
	 

		public boolean checkRestoreOfCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
			restore.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
			folderpathExpandBtn.click();
			
			Thread.sleep(3000);
		     
		     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\optionsCompanyRestore.exe");
		     
		     Thread.sleep(3000);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
		     restoreCompanyBtn.click();
		     
		     try
		     {
		    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
		 		 overRideYesBtn.click();
		 		 
		 		 Thread.sleep(130000);
		 		
		     }
		     catch(Exception e)
		     {
		    	 System.err.println("NO OLDER COMPANY EXISTS");
		     }
		     
		     if(getIsAlertPresent())
		     {
		    	 getWaitForAlert();
		    	 
		    	 getAlert().accept();
		     }
			
		     Thread.sleep(3000);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public boolean checkLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    //checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		     prongHornOn();
		     
		     Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkLogoutAndLoginWithoutPronghorn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    //checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		 try
		 {
			 if(getAlert().getText().isEmpty()==false)	
		     {
				 System.err.println("errorMessage is Displyed");
		    	 getAlert().accept();
		     }
           } 
		catch (Exception e) {
			
			System.err.println("errorMessage is Not Displyed");
			
		}
		    
		     
		     Thread.sleep(5000);
		     
		     //prongHornOn();
		     
		     //Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		public boolean checkEraseAllTransactionsLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		     prongHornOn();
		     
		     Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
	
		
		public boolean checkEraseAllTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully.";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
			
			System.out.println("************************************* checkEraseAllTransactions  *********************************");
			System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
			{
				System.out.println("Voucher Saved");
				//excelReader.setCellData(xlfile, "Sheet6", 262, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Voucher Not Saved");
				//excelReader.setCellData(xlfile, "Sheet6", 262, 9, resFail);
				return false;
			}
		}
	

	public boolean checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	  
		Thread.sleep(5000);
		
		String actUserInfo=userNameDisplay.getText();
		
		System.out.println("User Info  : "+actUserInfo);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name  :  "+ getLoginCompanyName);
		companyLogo.click();
		
		
		
		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Automation";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
		folderpathExpandBtn.click();
		
		Thread.sleep(3000);
	     
	     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\optionsCompanyRestore.exe");
	     
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
	     restoreCompanyBtn.click();
	     
	     try
	     {
	    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
	 		 overRideYesBtn.click();
	 		 Thread.sleep(25000);
	     }
	     catch(Exception e)
	     {
	    	 System.err.println("NO OLDER COMPANY EXISTS");
	     }
	     
	     if(getIsAlertPresent())
	     {
	    	 getWaitForAlert();
	    	 
	    	 getAlert().accept();
	     }
		
	
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	     userNameDisplay.click();
		
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	     logoutOption.click();
	     
	     

	     Thread.sleep(3000);
	     
	     lp.enterUserName(unamelt);
	     
	     lp.enterPassword(pawslt);
	     
	     Thread.sleep(2000);
	     
	     Select s = new Select(companyDropDownList);
	     int size=s.getOptions().size();
	     
	     System.err.println("SIZE : "+size);
	     
	     for(int i=0;i<size;i++)
	     {
	    	 String data;
	    	 
	    	 data=s.getOptions().get(i).getText();
	    	 
	    	 System.err.println("DATA : "+data);
	    	 
	    	 if(data.contains("Automation Options"))
	    	 {
	    		 
	    		 s.selectByVisibleText(data);
	    		 
	    		 break;
	    	 }
	     }
	     
	     
	     
	     lp.clickOnSignInBtn();
	     
	     Thread.sleep(5000);
	     
	     
	     String actUserInfo1=userNameDisplay.getText();
			
		System.out.println("User Info  : "+actUserInfo1);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		companyLogo.click();
		
		String getCompanyTxt1=companyName.getText();
		String getLoginCompanyName1=getCompanyTxt1.substring(0, 19);
		System.out.println("company name  :  "+ getLoginCompanyName1);
		companyLogo.click();
		
		
		
		String expUserInfo1           ="SU";
		String expLoginCompanyName1   ="Automation Options ";
	     
	     
		System.out.println("UserInfo             : "+actUserInfo            +" Value Expected : "+expUserInfo);
		System.out.println("LoginCompanyName     : "+getLoginCompanyName    +" Value Expected : "+expLoginCompanyName);
		
		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
		
		if(actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) 
				
				&& actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	/*public static String checkDownloadedFileName(WebDriver driver) throws InterruptedException
	{
		String mainWindow = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
      
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
	     
		driver.get("chrome://downloads");
	      
		JavascriptExecutor js1 = (JavascriptExecutor)driver;

		String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");

		System.err.println("Download deatils");
		System.out.println("File Name :-" + fileName);
	     
		driver.close();

		driver.switchTo().window(mainWindow);
		
		return fileName;
	}*/
	
	
	
	public boolean checkBackup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\Transaction Authorization.fbak");
		
		if(Efile.exists())
		{
			Efile.delete();
		}
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(backup));
		backup.click();
		
		Thread.sleep(3000);
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(backupBtn));
	     backupBtn.click();
	     
	     Thread.sleep(20000);
	     
	     String actBackupName = checkDownloadedFileName(getDriver());
		 String expBackupName = "Transaction Authorization.fbak";
	     
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_J);
	     robot.keyRelease(KeyEvent.VK_J);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     
	     Thread.sleep(4000);
	     
	     ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	     
	     getDriver().switchTo().window(openTabs.get(1)).close();
		 Thread.sleep(1000);
		 getDriver().switchTo().window(openTabs.get(0));
		 
		 Thread.sleep(2000);
		 	
		 System.err.println("Backup Downloaded : "+actBackupName+"  Value Expected  "+expBackupName);
		
		if(actBackupName.equalsIgnoreCase(expBackupName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	

	public boolean checkInputingWorkflowNameAsPurchasesFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		String expworkflowNameTxt="PurchasesFlow";
		String actworkflowNameTxt=workflowNameTxt.getAttribute("value");
		
		System.out.println("*********************************checkInputingWorkflowNameAsPurchasesFlow************");
		
		System.out.println("WorkflowNameTxt  :"+actworkflowNameTxt+" Value Expected : "+expworkflowNameTxt);
		
		if(actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	@FindBy (xpath="//a[@id='2033']/span")
	private static WebElement inventoryTransactionsStocksMenu; 
	
	@FindBy (xpath="//a[@id='2037']/span")
	private static WebElement openingStocksVoucher; 
	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  warehouseTxt;
	
	@FindBy(xpath="//input[@id='id_body_13']")
	private static WebElement  enter_Batch;
	
	@FindBy(xpath="//input[@id='id_body_37']")
	private static WebElement enter_Expirydate;
	
	public boolean checkSavingOpeningStockVoucher1WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksVoucher));
		openingStocksVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("BATCH BR ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.sendKeys("B1");
		enter_Batch.sendKeys(Keys.TAB);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar R1Exp=Calendar.getInstance();
		R1Exp.add(Calendar.DATE, 2);
		
		String R1=df.format(R1Exp.getTime());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.sendKeys(Keys.HOME,R1);
		enter_Expirydate.sendKeys(Keys.TAB);
		
		
		
		// 2nd Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys("BATCH BR ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.sendKeys("B2");
		enter_Batch.sendKeys(Keys.TAB);
		
		Calendar R2Exp=Calendar.getInstance();
		R2Exp.add(Calendar.DATE, 1);
		
		String R2=df.format(R2Exp.getTime());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.sendKeys(Keys.HOME,R2);
		enter_Expirydate.sendKeys(Keys.TAB);
		
		
		
		// 3rd Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys("BATCH BR ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("3");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.sendKeys("B3");
		enter_Batch.sendKeys(Keys.TAB);
		
		Calendar R3Exp=Calendar.getInstance();
		R3Exp.add(Calendar.DATE, 4);
		
		String R3=df.format(R3Exp.getTime());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.sendKeys(Keys.HOME,R3);
		enter_Expirydate.sendKeys(Keys.TAB);
		
		
		
		
		// 4th Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys("BR COGS ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("6");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.sendKeys("B4");
		enter_Batch.sendKeys(Keys.TAB);
		
		Calendar R4Exp=Calendar.getInstance();
		R4Exp.add(Calendar.DATE, 3);
		
		String R4=df.format(R4Exp.getTime());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.sendKeys(Keys.HOME,R4);
		enter_Expirydate.sendKeys(Keys.TAB);
		
		
		
		// 5th Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys("BR COGS ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("4");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.sendKeys("B5");
		enter_Batch.sendKeys(Keys.TAB);
		
		Calendar R5Exp=Calendar.getInstance();
		R5Exp.add(Calendar.DATE, 5);
		
		String R5=df.format(R5Exp.getTime());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.sendKeys(Keys.HOME,R5);
		enter_Expirydate.sendKeys(Keys.TAB);
		
		
		
		// 6th Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys("BR COGS ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("5");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.sendKeys("B6");
		enter_Batch.sendKeys(Keys.TAB);
		
		Calendar R6Exp=Calendar.getInstance();
		R6Exp.add(Calendar.DATE, 6);
		
		String R6=df.format(R6Exp.getTime());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.sendKeys(Keys.HOME,R6);
		enter_Expirydate.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expMessage1="Voucher saved successfully";
		String expMessage2="1";
		
		String actMessage=checkValidationMessage(expMessage1);
		
		System.out.println("********* Error Message : "+actMessage+"  value expected  "+expMessage1+" : "+expMessage2);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		
		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	@FindBy (xpath="//a[@id='2074']/span")
	private static WebElement shortagesInStockNewVoucher;
	
	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr/td[2]")
	private static List<WebElement> batchPopupBatchNoList;
	
	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr/td[1]")
	private static List<WebElement> batchPopupRowNosList;
	
	public boolean checkSavingShortageInStocksVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(shortagesInStockNewVoucher));
		shortagesInStockNewVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("BATCH BR ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("12");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(batchItemName));
		
		int BatchNoCount = batchPopupBatchNoList.size();
		
		for (int i = 0; i < BatchNoCount; i++) 
		{
			String batchNo = batchPopupBatchNoList.get(i).getText();
			
			if (batchNo.equalsIgnoreCase("B1")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(batchOkIcon));
		batchOkIcon.click();
		
		Thread.sleep(2000);
		
		
		// 2nd Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys("BR COGS ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_4thColumn));
		select2ndRow_4thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("24");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(batchItemName));
		
		int BatchNoCount1 = batchPopupBatchNoList.size();
		
		for (int i = 0; i < BatchNoCount1; i++) 
		{
			String batchNo = batchPopupBatchNoList.get(i).getText();
			
			if (batchNo.equalsIgnoreCase("B6")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(batchOkIcon));
		batchOkIcon.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expMessage1="Voucher saved successfully";
		String expMessage2="1";
		
		String actMessage=checkValidationMessage(expMessage1);
		
		System.out.println("********** Error Message : "+actMessage+"  value expected  "+expMessage1+" : "+expMessage2);
		
		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return false;
		}
	}
	
	
	
	
	
	@FindBy (xpath="//a[@id='2075']/span")
	private static WebElement excessInStocksNewVoucher;
	
	@FindBy (xpath="//*[@id='id_transaction_viewcontainer']/li[2]/a")
	private static WebElement pendingShortageInStocksLink;
	
	public boolean checkExcessesInStocksVoucherBatchNosByConvertingPendingShortageInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excessInStocksNewVoucher));
		excessInStocksNewVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingShortageInStocksLink));
		pendingShortageInStocksLink.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkValidationMessage("Link data loaded");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		String actR1BatchNo = select1stRow_7thColumn.getText();
		String expR1BatchNo = "B1"; 
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
		String actR2BatchNo = select2ndRow_7thColumn.getText();
		String expR2BatchNo = "B6";
		
		System.out.println("1st Row Batch No : "+actR1BatchNo+"  Value Expected  "+expR1BatchNo);
		System.out.println("2nd Row Batch No : "+actR2BatchNo+"  Value Expected  "+expR2BatchNo);
		
				
		if (actR1BatchNo.equalsIgnoreCase(expR1BatchNo) && actR2BatchNo.equalsIgnoreCase(expR2BatchNo))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public boolean checkExcessesInStocksVoucherBatchNosByWorkFlow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
		new_newBtn.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowExpandBtn));
		workFlowExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(20000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		String actR1BatchNo = select1stRow_7thColumn.getText();
		String expR1BatchNo = "B1"; 
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
		String actR2BatchNo = select2ndRow_7thColumn.getText();
		String expR2BatchNo = "B6";
		
		System.out.println("1st Row Batch No : "+actR1BatchNo+"  Value Expected  "+expR1BatchNo);
		System.out.println("2nd Row Batch No : "+actR2BatchNo+"  Value Expected  "+expR2BatchNo);
		
		if (actR1BatchNo.equalsIgnoreCase(expR1BatchNo) && actR2BatchNo.equalsIgnoreCase(expR2BatchNo))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			getWaitForAlert();
			getAlert().accept();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return true;
		}
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			new_CloseBtn.click();
			getWaitForAlert();
			getAlert().accept();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
			voucherhomeCloseBtn.click();
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public boolean checkLinkBetweenPurchaseOrderAndPVN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MapBtn.isDisplayed();
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = "true";
		
		System.out.println("**************************************checkLinkBetweenPurchaseVoucherNAndMRN*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy(xpath="//*[@id='WorkflowCheckboxDiv']/div/ul/li/label")
	private static List<WebElement> definitionTabChkBoxNameList;
	
	@FindBy(xpath="//*[@id='WorkflowCheckboxDiv']/div/ul/li/input")
	private static List<WebElement> definitionTabChkBoxList;
	
	

	public boolean CheckLinkValueDropDownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		int size=s.getOptions().size();
		
		Set<String> linkValueDropdownArray = new HashSet<String>();
		
		for(int i=0;i<size;i++)
		{
			String data = s.getOptions().get(i).getText();
			linkValueDropdownArray.add(data);
		}
		
		String actDefinitionLinkValueDropdown = linkValueDropdownArray.toString();
		String expDefinitionLinkValueDropdown = "[Transaction Gross, Quantity, Gross, Net]";
		
		System.out.println("********************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherNAndMRN***********");
		
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Ecpected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrderAndPvn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText("Quantity");
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown="Quantity";
		
		System.out.println("********************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrderAndPvn***********");
		
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Ecpected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	public boolean checkSelectingItemOptionBetweenPurchaseOrderAndPvn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM") && definitionTabChkBoxList.get(i).isSelected()==false)
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxList.get(i).isSelected();
				break;
				
			}
		}
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = "true";
		
		System.out.println("*********************************checkSelectingItemOptionBetweenPurchaseOrderAndPvn*************"); 
		
		System.out.println("PurchaseVoucherNAndMRNitemchkbox  : "+actMethod+" Value Expected : "+expMethod);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	public boolean checkMapOptionAndMappedFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MapBtn));
		MapBtn.click();
		
		Thread.sleep(2000);
		
		Set<String> baseFieldListArray=new HashSet<String>();
		
		for(int i=0;i<20;i++)
		{
			String data = baseFieldList.get(i).getText();
			baseFieldListArray.add(data);
		}
		
		String actbaseFieldList = baseFieldListArray.toString();
		String expbaseFieldList = "[, Item, Warehouse, Discount, Vendor Account, Narration, Rate, Quantity, Time, Gross, Document No., Unit]";
	
		
		System.out.println("actbaseFieldList   : "+actbaseFieldList);
		System.out.println("expbaseFieldList   : "+expbaseFieldList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkMappingOkBtn));
		linkMappingOkBtn.click();
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		//OkBtn.click();
		ClickUsingJs(OkBtn);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
	
		if(actbaseFieldList.equalsIgnoreCase(expbaseFieldList) && actMessage.equalsIgnoreCase(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy(xpath="//tbody[@id='mapWorkflow_GrdId_body']/tr/td[2]")
	private static List<WebElement> baseFieldList;
	
	@FindBy(xpath="//select[@id='mapWorkflow_GrdId_control_heading_ctrl_1']")
	private static WebElement baseFieldDropDown;
	
	@FindBy(xpath="//select[@id='mapWorkflow_GrdId_control_heading_ctrl_2']")
	private static WebElement linkFieldDropDown;
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[1]/td[2]")
	private static WebElement baseFieldRow1;
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[2]/td[2]")
	private static WebElement baseFieldRow2;

	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement  select1stRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement  select1stRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement  select1stRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement  select1stRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement  select1stRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement  select1stRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement  select1stRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement  select1stRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement  select1stRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement  select1stRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement  select1stRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement  select1stRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement  select1stRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement  select1stRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement  select1stRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement  select1stRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	private static WebElement  select1stRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	private static WebElement  select1stRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
	private static WebElement  select1stRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
	private static WebElement  select1stRow_20thColumn;
	
	
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	private static WebElement  select2ndRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	private static WebElement  select2ndRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	private static WebElement  select2ndRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	private static WebElement  select2ndRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	private static WebElement  select2ndRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	private static WebElement  select2ndRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	private static WebElement  select2ndRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	private static WebElement  select2ndRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	private static WebElement  select2ndRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement  select2ndRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement  select2ndRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement  select2ndRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	private static WebElement  select2ndRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	private static WebElement  select2ndRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	private static WebElement  select2ndRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]")
	private static WebElement  select2ndRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]")
	private static WebElement  select2ndRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]")
	private static WebElement  select2ndRow_19thColumn;

	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	private static WebElement  select4thRow_1stColumn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	private static WebElement  select3rdRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	private static WebElement  select3rdRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	private static WebElement  select3rdRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	private static WebElement  select3rdRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	private static WebElement  select3rdRow_5thColumn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	private static WebElement  select4thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	private static WebElement  select3rdRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	private static WebElement  select3rdRow_7thColumn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	private static WebElement  select4thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	private static WebElement  select3rdRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	private static WebElement  select3rdRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	private static WebElement  select3rdRow_10thColumn;

    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	private static WebElement  select3rdRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	private static WebElement  select3rdRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	private static WebElement  select3rdRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	private static WebElement  select3rdRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	private static WebElement  select3rdRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	private static WebElement  select3rdRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]")
	private static WebElement  select3rdRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]")
	private static WebElement  select3rdRow_18thColumn;

	
	
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	private static WebElement  inventoryMenu; 
	
	@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	private static WebElement  inventoryTransactionsMenu; 
	
	@FindBy(xpath="//*[@id='139']/span")
	private static WebElement  inventoryTransactionsPurchasesMenu; 

	@FindBy(xpath="//*[@id='2010']/span")
	private static WebElement  requestForQuoteVoucher;
	
	@FindBy(xpath="//*[@id='2011']/span")
	private static WebElement  purchasesQuotationsVoucher;
		
	@FindBy(xpath="//*[@id='2012']/span")
	private static WebElement  purchasesOrdersVoucher;

	@FindBy(xpath="//*[@id='2013']/span")
	private static WebElement  materialReceiptNotesVoucher;
	
	@FindBy(xpath="//*[@id='140']/span")
	private static WebElement  inventoyTransactionsSalesMenu; 
		
		@FindBy(xpath="//*[@id='2018']/span")
		private static WebElement  salesQuotationsVoucher;
		
		@FindBy(xpath="//*[@id='2019']/span")
		private static WebElement  deliveryNotesVoucher;
		
		@FindBy(xpath="//*[@id='2022']/span")
		private static WebElement  posSalesVoucher;
		
		@FindBy(xpath="//*[@id='2045']/span")
		private static WebElement  productionOrdersVoucher;
		
		@FindBy(xpath="//*[@id='2017']/span")
		private static WebElement  salesOrdersVoucher;
					
	
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement  newBtn;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  vendorAccountTxt;
	
	@FindBy(xpath="//*[@id='id_transaction_homescreen_new']")
	private static WebElement  voucherNewBtn;
	
	@FindBy(xpath="//*[@id='Deleteayout']")
	private static WebElement  workflowDeleteLayout;
	
	
	
	@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
	private static List<WebElement> vendorAccountListCount; 
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  pvWareHouseTxt;
	
	@FindBy(xpath="//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
	private static List<WebElement> pvwareHouseListCount;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;
	
	@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
    private static List<WebElement> itemListCount;
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']")
	private static WebElement  vouchersaveBtn;
	
	@FindBy(xpath="//input[@id='id_body_24']")
	private static WebElement  enter_UnitTxt;
	
	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;
	
	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;
	
	@FindBy(xpath="//input[@id='id_body_28']")
	private static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_body_33554437']")
	private static WebElement  enter_Discount;
	
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;
	
	@FindBy(xpath="//span[@class='icon-rightarrow-1 icon-font6']")
	private static WebElement  rearrangeFormula;
	
	@FindBy(xpath="//*[@id='id_customize_rearrangeformula_grid_body']//td[4]")
	private static WebElement  newFormula;
	
	@FindBy(xpath="//*[@id='id_customize_rearrangeformula_grid_control_heading_ctrl_3']")
	private static WebElement  newFormula1;
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td")
	private static List<WebElement> workFlowRow1List;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td")
	private static List<WebElement> workFlowRow2List;
	
	
	@FindBy(xpath="//div[@id='ReIndexingError_Modal']/div/div")
	private static WebElement  reindexingPopup;
	
	@FindBy(xpath="//div[@id='ReIndexingError_Modal']/div/div/div[3]/button")
	private static WebElement  reindexingPopupCancelBtn;
	
	@FindBy(xpath="//div[@id='ReIndexingError_Modal']/div/div/div[3]/input")
	private static WebElement  reindexingPopupSaveLogBtn;
	
	
	
	public boolean checkSavingPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("10");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("15");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		   
		System.out.println("************************************* checkSavingPurchaseOrdersvoucher  *********************************");
		
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
	
		if (savingMessage==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	
	
	
	
	
	@FindBy(xpath="//*[@id='60']/div")
	private static WebElement  financialsMenu; 

	@FindBy(xpath="//a[@id='61']//span[contains(text(),'Transactions')]")
	private static WebElement  financialsTransactionMenu;

        @FindBy(xpath="//*[@id='2007']/span")
		private static WebElement  financialsTransactionsPurchaseMenu; 
		
			@FindBy(xpath="//*[@id='2008']/span")
			private static WebElement  purchaseVoucher;
			
			@FindBy(xpath="//a[@id='2050']//span[contains(text(),'Purchase Vouchers N')]")
			private static WebElement  purchaseVoucherNew;
			
			@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
			private static WebElement  homePageAllVouchersView;
			
			@FindBy(xpath="//*[@id='2009']/span")
			private static WebElement  purchaseReturnsVoucher;
			
			@FindBy(xpath="//a[contains(text(),'*Pending Authorization Purchase')]")
			private static WebElement  homePagePendingAuthorizationView;
			
			@FindBy(xpath="//a[contains(text(),'Pending Purchases Orders')]")
			private static WebElement  homePagePendingOrdersLinks;
			
	@FindBy(xpath="//*[@id='tblBodyTransRender']/tr")
	private static List<WebElement>  voucherBodyGridRowCount;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']")
	private static WebElement  voucherBodyGrid;
	
	
	public boolean checkPendingPurchaseOrdersPurchaseVoucherNHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePagePendingOrdersLinks));	
		homePagePendingOrdersLinks.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));	
		
		int actVouchersCount=voucherBodyGridRowCount.size()-1;
		int expVouchersCount=1;
		
		System.out.println("************************************* checkPendingPurchaseOrdersPurchaseVoucherNewHomePage  *********************************");
		System.out.println("Vouchers Count in Voucher Body : "+actVouchersCount+" Value Expected : "+expVouchersCount);
		
		if(actVouchersCount==expVouchersCount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	

	//WorkFlow Elements

	
		@FindBy(xpath="//select[@id='id_transactionentry_workflow_popup_searchon']")
		private static WebElement  searchOnDropdown;
		
		@FindBy(xpath="//select[@id='id_transactionentry_workflow_popup_searchtype']")
		private static WebElement  containingDropdown;
			
		@FindBy(xpath="//input[@id='id_transactionentry_workflow_popup_search']")
		private static WebElement  workFlowSearchTxt;
		
		@FindBy(xpath="//i[@id='id_transactionentry_workflow_popup_close']")
		private static WebElement  workFlowCloseBtn;
		
		@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//div[@class='toolbar_button_text font-7'][contains(text(),'Customize')]")
		private static WebElement  workFlowCustomizeBtn;
		
		@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//div[@class='toolbar_button_text font-7'][contains(text(),'Ok')]")
		private static WebElement  workFlowOkBtn;
		
		@FindBy(xpath="//div[@class='toolbar_button_text font-7'][contains(text(),'Ok')]")
		private static WebElement  workFlowOkBtnInSalesVoucher;
		
		
		@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
		private static WebElement  workFlowMinimizeBtn;
		
		
		
		//WorkFlow Screen with Line wise
		@FindBy(xpath="//input[@id='id_transaction_entry_detail_workflow_popup_control_heading_ctrl_1']")
		private static WebElement  workFlowHeaderChkBox;
		
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_popup_control_heading_6']//div[contains(text(),'Voucher No')]")
		private static WebElement  workFlowHeaderVoucherNo;
		
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_popup_control_heading_7']//div[contains(text(),'Date')]")
		private static WebElement  workFlowHeaderDate;
		
		@FindBy(xpath="//div[contains(text(),'Name')]")
		private static WebElement  workFlowHeaderName;
		
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_popup_control_heading_9']//div[contains(text(),'Quantity')]")
		private static WebElement  workFlowHeaderQty;
		
		@FindBy(xpath="//div[contains(text(),'Suspended')]")
		private static WebElement  workFlowHeaderSuspend;
		
		
		//WorkFlow with Line wise
		// 1 Row
		
		@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[2]/input")
		private static WebElement workFlowRadioBtnRowOne;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-6']")
		private static WebElement  workFlowRow1Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-7']")
		private static WebElement  workFlowRow1Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-8']")
		private static WebElement  workFlowRow1Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-9']")
		private static WebElement  workFlowRow1Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-10']")
		private static WebElement  workFlowRow1Column5;
		
		// 2 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-1']//input")
		private static WebElement workFlowRadioBtnRowTwo;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-6']")
		private static WebElement  workFlowRow2Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-7']")
		private static WebElement  workFlowRow2Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-8']")
		private static WebElement  workFlowRow2Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-9']")
		private static WebElement  workFlowRow2Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-10']")
		private static WebElement  workFlowRow2Column5;
		
		
		
		
		// 3 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-1']//input")
		private static WebElement workFlowRadioBtnRowThree;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-6']")
		private static WebElement  workFlowRow3Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-7']")
		private static WebElement  workFlowRow3Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-8']")
		private static WebElement  workFlowRow3Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-9']")
		private static WebElement  workFlowRow3Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-10']")
		private static WebElement  workFlowRow3Column5;
		
		
		// 4 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_4-1']//input")
		private static WebElement workFlowRadioBtnRowFour;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-6']")
		private static WebElement  workFlowRow4Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-7']")
		private static WebElement  workFlowRow4Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-8']")
		private static WebElement  workFlowRow4Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-9']")
		private static WebElement  workFlowRow4Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-10']")
		private static WebElement  workFlowRow4Column5;	
		
		
		
	     // 5 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_5-1']//input")
		private static WebElement workFlowRadioBtnRowFive;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-6']")
		private static WebElement  workFlowRow5Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-7']")
		private static WebElement  workFlowRow5Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-8']")
		private static WebElement  workFlowRow5Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-9']")
		private static WebElement  workFlowRow5Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-10']")
		private static WebElement  workFlowRow5Column5;	
		
		
		
	    // 6 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_6-1']//input")
		private static WebElement workFlowRadioBtnRowSix;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-6']")
		private static WebElement  workFlowRow6Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-7']")
		private static WebElement  workFlowRow6Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-8']")
		private static WebElement  workFlowRow6Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-9']")
		private static WebElement  workFlowRow6Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-10']")
		private static WebElement  workFlowRow6Column5;	
		

	    // 7 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_7-1']//input")
		private static WebElement workFlowRadioBtnRowSeven;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-6']")
		private static WebElement  workFlowRow7Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-7']")
		private static WebElement  workFlowRow7Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-8']")
		private static WebElement  workFlowRow7Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-9']")
		private static WebElement  workFlowRow7Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-10']")
		private static WebElement  workFlowRow7Column5;	
		
		

	    // 8 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_8-1']//input")
		private static WebElement workFlowRadioBtnRowEight;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-6']")
		private static WebElement  workFlowRow8Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-7']")
		private static WebElement  workFlowRow8Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-8']")
		private static WebElement  workFlowRow8Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-9']")
		private static WebElement  workFlowRow8Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-10']")
		private static WebElement  workFlowRow8Column5;	
		
		

	    // 9 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_9-1']//input")
		private static WebElement workFlowRadioBtnRowNine;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-6']")
		private static WebElement  workFlowRow9Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-7']")
		private static WebElement  workFlowRow9Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-8']")
		private static WebElement  workFlowRow9Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-9']")
		private static WebElement  workFlowRow9Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-10']")
		private static WebElement  workFlowRow9Column5;	
		
		

	    // 10 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_10-1']//input")
		private static WebElement workFlowRadioBtnRowTen;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-6']")
		private static WebElement  workFlowRow10Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-7']")
		private static WebElement  workFlowRow10Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-8']")
		private static WebElement  workFlowRow10Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-9']")
		private static WebElement  workFlowRow10Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-10']")
		private static WebElement  workFlowRow10Column5;	
		
		

	    // 11 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_11-1']//input")
		private static WebElement workFlowRadioBtnRowElevan;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-6']")
		private static WebElement  workFlowRow11Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-7']")
		private static WebElement  workFlowRow11Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-8']")
		private static WebElement  workFlowRow11Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-9']")
		private static WebElement  workFlowRow11Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-10']")
		private static WebElement  workFlowRow11Column5;	
		
		

	    // 12 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_12-1']//input")
		private static WebElement workFlowRadioBtnRowTwevle;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-6']")
		private static WebElement  workFlowRow12Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-7']")
		private static WebElement  workFlowRow12Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-8']")
		private static WebElement  workFlowRow12Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-9']")
		private static WebElement  workFlowRow12Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-10']")
		private static WebElement  workFlowRow12Column5;	
		

	    // 13 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_13-1']//input")
		private static WebElement workFlowRadioBtnRowThirteen;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-6']")
		private static WebElement  workFlowRow13Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-7']")
		private static WebElement  workFlowRow13Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-8']")
		private static WebElement  workFlowRow13Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-9']")
		private static WebElement  workFlowRow13Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-10']")
		private static WebElement  workFlowRow13Column5;	
		
		

	    // 14 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_14-1']//input")
		private static WebElement workFlowRadioBtnRowFourteen;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-6']")
		private static WebElement  workFlowRow14Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-7']")
		private static WebElement  workFlowRow14Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-8']")
		private static WebElement  workFlowRow14Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-9']")
		private static WebElement  workFlowRow14Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-10']")
		private static WebElement  workFlowRow14Column5;	
		
		

	    // 15 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_15-1']//input")
		private static WebElement workFlowRadioBtnRowFifteen;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-6']")
		private static WebElement  workFlowRow15Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-7']")
		private static WebElement  workFlowRow15Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-8']")
		private static WebElement  workFlowRow15Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-9']")
		private static WebElement  workFlowRow15Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-10']")
		private static WebElement  workFlowRow15Column5;	
		
		

		

	    // 16 Row
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_16-1']//input")
		private static WebElement workFlowRadioBtnRowSixteen;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-6']")
		private static WebElement  workFlowRow16Column1;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-7']")
		private static WebElement  workFlowRow16Column2;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-8']")
		private static WebElement  workFlowRow16Column3;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-9']")
		private static WebElement  workFlowRow16Column4;
		
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-10']")
		private static WebElement  workFlowRow16Column5;	
		
		
		@FindBy(xpath="//input[@id='id_header_67108924']")
		private static WebElement  purchaseVoucherNewNarration;

		@FindBy(xpath="//input[@id='id_header_67108931']")
		private static WebElement  purchaseVoucherNewTest;
		
		@FindBy(xpath="//input[@id='id_header_10']")
		private static WebElement  voucherHeaderCurrency;

		@FindBy(xpath="//input[@id='id_header_145']")
		private static WebElement  voucherHeaderLocalExchangeRate;	
		
		@FindBy(xpath="//input[@id='id_header_11']")
		private static WebElement  voucherHeaderExchangeRate;
		
		
		@FindBy(xpath="//tr[@id='trRender_1']//td//input")
		private static WebElement  grid_ChkBox1;
		
		@FindBy(xpath="//tr[@id='trRender_2']//td//input")
		private static WebElement  grid_ChkBox2;
		
		@FindBy(xpath="//span[@class='icon-convert icon-font6']")
		private static WebElement  convertBtn;
		
		@FindBy(xpath="//input[@id='id_header_2']")
		private static WebElement  dateTxt;
		
		@FindBy(xpath="//input[@id='id_header_268435459']")
		private static WebElement  departmentTxt;
		
		@FindBy(xpath="//input[@id='id_header_268435460']")
		private static WebElement  wareHouseTxt;
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr/td")
		private static List<WebElement> voucherGridBodyList;
		

	    @FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_26']")
		private static WebElement  QtyAmount;
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_28']")
		private static WebElement  GrossAmount;
		
		@FindBy(xpath="//span[@class='col-xs-6 icon-expand icon-font6 no_padding_left_right theme_color-inverse']")
		private static WebElement  new_footerExpandBtn;
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
		private static WebElement  netLabel;
		
		@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
		private static WebElement  netAmount;
		
		@FindBy(xpath="//div[@id='id_transactionentry_summary']//div[2]//div[2]")
		private static WebElement PVNFooterAvgRateO;


		public boolean checkPendingLinksThroughConvertOptionWithSelectingRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
	        grid_ChkBox1.click();
	               
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertBtn));
	        convertBtn.click();
	        
	        boolean res=false;
	        
	        try
	        {
	        	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
	        	String actMessageonConvert=errorMessage.getText();
	        	
	        	String expMessage="Link data loaded";
	        	
	        	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
	        	errorMessageCloseBtn.click();
	        	
	        	if(actMessageonConvert.startsWith(expMessage))
	        	{
	        		res=true;
	        	}
	        	else
	        	{
	        		res=false;
	        	}
	        }
	        catch(Exception e)
	        {
	        	System.err.println("UNABLE TO TRACE ERROR MESSAGE");
	        	System.err.println(e.getMessage());
	        	
	        	res=false;
	        }
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			
			String actvendorAccountTxt=vendorAccountTxt.getAttribute("value");
			String expvendorAccountTxt="vendor A";
			
			System.out.println("actvendorAccountTxt : "+actvendorAccountTxt);
			System.out.println("expvendorAccountTxt : "+expvendorAccountTxt);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
		
			String actwareHouseTxt=wareHouseTxt.getAttribute("value");
			String expwareHouseTxt="HYDERABAD";
			
			System.out.println("actwareHouseTxt : "+actwareHouseTxt);
			System.out.println("expwareHouseTxt : "+expwareHouseTxt);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
			new_footerExpandBtn.click();
			
			
			
			String actPvVoucherFooterQty,actPvVoucherFooterGross,actPvVoucherFooterNet,actPvVoucherFooterAvgRateO;
			
			
			String expPvVoucherFooterQty,expPvVoucherFooterGross,expPvVoucherFooterNet,expPvVoucherFooterAvgRateO;
			
			
			int voucherGridBodyListCount = voucherGridBodyList.size();
			
			ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
			
			for(int i=0;i<voucherGridBodyListCount;i++)
			{
				
				String data = voucherGridBodyList.get(i).getText();
				
				
				voucherGridBodyListArray.add(data);
			}
			
			
			String actvoucherGridBodyList = voucherGridBodyListArray.toString();
			
			String expvoucherGridBodyList = "[1, BR COGS ITEM, Dozs, 0, 0.00, 10.00, PurOrd:1, 15.00, 150.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
			
			System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
			System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
			
			
			
			expPvVoucherFooterNet="150.00";
			expPvVoucherFooterQty="10.00";
			expPvVoucherFooterGross="150.00";
			expPvVoucherFooterAvgRateO="0.00";
					
				
			
			System.out.println(netAmount.getText());
			System.out.println(QtyAmount.getText());
			System.out.println(GrossAmount.getText());
			System.out.println(PVNFooterAvgRateO.getText());
			
			
			 
			
			actPvVoucherFooterNet=netAmount.getText();
			actPvVoucherFooterQty=QtyAmount.getText();
			actPvVoucherFooterGross=GrossAmount.getText();
			actPvVoucherFooterAvgRateO=PVNFooterAvgRateO.getText();
			 
			System.out.println("************************************* checkPendingLinksThroughConvertOptionWithSelectingRow  *********************************");

			       
	        System.out.println("PvVoucherFooterNet          :  " + actPvVoucherFooterNet 	 +" Value Expected : " + expPvVoucherFooterNet);
	        System.out.println("PvVoucherFooterQty          :  " + actPvVoucherFooterQty  	 +" Value Expected : " + expPvVoucherFooterQty);
	        System.out.println("PvVoucherFooterGross        :  " + actPvVoucherFooterGross	 +" Value Expected : " + expPvVoucherFooterGross);
	        System.out.println("PvVoucherFooterAvgRateO     :  " + actPvVoucherFooterAvgRateO+" Value Expected : " + expPvVoucherFooterAvgRateO);
	        
	       
			
			if(res==true				
					&& actPvVoucherFooterQty.equalsIgnoreCase(expPvVoucherFooterQty) && actPvVoucherFooterGross.equalsIgnoreCase(expPvVoucherFooterGross) 
					&& actPvVoucherFooterNet.equalsIgnoreCase(expPvVoucherFooterNet) && actPvVoucherFooterAvgRateO.equalsIgnoreCase(expPvVoucherFooterAvgRateO)
					
					&& actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList)

					&& actvendorAccountTxt.equalsIgnoreCase(expvendorAccountTxt) && actwareHouseTxt.equalsIgnoreCase(expwareHouseTxt))
			{
				System.out.println("Test Pass : Saved Data is As Expected");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Saved Data is NOT As Expected");
				return false;
			}

		}

		@FindBy(xpath="//span[@id='btnPick']")
		private static WebElement  billRefPickIcon;	
		
		@FindBy(xpath="//*[@id='txtNewReference']")
		private static WebElement  billRefNewRefTxt;	
		
		@FindBy(xpath="//span[@id='btnOk']")
		private static WebElement  billRefOkBtn;
		
		@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
	    private static List<WebElement> departmentListCount;
		
		@FindBy(xpath="//input[@id='id_header_3']")
		private static WebElement  purchaseAccountTxt;
		
		@FindBy(xpath="//tbody[@id='id_header_3_table_body']/tr/td[2]")
		private static List<WebElement> purchaseAccountListCount; 


		public boolean checkSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys(Keys.SPACE);
			
			int count=purchaseAccountListCount.size();
			
			System.err.println(count);
			
			for(int i=0 ; i < count ;i++)
			{
				String data=purchaseAccountListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					purchaseAccountListCount.get(i).click();
					
					break;
				}
			}
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("DUBAI"))
				{
					departmentListCount.get(i).click();
					
					break;
				}
			}
				
			departmentTxt.sendKeys(Keys.TAB);	
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
			vouchersaveBtn.click();
			
			Thread.sleep(2000);
			
			click(billRefNewRefTxt);
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
		
			Thread.sleep(2000);
			
			boolean savingMessage=checkVoucherSavingMessage(docno);
			  
			System.out.println("************************************* CheckSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields  *********************************");
			System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
			
			if (savingMessage==true)
			{
				System.out.println("Voucher Saved");
				return true;
			}
			else
			{
				System.out.println("Voucher Not Saved");
				return false;
			}
		}
		

		
		
		
		public boolean checkEraseAllTransactionsAfterIntialCheck() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			Thread.sleep(2000);
			
			String expMessage = "Data deleted successfully.";
			
			String actMessage = checkValidationMessage(expMessage);
			  
			System.out.println("Message  :  "+actMessage +" Value Expected : "+expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Voucher Saved");
				
				return true;
			}
			else
			{
				System.out.println("Voucher Not Saved");
				
				return false;
			}
		}
		
		@FindBy(xpath="//div[@id='Workflow_Mapping_dialog']//tr[1]//td[1]")
		private static WebElement mapFirstRowIndex;
		
		@FindBy(xpath="//span[@class='icon-delete icon-font8']")
		private static WebElement  mapdeleteRowBtn;
		
		
		public boolean checkUpdatingMapFieldsInBetweenPurchaseOrdersAndPvn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
			settingsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
			designWorkflowbtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
			workflowNameTxt.click();
			workflowNameTxt.sendKeys("PurchasesFlow");
			Thread.sleep(2000);
			workflowNameTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(1000);
			
			draggedPurchasesVouchersN.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
			link3TO4.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MapBtn));
			MapBtn.click();
			
			Thread.sleep(3000);
			
			for(int i=0;i<20;i++)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mapFirstRowIndex));
				mapFirstRowIndex.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mapdeleteRowBtn));
				mapdeleteRowBtn.click();
				
				getWaitForAlert();
				
				getAlert().accept();
				
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseFieldRow1));
			baseFieldRow1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseFieldDropDown));
			Select baseFieldDropDownselect = new Select(baseFieldDropDown);
			
			baseFieldDropDownselect.selectByVisibleText("Warehouse");
			baseFieldDropDown.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkFieldDropDown));
			Select linkFieldDropDownselect = new Select(linkFieldDropDown);
			
			linkFieldDropDownselect.selectByVisibleText("Warehouse");
			linkFieldDropDown.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkMappingOkBtn));
			linkMappingOkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="WorkFlow Saved Successfully";
		  		
			String actMessage=checkValidationMessage(expMessage);
			  		
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
		
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
				 userNameDisplay.click();
				  
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				 logoutOption.click();
				 
				 Thread.sleep(3000);
				 
				 LoginPage lp=new LoginPage(getDriver()); 
					
			     String unamelt="su";
			  
			     String pawslt="su";
			      
			     lp.enterUserName(unamelt);
			    
			     lp.enterPassword(pawslt);
			    
			     lp.clickOnSignInBtn();
			    
			 	 Thread.sleep(5000);
				 
			 	 return true;
			}
			else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
				 userNameDisplay.click();
				  
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				 logoutOption.click();
				 
				 Thread.sleep(3000);
				 
				 LoginPage lp=new LoginPage(getDriver()); 
					
			     String unamelt="su";
			  
			     String pawslt="su";
			      
			     lp.enterUserName(unamelt);
			    
			     lp.enterPassword(pawslt);
			    
			     lp.clickOnSignInBtn();
			    
			 	 Thread.sleep(5000);
				 
			 	 return false;
			}
		}
		
		
		
		
		public boolean checkSavingPurchaseOrdersAfterUpdatingMapFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
			inventoryTransactionsPurchasesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
			purchasesOrdersVoucher.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys(Keys.SPACE);
			 
			Thread.sleep(2000);
			 
			 int vendorcount=vendorAccountListCount.size();
			 
			 System.err.println(vendorcount);
			 
			 for(int i=0 ; i < vendorcount ;i++)
			 {
				 String data=vendorAccountListCount.get(i).getText();
				 
				 if(data.equalsIgnoreCase("Vendor A"))
				 {
					 vendorAccountListCount.get(i).click();
					 
					 break;
				 }
			 }
				
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys(Keys.SPACE);
			
			int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
			
			for(int i=0 ; i < warehousecount ;i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("HYDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("BR COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("10");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("15");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
			vouchersaveBtn.click();
			
			boolean savingMessage=checkVoucherSavingMessage(docno);
			   
			System.out.println("************************************* checkSavingPurchaseOrdersAfterUpdatingMapFields  *********************************");
			
			System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		
			if (savingMessage==true)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
		
		
		
		
		public boolean checkPendingLinksThroughConvertOptionAfterMapFieldsUpdating() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePagePendingOrdersLinks));	
			homePagePendingOrdersLinks.click();
				
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
	        grid_ChkBox1.click();
	               
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertBtn));
	        convertBtn.click();
	        
	        String expMessage = "Link data loaded";
	        String actMessage = checkValidationMessage(expMessage);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			
			String actvendorAccountTxt=vendorAccountTxt.getAttribute("value");
			String expvendorAccountTxt="Vendor A";
			
			System.out.println("actvendorAccountTxt : "+actvendorAccountTxt);
			System.out.println("expvendorAccountTxt : "+expvendorAccountTxt);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
		
			String actwareHouseTxt=wareHouseTxt.getAttribute("value");
			String expwareHouseTxt="HYDERABAD";
			
			System.out.println("actwareHouseTxt : "+actwareHouseTxt);
			System.out.println("expwareHouseTxt : "+expwareHouseTxt);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
			new_footerExpandBtn.click();
			
			
			
			String actPvVoucherFooterQty,actPvVoucherFooterGross,actPvVoucherFooterNet,actPvVoucherFooterAvgRateO;
			
			
			String expPvVoucherFooterQty,expPvVoucherFooterGross,expPvVoucherFooterNet,expPvVoucherFooterAvgRateO;
			
			
			int voucherGridBodyListCount = voucherGridBodyList.size();
			
			ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
			
			for(int i=0;i<voucherGridBodyListCount;i++)
			{
				
				String data = voucherGridBodyList.get(i).getText();
				
				
				voucherGridBodyListArray.add(data);
			}
			
			
			String actvoucherGridBodyList = voucherGridBodyListArray.toString();
			
			String expvoucherGridBodyList = "[1, BR COGS ITEM, Dozs, 0, 0.00, 10.00, PurOrd:1, 15.00, 150.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
			
			System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
			System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
			
			
			expPvVoucherFooterNet="150.00";
			expPvVoucherFooterQty="10.00";
			expPvVoucherFooterGross="150.00";
			expPvVoucherFooterAvgRateO="0.00";
					
			
			System.out.println(netAmount.getText());
			System.out.println(QtyAmount.getText());
			System.out.println(GrossAmount.getText());
			System.out.println(PVNFooterAvgRateO.getText());
			
			
			actPvVoucherFooterNet=netAmount.getText();
			actPvVoucherFooterQty=QtyAmount.getText();
			actPvVoucherFooterGross=GrossAmount.getText();
			actPvVoucherFooterAvgRateO=PVNFooterAvgRateO.getText();
			 
			System.out.println("************************************* checkPendingLinksThroughConvertOptionWithSelectingRow  *********************************");

			       
	        System.out.println("PvVoucherFooterNet          :  " + actPvVoucherFooterNet 	 +" Value Expected : " + expPvVoucherFooterNet);
	        System.out.println("PvVoucherFooterQty          :  " + actPvVoucherFooterQty  	 +" Value Expected : " + expPvVoucherFooterQty);
	        System.out.println("PvVoucherFooterGross        :  " + actPvVoucherFooterGross	 +" Value Expected : " + expPvVoucherFooterGross);
	        System.out.println("PvVoucherFooterAvgRateO     :  " + actPvVoucherFooterAvgRateO+" Value Expected : " + expPvVoucherFooterAvgRateO);
	        
			if(actMessage.startsWith(expMessage)				
					&& actPvVoucherFooterQty.equalsIgnoreCase(expPvVoucherFooterQty) && actPvVoucherFooterGross.equalsIgnoreCase(expPvVoucherFooterGross) 
					&& actPvVoucherFooterNet.equalsIgnoreCase(expPvVoucherFooterNet) && actPvVoucherFooterAvgRateO.equalsIgnoreCase(expPvVoucherFooterAvgRateO)
					
					&& actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList)

					&& actvendorAccountTxt.equalsIgnoreCase(expvendorAccountTxt) && actwareHouseTxt.equalsIgnoreCase(expwareHouseTxt))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		

		public boolean CheckSavingAndDeleteAllTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
			purchaseAccountTxt.click();
			purchaseAccountTxt.sendKeys(Keys.SPACE);
			
			int count=purchaseAccountListCount.size();
			
			System.err.println(count);
			
			for(int i=0 ; i < count ;i++)
			{
				String data=purchaseAccountListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Purchase"))
				{
					purchaseAccountListCount.get(i).click();
					
					break;
				}
			}
			
			purchaseAccountTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.click();
			vendorAccountTxt.sendKeys(Keys.END);
			vendorAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			vendorAccountTxt.sendKeys(Keys.SPACE);
			
			Thread.sleep(2000);
			
			int countv=vendorAccountListCount.size();
			
			System.err.println(countv);
			
			for(int i=0 ; i < countv ;i++)
			{
				String data=vendorAccountListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Vendor A"))
				{
					vendorAccountListCount.get(i).click();
					
					break;
				}
			}
			
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("DUBAI"))
				{
					departmentListCount.get(i).click();
					
					break;
				}
			}
				
			departmentTxt.sendKeys(Keys.TAB);	
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
			vouchersaveBtn.click();
			
			Thread.sleep(2000);
			
			click(billRefNewRefTxt);
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
		
			boolean savingMessage=checkVoucherSavingMessage(docno);
			  
			System.out.println("************************************* CheckSavingAndDeleteAllTransactions  *********************************");
			System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
			
			checkEraseAllTransactionsLogoutAndLogin();
			
			if (savingMessage==true)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		

		public boolean checkRaiseLinkDocumentWhenBaseIsSavedOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			Thread.sleep(2000);
			prongHornExit();
			Thread.sleep(10000);
			checkLogoutAndLoginWithoutPronghorn();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
			settingsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
			designWorkflowbtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
			workflowNameTxt.click();
			workflowNameTxt.sendKeys("PurchasesFlow");
			Thread.sleep(2000);
			workflowNameTxt.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			draggedPurchasesVouchersN.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
			link3TO4.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
			settingTab.click();
			
			if(raiseLinkDocumentWhenbaseIsSavedChkbox.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(raiseLinkDocumentWhenbaseIsSavedChkbox));
				raiseLinkDocumentWhenbaseIsSavedChkbox.click();
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="WorkFlow Saved Successfully";
		  		
			String actMessage=checkValidationMessage(expMessage);
			
			checkLogoutAndLogin();
			
	
			  		
			Thread.sleep(2000);
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();*/
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
			inventoryMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
			inventoryTransactionsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
			inventoryTransactionsPurchasesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
			purchasesOrdersVoucher.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			 vendorAccountTxt.sendKeys(Keys.SPACE);
			 
			 Thread.sleep(2000);
			 
			 int vendorcount=vendorAccountListCount.size();
			 
			 System.err.println(vendorcount);
			 
			 for(int i=0 ; i < vendorcount ;i++)
			 {
				 String data=vendorAccountListCount.get(i).getText();
				 
				 if(data.equalsIgnoreCase("Vendor A"))
				 {
					 vendorAccountListCount.get(i).click();
					 
					 break;
				 }
			 }
				
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys(Keys.SPACE);
			
			int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
			
			for(int i=0 ; i < warehousecount ;i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("HYDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("BR COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("10");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("15");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
			vouchersaveBtn.click();
			
			boolean savingMessage=checkVoucherSavingMessage(docno);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
			financialsTransactionsPurchaseMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
			purchaseVoucherNew.click();
			
			Thread.sleep(3000);
			
			int actrowCount=voucherBodyGridRowCount.size()-1;
			int exprowCount=1;
			  
			System.out.println("************************************* checkRaiseLinkDocumentWhenBaseIsSavedOption  *********************************");
			System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
			System.out.println("rowCount  : "+actrowCount+" Value Expected : "+exprowCount);
			
			Thread.sleep(3000);
			
			//Thread.sleep(2000);
			prongHornExit();
			Thread.sleep(10000);
			checkLogoutAndLoginWithoutPronghorn();
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
			settingsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
			designWorkflowbtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
			workflowNameTxt.click();
			workflowNameTxt.sendKeys("PurchasesFlow");
			Thread.sleep(2000);
			workflowNameTxt.sendKeys(Keys.TAB);

			Thread.sleep(2000);
			
			draggedPurchasesVouchersN.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
			link3TO4.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
			settingTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(raiseLinkDocumentWhenbaseIsSavedChkbox));
			
			if(raiseLinkDocumentWhenbaseIsSavedChkbox.isSelected()==true)
			{
				raiseLinkDocumentWhenbaseIsSavedChkbox.click();
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage1="WorkFlow Saved Successfully";
		  		
			String actMessage1=checkValidationMessage(expMessage1);
			
			checkEraseAllTransactionsLogoutAndLogin();
			
			if (savingMessage==true && actrowCount==exprowCount)
			{
				System.out.println("Voucher Saved");
				return true;
			}
			else
			{
				System.out.println("Voucher Not Saved");
				return false;
			}
		}
		
		

		@FindBy(xpath="//*[@id='id_transaction_entry_heading2']")
		private static WebElement  purchaseVoucherWorlFlowText;
		

		
		//Consume the links through CTRL + L in linked voucher
		@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
		private static WebElement workFlowExpandBtn;

		@FindBy(xpath="//select[@id='id_transactionentry_workflow_dropdown']")
		private static WebElement  workFlowDropdown;

		@FindBy(xpath="//select[@id='id_transactionentry_workflow_searchon']")
		private static WebElement  searchOnDropdownCL;

		@FindBy(xpath="//select[@id='id_transactionentry_workflow_searchtype']")
		private static WebElement  containingDropdownCL;
				
		@FindBy(xpath="//input[@id='id_transactionentry_workflow_search_input']")
		private static WebElement  workFlowSearchTxtCL;

		@FindBy(xpath="//span[@class='toolbar_button_image icon-custamize icon-font7']")
		private static WebElement  workFlowCustomizeBtnCL;
		
		@FindBy(xpath="//*[@id='Export']")
		private static WebElement  workFlowExportBtn;
		
		@FindBy(xpath="//*[@id='Import']/div[1]/span")
		private static WebElement  workFlowImportBtn;
		
		@FindBy(xpath="//p[contains(text(),'Warehouse Code')]")
		private static WebElement  workFlowWarehouseCodeTab;
		
		@FindBy(xpath="//a[contains(text(),'Remove Column')]")
		private static WebElement  workFlowRemoveColumnBtn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_row_heading']/th/div[2]")
		private static List<WebElement>  workflowHeaderList;
		
		

		@FindBy(xpath="//span[@class='icon-ok icon-font7']")
		private static WebElement  workFlowOkBtnCL;

		@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
		private static WebElement  workFlowMinimizeBtnCL;

		@FindBy(xpath="//input[@id='id_transaction_entry_detail_workflow_control_heading_ctrl_1']")
		
		private static WebElement  workFlowHeaderChkBoxCL;

		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_control_heading_6']//div[contains(text(),'Voucher No')]")
		private static WebElement  workFlowHeaderVoucherNoCL;

		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_control_heading_7']//div[contains(text(),'Date')]")
		private static WebElement  workFlowHeaderDateCL;

		@FindBy(xpath="//div[contains(text(),'Name')]")
		private static WebElement  workFlowHeaderNameCL;

		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_control_heading_9']//div[contains(text(),'Quantity')]")
		private static WebElement  workFlowHeaderQtyCL;

		@FindBy(xpath="//div[contains(text(),'Suspended')]")
		private static WebElement  workFlowHeaderSuspendCL;

		//1 Row CRTL + L

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td[2]/input")
		private static WebElement workFlowRow1ChkBoxCL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td[7]")
		private static WebElement  workFlowRow1Column1CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td[8]")
		private static WebElement  workFlowRow1Column2CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td[9]")
		private static WebElement  workFlowRow1Column3CL;
				
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td[10]")
		private static WebElement  workFlowRow1Column4CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td[11]")
		private static WebElement  workFlowRow1Column5CL;


		//2 Row CRTL + L

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[2]/input")
		private static WebElement workFlowRow2ChkBoxCL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[7]")
		private static WebElement  workFlowRow2Column1CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[8]")
		private static WebElement  workFlowRow2Column2CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[9]")
		private static WebElement  workFlowRow2Column3CL;
				
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[10]")
		private static WebElement  workFlowRow2Column4CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[11]")
		private static WebElement  workFlowRow2Column5CL;


		//3 Row CRTL + L

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td[2]/input")
		private static WebElement workFlowRow3ChkBoxCL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td[7]")
		private static WebElement  workFlowRow3Column1CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td[8]")
		private static WebElement  workFlowRow3Column2CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td[9]")
		private static WebElement  workFlowRow3Column3CL;
				
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td[10]")
		private static WebElement  workFlowRow3Column4CL;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td[11]")
		private static WebElement  workFlowRow3Column5CL;
		
		@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_body']")
		private static WebElement workFlowTableBody;
		
		
	
	public boolean checkAutoCLoseInDaysOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("10");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("15");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    System.out.println();
	    
	    
	    // Create a calendar object with today date. Calendar is in java.util pakage.
	    Calendar calendar = Calendar.getInstance();
	
	    // Move calendar to yesterday
	    calendar.add(Calendar.DATE, 2);
	
	    // Get current date of calendar which point to the yesterday now
	    Date yesterday = calendar.getTime();
	
	    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
	    
	    System.err.println(dfr.format(yesterday).toString());
	    
	    
	    dateTxt.sendKeys(Keys.LEFT);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(Keys.HOME);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(dfr.format(yesterday).toString());
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	   
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		boolean actworkFlowHeaderChkBoxCL = workFlowHeaderChkBoxCL.isDisplayed();
		boolean expworkFlowHeaderChkBoxCL = true;
		
		Thread.sleep(2000);
	    
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoCloseTxt));
		autoCloseTxt.click();
		autoCloseTxt.clear();
		autoCloseTxt.sendKeys("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		checkLogoutAndLogin();
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	    
	    dateTxt.sendKeys(Keys.LEFT);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(Keys.HOME);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(dfr.format(yesterday).toString());
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
	    boolean actpurchaseVoucherWorlFlowText = workFlowTableBody.getText().isEmpty();
		boolean exppurchaseVoucherWorlFlowText = true;
		
		System.err.println(workFlowTableBody.getText());
		  
		System.out.println("************************************* checkAutoCLoseInDaysOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("workFlowHeaderChkBoxCL : "+actworkFlowHeaderChkBoxCL+" Value Expected : "+expworkFlowHeaderChkBoxCL);
		System.out.println("purchaseVoucherWorlFlowText : "+actpurchaseVoucherWorlFlowText+" Value Expected : "+exppurchaseVoucherWorlFlowText);
		
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoCloseTxt));
		autoCloseTxt.click();
		//autoCloseTxt.clear();
		
		/*autoCloseTxt.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		autoCloseTxt.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		*/
		autoCloseTxt.sendKeys(Keys.END);
		Thread.sleep(1500);
		autoCloseTxt.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1500);
		autoCloseTxt.sendKeys("0");
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(3000);
			
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();*/
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actworkFlowHeaderChkBoxCL==expworkFlowHeaderChkBoxCL
				&& actpurchaseVoucherWorlFlowText==exppurchaseVoucherWorlFlowText)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_body']/tr")
	private static List<WebElement>  LinkRowCount;
	
	

	public boolean checkConsolidateOnDocumentWhenDisplayingInSelection() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		 checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		for(int a=1; a<4; a++)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys(Keys.END);
			pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
			pvWareHouseTxt.sendKeys(Keys.SPACE);
			
			int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
			
			for(int i=0 ; i < warehousecount ;i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("HYDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("BR COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
			enter_Discount.click();
			enter_Discount.sendKeys(Keys.TAB);
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 3;
	    
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(checkConsolidateDocWhenDisplayingInSelectionChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkConsolidateDocWhenDisplayingInSelectionChkBox));
			checkConsolidateDocWhenDisplayingInSelectionChkBox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		//checkLogoutAndLogin();
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
	    
	    prongHornOn();
	    
	    Thread.sleep(2500);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
	    
	    
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
	    int actLinkRowCountValueAfterOptionSelection = rowCountInLinkScreen1.size();
		int expLinkRowCountValueAfterOptionSelection = 1;
		
		String actQuantity = workFlowRow1Column4CL.getText();
		String expQuantity = "36.00";
		  
		System.out.println("************************************* checkConsolidateOnDocumentWhenDisplayingInSelection  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue  : "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue );
		System.out.println("LinkRowCountValueAfterOptionSelection : "+actLinkRowCountValueAfterOptionSelection+" Value Expected : "+expLinkRowCountValueAfterOptionSelection);
		System.out.println("Quantity : "+actQuantity+" Value Expected : "+expQuantity);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(checkConsolidateDocWhenDisplayingInSelectionChkBox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkConsolidateDocWhenDisplayingInSelectionChkBox));
			checkConsolidateDocWhenDisplayingInSelectionChkBox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		
		Thread.sleep(2000);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);*/
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actLinkRowCountValue ==expLinkRowCountValue 
				&& actLinkRowCountValueAfterOptionSelection==expLinkRowCountValueAfterOptionSelection && actQuantity.equalsIgnoreCase(expQuantity))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;

	@FindBy(xpath="//input[@id='id_body_33554460']")
	private static WebElement so_enter_AQTxt;
	
	@FindBy(xpath="//input[@id='id_body_33554461']")
	private static WebElement so_enter_FQTxt;

	@FindBy(xpath="//div[@class='col-sm-12 footer_button_image']//span[@class='icon-close icon-font6']")
	private static WebElement res_CloseBtn;
	
	@FindBy(xpath="//tbody[@id='id_header_3_table_data_body']/tr")
	private static List<WebElement> salesAccountListCount; 

    @FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
	private static List<WebElement> customerAccountListCount; 
    
    @FindBy(xpath="//a[@id='2014']//span[contains(text(),'Sales')]")
	private static WebElement  financialTransactionSalesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Sales invoice VAT')]")
	private static WebElement  salesInvoiceVATVoucher;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Sales invoice VAT')]")
	private static WebElement draggedSalesInvoicesVAT; 
	
	public boolean checkCheckStockWhileLinkingOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		try
		{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoyTransactionsSalesMenu));
		inventoyTransactionsSalesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersVoucher));
		salesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.click();
		customerAccountTxt.sendKeys(Keys.SPACE);
		 
		int customercount=customerAccountListCount.size();
		 
		System.err.println(customercount);
		 
		for(int i=0 ; i < customercount ;i++)
		{
			String data=customerAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Customer A"))
			{
				 customerAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		customerAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
			
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.END);
		enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_AQTxt));
		so_enter_AQTxt.sendKeys("6");
		so_enter_AQTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(so_enter_FQTxt));
		so_enter_FQTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys(Keys.TAB);
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(res_CloseBtn));
			res_CloseBtn.click();
		}
		catch(Exception e)
		{
			System.err.println("No Pop Up Displayed");
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkValidationMessage("");
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkUserFriendlyMessage();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	    customerAccountTxt.click();
	    customerAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		String expMessageinSalesInvoice = "Items having no stock have been removed from list.";
		String actMessageinSalesInvoice = checkValidationMessage(expMessageinSalesInvoice);
		
		System.out.println("actMessageinSalesInvoice : "+actMessageinSalesInvoice);
		System.out.println("expMessageinSalesInvoice : "+expMessageinSalesInvoice);
		
		 int voucherGridBodyListCount = voucherGridBodyList.size();
		 
		 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
		 
		 for(int i=10;i<voucherGridBodyListCount;i++)
		 {
			 String data = voucherGridBodyList.get(i).getText();
			 voucherGridBodyListArray.add(data);
		 }
		 
		 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
		 
		 String expvoucherGridBodyList="[]";
		 
		 prongHornExit();
		 Thread.sleep(10000);
		 checkLogoutAndLoginWithoutPronghorn();
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("Sales Flow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedSalesInvoicesVAT.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link5TO6));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
		link5TO6.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(checkstockWhileLinkingChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkstockWhileLinkingChkbox));
			checkstockWhileLinkingChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessageDW="WorkFlow Saved Successfully";
	  		
		String actMessageDW=checkValidationMessage(expMessageDW);
		  		
		Thread.sleep(2000);
		
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    
	    Thread.sleep(2500);
	    
	    prongHornOn();
	    Thread.sleep(2500);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(7000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	    customerAccountTxt.click();
	    customerAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValueAfterChange = rowCountInLinkScreen1.size();
		int expLinkRowCountValueAfterChange = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		
		 int voucherGridBodyListCountAfterChange = voucherGridBodyList.size();
		 
		 ArrayList<String> voucherGridBodyListArrayAfterChange = new ArrayList<String>();
		 
		 for(int i=10;i<voucherGridBodyListCountAfterChange;i++)
		 {
			 String data = voucherGridBodyList.get(i).getText();
			 voucherGridBodyListArrayAfterChange.add(data);
		 }
		 
		 String actvoucherGridBodyListAfterChange=voucherGridBodyListArrayAfterChange.toString();
		 
		 String expvoucherGridBodyListAfterChange="[]";
		  
		System.out.println("************************************* checkCheckStockWhileLinkingOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue  : "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue );
		System.out.println("MessageinSalesInvoice : "+actMessageinSalesInvoice+" Value Expected : "+expMessageinSalesInvoice);
		System.out.println("LinkRowCountValueAfterOptionSelection : "+actLinkRowCountValueAfterChange+" Value Expected : "+expLinkRowCountValueAfterChange);
		System.out.println("MessageDW : "+actMessageDW+" Value Expected : "+expMessageDW);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("Sales Flow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedSalesInvoicesVAT.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link5TO6));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
		link5TO6.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(checkstockWhileLinkingChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkstockWhileLinkingChkbox));
			checkstockWhileLinkingChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessageDW1="WorkFlow Saved Successfully";
	  		
		String actMessageDW1=checkValidationMessage(expMessageDW1);
		  		
		Thread.sleep(2000);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();*/
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actLinkRowCountValue ==expLinkRowCountValue && actMessageinSalesInvoice.equalsIgnoreCase(expMessageinSalesInvoice)
				&& actLinkRowCountValueAfterChange==expLinkRowCountValueAfterChange && actMessageDW.equalsIgnoreCase(expMessageDW))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
		}
		catch(Exception e)
		{
			checkEraseAllTransactionsLogoutAndLogin();
			return false;
		}
	}
	
	
	
	
	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	private static List<WebElement> wareHouseListCount;
	
	
	@FindBy(xpath="//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
	private static WebElement  voucherHomedeleteBtn;
	
	
	public boolean checkCannotExceedTheBaseValueOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Hyderabad"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		grid_ChkBox1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomedeleteBtn));
		voucherHomedeleteBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
		checkUserFriendlyMessage();
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor1=vendorAccountListCount.size();
		
		System.err.println(countVendor1);
		
		for(int i=0 ; i < countVendor1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount1=wareHouseListCount.size();
		
		System.err.println(warehouseCount1);
			
		for(int i=0 ; i < warehouseCount1 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();	
		
		Thread.sleep(1200);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		System.out.println("************************************* checkCannotExceedTheBaseValueOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true && savingMessage1==true && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_close']")
	private static WebElement  new_CloseBtn;
	
	@FindBy(xpath="//*[@id='tblBodyTransRender']/tr[1]//td[12]")
	private static WebElement  voucherHomePgeSupendedStatus;
	
	
	@FindBy(xpath="//td[text()='True']//..//td[2]/input")
	private static WebElement  SupendedVoucherCheckBox;
	
	
	@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
	private static WebElement  voucherhomeCloseBtn;
	
	public boolean checkBaseDocumentCannotBeEditiedAfterItIsLinkedOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		Thread.sleep(2000);
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expValidationMessage = "This document is already linked to another document, and, cannot be edited.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(baseDocumentCannotBeEditedAfterItIsLinkedChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseDocumentCannotBeEditedAfterItIsLinkedChkbox));
			baseDocumentCannotBeEditedAfterItIsLinkedChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    prongHornOn();
	    
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
	
		boolean savingMessage2=checkVoucherSavingMessage(docno2);
		
		System.out.println("************************************* checkBaseDocumentCannotBeEditiedAfterItIsLinkedOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage2  :  "+savingMessage2 +" Value Expected : "+"TRUE");
		System.out.println("validationConfirmationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(baseDocumentCannotBeEditedAfterItIsLinkedChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseDocumentCannotBeEditedAfterItIsLinkedChkbox));
			baseDocumentCannotBeEditedAfterItIsLinkedChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true && savingMessage1==true && savingMessage2==true  && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	
	
	public boolean checkCloseLinkAfterDueDateElapses() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    // Create a calendar object with today date. Calendar is in java.util pakage.
	    Calendar calendar = Calendar.getInstance();
	
	    // Move calendar to yesterday
	    calendar.add(Calendar.DATE, -2);
	
	    // Get current date of calendar which point to the yesterday now
	    Date yesterday = calendar.getTime();
	
	    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
	    
	    System.out.println(dfr.format(yesterday).toString());
	    
	    dateTxt.sendKeys(Keys.LEFT);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(Keys.HOME);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(dfr.format(yesterday).toString());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount2=vendorAccountListCount.size();
		 
		System.err.println(vendorcount2);
		 
		for(int i=0 ; i < vendorcount2 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount2=pvwareHouseListCount.size();
		
		System.err.println(warehousecount2);
		
		for(int i=0 ; i < warehousecount2 ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount2=itemListCount.size();
		
		System.err.println(itemcount2);
			
		for(int i=0 ; i < itemcount2 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage2=checkVoucherSavingMessage(docno2);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 2;
	    
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
	    
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(closeLinkAfterTheDueDateElapsesChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinkAfterTheDueDateElapsesChkbox));
			closeLinkAfterTheDueDateElapsesChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1522);
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(7000);
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
	    int actLinkRowCountValueAfterOptionSelection = rowCountInLinkScreen1.size();
		int expLinkRowCountValueAfterOptionSelection = 1;
		
		  
		System.out.println("************************************* checkCloseLinkAfterDueDateElapses  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue  : "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue );
		System.out.println("LinkRowCountValueAfterOptionSelection : "+actLinkRowCountValueAfterOptionSelection+" Value Expected : "+expLinkRowCountValueAfterOptionSelection);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(closeLinkAfterTheDueDateElapsesChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinkAfterTheDueDateElapsesChkbox));
			closeLinkAfterTheDueDateElapsesChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actLinkRowCountValue ==expLinkRowCountValue 
				&& actLinkRowCountValueAfterOptionSelection==expLinkRowCountValueAfterOptionSelection )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	public boolean checkLinkIsMandatoryOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		   
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
	    
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(linkIsMandatoryChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkIsMandatoryChkbox));
			linkIsMandatoryChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(7000);
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor1=vendorAccountListCount.size();
		
		System.err.println(countVendor1);
		
		for(int i=0 ; i < countVendor1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount1=wareHouseListCount.size();
		
		System.err.println(warehouseCount1);
			
		for(int i=0 ; i < warehouseCount1 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expValidationMessage = "Provide data for mandatory fieldsL-Purchases Orders";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		  
		System.out.println("************************************* checkLinkIsMandatoryOption  *********************************");
		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage);
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(linkIsMandatoryChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkIsMandatoryChkbox));
			linkIsMandatoryChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (actMessage.equalsIgnoreCase(expMessage) && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Purchases Voucher VAT')]")
	private static WebElement  purchaseVouchersVat;
	
	public static boolean baseDocumentCannotbeEditedAfterItisLinked() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesOrders.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link4TO5));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link4TO5));
		link4TO5.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(baseDocCannotEditedBaseChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseDocCannotEditedBaseChkbox));
			baseDocCannotEditedBaseChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
	    prongHornOn();
	    Thread.sleep(1500);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    Thread.sleep(3000);
	    if(actMessage.equalsIgnoreCase(expMessage))
	    {
	    	return true;
	    	}
	    	else {
	    		return false;
	    	}
	    	
	    
	}

	public boolean checkDoNotClubWithCommonBaseOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		Thread.sleep(2000);
		baseDocumentCannotbeEditedAfterItisLinked();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RTAE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(1500);
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		Thread.sleep(2000);
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		
		Thread.sleep(2000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVat));
		purchaseVouchersVat.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePagePendingOrdersLinks));	
		homePagePendingOrdersLinks.click();
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));	
		
		String VoucherBodyTxt = voucherBodyGrid.getText();
		//boolean actVoucherBody=voucherBodyGrid.getText().isEmpty();
		boolean expVoucherBody=true;
		
		boolean actVoucherBody = false;
		System.err.println("*"+VoucherBodyTxt+"*");
		
		if (voucherBodyGrid.getText().isEmpty() || VoucherBodyTxt.equalsIgnoreCase("") || VoucherBodyTxt.equalsIgnoreCase(" ")) {
			
			 actVoucherBody=true;
			
		}
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesOrders.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link4TO5));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link4TO5));
		link4TO5.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(doNotClubWithCommonBaseChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotClubWithCommonBaseChkbox));
			doNotClubWithCommonBaseChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1522);
	    prongHornOn();
	    Thread.sleep(1522);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(7000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVat));
		purchaseVouchersVat.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePagePendingOrdersLinks));	
		homePagePendingOrdersLinks.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));	
		
		int actrowCountAfterSelection=voucherBodyGridRowCount.size()-1;
		int exprowCountAfterSelection=1;
		
		  
		System.out.println("************************************* checkDoNotClubWithCommonBaseOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue  : "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue );
		System.out.println("VoucherBody : "+actVoucherBody+" Value Expected : "+expVoucherBody);
		System.err.println("*"+VoucherBodyTxt+"*");
		System.out.println("rowCountAfterSelection : "+actrowCountAfterSelection+" Value Expected : "+exprowCountAfterSelection);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesOrders.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link4TO5));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link4TO5));
		link4TO5.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(doNotClubWithCommonBaseChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotClubWithCommonBaseChkbox));
			doNotClubWithCommonBaseChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actLinkRowCountValue ==expLinkRowCountValue && actVoucherBody==expVoucherBody
				&& actrowCountAfterSelection==exprowCountAfterSelection )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
	private static List<WebElement> voucherGridIndexChkBox;
	
	
	public boolean checkDoNotAllowSelectionIfLinksFieldsAreNotSelectedOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Vendor Account"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox));
			doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1522);
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	    vendorAccountTxt.click();
	    vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
	    String expValidationMessage = "Select all the link fields to load pending links";
	    String actValidationMessage = checkValidationMessage(expValidationMessage);
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int vendorcount1=vendorAccountListCount.size();
		
		System.err.println(vendorcount1);
		
		for(int i=0 ; i < vendorcount1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		 Thread.sleep(2000);
		    
		 List<WebElement> rowCountInLinkScreen1=LinkRowCount;
			
		 int actLinkRowCountValueAfterOptionSelection = rowCountInLinkScreen1.size();
		 int expLinkRowCountValueAfterOptionSelection = 1;
		
		  
		System.out.println("************************************* checkDoNotAllowSelectionIfLinksFieldsAreNotSelectedOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue  : "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue );
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		System.out.println("LinkRowCountValueAfterOptionSelection : "+actLinkRowCountValueAfterOptionSelection+" Value Expected : "+expLinkRowCountValueAfterOptionSelection);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Vendor Account"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox));
			doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actLinkRowCountValue ==expLinkRowCountValue && actValidationMessage.equalsIgnoreCase(expValidationMessage)
				&& actLinkRowCountValueAfterOptionSelection==expLinkRowCountValueAfterOptionSelection )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//span[@class='icon-panel icon-font6']")
	private static WebElement  jumpToBodySectionBtn;
	
	

	public boolean checkAllowBackDatedLinkingOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    System.out.println();
	    
	    // Create a calendar object with today date. Calendar is in java.util pakage.
	    Calendar calendar = Calendar.getInstance();
	
	    // Move calendar to yesterday
	    calendar.add(Calendar.DATE, 10);
	
	    // Get current date of calendar which point to the futuredate now
	    Date futuredate = calendar.getTime();
	
	    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
	    
	    System.out.println(dfr.format(futuredate).toString());
	    
	    dateTxt.sendKeys(Keys.LEFT);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(Keys.HOME);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(dfr.format(futuredate).toString());
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jumpToBodySectionBtn));
		jumpToBodySectionBtn.click();
	 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
	    wareHouseTxt.click();
	    wareHouseTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    boolean actpurchaseVoucherWorlFlowText = workFlowTableBody.getText().isEmpty();
		boolean exppurchaseVoucherWorlFlowText = true;
	    
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(allowBackdatedLinkingChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBackdatedLinkingChkbox));
			allowBackdatedLinkingChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(2000);
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		 Thread.sleep(2000);
		 
		 List<WebElement> rowCountInLinkScreen1=LinkRowCount;
			
		 int actLinkRowCountValueAfterOptionSelection = rowCountInLinkScreen1.size();
		 int expLinkRowCountValueAfterOptionSelection = 1;
		
		System.out.println("************************************* checkAllowBackDatedLinkingOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("purchaseVoucherWorlFlowText : "+actpurchaseVoucherWorlFlowText+" Value Expected : "+exppurchaseVoucherWorlFlowText);
		System.out.println("LinkRowCountValueAfterOptionSelection : "+actLinkRowCountValueAfterOptionSelection+" Value Expected : "+expLinkRowCountValueAfterOptionSelection);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(allowBackdatedLinkingChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBackdatedLinkingChkbox));
			allowBackdatedLinkingChkbox.click();
		}

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actpurchaseVoucherWorlFlowText==exppurchaseVoucherWorlFlowText
				&& actLinkRowCountValueAfterOptionSelection==expLinkRowCountValueAfterOptionSelection )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	

	

	public boolean checkRecheckBeforeTheSavingIfLinkIsConsumedElseWhereOnTheNetWorkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox));
			recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox.click();
		}

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(2000);
	    prongHornOn();
	    Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(7000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(4000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(5000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

        System.out.println("openTabs"+openTabs);

        getDriver().switchTo().window(openTabs.get(0));
        
	        getDriver().switchTo().window(openTabs.get(1));
        
        enterUrl("http://localhost/focus8w");
		
        Thread.sleep(4000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int countP=purchaseAccountListCount.size();
		
		System.err.println(countP);
		
		for(int i=0 ; i < countP ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno2);
		
		getDriver().switchTo().window(openTabs.get(0));
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		String expValidationMessage = "The link which you are trying to use, has been closed in base document.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		  
		System.out.println("************************************* checkRecheckBeforeTheSavingIfLinkIsConsumedElseWhereOnTheNetWorkOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		getDriver().switchTo().window(openTabs.get(1));
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_W);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_W);
		
		System.err.println("Before Restore");
		
		getDriver().switchTo().window(openTabs.get(0));
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox));
			recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	


	public boolean checkUseThisLinkOnlyForLoadingOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(4000);
		
		LoginPage lp=new LoginPage(getDriver()); 
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

        System.out.println("openTabs"+openTabs);

        getDriver().switchTo().window(openTabs.get(0));
        
        getDriver().switchTo().window(openTabs.get(1));
        
        enterUrl("http://localhost/focus8w");
		
		
        Thread.sleep(3000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	    
		
		boolean actpurchaseVoucherWorlFlowText = purchaseVoucherWorlFlowText.isDisplayed();
		boolean exppurchaseVoucherWorlFlowText = true;
		
		Thread.sleep(2000);
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_W);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_W);
		
		Thread.sleep(2000);

		getDriver().switchTo().window(openTabs.get(0));
		
		Thread.sleep(2000);
		 
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(useThisLinkOnlyForLoadingChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useThisLinkOnlyForLoadingChkbox));
			useThisLinkOnlyForLoadingChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(2000);
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(4000);
	    
	    
	    
	    Thread.sleep(5000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		Robot robot3 = new Robot();
		robot3.keyPress(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_T);
		robot3.keyRelease(KeyEvent.VK_CONTROL);
		robot3.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(2000);
		
		ArrayList<String> openTabs1 = new ArrayList<String>(getDriver().getWindowHandles());

        System.out.println("openTabs1"+openTabs1);

        getDriver().switchTo().window(openTabs1.get(0));
        
        getDriver().switchTo().window(openTabs1.get(1));
        
         enterUrl("http://localhost/focus8w");
		
		
        Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int countP=purchaseAccountListCount.size();
		
		System.err.println(countP);
		
		for(int i=0 ; i < countP ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno2);
		
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_W);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_W);
		  
		System.out.println("************************************* checkUseThisLinkOnlyForLoadingOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue : "+actLinkRowCountValue+" Value Expected : "+expLinkRowCountValue);
		System.out.println("LinkRowCountValue1 : "+actLinkRowCountValue1+" Value Expected : "+expLinkRowCountValue1);
		
		
		System.err.println("Before Restore");
		
		getDriver().switchTo().window(openTabs.get(0));
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(useThisLinkOnlyForLoadingChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useThisLinkOnlyForLoadingChkbox));
			useThisLinkOnlyForLoadingChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		System.err.println("After Restore");
		
		if (savingMessage==true &&  actLinkRowCountValue==expLinkRowCountValue && actLinkRowCountValue1==expLinkRowCountValue1 )
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	

	public boolean checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
	
		Thread.sleep(2000);
	
		
		int voucherGridBodyListCount = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray.add(data);
		}
		
		
		String actvoucherGridBodyList = voucherGridBodyListArray.toString();
		
		String expvoucherGridBodyList = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		String expvoucherGridBodyListS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		boolean actvoucherGridBodyListResult = false;
		boolean expvoucherGridBodyListResult = true;
		
		if (actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList) || actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyListS)) 
		{
			actvoucherGridBodyListResult=true;
		}
		
		System.err.println("VoucherGridBodyListResult : "+actvoucherGridBodyListResult+"  Value Expected  "+expvoucherGridBodyListResult);
		
		Thread.sleep(1500);
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox));
			loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(7000);

	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
	    
		Thread.sleep(2000);
	    
		int voucherGridBodyListCount1 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount1;i++)
		{
			String data = voucherGridBodyList.get(i).getText();
			
			voucherGridBodyListArray1.add(data);
		}
		
		
		String actvoucherGridBodyList1 = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyList1 = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		String expvoucherGridBodyList1S = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList1);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList1);
		
		boolean actvoucherGridBodyList1Result = false;
		boolean expvoucherGridBodyList1Result = true;
		
		if (actvoucherGridBodyList1.equalsIgnoreCase(expvoucherGridBodyList1) || actvoucherGridBodyList1.equalsIgnoreCase(expvoucherGridBodyList1S)) 
		{
			actvoucherGridBodyList1Result = true;
		}
		
		System.err.println("VoucherGridBodyList1Result : "+actvoucherGridBodyList1Result+"  Value Expected  "+expvoucherGridBodyList1Result);
		  
		System.out.println("************************************* checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue : "+actLinkRowCountValue+" Value Expected : "+expLinkRowCountValue);
		System.out.println("LinkRowCountValue1 : "+actLinkRowCountValue1+" Value Expected : "+expLinkRowCountValue1);
		System.out.println("voucherGridBodyList : "+actvoucherGridBodyList+" Value Expected : "+expvoucherGridBodyList);
		System.out.println("voucherGridBodyList1 : "+actvoucherGridBodyList1+" Value Expected : "+expvoucherGridBodyList1);
		
		Thread.sleep(1500);
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox));
			loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actLinkRowCountValue==expLinkRowCountValue && actLinkRowCountValue1==expLinkRowCountValue1
				&& actvoucherGridBodyListResult==expvoucherGridBodyListResult
				&& actvoucherGridBodyList1Result==expvoucherGridBodyList1Result)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	

	public boolean checkLinkIsOptionalIfTheDocumentIsLinkedToOtherBaseDocumentOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		Thread.sleep(1500);
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialRequisitionDragAndDrop));
		materialRequisitionDragAndDrop.click();
		
		getAction().dragAndDropBy(materialRequisitionDragAndDrop, 350, -150).build().perform();
		
		getAction().contextClick(draggedMaterialRequisition).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode0Left));
		linkNode0Left.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
		link5TO6.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		DefinitionTab.click();

		Select s=new Select(DefinitionLinkValueDropdown);
		
		s.selectByVisibleText("Quantity");
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(linkIsMandatoryChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkIsMandatoryChkbox));
			linkIsMandatoryChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		Select workflowVoucher = new Select(workFlowDropdown);
		workflowVoucher.selectByVisibleText("Purchases Orders");
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
	
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int countP=purchaseAccountListCount.size();
		
		System.err.println(countP);
		
		for(int i=0 ; i < countP ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expValidationMessage = "Provide data for mandatory fieldsL-Material Requisition";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode0Left));
		linkNode0Left.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
		link5TO6.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(linkIsMandatoryChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkIsMandatoryChkbox));
			linkIsMandatoryChkbox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkIsMandatoryChkbox));
			linkIsMandatoryChkbox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkIsOptionalIfTheDocumentIsLinkedToAnotherbasedocumentChkbox));
			linkIsOptionalIfTheDocumentIsLinkedToAnotherbasedocumentChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(6000);
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		workflowVoucher.selectByVisibleText("Purchases Orders");
		
		Thread.sleep(2000);
		
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen.size();
		int expLinkRowCountValue1 = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
	
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		Thread.sleep(1000);
		
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
		

		System.out.println("************************************* checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue : "+actLinkRowCountValue+" Value Expected : "+expLinkRowCountValue);
		System.out.println("savingMessage1 : "+savingMessage1+" Value Expected : "+"TRUE");
		
		System.out.println("Validation Message : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		checkEraseAllTransactions();
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedMaterialRequisition));
		getAction().contextClick(draggedMaterialRequisition).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggeddeleteBtn));
		draggeddeleteBtn.click();
		
		Thread.sleep(2000);
		
		if (getIsAlertPresent()==true) 
		{
			getAlert().accept();
		}

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage2="WorkFlow Saved Successfully";
	  		
		String actMessage2=checkValidationMessage(expMessage2);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) && actLinkRowCountValue==expLinkRowCountValue
				&& actLinkRowCountValue1==expLinkRowCountValue1 && savingMessage==true && savingMessage1==true)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	

	public boolean checkRaiseLinkDocumentWhenBaseIsSaved() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));	
		
		boolean actVoucherBody=voucherBodyGrid.getText().isEmpty();
		boolean expVoucherBody=true;
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		if(raiseLinkDocumentWhenbaseIsSavedChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(raiseLinkDocumentWhenbaseIsSavedChkbox));
			raiseLinkDocumentWhenbaseIsSavedChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(6000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		
		Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));	
		
		int actrowCountAfterSelection=voucherBodyGridRowCount.size();
		int exprowCountAfterSelection=2;
		
		
		System.out.println("************************************* checkRaiseLinkDocumentWhenBaseIsSaved  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("VoucherBody : "+actVoucherBody+" Value Expected : "+expVoucherBody);
		System.out.println("rowCountAfterSelection : "+actrowCountAfterSelection+" Value Expected : "+exprowCountAfterSelection);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		if(raiseLinkDocumentWhenbaseIsSavedChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(raiseLinkDocumentWhenbaseIsSavedChkbox));
			raiseLinkDocumentWhenbaseIsSavedChkbox.click();
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage2=checkValidationMessage(expMessage1);
		  		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  actVoucherBody==expVoucherBody && actrowCountAfterSelection==exprowCountAfterSelection)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	

	
	
	
	
	
	public boolean checkLoadPendingDocumentsAndBasedOnFieldOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expPOSaveMessage1 = "Voucher saved successfully";
		String expPOSaveMessage2 = "1";
		String actPOSaveMessage = checkValidationMessage(expPOSaveMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNewNarration));
		purchaseVoucherNewNarration.click();
		purchaseVoucherNewNarration.sendKeys("1");
		purchaseVoucherNewNarration.sendKeys(Keys.TAB);
	
		Thread.sleep(2000);
	
		
		int voucherGridBodyListCount = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray.add(data);
		}
		
		
		String actvoucherGridBodyList = voucherGridBodyListArray.toString();
		
		String expvoucherGridBodyList = "[1, , , , , , , , , , 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MapBtn));
		MapBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseFieldRow2));
		baseFieldRow2.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseFieldDropDown));
		Select baseFieldDropDownselect = new Select(baseFieldDropDown);
		
		baseFieldDropDownselect.selectByVisibleText("Rate");
		baseFieldDropDown.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkFieldDropDown));
		Select linkFieldDropDownselect = new Select(linkFieldDropDown);
		
		linkFieldDropDownselect.selectByVisibleText("Rate");
		linkFieldDropDown.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkMappingOkBtn));
		linkMappingOkBtn.click(); */
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		Select loadpendingDocuments = new Select(loadpendingDocumentsDropdown);
		loadpendingDocuments.selectByIndex(1);
		
		Thread.sleep(2000);
		
		Select loadFields = new Select(loadFieldsDropdown);
		loadFields.selectByIndex(1);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNewNarration));
		purchaseVoucherNewNarration.click();
		purchaseVoucherNewNarration.sendKeys("1");
		purchaseVoucherNewNarration.sendKeys(Keys.TAB);
	
		Thread.sleep(2000);
	
		
		int voucherGridBodyListCount1 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount1;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			voucherGridBodyListArray1.add(data);
		}
		
		
		String actvoucherGridBodyListAfterSelection = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyListAfterSelection = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		String expvoucherGridBodyListAfterSelectionS = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyListAfterSelection Actual    : " + actvoucherGridBodyListAfterSelection);
		System.out.println("voucherGridBodyListAfterSelection Expected  : " + expvoucherGridBodyListAfterSelection);
		
		boolean actVoucherGridBodyListAfterSelection = false;
		boolean expVoucherGridBodyListAfterSelection = true;
		
		if (actvoucherGridBodyListAfterSelection.equalsIgnoreCase(expvoucherGridBodyListAfterSelection) || actvoucherGridBodyListAfterSelection.equalsIgnoreCase(expvoucherGridBodyListAfterSelectionS)) 
		{
			actVoucherGridBodyListAfterSelection = true;
		}
		
		System.err.println("VoucherGridBodyListAfterSelection : "+actVoucherGridBodyListAfterSelection+"  Value Expected  "+expVoucherGridBodyListAfterSelection);
		
		System.out.println("************************************* checkRaiseLinkDocumentWhenBaseIsSaved  *********************************");
		System.out.println("SavingMessage  :  "+actPOSaveMessage +" Value Expected : "+expPOSaveMessage1+" "+expPOSaveMessage2);
		System.out.println("voucherGridBodyList : "+actvoucherGridBodyList+" Value Expected : "+expvoucherGridBodyList);
		System.out.println("voucherGridBodyListAfterSelection : "+actvoucherGridBodyListAfterSelection+" Value Expected : "+expvoucherGridBodyListAfterSelection);
		
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		loadpendingDocuments.selectByIndex(0);
		
		//loadFields.selectByIndex(1);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (actPOSaveMessage.startsWith(expPOSaveMessage1) && actPOSaveMessage.endsWith(expPOSaveMessage2) &&  actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList)
				&& actVoucherGridBodyListAfterSelection==expVoucherGridBodyListAfterSelection)
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  configureTransactionBtn;
	
	@FindBy(xpath="//label[contains(text(),'Preferences')]")
	private static WebElement  preferencesBtn;
	
	@FindBy(xpath="//div[@id='docCustomization']")
	private static WebElement  documentCustomization45Btn;
	
	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement  updateBtn;
	
	@FindBy(xpath="//a[@id='2560']")
	private static WebElement  purchaseOrdersBtn;
	
	@FindBy(xpath="//span[contains(text(),'Edit Layout')]")
	private static WebElement editLayoutTab;
	
	@FindBy(xpath="//i[@class='icon-copyfields icon-font7']")
	private static WebElement editLayoutLoadFieldsBtn;  
	      
	@FindBy(xpath="//select[@id='editLayout_voucherDropDown']")
	private static WebElement editLayoutLoadFieldsDropdown;  
	      
	@FindBy(xpath="//button[@class='Fbutton pull-left']")
	private static WebElement editLayoutselectAllBtn; 
	
	@FindBy(xpath="//div[@id='editLayout_copyFieldsDiv']//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	private static WebElement editLayoutokBtn;  
	
	
	public boolean checkLoadPendingDocumentsAndBasedOnFieldOptionWithExtraField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(configureTransactionBtn));
		configureTransactionBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrdersBtn));
		purchaseOrdersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTab));
		editLayoutTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutLoadFieldsBtn));
		editLayoutLoadFieldsBtn.click();
		
		Thread.sleep(1500);
		
		Select s=new Select(editLayoutLoadFieldsDropdown);
		s.selectByVisibleText("Purchase Vouchers N");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutselectAllBtn));
		editLayoutselectAllBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutokBtn));
		editLayoutokBtn.click();
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
		
		String expMessage="Data Saved Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		Thread.sleep(2000);
		
		checkLogoutAndLogin();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expPOSaveMessage1 = "Voucher saved successfully";
		String expPOSaveMessage2 = "1";
		String actPOSaveMessage = checkValidationMessage(expPOSaveMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNewTest));
		purchaseVoucherNewTest.click();
		purchaseVoucherNewTest.sendKeys("1");
		purchaseVoucherNewTest.sendKeys(Keys.TAB);
	
		Thread.sleep(2000);
	
		
		int voucherGridBodyListCount = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray.add(data);
		}
		
		
		String actvoucherGridBodyList = voucherGridBodyListArray.toString();
		
		String expvoucherGridBodyList = "[1, , , , , , , , , , 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		Select loadpendingDocuments = new Select(loadpendingDocumentsDropdown);
		loadpendingDocuments.selectByIndex(1);
		
		Select loadFields = new Select(loadFieldsDropdown);
		loadFields.selectByIndex(2);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(3000);
	    
	    
	    
	    Thread.sleep(5000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNewTest));
		purchaseVoucherNewTest.click();
		purchaseVoucherNewTest.sendKeys("1");
		purchaseVoucherNewTest.sendKeys(Keys.TAB);
		purchaseVoucherNewTest.click();
	
		Thread.sleep(2000);
	
		
		int voucherGridBodyListCount1 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount1;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray1.add(data);
		}
		
		
		String actvoucherGridBodyListAfterSelection = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyListAfterSelection = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		String expvoucherGridBodyListAfterSelectionS = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, , , , , , , , , , 3, , , , , , , , , , 4, , , , , , , , , , 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyListAfterSelection Actual    : " + actvoucherGridBodyListAfterSelection);
		System.out.println("voucherGridBodyListAfterSelection Expected  : " + expvoucherGridBodyListAfterSelection);
		
		boolean actVoucherGridBodyListAfterSelection = false;
		boolean expVoucherGridBodyListAfterSelection = true;
		
		if (actvoucherGridBodyListAfterSelection.equalsIgnoreCase(expvoucherGridBodyListAfterSelection) || actvoucherGridBodyListAfterSelection.equalsIgnoreCase(expvoucherGridBodyListAfterSelectionS)) 
		{
			actVoucherGridBodyListAfterSelection = true;
		}
		
		System.err.println("VoucherGridBodyListAfterSelection : "+actVoucherGridBodyListAfterSelection+"  Value Expected  "+expVoucherGridBodyListAfterSelection);
		
		System.out.println("************************************* checkLoadPendingDocumentsAndBasedOnFieldOptionWithExtraField  *********************************");
		System.out.println("SavingMessage  :  "+actPOSaveMessage +" Value Expected : "+expPOSaveMessage1+" "+expPOSaveMessage2);
		System.out.println("voucherGridBodyList : "+actvoucherGridBodyList+" Value Expected : "+expvoucherGridBodyList);
		System.out.println("voucherGridBodyListAfterSelection : "+actvoucherGridBodyListAfterSelection+" Value Expected : "+expvoucherGridBodyListAfterSelection);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		loadpendingDocuments.selectByIndex(0);
		
		//loadFields.selectByIndex(2);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage2="WorkFlow Saved Successfully";
	  		
		String actMessage2=checkValidationMessage(expMessage2);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (actPOSaveMessage.startsWith(expPOSaveMessage1) && actPOSaveMessage.endsWith(expPOSaveMessage2) &&  actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList)
				&& actVoucherGridBodyListAfterSelection==expVoucherGridBodyListAfterSelection)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_previous']")
	private static WebElement  previousBtn;
	
	@FindBy(xpath="//div[@id='id_transactionentry_suspend']")
	private static WebElement  new_Suspend;
	

	@FindBy(xpath="//*[@id='1000']/span")
	private static WebElement  homeMasterMenu;

	@FindBy(xpath="//*[@id='221']/span")
	private static WebElement  homeMasterItemMenu;

	@FindBy(xpath="//*[@id='1105']/span")
	private static WebElement  homeMasterItem_ItemMenu;
	
	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
  	private static List<WebElement> itemList;
  	
  	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
  	private static List<WebElement> itemListChkBox;
  	
  	@FindBy(xpath="//input[@id='PositiveTolerance']")
  	private static WebElement itemToleranceTxt;
  	
  	 @FindBy(xpath="//*[@id='btnProperties']")
     private static WebElement itemPropertiesBtn;
  	 
  	 @FindBy(xpath=" //*[@id='btnPropOk']/i")
     private static WebElement ItemPropertiesOkBtn;
	
	public boolean CheckToleranceValueAndUseItemWiseToleranceWhenAvailableOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tolerance2Txt));
		tolerance2Txt.click();
		tolerance2Txt.sendKeys(Keys.END);
		tolerance2Txt.sendKeys(Keys.SHIFT,Keys.HOME);
		tolerance2Txt.sendKeys("10");
		tolerance2Txt.sendKeys(Keys.TAB);
		

		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(3000);
	    
	    
	    
	    Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("100");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
	
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("105");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		boolean savingMessage2=checkVoucherSavingMessage(docno1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("111");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		String expValidationMessage = "Tolerance quantity has been exceeded .";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		checkEraseAllTransactionsAfterIntialCheck();
		
		Thread.sleep(2000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
      	homeMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
      	homeMasterMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
      	homeMasterItemMenu.click();
      	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
    	homeMasterItem_ItemMenu.click();
    	
    	int ItemList = itemList.size();
	 		
 		for(int i=0;i<ItemList;i++)
 		{
 			String data= itemList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
 			{
 				itemList.get(i).click();
 				itemListChkBox.get(i).click();
 				
 				break;
 			}
 		}
 		
 		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
 		itemFirstCheckBox.click();*/
 				
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
 		itemPropertiesBtn.click();

 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemToleranceTxt));
 		itemToleranceTxt.click();
 		itemToleranceTxt.sendKeys(Keys.END);
 		itemToleranceTxt.sendKeys(Keys.SHIFT,Keys.HOME);
 		itemToleranceTxt.sendKeys("20");
 		itemToleranceTxt.sendKeys(Keys.TAB);
				
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
		ItemPropertiesOkBtn.click();
		
		if(validationConfirmationMessage.getText().isEmpty()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
		}
		
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		Thread.sleep(2000);
		
		if(useItemWiseToleranceWhenAvailableChkBox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useItemWiseToleranceWhenAvailableChkBox));
			useItemWiseToleranceWhenAvailableChkBox.click();
		}
		

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessageWorkFLow="WorkFlow Saved Successfully";
	  		
		String actMessageWorkFLow=checkValidationMessage(expMessageWorkFLow);
		  		
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
		
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(3000);
	    
	    
	    
	    Thread.sleep(5000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount1=vendorAccountListCount.size();
		 
		System.err.println(vendorcount1);
		 
		for(int i=0 ; i < vendorcount1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount1=pvwareHouseListCount.size();
		
		System.err.println(warehousecount1);
		
		for(int i=0 ; i < warehousecount1 ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("100");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno3=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage5=checkVoucherSavingMessage(docno3);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
	
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int countP=purchaseAccountListCount.size();
		
		System.err.println(countP);
		
		for(int i=0 ; i < countP ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage3=checkVoucherSavingMessage(docno2);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("111");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		boolean savingMessage4=checkVoucherSavingMessage(docno2);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("121");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		//Thread.sleep(2000);
		
		String expValidationMessageOnItemTolerance = "Tolerance quantity has been exceeded .";
		String actValidationMessageOnItemTolerance = checkValidationMessage(expValidationMessageOnItemTolerance);
		
		System.err.println("actValidationMessageOnItemTolerance         :"+actValidationMessageOnItemTolerance);
		System.err.println("expValidationMessageOnItemTolerance         :"+expValidationMessageOnItemTolerance);
		
		
		System.out.println("************************************* CheckToleranceValueAndUseItemWiseToleranceWhenAvailableOption  *********************************");
		System.out.println("SavingMessage   :  "+savingMessage  +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage2  :  "+savingMessage2 +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage3  :  "+savingMessage3 +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage4  :  "+savingMessage4 +" Value Expected : "+"TRUE");
		System.out.println("LinkRowCountValue                : "+actLinkRowCountValue               +" Value Expected : "+expLinkRowCountValue);
		System.out.println("LinkRowCountValue1               : "+actLinkRowCountValue1              +" Value Expected : "+expLinkRowCountValue1);
		System.out.println("ValidationMessage                : "+actValidationMessage               +" Value Expected : "+expValidationMessage);
		System.out.println("ValidationMessageOnItemTolerance : "+actValidationMessageOnItemTolerance+" Value Expected : "+expValidationMessageOnItemTolerance);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
      	homeMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterMenu));
      	homeMasterMenu.click();
      	
      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMenu));
      	homeMasterItemMenu.click();
      	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItem_ItemMenu));
    	homeMasterItem_ItemMenu.click();
    	
 		for(int i=0;i<ItemList;i++)
 		{
 			String data= itemList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
 			{
 				itemList.get(i).click();
 				itemListChkBox.get(i).click();
 				
 				break;
 			}
 		}
 		
 		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
 		itemFirstCheckBox.click();*/
 				
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
 		itemPropertiesBtn.click();

 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemToleranceTxt));
 		itemToleranceTxt.click();
 		itemToleranceTxt.sendKeys(Keys.END);
 		itemToleranceTxt.sendKeys(Keys.SHIFT,Keys.HOME);
 		itemToleranceTxt.sendKeys("0");
 		itemToleranceTxt.sendKeys(Keys.TAB);
				
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
		ItemPropertiesOkBtn.click();
		
		if(validationConfirmationMessage.getText().isEmpty()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
		}
		
		Thread.sleep(2000);

		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		draggedPurchasesVouchersN.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tolerance2Txt));
		tolerance2Txt.click();
		tolerance2Txt.sendKeys(Keys.END);
		tolerance2Txt.sendKeys(Keys.SHIFT,Keys.HOME);
		tolerance2Txt.sendKeys("0.0000");
		tolerance2Txt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}

		Thread.sleep(2000);
		
		if(useItemWiseToleranceWhenAvailableChkBox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useItemWiseToleranceWhenAvailableChkBox));
			useItemWiseToleranceWhenAvailableChkBox.click();
		}
		

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true &&  savingMessage1==true && savingMessage2==true && savingMessage3==true && savingMessage4==true
				&& actValidationMessage.equalsIgnoreCase(expValidationMessage) && actValidationMessageOnItemTolerance.equalsIgnoreCase(expValidationMessageOnItemTolerance)
				&& actLinkRowCountValue==expLinkRowCountValue && actLinkRowCountValue1==expLinkRowCountValue1)
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th")
	private static List<WebElement>  custBodyHeaderList;
	
	 @FindBy(xpath="//*[@id='id_Default_spanPlus']")
	 private static WebElement  custLeftPannelDefaultExpandBtn;
	 
	 @FindBy(xpath="//*[@id='id_prog_spanPlus']")
	 private static WebElement  custLeftPannelProgExpandBtn;
		
	 @FindBy(xpath="//*[@id='id_Trans_spanPlus']")
	 private static WebElement  custLeftPannelTransExpandBtn;
	 
	 @FindBy(xpath="//span[contains(text(),'Extra Fields')]")
	 private static WebElement  custTransExtraFieldExpandBtn;
	 
	 @FindBy(xpath="//div[@class='col-sm-12 toolbar_button_text font-6'][contains(text(),'Save')]")
	 private static WebElement  custSaveBtn;
	
	 @FindBy(xpath="//*[@id='btnCustomizeClose']/div[1]/span")
	 private static WebElement  custCancelBtn;
	
	 @FindBy(xpath="//input[@id='layoutName']")
	 private static WebElement  custLayoutNameTxt;
	
	 @FindBy(xpath="//input[@id='chkDefault']")
	 private static WebElement  custDefaultChkBox;
	
	 @FindBy(xpath="//input[@id='totalWidth']")
	 private static WebElement  custTotalWidthTxt;
	
	 @FindBy(xpath="//input[@id='chkLandscape']")
	 private static WebElement  custLandscapeChkBox;
	
	 @FindBy(xpath="//*[@id='rd_customization_tree5099']/span/span/i") //*[@id='rd_customization_tree4389']/span/span/i
	 private static WebElement  warehouseExpandBtn; 
	 
	 @FindBy(xpath="//*[@id='rd_customization_tree5098']/span/span/i") 
	 private static WebElement  warehouse1ExpandBtn; 
	 

	 
	 @FindBy(xpath="//*[@id='rd_customization_tree5100']")    //*[@id='rd_customization_tree4390']
	 private static WebElement  warehouseName;
	
	 @FindBy(xpath="//li[@id='rd_customization_tree4247']")
	 private static WebElement  warehouseCode;
	 
	 @FindBy(xpath="//li[@id='rd_customization_tree5100']")
	 private static WebElement  warehouseCode1;
	
	 @FindBy(xpath="//input[@id='ColumnHeading']")
	 private static WebElement  columnHeadingTxt;
	 
	 @FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th[5]/div/p")
	 private static WebElement  suspendTab;
	
	 @FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th[13]")
	 private static WebElement  warehouseCodeHeaderTxt;
	 
	 
	 @FindBy(xpath="//input[@id='HidethisColumn']")
	 private static WebElement  hideThisColumnChkbox;	
	 
	 @FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th")
	 private static List<WebElement>  cusHeaderList;	
	 
	 @FindBy(xpath="//thead[@id='id_transaction_entry_detail_workflow_head']/tr/th/div[2]")
	 private static List<WebElement>  workFlowHeaderList;	
	
	
	public boolean checkCustomizeOptionAndHideThisColumnInControlPlusL() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(3000);
		    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtnCL));
		workFlowCustomizeBtnCL.click();
		
		Thread.sleep(5000);
		
		int cusHeaderListCount=cusHeaderList.size();
		
		String actcusHeaderList=Integer.toString(cusHeaderListCount);
		String expcusHeaderList="5";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendTab));
		suspendTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideThisColumnChkbox));
		hideThisColumnChkbox.click();
		
		if(validationConfirmationMessage.getText().isEmpty()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
		}
	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String expSaveMessage  = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		Thread.sleep(2000);
		
		int cusHeaderListCount1=cusHeaderList.size();
		
		String actcusHeaderList1=Integer.toString(cusHeaderListCount1);
		String expcusHeaderList1="4";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(3000);
		
		String expworkFlowHeaderList = "[Voucher No, Date, Name, Quantity]";
		
		int workFlowHeaderListCount = workFlowHeaderList.size();
		
		ArrayList<String> workFlowHeaderListArray = new ArrayList<String>();
		
		for(int i=0;i<workFlowHeaderListCount;i++)
		{
			String data = workFlowHeaderList.get(i).getText();
			
			workFlowHeaderListArray.add(data);
		}
		
		
		String actworkFlowHeaderList = workFlowHeaderListArray.toString();
		
		System.out.println("actworkFlowHeaderList : "+actworkFlowHeaderList);
		System.out.println("expworkFlowHeaderList : "+expworkFlowHeaderList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtnCL));
		workFlowCustomizeBtnCL.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendTab));
		suspendTab.click();
		    
		Thread.sleep(2000);
		
		if(hideThisColumnChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideThisColumnChkbox));
			hideThisColumnChkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String expSaveMessage1  = "Data saved successfully";
		String actSaveMessage1 = checkValidationMessage(expSaveMessage1);
		
		Thread.sleep(2000);
		
		System.out.println("************************************* checkCustomizeOptionInControlPlusL  *********************************");
		/*System.out.println("SavingMessage   :  "+savingMessage  +" Value Expected : "+"TRUE");*/
		System.out.println("SaveMessage  :  "+actSaveMessage +" Value Expected : "+expSaveMessage);
		System.out.println("cusHeaderList  :  "+actcusHeaderList +" Value Expected : "+expcusHeaderList);
		System.out.println("cusHeaderList1  :  "+actcusHeaderList1 +" Value Expected : "+expcusHeaderList1);
		
		if (actSaveMessage.equalsIgnoreCase(expSaveMessage)
				&& actworkFlowHeaderList.equalsIgnoreCase(expworkFlowHeaderList)
				&& actcusHeaderList.equalsIgnoreCase(expcusHeaderList))
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	@FindBy(xpath="//div[@id='Cus717']")
	private static WebElement warehouseHeading;
	
	@FindBy(xpath="//a[contains(text(),'Remove Column')]")
	 private static WebElement  custExtraFieldRemoveBtn;
	
	public boolean checkCustomizeOptionAndAddingExtraFieldsInControlPlusL() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtnCL));
		workFlowCustomizeBtnCL.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custLeftPannelTransExpandBtn));
		custLeftPannelTransExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custTransExtraFieldExpandBtn));
		custTransExtraFieldExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
		warehouseExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseName));
		getAction().doubleClick(warehouseName).build().perform();
		
		int cusHeaderListCount=cusHeaderList.size();
		
		String actcusHeaderList=Integer.toString(cusHeaderListCount);
		String expcusHeaderList="6";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String expSaveMessage  = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(3000);
		
		String expworkFlowHeaderList = "[Voucher No, Date, Name, Quantity, Suspended, Warehouse Name]";
		
		int workFlowHeaderListCount = workFlowHeaderList.size();
		
		ArrayList<String> workFlowHeaderListArray = new ArrayList<String>();
		
		for(int i=0;i<workFlowHeaderListCount;i++)
		{
			String data = workFlowHeaderList.get(i).getText();
			
			workFlowHeaderListArray.add(data);
		}
		
		
		String actworkFlowHeaderList = workFlowHeaderListArray.toString();
		
		System.out.println("actworkFlowHeaderList : "+actworkFlowHeaderList);
		System.out.println("expworkFlowHeaderList : "+expworkFlowHeaderList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtnCL));
		workFlowCustomizeBtnCL.click();
		
		Thread.sleep(5000);
		
		int  custBodyHeader = custBodyHeaderList.size();
		
		for(int i=0;i<custBodyHeader;i++)
		{
			String data = custBodyHeaderList.get(i).getText();
			
			if(data.equalsIgnoreCase("Warehouse Name"))
			{
				custBodyHeaderList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custExtraFieldRemoveBtn));
		custExtraFieldRemoveBtn.click();
		
		int cusHeaderListCountAfterRemoving=cusHeaderList.size();
		
		String actcusHeaderListCountAfterRemoving=Integer.toString(cusHeaderListCountAfterRemoving);
		String expcusHeaderListCountAfterRemoving="5";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String actSaveMessage1 = checkValidationMessage(expSaveMessage);
		
		Thread.sleep(3000);
		
		System.out.println("************************************* checkCustomizeOptionAndAddingExtraFieldsInControlPlusL  *********************************");
		System.out.println("SaveMessage  :  "+actSaveMessage +" Value Expected : "+expSaveMessage);
		System.out.println("cusHeaderList  :  "+actcusHeaderList +" Value Expected : "+expcusHeaderList);
		System.out.println("cusHeaderListCountAfterRemoving  :  "+actcusHeaderListCountAfterRemoving +" Value Expected : "+expcusHeaderListCountAfterRemoving);
		
		checkEraseAllTransactionsAfterIntialCheck();
		
		if (actSaveMessage.equalsIgnoreCase(expSaveMessage)
				&& actworkFlowHeaderList.equalsIgnoreCase(expworkFlowHeaderList)
				&& actcusHeaderList.equalsIgnoreCase(expcusHeaderList)
				&& actcusHeaderListCountAfterRemoving.equalsIgnoreCase(expcusHeaderListCountAfterRemoving))
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr")
	private static List<WebElement>  LinkRowCountLineWise;
	

	@FindBy(xpath="//thead[@id='id_transaction_entry_detail_workflow_popup_head']/tr/th/div[2]")
	private static List<WebElement>  workFlowHeaderListLineWise;	
	
	
	

	public boolean checkCustomizeOptionAndHideThisColumnInLineWise() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor1=vendorAccountListCount.size();
		
		System.err.println(countVendor1);
		
		for(int i=0 ; i < countVendor1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount1=wareHouseListCount.size();
		
		System.err.println(warehouseCount1);
			
		for(int i=0 ; i < warehouseCount1 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCountLineWise;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtn));
		workFlowCustomizeBtn.click();
		
		Thread.sleep(5000);
	
		int cusHeaderListCount=cusHeaderList.size();
		
		String actcusHeaderList=Integer.toString(cusHeaderListCount);
		String expcusHeaderList="5";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendTab));
		suspendTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideThisColumnChkbox));
		hideThisColumnChkbox.click();
		
		if(validationConfirmationMessage.getText().isEmpty()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
		}
	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String expSaveMessage  = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();	
		
		Thread.sleep(2000);
		
		String expworkFlowHeaderList = "[Voucher No, Date, Name, Quantity, Suspended]";
		
		int workFlowHeaderListCount = workFlowHeaderListLineWise.size();
		
		ArrayList<String> workFlowHeaderListArray = new ArrayList<String>();
		
		for(int i=0;i<workFlowHeaderListCount;i++)
		{
			String data = workFlowHeaderListLineWise.get(i).getText();
			
			workFlowHeaderListArray.add(data);
		}
		
	
		String actworkFlowHeaderList = workFlowHeaderListArray.toString();
		
		System.out.println("actworkFlowHeaderList : "+actworkFlowHeaderList);
		System.out.println("expworkFlowHeaderList : "+expworkFlowHeaderList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtn));
		workFlowCustomizeBtn.click();
		
		Thread.sleep(5000);
		
		int cusHeaderListCountAfterHiding=cusHeaderList.size();
		
		String actcusHeaderListCountAfterHiding=Integer.toString(cusHeaderListCountAfterHiding);
		String expcusHeaderListCountAfterHiding="4";
 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendTab));
		suspendTab.click();
		    
		
		if(hideThisColumnChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideThisColumnChkbox));
			hideThisColumnChkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String expSaveMessage1  = "Data saved successfully";
		String actSaveMessage1 = checkValidationMessage(expSaveMessage1);
		
		System.out.println("************************************* checkCustomizeOptionInControlPlusL  *********************************");
		/*System.out.println("SavingMessage   :  "+savingMessage  +" Value Expected : "+"TRUE");*/
		System.out.println("SaveMessage  :  "+actSaveMessage +" Value Expected : "+expSaveMessage);
		System.out.println("cusHeaderList  :  "+actcusHeaderList +" Value Expected : "+expcusHeaderList);
		System.out.println("cusHeaderListCountAfterHiding  :  "+actcusHeaderListCountAfterHiding +" Value Expected : "+expcusHeaderListCountAfterHiding);
		
		if (/*savingMessage==true && */ actSaveMessage.equalsIgnoreCase(expSaveMessage)
				&& actworkFlowHeaderList.equalsIgnoreCase(expworkFlowHeaderList)
				&& actcusHeaderList.equalsIgnoreCase(expcusHeaderList)
				&& actcusHeaderListCountAfterHiding==expcusHeaderListCountAfterHiding)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	public boolean checkCustomizeOptionAndAddingExtraFieldsInLineWise() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtn));
		workFlowCustomizeBtn.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custLeftPannelTransExpandBtn));
		custLeftPannelTransExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custTransExtraFieldExpandBtn));
		custTransExtraFieldExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
		warehouseExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseName));
		getAction().doubleClick(warehouseName).build().perform();
		
		int cusHeaderListCount=cusHeaderList.size();
		
		String actcusHeaderList=Integer.toString(cusHeaderListCount);
		String expcusHeaderList="6"; 
	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
		custSaveBtn.click();
		
		String expSaveMessage  = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		select1stRow_6thColumn.click();	
		
		Thread.sleep(3000);
		
		String expworkFlowHeaderList = "[Voucher No, Date, Name, Quantity, Suspended, Warehouse Name]";
		
		int workFlowHeaderListCount = workFlowHeaderListLineWise.size();
		
		ArrayList<String> workFlowHeaderListArray = new ArrayList<String>();
		
		for(int i=0;i<workFlowHeaderListCount;i++)
		{
			String data = workFlowHeaderListLineWise.get(i).getText();
			
			workFlowHeaderListArray.add(data);
		}
		
		
		String actworkFlowHeaderList = workFlowHeaderListArray.toString();
		
		System.out.println("actworkFlowHeaderList : "+actworkFlowHeaderList);
		System.out.println("expworkFlowHeaderList : "+expworkFlowHeaderList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowCustomizeBtn));
		workFlowCustomizeBtn.click();
		
		Thread.sleep(5000);
		
		int  custBodyHeader = custBodyHeaderList.size();
		
		for(int i=0;i<custBodyHeader;i++)
		{
			String data = custBodyHeaderList.get(i).getText();
			
			if(data.equalsIgnoreCase("Warehouse Name"))
			{
				custBodyHeaderList.get(i).click();
				break;
			}
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custExtraFieldRemoveBtn));
		custExtraFieldRemoveBtn.click();
		
		int cusHeaderListCountAfterRemoving=cusHeaderList.size();
		
		String actcusHeaderListCountAfterRemoving=Integer.toString(cusHeaderListCountAfterRemoving);
		String expcusHeaderListCountAfterRemoving="5"; 
 		
		
		System.out.println("************************************* checkCustomizeOptionAndAddingExtraFieldsInControlPlusL  *********************************");
		System.out.println("SaveMessage  :  ."+actSaveMessage +". Value Expected : "+expSaveMessage);
		System.out.println("cusHeaderList  :  "+actcusHeaderList +" Value Expected : "+expcusHeaderList);
		System.out.println("cusHeaderListCountAfterRemoving  :  "+actcusHeaderListCountAfterRemoving +" Value Expected : "+expcusHeaderListCountAfterRemoving);
		
		if (actSaveMessage.equalsIgnoreCase(expSaveMessage)
				&& actworkFlowHeaderList.equalsIgnoreCase(expworkFlowHeaderList)
				&& actcusHeaderList.equalsIgnoreCase(expcusHeaderList)
				&& actcusHeaderListCountAfterRemoving.equalsIgnoreCase(expcusHeaderListCountAfterRemoving))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	
	
	
	// Link Options in Voucher
	
	@FindBy(xpath="//span[@class='icon-menu icon-font4']")
	private static WebElement  toggleBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_copydocument']")
	private static WebElement  copyDocumentOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']")
	private static WebElement  copyToClipBoardOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']")
	private static WebElement  pasteFromClipBoardOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_raisechequereturn']")
	private static WebElement  raiseCheckReturnOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_addtostock']")
	private static WebElement  addToStockOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_markconvert']")
	private static WebElement  markConvertedOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_bominput']")
	private static WebElement  bOMinputOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_autoallocate']")
	private static WebElement  autoAllocateOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_reverseentry']")
	private static WebElement  reverseEntryOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_printbarcode']")
	private static WebElement  printBarCodeOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_postingdetails']")
	private static WebElement  postingDetailsOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_exporttoxml']")
	private static WebElement  exportToXMLOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_settings']")
	private static WebElement  settingsOption;
	
	@FindBy(xpath="//label[contains(text(),'Close Links')]")
	private static WebElement  closeLinksOption;
	
	@FindBy(xpath="//label[contains(text(),'Partial')]")
	private static WebElement  partialLinksOption;
	
	@FindBy(xpath="//label[contains(text(),'Open Link')]")
	private static WebElement  openLinksOption;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	private static WebElement  firstRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
	private static WebElement  secondRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
	private static WebElement  thirdRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
	private static WebElement  fourthRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
	private static WebElement  fifthRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
	private static WebElement  sixthRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
	private static WebElement  seventhRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
	private static WebElement  eigthRowIndex;
	
	@FindBy(xpath="//span[@class='icon-delete icon-font8']")
	private static WebElement  deleteRowBtn;
	
	@FindBy(xpath="//span[@class='icon-insertrow icon-font8']")
	private static WebElement  insertRowBtn;
	
	@FindBy(xpath="//span[@class='icon-selectall icon-font8']")
	private static WebElement  selectRowBtn;
	
	@FindBy(xpath="//span[@class='icon-unselectall1 icon-font8']")
	private static WebElement  unSelectRowBtn;
	
	@FindBy(xpath="//span[@class='icon-clone icon-font8']")
	private static WebElement  duplicateRowBtn;
	

	public boolean checkCloseLinkAndPartialOptionInPurchaseOrderHavingTwoLinkDocuments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		boolean actpurchaseVoucherWorlFlowText = purchaseVoucherWorlFlowText.isDisplayed();
		boolean exppurchaseVoucherWorlFlowText = true;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(partialLinksOption));
		partialLinksOption.click();
		
		String expValidationMessageonPartial = "Link satus has been updated.";
		String actValidationMessageonPartial = checkValidationMessage(expValidationMessageonPartial);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		
		Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
 		
		
		System.out.println("************************************* checkCloseLinkAndPartialOptionInPurchaseOrderHavingTwoLinkDocuments  *********************************");
		System.out.println("ValidationMessage  :  "+actValidationMessage +" Value Expected : "+expValidationMessage);
		System.out.println("ValidationMessageonPartial  :  "+actValidationMessageonPartial +" Value Expected : "+expValidationMessageonPartial);
		System.out.println("LinkRowCountValue  :  "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue);
		System.out.println("LinkRowCountValue1  :  "+actLinkRowCountValue1 +" Value Expected : "+expLinkRowCountValue1);
		
		checkEraseAllTransactions();
		
		if (actLinkRowCountValue==expLinkRowCountValue && actLinkRowCountValue1==expLinkRowCountValue1
				&& actValidationMessage.equalsIgnoreCase(expValidationMessage)
				&& actValidationMessageonPartial.equalsIgnoreCase(expValidationMessageonPartial))
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	public boolean checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingTwoLinkDocuments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver());  
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		for(int a=1;a<=5;a++)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys(Keys.END);
			pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
			pvWareHouseTxt.sendKeys(Keys.SPACE);
			
			int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
			
			for(int i=0; i < warehousecount; i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("HYDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
			enter_Discount.click();
			enter_Discount.sendKeys(Keys.TAB);
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		int voucherGridBodyListCount = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
		
		for(int i=0; i<voucherGridBodyListCount; i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray.add(data);
		}
		
		
		String actvoucherGridBodyList = voucherGridBodyListArray.toString();
		
		String expvoucherGridBodyList = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 6, , , , , , , , , ]";
		String expvoucherGridBodyListS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 6, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		Thread.sleep(2000);
		
		boolean actVoucherGridBodyList = false;
		boolean expVoucherGridBodyList = true;
		
		if (actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList) || actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyListS)) 
		{
			actVoucherGridBodyList = true;
		}
		
		System.err.println("VoucherGridBodyList : "+actVoucherGridBodyList+"  Value Expected  "+expVoucherGridBodyList);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
		thirdRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		int voucherGridBodyListCount1 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();
		
		for(int i=0; i<voucherGridBodyListCount1; i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray1.add(data);
		}
		
		
		String actvoucherGridBodyListOnCloseLink = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyListOnCloseLink = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		String expvoucherGridBodyListOnCloseLinkS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyListOnCloseLink Actual    : " + actvoucherGridBodyListOnCloseLink);
		System.out.println("voucherGridBodyListOnCloseLink Expected  : " + expvoucherGridBodyListOnCloseLink);

		Thread.sleep(3000);
		
		boolean actVoucherGridBodyListOnCloseLink = false;
		boolean expVoucherGridBodyListOnCloseLink = true;
		
		if (actvoucherGridBodyListOnCloseLink.equalsIgnoreCase(expvoucherGridBodyListOnCloseLink) || actvoucherGridBodyListOnCloseLink.equalsIgnoreCase(expvoucherGridBodyListOnCloseLinkS)) 
		{
			actVoucherGridBodyListOnCloseLink = true;
		}
		
		System.err.println("VoucherGridBodyListOnCloseLink : "+actVoucherGridBodyListOnCloseLink+"  Value Expected  "+expVoucherGridBodyListOnCloseLink);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
		thirdRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(partialLinksOption));
		partialLinksOption.click();
		
		String expValidationMessageOnPartial = "Link satus has been updated.";
		String actValidationMessageOnPartial = checkValidationMessage(expValidationMessageOnPartial);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		int voucherGridBodyListCount2 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray2 = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount2;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray2.add(data);
		}
		
		
		String actvoucherGridBodyListOnPartialLink = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyListOnPartialLink = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		String expvoucherGridBodyListOnPartialLinkS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		
		boolean actVoucherGridBodyListOnPartialLink = false;
		boolean expVoucherGridBodyListOnPartialLink = true;
		
		if (actvoucherGridBodyListOnPartialLink.equalsIgnoreCase(expvoucherGridBodyListOnPartialLink) || actvoucherGridBodyListOnPartialLink.equalsIgnoreCase(expvoucherGridBodyListOnPartialLinkS)) 
		{
			actVoucherGridBodyListOnPartialLink = true;
		}
		
		System.err.println("VoucherGridBodyListOnPartialLink : "+actVoucherGridBodyListOnPartialLink+"  Value Expected  "+expVoucherGridBodyListOnPartialLink);
		
		System.out.println("************************************* checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingTwoLinkDocuments  *********************************");
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		System.out.println("voucherGridBodyListOnCloseLink Actual    : " + actvoucherGridBodyListOnCloseLink);
		System.out.println("voucherGridBodyListOnCloseLink Expected  : " + expvoucherGridBodyListOnCloseLink);
		
		System.out.println("voucherGridBodyListOnPartialLink Actual    : " + actvoucherGridBodyListOnPartialLink);
		System.out.println("voucherGridBodyListOnPartialLink Expected  : " + expvoucherGridBodyListOnPartialLink);
		
		System.out.println("ValidationMessage                 :  "+actValidationMessage                +" Value Expected : "+expValidationMessage);
		System.out.println("ValidationMessageOnPartial        :  "+actValidationMessageOnPartial       +" Value Expected : "+expValidationMessageOnPartial);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
		folderpathExpandBtn.click();
		
		Thread.sleep(3000);
	     
	     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\optionsCompanyRestore.exe");
	     
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
	     restoreCompanyBtn.click();
	     
	     try
	     {
	    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
	 		 overRideYesBtn.click();
	 		 Thread.sleep(20000);
	     }
	     catch(Exception e)
	     {
	    	 System.err.println("NO OLDER COMPANY EXISTS");
	     }
	     
	     if(getIsAlertPresent())
	     {
	    	 getWaitForAlert();
	    	 
	    	 getAlert().accept();
	     }*/
		
		//checkEraseAllTransactionsLogoutAndLogin();
		
		checkEraseAllTransactions();
		
		if (actVoucherGridBodyList==expVoucherGridBodyList && actValidationMessage.equalsIgnoreCase(expValidationMessage)
				&& actVoucherGridBodyListOnCloseLink==expVoucherGridBodyListOnCloseLink
				&& actValidationMessageOnPartial.equalsIgnoreCase(expValidationMessageOnPartial)
				&& actVoucherGridBodyListOnPartialLink==expVoucherGridBodyListOnPartialLink)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	public boolean checkDeletingPurchaseFlowAndSavingNewFlowWithOneBaseAndOneLinkDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
		deleteBtn.click();
		
		Thread.sleep(2000);
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		workflowNameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersDragAndDrop));
		purchasesOrdersDragAndDrop.click();
		
		
		getAction().dragAndDropBy(purchasesOrdersDragAndDrop, 350, -250).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNDragAndDrop));
		purchaseVoucherNDragAndDrop.click();
		
		
		getAction().dragAndDropBy(purchaseVoucherNDragAndDrop, 650, 0).build().perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
		boolean actdraggedPurchasesVouchersN=draggedPurchasesVouchersN.isDisplayed();
		
		boolean expFirstDraggedElement=true;
		boolean expdraggedPurchasesVouchersN=true;
		
		getAction().contextClick(FirstDraggedElement).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		
		boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
		boolean actdraggeddeleteBtn=draggeddeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn=true;
		boolean expdraggeddeleteBtn=true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode6Left));
		linkNode6Left.click();
		
		Thread.sleep(2000);
		
		boolean actlink0TO1=link5TO6.isDisplayed();
		boolean explink0TO1=true;
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
		link5TO6.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		DefinitionTab.click();

		
		Select s=new Select(DefinitionLinkValueDropdown);
		
		s.selectByVisibleText("Quantity");
		
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		
		boolean actFirstDraggedElementAfter           = FirstDraggedElement.isDisplayed();
		boolean actdraggedPurchasesVouchersNAfter      = draggedPurchasesVouchersN.isDisplayed();
		boolean actlink0TO1After                      = link5TO6.isDisplayed();
		
		
		boolean expFirstDraggedElementAfter           = true;
		boolean expdraggedPurchasesVouchersNAfter      = true;
		boolean explink0TO1After                      = true;
		
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedPurchasesVouchersN==expdraggedPurchasesVouchersN
				&& actdraggedlinkBtn==expdraggedlinkBtn &&actdraggeddeleteBtn==expdraggeddeleteBtn 
				&& actlink0TO1==explink0TO1
				&& actFirstDraggedElementAfter==expFirstDraggedElementAfter && actdraggedPurchasesVouchersNAfter==expdraggedPurchasesVouchersNAfter
				&& actlink0TO1After==explink0TO1After;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = "true";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expMessage="Workflow saved successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver());  
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    Thread.sleep(1500);
		prongHornOn();
		Thread.sleep(4000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(3000);
	    
	    
	    
	    Thread.sleep(5000);
		
		System.out.println("**********************************************checkSelectBaseAndLinkVouchersToDrag*********************************");
		
		System.out.println("FirstDraggedElement          : "+actFirstDraggedElement           +" Value Expected : " +expFirstDraggedElement);
		System.out.println("draggedPurchasesVouchersN     : "+actdraggedPurchasesVouchersN      +" Value Expected : " +expdraggedPurchasesVouchersN);
		System.out.println("DraggedlinkBtn               : "+actdraggedlinkBtn                +" Value Expected : " +expdraggedlinkBtn);
		System.out.println("DraggeddeleteBtn             : "+actdraggeddeleteBtn              +" Value Expected : " +expdraggeddeleteBtn);
		System.out.println("Link0TO1                     : "+actlink0TO1                      +" Value Excepted : " +explink0TO1);
		System.out.println("FirstDraggedElementAfter     :" +actFirstDraggedElementAfter      +" Value Expected : " +expFirstDraggedElementAfter);
		System.out.println("draggedPurchasesVouchersNAfter :" +actdraggedPurchasesVouchersNAfter +" Value Expected : " +expdraggedPurchasesVouchersNAfter);
		System.out.println("Link0TO1After                :" +actlink0TO1After                 +" Value Expected : " +explink0TO1After);
		
		
		if(actMessage.equalsIgnoreCase(expMessage) && actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			
			return false;
		}
	}

	
	
	
	public boolean checkCloseLinkAndPartialOptionInPurchaseOrderHavingOneLinkDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen=LinkRowCount;
		
		int actLinkRowCountValue = rowCountInLinkScreen.size();
		int expLinkRowCountValue = 1;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		boolean actpurchaseVoucherWorlFlowText = purchaseVoucherWorlFlowText.isDisplayed();
		boolean exppurchaseVoucherWorlFlowText = true;
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openLinksOption));
		openLinksOption.click();
		
		String expValidationMessageonOpen = "Link satus has been updated.";
		String actValidationMessageonOpen = checkValidationMessage(expValidationMessageonOpen);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		
		Thread.sleep(2000);
	    
	    List<WebElement> rowCountInLinkScreen1=LinkRowCount;
		
		int actLinkRowCountValue1 = rowCountInLinkScreen1.size();
		int expLinkRowCountValue1 = 1;
 		
		
		System.out.println("************************************* checkCloseLinkAndOpenOptionInPurchaseOrderHavingOneLinkDocument  *********************************");
		System.out.println("ValidationMessage  :  "+actValidationMessage +" Value Expected : "+expValidationMessage);
		System.out.println("ValidationMessageonOpen  :  "+actValidationMessageonOpen +" Value Expected : "+expValidationMessageonOpen);
		System.out.println("LinkRowCountValue  :  "+actLinkRowCountValue +" Value Expected : "+expLinkRowCountValue);
		System.out.println("LinkRowCountValue1  :  "+actLinkRowCountValue1 +" Value Expected : "+expLinkRowCountValue1);
		
		checkEraseAllTransactionsAfterIntialCheck();
		
		if (actLinkRowCountValue==expLinkRowCountValue && actLinkRowCountValue1==expLinkRowCountValue1
				&& actValidationMessage.equalsIgnoreCase(expValidationMessage)
				&& actValidationMessageonOpen.equalsIgnoreCase(expValidationMessageonOpen))
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	

	public boolean checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingOneLinkDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver());  
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(5000);
		    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		for(int a=1;a<=5;a++)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys(Keys.END);
			pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
			pvWareHouseTxt.sendKeys(Keys.SPACE);
			
			int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
			
			for(int i=0 ; i < warehousecount ;i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("HYDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			Thread.sleep(1500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
			enter_Discount.click();
			enter_Discount.sendKeys(Keys.TAB);
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		int voucherGridBodyListCount = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray.add(data);
		}
		
		
		String actvoucherGridBodyList = voucherGridBodyListArray.toString();
		
		String expvoucherGridBodyList = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 6, , , , , , , , , ]";
		String expvoucherGridBodyListS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 6, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		Thread.sleep(3000);
		
		boolean actVoucherGridBodyList = false;
		boolean expVoucherGridBodyList = true;
		
		 if (actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList) || actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyListS)) 
		 {
			 actVoucherGridBodyList = true;
		 }
		 
		 System.err.println("VoucherGridBodyList : "+actVoucherGridBodyList+"  Value Expected  "+expVoucherGridBodyList);
		 
		 Thread.sleep(5000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
		thirdRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		int voucherGridBodyListCount1 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount1;i++)
		{
			String data = voucherGridBodyList.get(i).getText();
			voucherGridBodyListArray1.add(data);
		}
		
		
		String actvoucherGridBodyListOnCloseLink = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyListOnCloseLink = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		String expvoucherGridBodyListOnCloseLinkS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		
		System.out.println("voucherGridBodyListOnCloseLink Actual    : " + actvoucherGridBodyListOnCloseLink);
		System.out.println("voucherGridBodyListOnCloseLink Expected  : " + expvoucherGridBodyListOnCloseLink);
		
		boolean actVoucherGridBodyListOnCloseLink = false;
		boolean expVoucherGridBodyListOnCloseLink = true;
		
		if (actvoucherGridBodyListOnCloseLink.equalsIgnoreCase(expvoucherGridBodyListOnCloseLink) || actvoucherGridBodyListOnCloseLink.equalsIgnoreCase(expvoucherGridBodyListOnCloseLinkS)) 
		{
			actVoucherGridBodyListOnCloseLink = true;
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
		thirdRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(partialLinksOption));
		partialLinksOption.click();
		
		Thread.sleep(3000);
		
		String expValidationMessageOnPartial = "Link satus has been updated.";
		String actValidationMessageOnPartial = checkValidationMessage(expValidationMessageOnPartial);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(2000);
		
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBoxCL));
		workFlowHeaderChkBoxCL.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtnCL));
		workFlowOkBtnCL.click();
		
		Thread.sleep(2000);
		
		int voucherGridBodyListCount2 = voucherGridBodyList.size();
		
		ArrayList<String> voucherGridBodyListArray2 = new ArrayList<String>();
		
		for(int i=0;i<voucherGridBodyListCount2;i++)
		{
			
			String data = voucherGridBodyList.get(i).getText();
			
			
			voucherGridBodyListArray2.add(data);
		}
		
		
		String actvoucherGridBodyListOnPartialLink = voucherGridBodyListArray1.toString();
		
		String expvoucherGridBodyListOnPartialLink = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		String expvoucherGridBodyListOnPartialLinkS = "[1, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 2, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 3, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 4, STD RATE COGS ITEM, Dozs, 0, 0.00, 1.00, PurOrd:1, 10.00, 10.00, 0.00, 5, , , , , , , , , ]";
		
		boolean actVoucherGridBodyListOnPartialLink = false;
		boolean expVoucherGridBodyListOnPartialLink = true;
		
		if (actvoucherGridBodyListOnPartialLink.equalsIgnoreCase(expvoucherGridBodyListOnPartialLink) || actvoucherGridBodyListOnPartialLink.equalsIgnoreCase(expvoucherGridBodyListOnPartialLinkS)) 
		{
			actVoucherGridBodyListOnPartialLink = true;
		}
		
		System.err.println("VoucherGridBodyListOnPartialLink : "+actVoucherGridBodyListOnPartialLink+"  Value Expected  "+expVoucherGridBodyListOnPartialLink);
		
		System.out.println("************************************* checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingOneLinkDocument  *********************************");
		
		System.out.println("voucherGridBodyList Actual    : " + actvoucherGridBodyList);
		System.out.println("voucherGridBodyList Expected  : " + expvoucherGridBodyList);
		
		System.out.println("voucherGridBodyListOnCloseLink Actual    : " + actvoucherGridBodyListOnCloseLink);
		System.out.println("voucherGridBodyListOnCloseLink Expected  : " + expvoucherGridBodyListOnCloseLink);
		
		System.out.println("voucherGridBodyListOnPartialLink Actual    : " + actvoucherGridBodyListOnPartialLink);
		System.out.println("voucherGridBodyListOnPartialLink Expected  : " + expvoucherGridBodyListOnPartialLink);
 		
		
		
		System.out.println("ValidationMessage                 :  "+actValidationMessage                +" Value Expected : "+expValidationMessage);
		System.out.println("ValidationMessageOnPartial        :  "+actValidationMessageOnPartial       +" Value Expected : "+expValidationMessageOnPartial);
		
		checkEraseAllTransactionsAfterIntialCheck();
		
		if (actVoucherGridBodyList==expVoucherGridBodyList 
				&& actVoucherGridBodyListOnCloseLink==expVoucherGridBodyListOnCloseLink
				&& actVoucherGridBodyListOnPartialLink==expVoucherGridBodyListOnPartialLink)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[2]/input")
	private static List<WebElement> linkChkBoxList;
	
	@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[7]")
	private static List<WebElement> linkVoucherNameList;
	
	public boolean checkSavingPurchaseOrderAndPurchaseVoucherNPartialConsumeCloseLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";
		
		String actMessage = checkValidationMessage(expMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		Thread.sleep(1000);
		checkUserFriendlyMessage();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int vendorCount=vendorAccountListCount.size();
		
		System.err.println(vendorCount);
		
		for(int i=0 ; i < vendorCount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		wareHouseTxt.click();
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouse=wareHouseListCount.size();
		
		System.err.println(warehouse);
			
		for(int i=0 ; i < warehouse ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcountpvn=itemListCount.size();
		
		System.err.println(itemcountpvn);
			
		for(int i=0 ; i < itemcountpvn ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("0.5");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		int linkVoucherNameListCount = linkVoucherNameList.size();
		
		for(int i=0;i<linkVoucherNameListCount;i++)
		{
			String data = linkVoucherNameList.get(i).getText();
			
			if(data.equalsIgnoreCase("PurOrd:1"))
			{
				linkChkBoxList.get(i).click();
				
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcountpvn2=itemListCount.size();
		
		System.err.println(itemcountpvn2);
			
		for(int i=0 ; i < itemcountpvn2 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
		select2ndRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("0.5");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		boolean actLPurchaseOrderCloumn = select2ndRow_6thColumn.getText().isEmpty();
		boolean expLPurchaseOrderCloumn = true;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
 		
		
		System.out.println("************************************* checkSavingPurchaseOrderAndPurchaseVoucherNPartialConsumeCloseLink  *********************************");
		System.out.println("ValidationMessage  :  "+actValidationMessage +" Value Expected : "+expValidationMessage);
		System.out.println("LPurchaseOrderCloumn  :  "+actLPurchaseOrderCloumn +" Value Expected : "+expLPurchaseOrderCloumn);
		
		
		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) && actLPurchaseOrderCloumn==expLPurchaseOrderCloumn)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
	private static List<WebElement> voucherGridDocNo;
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
	private static WebElement  editBtn;
	
	
	public boolean checkSavingPurchaseOrderAndPurchaseVoucherNRowWisePartialConsumeCloseLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		// po 2
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		for(int a=0;a<=1;a++)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
			pvWareHouseTxt.click();
			pvWareHouseTxt.sendKeys(Keys.END);
			pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
			pvWareHouseTxt.sendKeys(Keys.SPACE);
			
			int warehousecount=pvwareHouseListCount.size();
			
			System.err.println(warehousecount);
			
			for(int i=0 ; i < warehousecount ;i++)
			{
				String data=pvwareHouseListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("HYDERABAD"))
				{
					pvwareHouseListCount.get(i).click();
					
					break;
				}
			}
				
			pvWareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.sendKeys("1");
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("10");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
			enter_Discount.click();
			enter_Discount.sendKeys(Keys.TAB);
		
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int vendorCount=vendorAccountListCount.size();
		
		System.err.println(vendorCount);
		
		for(int i=0 ; i < vendorCount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		wareHouseTxt.click();
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouse=wareHouseListCount.size();
		
		System.err.println(warehouse);
			
		for(int i=0 ; i < warehouse ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcountpvn=itemListCount.size();
		
		System.err.println(itemcountpvn);
			
		for(int i=0 ; i < itemcountpvn ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		int actlinkVoucherNameListCount = linkVoucherNameList.size();
		int explinkVoucherNameListCount = 2;
		
		
		for(int i=0;i<actlinkVoucherNameListCount;i++)
		{
			String data = linkVoucherNameList.get(i).getText();
			
			if(data.equalsIgnoreCase("PurOrd:2"))
			{
				linkChkBoxList.get(i).click();
				
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(3000);
		
		
		int voucherGridDocNoCount = voucherGridDocNo.size();
		
		for(int i=0;i<voucherGridDocNoCount;i++)
		{
			String data = voucherGridDocNo.get(i).getText();
			
			if(data.equalsIgnoreCase("2"))
			{
				voucherGridIndexChkBox.get(i).click();
				
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editBtn));
		editBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(secondRowIndex));
		secondRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(partialLinksOption));
		partialLinksOption.click();
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcountpvn2=itemListCount.size();
		
		System.err.println(itemcountpvn2);
			
		for(int i=0 ; i < itemcountpvn2 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
		select2ndRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("0.5");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		boolean actLPurchaseOrderCloumn = select2ndRow_6thColumn.getText().isEmpty();
		boolean expLPurchaseOrderCloumn = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
 		
		
		System.out.println("************************************* checkSavingPurchaseOrderAndPurchaseVoucherNRowWisePartialConsumeCloseLink  *********************************");
		System.out.println("ValidationMessage  :  "+actValidationMessage +" Value Expected : "+expValidationMessage);
		System.out.println("LPurchaseOrderCloumn  :  "+actLPurchaseOrderCloumn +" Value Expected : "+expLPurchaseOrderCloumn);
		System.out.println("linkVoucherNameListCount : "+actlinkVoucherNameListCount+" Value Expected : "+explinkVoucherNameListCount);
		
		
		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) && actLPurchaseOrderCloumn==expLPurchaseOrderCloumn 
				&& actlinkVoucherNameListCount==explinkVoucherNameListCount)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_new']")
	private static WebElement  new_newBtn;
	

	public boolean checkSavingPurchaseOrderVoucherForCloseLinkAndEditingLinkOptionAndSlabChangeVoucherSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		
		// po 3
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount=vendorAccountListCount.size();
		 
		System.err.println(vendorcount);
		 
		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
	

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		Thread.sleep(1000);
		
		String expValidationMessage = "Link satus has been updated.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
		new_newBtn.click();
		
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount1=vendorAccountListCount.size();
		 
		System.err.println(vendorcount1);
		 
		for(int i=0 ; i < vendorcount1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount1=pvwareHouseListCount.size();
		
		System.err.println(warehousecount1);
		
		for(int i=0 ; i < warehousecount1 ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
	

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRowBtn));
		selectRowBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksOption));
		closeLinksOption.click();
		
		String expValidationMessageClose = "Link satus has been updated.";
		String actValidationMessageClose = checkValidationMessage(expValidationMessageClose);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openLinksOption));
		openLinksOption.click();
		
		String expValidationMessageOpen = "Link satus has been updated.";
		String actValidationMessageOpen = checkValidationMessage(expValidationMessageOpen);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
		new_newBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();
	 
		
	    
	    Calendar calendar = Calendar.getInstance();
	
	    calendar.add(Calendar.DATE, -31);
	
	    Date yesterday = calendar.getTime();
	
	    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
	    
	    
	    // yesterdayDate =dfr.format(yesterday).toString();
	    
	    System.out.println(dfr.format(yesterday).toString());
	    
	    
	    dateTxt.sendKeys(Keys.LEFT);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(Keys.HOME);
	    Thread.sleep(2000);
	    dateTxt.sendKeys(dfr.format(yesterday).toString());
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		 
		int vendorcount2=vendorAccountListCount.size();
		 
		System.err.println(vendorcount2);
		 
		for(int i=0 ; i < vendorcount2 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			 
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				 
				break;
			}
		}
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount2=pvwareHouseListCount.size();
		
		System.err.println(warehousecount2);
		
		for(int i=0 ; i < warehousecount2 ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount2=itemListCount.size();
		
		System.err.println(itemcount2);
			
		for(int i=0 ; i < itemcount2 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
	

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage2=checkVoucherSavingMessage(docno2);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		Thread.sleep(3000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
 		
		
		System.out.println("************************************* checkSavingPurchaseOrderVoucherForCloseLinkAndEditingLinkOptionAndSlabChangeVoucherSave  *********************************");
		System.out.println("ValidationMessage  :  "+actValidationMessage +" Value Expected : "+expValidationMessage);
		System.out.println("savingMessage   :  "+savingMessage  +" Value Expected : "+"true");
		System.out.println("savingMessage1  :  "+savingMessage1 +" Value Expected : "+"true");
		System.out.println("savingMessage2  :  "+savingMessage2 +" Value Expected : "+"true");
		System.out.println("ValidationMessageClose : "+actValidationMessageClose+" Value Expected : "+expValidationMessageClose);
		System.out.println("ValidationMessageOpen : "+actValidationMessageOpen+" Value Expected : "+expValidationMessageOpen);
		
		
		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) && actValidationMessageClose.equalsIgnoreCase(expValidationMessageClose)
				&& actValidationMessageOpen.equalsIgnoreCase(expValidationMessageOpen) && savingMessage==true 
				&& savingMessage1==true && savingMessage2==true)
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	@FindBy(xpath="//div[@id='id_transactionentry_authorize']//div[@class='toolbar_button_text font-6'][contains(text(),'Authorize')]")
	private static WebElement  new_authorizeBtn;
	
	@FindBy(xpath="//textarea[@id='id_transactionentry_authorization_remark']")
	private static WebElement  remarksOfAuthorizeRemarks;
	
	
	@FindBy(xpath="//input[@id='id_transactionentry_authorization_remark_popup_ok']")
	private static WebElement  remarksOfAuthorizeRemarksOkButton;
	
	@FindBy(xpath="//td[contains(text(),'Authorized')]")
	private static WebElement homePageAuthStatusAuthorizeRowOne;
	
	public boolean checkAuthorizingPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="UserAllOptions";
	  
	    String pawslt="12345";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(3000);
	    
	    
	    
	    Thread.sleep(5000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		int voucherGridDocNoCount = voucherGridDocNo.size();
		
		for(int i=0;i<voucherGridDocNoCount;i++)
		{
			String data = voucherGridDocNo.get(i).getText();
			
			if(data.equalsIgnoreCase("1"))
			{
				voucherGridIndexChkBox.get(i).click();
				
				break;
			}
		}
		
		getWebDriverWait().until(ExpectedConditions.visibilityOf(editBtn));
		editBtn.click();
		
		checkUserFriendlyMessage();
		
		getWebDriverWait().until(ExpectedConditions.visibilityOf(new_authorizeBtn));
		new_authorizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(remarksOfAuthorizeRemarks));
	    remarksOfAuthorizeRemarks.click();
	    remarksOfAuthorizeRemarks.sendKeys("Test Smoke");
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(remarksOfAuthorizeRemarksOkButton));
	    remarksOfAuthorizeRemarksOkButton.click();
	    
	    Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.visibilityOf(new_CloseBtn));
		new_CloseBtn.click();
		
		String acthomePageAuthStatusAuthorizeRowOne=homePageAuthStatusAuthorizeRowOne.getText();
		String exphomePageAuthStatusAuthorizeRowOne="Authorized";
		
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
		voucherhomeCloseBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		
	    String unamelt1="su";
	  
	    String pawslt1="su";
	      
	    lp.enterUserName(unamelt1);
	    
	    lp.enterPassword(pawslt1);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(3000);
 		
		
		System.out.println("************************************* checkAuthorizingPurchaseVoucher  *********************************");
		System.out.println("homePageAuthStatusAuthorizeRowOne  :  "+acthomePageAuthStatusAuthorizeRowOne +" Value Expected : "+exphomePageAuthStatusAuthorizeRowOne);
		
		if (acthomePageAuthStatusAuthorizeRowOne.equalsIgnoreCase(exphomePageAuthStatusAuthorizeRowOne))
		{
			System.out.println("Voucher Saved");
			
			return true;
		}
		else                                                                    
		{
			System.out.println("Voucher Not Saved");
			
			return false;
		}
	}
	
	
	
	// Order ManageMent Reports.
	
	
	@FindBy(xpath="//span[contains(text(),'Order Management')]")
	private static WebElement  orderManagementMenu; 

	@FindBy(xpath="//*[@id='600']/span")
	private static WebElement  analysisOfLinkedORUnlinkedDocumentsMenu;
				
	@FindBy(xpath="//*[@id='601']/span")
	private static WebElement  listingOfDocuments;
	
	@FindBy(xpath="//span[contains(text(),'Listing of Documents by Due Date')]")
	private static WebElement  listingOfDocumentsByDueDate;
	
	@FindBy(xpath="//a[@id='603']//span[contains(text(),'Ageing of Pending Documents')]")
	private static WebElement  ageingOfPendingDocuments;
	
	@FindBy(xpath="//span[contains(text(),'Ageing of Pending Documents by Due Date')]")
	private static WebElement  ageingOfPendingDocumentsByDueDate;
	
	@FindBy(xpath="//span[contains(text(),'Link chain analysis')]")
	private static WebElement  linkChainAnalysis;
	
	@FindBy(xpath="//span[contains(text(),'Pending voucher report')]")
	private static WebElement  pendingVoucherReports;

	@FindBy(xpath="//input[@id='RITTable__1']")
	private static WebElement listingOfDocWorkFlowTxt;
	
	@FindBy(xpath="//select[@id='DateOptions_']")
	private static WebElement sl_DateOptionDropdown;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
	private static WebElement sl_OkBtn;
	
	
	@FindBy(xpath="//tr[@id='trRender_0']/td")
	private static List<WebElement> reportRow1;
	
	@FindBy(xpath="//tr[@id='trRender_1']/td")
	private static List<WebElement> reportRow2;
	
	@FindBy(xpath="//tr[@id='trRender_2']/td")
	private static List<WebElement> reportRow3;
	
	@FindBy(xpath="//tr[@id='trRender_3']/td")
	private static List<WebElement> reportRow4;
	
	@FindBy(xpath="//tr[@id='trRender_4']/td")
	private static List<WebElement> reportRow5;
	
	@FindBy(xpath="//tr[@id='trRender_5']/td")
	private static List<WebElement> reportRow6;
	
	@FindBy(xpath="//tr[@id='trRender_6']/td")
	private static List<WebElement> reportRow7;
	
	@FindBy(xpath="//tr[@id='trRender_7']/td")
	private static List<WebElement> reportRow8;
	
	@FindBy(xpath="//tr[@id='trRender_8']/td")
	private static List<WebElement> reportRow9;
	
	@FindBy(xpath="//tr[@id='trRender_9']/td")
	private static List<WebElement> reportRow10;
	
	@FindBy(xpath="//tr[@id='trRender_10']/td")
	private static List<WebElement> reportRow11;
	
	@FindBy(xpath="//tr[@id='trRender_11']/td")
	private static List<WebElement> reportRow12;
	
	@FindBy(xpath="//tr[@id='trRender_12']/td")
	private static List<WebElement> reportRow13;
	
	/*@FindBy(xpath="//span[@id='reportClose_']//i[contains(@class,'icon-font6 icon-close')]")
	private static WebElement report_CloseBtn;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
	private static WebElement sl_CloseBtn;*/
	
	@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[12]")
	private static WebElement report_CloseBtn;


	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
	private static WebElement sl_CloseBtn;
	
	
	
	public boolean checkListingOfDocumentsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
		orderManagementMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
		analysisOfLinkedORUnlinkedDocumentsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocuments));
		listingOfDocuments.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		//s.selectByVisibleText(" As on date ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
		listingOfDocWorkFlowTxt.click();
		listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
		Thread.sleep(2000);
		listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[PurOrd:1, STD RATE COGS ITEM, 12.00, , Manually Closed]";
		//String expreportRow1 = "[PurOrd:1, STD RATE COGS ITEM, 12.00, 6.00, Manual Closed]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[NDT45:1, STD RATE COGS ITEM, 6.00, , Manually Closed]";
		//String expreportRow2 = "[NDT45:1, STD RATE COGS ITEM, 6.00, , ]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, , Closed]";
		//String expreportRow3 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, , Closed]";
		
		int reportRow4Count = reportRow4.size();
		
		ArrayList<String> reportRow4Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow4Count;i++)
		{
			String data = reportRow4.get(i).getText();
			
			reportRow4Array.add(data);
		}
		
		
		String actreportRow4 = reportRow4Array.toString();
		String expreportRow4 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, , Manually Closed]";
		//String expreportRow4 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, 12.00, Manual Closed]";
		
		int reportRow5Count = reportRow5.size();
		
		ArrayList<String> reportRow5Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow5Count;i++)
		{
			String data = reportRow5.get(i).getText();
			
			reportRow5Array.add(data);
		}
		
		
		String actreportRow5 = reportRow5Array.toString();
		String expreportRow5 = "[PurOrd:3, STD RATE COGS ITEM, 12.00, , Manually Closed]";
		//String expreportRow5 = "[PurOrd:3, STD RATE COGS ITEM, 12.00, 12.00, Manual Closed]";
		
		int reportRow6Count = reportRow6.size();
		
		ArrayList<String> reportRow6Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow6Count;i++)
		{
			String data = reportRow6.get(i).getText();
			
			reportRow6Array.add(data);
		}
		
		
		String actreportRow6 = reportRow6Array.toString();
		String expreportRow6 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, Pending]";
		//String expreportRow6 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, Partial Consumed]";
		
		int reportRow7Count = reportRow7.size();
		
		ArrayList<String> reportRow7Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow7Count;i++)
		{
			String data = reportRow7.get(i).getText();
			
			reportRow7Array.add(data);
		}
		
		
		String actreportRow7 = reportRow7Array.toString();
		String expreportRow7 = "[PurOrd:5, STD RATE COGS ITEM, 12.00, 12.00, Pending]";
		
		int reportRow8Count = reportRow8.size();
		
		ArrayList<String> reportRow8Array = new ArrayList<String>();
		
		for(int i=1;i<reportRow8Count;i++)
		{
			String data = reportRow8.get(i).getText();
			
			reportRow8Array.add(data);
		}
		
		
		String actreportRow8 = reportRow8Array.toString();
		String expreportRow8 = "[Grand Total, , , 78.00, 24.00, ]";
		//String expreportRow8 = "[Grand Total, , , 78.00, 54.00, ]";
		
		System.out.println("*********************************checkListingOfDocumentsReport*****************************************");
		
		System.out.println(actreportRow1);
		System.out.println(expreportRow1);
		System.out.println(actreportRow2);
		System.out.println(expreportRow2);
		System.out.println(actreportRow3);
		System.out.println(expreportRow3);
		System.out.println(actreportRow4);
		System.out.println(expreportRow4);
		System.out.println(actreportRow5);
		System.out.println(expreportRow5);
		System.out.println(actreportRow6);
		System.out.println(expreportRow6);
		System.out.println(actreportRow7);
		System.out.println(expreportRow7);
		System.out.println(actreportRow8);
		System.out.println(expreportRow8);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3)
				&& actreportRow4.equalsIgnoreCase(expreportRow4) && actreportRow5.equalsIgnoreCase(expreportRow5) && actreportRow6.equalsIgnoreCase(expreportRow6)
				&& actreportRow7.equalsIgnoreCase(expreportRow7) && actreportRow8.equalsIgnoreCase(expreportRow8))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	

	public boolean checkListingOfDocumentsByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
		orderManagementMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
		analysisOfLinkedORUnlinkedDocumentsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocumentsByDueDate));
		listingOfDocumentsByDueDate.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		//s.selectByVisibleText(" As on date ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
		listingOfDocWorkFlowTxt.click();
		listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
		Thread.sleep(2000);
		listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[PurOrd:5, STD RATE COGS ITEM, 12.00, 12.00, Pending]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[PurOrd:1, STD RATE COGS ITEM, 12.00, , Manually Closed]";
		//String expreportRow2 = "[PurOrd:3, STD RATE COGS ITEM, 12.00, 12.00, Manual Closed]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[NDT45:1, STD RATE COGS ITEM, 6.00, , Manually Closed]";
		
		//String expreportRow3 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, Manual Closed]";
		
		int reportRow4Count = reportRow4.size();
		
		ArrayList<String> reportRow4Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow4Count;i++)
		{
			String data = reportRow4.get(i).getText();
			
			reportRow4Array.add(data);
		}
		
		
		String actreportRow4 = reportRow4Array.toString();
		String expreportRow4 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, , Closed]";
		
		int reportRow5Count = reportRow5.size();
		
		ArrayList<String> reportRow5Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow5Count;i++)
		{
			String data = reportRow5.get(i).getText();
			
			reportRow5Array.add(data);
		}
		
		
		String actreportRow5 = reportRow5Array.toString();
		String expreportRow5 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, , Manually Closed]";
		//String expreportRow5 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, 12.00, Manual Closed]";
		
		int reportRow6Count = reportRow6.size();
		
		ArrayList<String> reportRow6Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow6Count;i++)
		{
			String data = reportRow6.get(i).getText();
			
			reportRow6Array.add(data);
		}
		
		
		String actreportRow6 = reportRow6Array.toString();
		String expreportRow6 = "[PurOrd:3, STD RATE COGS ITEM, 12.00, , Manually Closed]";
		//String expreportRow6 = "[PurOrd:1, STD RATE COGS ITEM, 12.00, 6.00, Manual Closed]";
		
		
		
		int reportRow7Count = reportRow7.size();
		
		ArrayList<String> reportRow7Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow7Count;i++)
		{
			String data = reportRow7.get(i).getText();
			
			reportRow7Array.add(data);
		}
		
		
		String actreportRow7 = reportRow7Array.toString();
		String expreportRow7 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, Pending]";
		//String expreportRow7 = "[NDT45:1, STD RATE COGS ITEM, 6.00, , ]";
		
		int reportRow8Count = reportRow8.size();
		
		ArrayList<String> reportRow8Array = new ArrayList<String>();
		
		for(int i=1;i<reportRow8Count;i++)
		{
			String data = reportRow8.get(i).getText();
			
			reportRow8Array.add(data);
		}
		
		String actreportRow8 = reportRow8Array.toString();
		String expreportRow8 = "[Grand Total, , , , 78.00, 24.00, ]";
		//String expreportRow8 = "[Grand Total, , , , 78.00, 54.00, ]";
		
		
		System.out.println("*********************************checkListingOfDocumentsByDueDateReport*****************************************");
		
		System.out.println(actreportRow1);
		System.out.println(expreportRow1);
		System.out.println(actreportRow2);
		System.out.println(expreportRow2);
		System.out.println(actreportRow3);
		System.out.println(expreportRow3);
		System.out.println(actreportRow4);
		System.out.println(expreportRow4);
		System.out.println(actreportRow5);
		System.out.println(expreportRow5);
		System.out.println(actreportRow6);
		System.out.println(expreportRow6);
		System.out.println(actreportRow7);
		System.out.println(expreportRow7);
		System.out.println(actreportRow8);
		System.out.println(expreportRow8);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3)
				&& actreportRow4.equalsIgnoreCase(expreportRow4) && actreportRow5.equalsIgnoreCase(expreportRow5) && actreportRow6.equalsIgnoreCase(expreportRow6)
				&& actreportRow7.equalsIgnoreCase(expreportRow7) && actreportRow8.equalsIgnoreCase(expreportRow8))
		{
			return true;
		}
		else
		{
			/*if (actreportRow8.equalsIgnoreCase(expreportRow8)) 
			{
				return true;
			} 
			else
			{*/
				return false;
			}
		}
	//}
	
	

	public boolean checkAgeingOfPendingDocumentsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
		orderManagementMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
		analysisOfLinkedORUnlinkedDocumentsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingOfPendingDocuments));
		ageingOfPendingDocuments.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		//s.selectByVisibleText(" As on date ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
		listingOfDocWorkFlowTxt.click();
		listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
		Thread.sleep(2000);
		listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[PurOrd:5, STD RATE COGS ITEM, 12.00, 12.00, , 12.00, , , , , , ]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=1;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[Grand Total, , , 24.00, 24.00, 12.00, 12.00, , , , , , ]";
		
		
		
		System.out.println("*********************************checkAgeingOfPendingDocumentsReport*****************************************");
		
		
		System.out.println("reportRow1 : "+actreportRow1+" Value Expected : "+expreportRow1);
		System.out.println("reportRow2 : "+actreportRow2+" Value Expected : "+expreportRow2);
		System.out.println("reportRow3 : "+actreportRow3+" Value Expected : "+expreportRow3);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	


	public boolean checkAgeingOfPendingDocumentsByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
		orderManagementMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
		analysisOfLinkedORUnlinkedDocumentsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingOfPendingDocumentsByDueDate));
		ageingOfPendingDocumentsByDueDate.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		//s.selectByVisibleText(" As on date ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
		listingOfDocWorkFlowTxt.click();
		listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
		Thread.sleep(2000);
		listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[PurOrd:5, STD RATE COGS ITEM, 12.00, 12.00, , 12.00, , , , , , ]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[PurOrd:5, STD RATE COGS ITEM, 12.00, 12.00, , 12.00, , , , , , ]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[NDT45:2, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		int reportRow4Count = reportRow4.size();
		
		ArrayList<String> reportRow4Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow4Count;i++)
		{
			String data = reportRow4.get(i).getText();
			
			reportRow4Array.add(data);
		}
		
		
		String actreportRow4 = reportRow4Array.toString();
		String expreportRow4 = "[PurOrd:1, STD RATE COGS ITEM, 12.00, 6.00, 6.00, , , , , , , ]";
		
		int reportRow5Count = reportRow5.size();
		
		ArrayList<String> reportRow5Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow5Count;i++)
		{
			String data = reportRow5.get(i).getText();
			
			reportRow5Array.add(data);
		}
		
		
		String actreportRow5 = reportRow5Array.toString();
		String expreportRow5 = "[PurOrd:1, STD RATE COGS ITEM, 12.00, 6.00, 6.00, , , , , , , ]";
		
		int reportRow6Count = reportRow6.size();
		
		ArrayList<String> reportRow6Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow6Count;i++)
		{
			String data = reportRow6.get(i).getText();
			
			reportRow6Array.add(data);
		}
		
		
		String actreportRow6 = reportRow6Array.toString();
		String expreportRow6 = "[NDT45:1, STD RATE COGS ITEM, 6.00, 6.00, 6.00, , , , , , , ]";
		
		
		
		int reportRow7Count = reportRow7.size();
		
		ArrayList<String> reportRow7Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow7Count;i++)
		{
			String data = reportRow7.get(i).getText();
			
			reportRow7Array.add(data);
		}
		
		String actreportRow7 = reportRow7Array.toString();
		String expreportRow7 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		
		
		int reportRow8Count = reportRow8.size();
		
		ArrayList<String> reportRow8Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow8Count;i++)
		{
			String data = reportRow8.get(i).getText();
			
			reportRow8Array.add(data);
		}
		
		String actreportRow8 = reportRow8Array.toString();
		String expreportRow8 = "[PurOrd:2, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		
		
		int reportRow9Count = reportRow9.size();
		
		ArrayList<String> reportRow9Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow9Count;i++)
		{
			String data = reportRow9.get(i).getText();
			
			reportRow9Array.add(data);
		}
		
		String actreportRow9 = reportRow9Array.toString();
		String expreportRow9 = "[PurOrd:3, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		
		
		int reportRow10Count = reportRow10.size();
		
		ArrayList<String> reportRow10Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow10Count;i++)
		{
			String data = reportRow10.get(i).getText();
			
			reportRow10Array.add(data);
		}
		
		String actreportRow10 = reportRow10Array.toString();
		String expreportRow10 = "[PurOrd:3, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		
		
		int reportRow11Count = reportRow11.size();
		
		ArrayList<String> reportRow11Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow11Count;i++)
		{
			String data = reportRow11.get(i).getText();
			
			reportRow11Array.add(data);
		}
		
		String actreportRow11 = reportRow11Array.toString();
		String expreportRow11 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		
		
		
		int reportRow12Count = reportRow12.size();
		
		ArrayList<String> reportRow12Array = new ArrayList<String>();
		
		for(int i=3;i<reportRow12Count;i++)
		{
			String data = reportRow12.get(i).getText();
			
			reportRow12Array.add(data);
		}
		
		String actreportRow12 = reportRow12Array.toString();
		String expreportRow12 = "[PurOrd:4, STD RATE COGS ITEM, 12.00, 12.00, 12.00, , , , , , , ]";
		
		
		
		int reportRow13Count = reportRow13.size();
		
		ArrayList<String> reportRow13Array = new ArrayList<String>();
		
		for(int i=1;i<reportRow13Count;i++)
		{
			String data = reportRow13.get(i).getText();
			
			reportRow13Array.add(data);
		}
		
		String actreportRow13 = reportRow13Array.toString();
		String expreportRow13 = "[Grand Total, , , , 138.00, 126.00, 102.00, 24.00, , , , , , ]";
		
		
		
		System.out.println("*********************************checkAgeingOfPendingDocumentsByDueDateReport*****************************************");
		
		System.out.println(actreportRow1);
		System.out.println(expreportRow1);
		System.out.println(actreportRow2);
		System.out.println(expreportRow2);
		System.out.println(actreportRow3);
		System.out.println(expreportRow3);
		System.out.println(actreportRow4);
		System.out.println(expreportRow4);
		System.out.println(actreportRow5);
		System.out.println(expreportRow5);
		System.out.println(actreportRow6);
		System.out.println(expreportRow6);
		System.out.println(actreportRow7);
		System.out.println(expreportRow7);
		System.out.println(actreportRow8);
		System.out.println(expreportRow8);
		System.out.println(actreportRow9);
		System.out.println(expreportRow9);
		System.out.println(actreportRow10);
		System.out.println(expreportRow10);
		System.out.println(actreportRow11);
		System.out.println(expreportRow11);
		System.out.println(actreportRow12);
		System.out.println(expreportRow12);
		System.out.println(actreportRow13);
		System.out.println(expreportRow13);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3)
				&& actreportRow4.equalsIgnoreCase(expreportRow4) && actreportRow5.equalsIgnoreCase(expreportRow5) && actreportRow6.equalsIgnoreCase(expreportRow6)
				&& actreportRow7.equalsIgnoreCase(expreportRow7) && actreportRow8.equalsIgnoreCase(expreportRow8) && actreportRow9.equalsIgnoreCase(expreportRow9)
				&& actreportRow10.equalsIgnoreCase(expreportRow10) && actreportRow11.equalsIgnoreCase(expreportRow11) && actreportRow12.equalsIgnoreCase(expreportRow12)
				&& actreportRow13.equalsIgnoreCase(expreportRow13))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	

	public boolean checkLinkChainAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
		orderManagementMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
		analysisOfLinkedORUnlinkedDocumentsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkChainAnalysis));
		linkChainAnalysis.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		//s.selectByVisibleText(" As on date ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
		listingOfDocWorkFlowTxt.click();
		listingOfDocWorkFlowTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			if(i==2)
			{
				data="date field";
			}
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[1, PurOrd:5, date field, 12.00, ]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			if(i==2)
			{
				data="date field";
			}
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[2, PurOrd:2, date field, 12.00, ]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			if(i==2)
			{
				data="date field";
			}
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[3, PurOrd:3, date field, 12.00, ]";
		
		int reportRow4Count = reportRow4.size();
		
		ArrayList<String> reportRow4Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow4Count;i++)
		{
			String data = reportRow4.get(i).getText();
			
			if(i==2)
			{
				data="date field";
			}
			
			reportRow4Array.add(data);
		}
		
		
		String actreportRow4 = reportRow4Array.toString();
		String expreportRow4 = "[4, PurOrd:4, date field, 12.00, ]";
		
		int reportRow5Count = reportRow5.size();
		
		ArrayList<String> reportRow5Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow5Count;i++)
		{
			String data = reportRow5.get(i).getText();
			
			if(i==2)
			{
				data="date field";
			}
			
			reportRow5Array.add(data);
		}
		
		
		String actreportRow5 = reportRow5Array.toString();
		String expreportRow5 = "[5, PurOrd:1, date field, 12.00, NDT45:1]";
		
		int reportRow6Count = reportRow6.size();
		
		ArrayList<String> reportRow6Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow6Count;i++)
		{
			String data = reportRow6.get(i).getText();
			
			if(i==2)
			{
				data="date field";
			}
			
			reportRow6Array.add(data);
		}
		
		
		String actreportRow6 = reportRow6Array.toString();
		String expreportRow6 = "[6, PurOrd:2, date field, 12.00, NDT45:2]";
		
		int reportRow7Count = reportRow7.size();
		
		ArrayList<String> reportRow7Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow7Count;i++)
		{
			String data = reportRow7.get(i).getText();
			
			reportRow7Array.add(data);
		}
		
		
		String actreportRow7 = reportRow7Array.toString();
		String expreportRow7 = "[7, Grand Total, , 72.00, ]";
		
		
		
		System.out.println("*********************************checkLinkChainAnalysisReport*****************************************");
		
		
		System.out.println("reportRow1 : "+actreportRow1+" Value Expected : "+expreportRow1);
		System.out.println("reportRow2 : "+actreportRow2+" Value Expected : "+expreportRow2);
		System.out.println("reportRow3 : "+actreportRow3+" Value Expected : "+expreportRow3);
		System.out.println("reportRow4 : "+actreportRow4+" Value Expected : "+expreportRow4);
		System.out.println("reportRow5 : "+actreportRow5+" Value Expected : "+expreportRow5);
		System.out.println("reportRow6 : "+actreportRow6+" Value Expected : "+expreportRow6);
		System.out.println("reportRow7 : "+actreportRow7+" Value Expected : "+expreportRow7);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3)
				&& actreportRow4.equalsIgnoreCase(expreportRow4) && actreportRow5.equalsIgnoreCase(expreportRow5) && actreportRow6.equalsIgnoreCase(expreportRow6)
				&& actreportRow7.equalsIgnoreCase(expreportRow7) )
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	

	public boolean checkPendingVoucherReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
		orderManagementMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
		analysisOfLinkedORUnlinkedDocumentsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingVoucherReports));
		pendingVoucherReports.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		//s.selectByVisibleText(" As on date ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocWorkFlowTxt));
		listingOfDocWorkFlowTxt.click();
		listingOfDocWorkFlowTxt.sendKeys("Purchases Orders vs Purchase Vouchers N");
		Thread.sleep(2000);
		listingOfDocWorkFlowTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(3000);
		
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			if(i==5 || i==6 || i==7 || i==8)
			{
				data="Date Or Time";
			}
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[4, SU, SU, Date Or Time, Date Or Time, Date Or Time, Date Or Time, False, Authorized, 12.00, ]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			if(i==5 || i==6 || i==7 || i==8)
			{
				data="Date Or Time";
			}
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[5, SU, SU, Date Or Time, Date Or Time, Date Or Time, Date Or Time, False, Authorized, 12.00, ]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[3, Grand Total, , , , , , , , , , 24.00, ]";
		
		
		
		
		System.out.println("*********************************checkPendingVoucherReport*****************************************");
		
		
		System.out.println("reportRow1 : "+actreportRow1+" Value Expected : "+expreportRow1);
		System.out.println("reportRow2 : "+actreportRow2+" Value Expected : "+expreportRow2);
		System.out.println("reportRow3 : "+actreportRow3+" Value Expected : "+expreportRow3);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		//checkEraseAllTransactionsLogoutAndLogin();
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3) )
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	
	
	public boolean checkValidatingAddingNewFieldInLinksCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(1000);
		
		click(voucherNewBtn);
		
		Thread.sleep(1000);
		
		checkValidationMessage("Screen opened");
		
		documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		
		Thread.sleep(2000);
		
		click(workFlowCustomizeBtnCL);
		
		Thread.sleep(5000);
		
		click(programmableExpandBtn);
		
		Thread.sleep(1500);
		
		doubleClick(programmableFiledBtn);
		
		Thread.sleep(1500);
		
		click(programmableTab);
		
		Thread.sleep(3000);
		
		ClickUsingJs(formulaControlTxt);
		
		enterText(formulaControlTxt, "c4*5");
		Thread.sleep(3000);
		
		moveToElement(formulaControlOkBtn);
		
		ClickUsingJs(custSaveBtn);
		
		String expMsg ="Data saved successfully";
		
		String actMsg =checkValidationMessage(expMsg);
		
		Thread.sleep(1500);
		
		
		
		documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		Thread.sleep(3000);
		
		//System.err.println("***********"+yesterdayDate);
		
		
		DateFormat df = new SimpleDateFormat("dd-M-yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, -31); 
		String expiryDate = df.format(exp.getTime());
		
		
		int workflowRow1Count = workFlowRow1List.size();
		ArrayList<String> workflowRow1CountListArray = new ArrayList<String>();
		for(int i=0;i<workflowRow1Count;i++)
		{
			String data = workFlowRow1List.get(i).getText();
			
			if(data.isEmpty()==false) 
			
			{
				
				workflowRow1CountListArray.add(data);
				
			}
			
		}
		String actRow1List = workflowRow1CountListArray.toString();   //dfr.format(yesterday).toString()   
		String expRow1List = "[1, PurOrd:5, "+expiryDate+", STD RATE COGS ITEM, 12.00, 60.00]";
		
		System.out.println("actRow1List     :"+actRow1List);
		System.out.println("expRow1List     :"+expRow1List);
		
		
		int workflowRow2Count = workFlowRow2List.size();
		ArrayList<String> workflowRow2CountListArray = new ArrayList<String>();
		for(int i=0;i<workflowRow2Count;i++)
		{
			String data = workFlowRow2List.get(i).getText();
			
			if(data.isEmpty()==false) 
			
			{
				
				workflowRow2CountListArray.add(data);
				
			}
			
		}
		String actRow2List = workflowRow2CountListArray.toString();
		String expRow2List = "[2, PurOrd:4, "+getCurrentDateFormat()+", STD RATE COGS ITEM, 12.00, 60.00]";
		
		System.out.println("actRow2List     :"+actRow2List);
		System.out.println("expRow2List     :"+expRow2List);
		
		ClickUsingJs(workFlowCustomizeBtnCL);
		
		Thread.sleep(5000);
		
		click(programmableTab);
		Thread.sleep(3000);
		
		String actFormulaValue  =formulaControlTxt.getAttribute("value");
		
		String expFormulaValue  ="c4*5";
		
		System.out.println("actFormulaValue     :"+actFormulaValue);
		System.out.println("expFormulaValue     :"+expFormulaValue);
		
		
		
		click(nameTab);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custLeftPannelTransExpandBtn));
		custLeftPannelTransExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custTransExtraFieldExpandBtn));
		custTransExtraFieldExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouse1ExpandBtn));
		warehouse1ExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseCode1));
		getAction().doubleClick(warehouseCode1).build().perform();
		
		Thread.sleep(2000);
		
		click(custSaveBtn);
		
		checkValidationMessage("Data saved successfully");
		
		documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		
		
		
		Thread.sleep(3000);
		
		
		int afterRow1Count = workFlowRow1List.size();
		ArrayList<String> afterRow1CountListArray = new ArrayList<String>();
		for(int i=0;i<afterRow1Count;i++)
		{
			String data = workFlowRow1List.get(i).getText();
			
			if(data.isEmpty()==false) 
			
			{
				
				afterRow1CountListArray.add(data);
				
			}
			
		}
		String afteractRow1List = afterRow1CountListArray.toString();
		String afterexpRow1List = "[1, PurOrd:5, "+expiryDate+", STD RATE COGS ITEM, HYDERABAD, 12.00]";
		
		System.out.println("afteractRow1List     :"+afteractRow1List);
		System.out.println("afterexpRow1List     :"+afterexpRow1List);
		
		
		int afterRow2Count = workFlowRow2List.size();
		ArrayList<String> afterRow2CountListArray = new ArrayList<String>();
		for(int i=0;i<afterRow2Count;i++)
		{
			String data = workFlowRow2List.get(i).getText();
			
			if(data.isEmpty()==false) 
			
			{
				
				afterRow2CountListArray.add(data);
				
			}
			
		}
		String afteractRow2List = afterRow2CountListArray.toString();
		String afterexpRow2List = "[2, PurOrd:4, "+getCurrentDateFormat()+", STD RATE COGS ITEM, HYDERABAD, 12.00]";
		
		System.out.println("afteractRow2List     :"+afteractRow2List);
		System.out.println("afterexpRow2List     :"+afterexpRow2List);
		
		Thread.sleep(3000);
		
		click(workFlowCustomizeBtnCL);
		
		Thread.sleep(5000);
		
		click(rearrangeFormula);
		
		Thread.sleep(2000);
		
		click(newFormula);
		
		newFormula1.sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(1500);
		
		newFormula1.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(1500);
		
		enterText(newFormula1, "c5*5");
		
		Thread.sleep(2000);
		
		click(reArrangeFormulaOkBtn);
		
		Thread.sleep(1500);
		
		click(custSaveBtn);
		
		checkValidationMessage("Data saved successfully");
		
		documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		
		Thread.sleep(3000);
		
		
		int afterEditingFormulaworkflowRow1Count = workFlowRow1List.size();
		ArrayList<String> afterEditingFormulaRow1CountListArray = new ArrayList<String>();
		for(int i=0;i<afterEditingFormulaworkflowRow1Count;i++)
		{
			String data = workFlowRow1List.get(i).getText();
			
			if(data.isEmpty()==false) 
			
			{
				
				afterEditingFormulaRow1CountListArray.add(data);
				
			}
			
		}
		String afterEditingFormulaactRow1List = afterEditingFormulaRow1CountListArray.toString();
		String afterEditingFormulaexpRow1List = "[1, PurOrd:5, "+expiryDate+", STD RATE COGS ITEM, HYDERABAD, 12.00, 60.00]";
		
		System.out.println("afterEditingFormulaactRow1List     :"+afterEditingFormulaactRow1List);
		System.out.println("afterEditingFormulaexpRow1List     :"+afterEditingFormulaexpRow1List);
		
		
		int afterEditingFormulaworkflowRow2Count = workFlowRow2List.size();
		ArrayList<String> afterEditingFormulaworkflowRow2CountListArray = new ArrayList<String>();
		for(int i=0;i<afterEditingFormulaworkflowRow2Count;i++)
		{
			String data = workFlowRow2List.get(i).getText();
			
			if(data.isEmpty()==false) 
			
			{
				
				afterEditingFormulaworkflowRow2CountListArray.add(data);
				
			}
			
		}
		String afterEditingFormulaactRow2List = afterEditingFormulaworkflowRow2CountListArray.toString();
		String afterEditingFormulaexpRow2List = "[2, PurOrd:4, "+getCurrentDateFormat()+", STD RATE COGS ITEM, HYDERABAD, 12.00, 60.00]";
		
		System.out.println("afterEditingFormulaactRow2List     :"+afterEditingFormulaactRow2List);
		System.out.println("afterEditingFormulaexpRow2List     :"+afterEditingFormulaexpRow2List);
		
		ClickUsingJs(workFlowCustomizeBtnCL);
		
		Thread.sleep(5000);
		
		click(programmableTab);
		Thread.sleep(3000);
		
		String actFormulaValueafterEditing  =formulaControlTxt.getAttribute("value");
		
		String expFormulaValueafterEditing  ="c5*5";
		
		System.out.println("actFormulaValueafterEditing     :"+actFormulaValueafterEditing);
		System.out.println("expFormulaValueafterEditing     :"+expFormulaValueafterEditing);
		
		
		
		
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(actRow2List) && afteractRow1List.equalsIgnoreCase(afterexpRow1List)
				&& afteractRow2List.equalsIgnoreCase(afterexpRow2List) && afterEditingFormulaactRow1List.equalsIgnoreCase(afterEditingFormulaexpRow1List)
				&& afterEditingFormulaactRow2List.equalsIgnoreCase(afterEditingFormulaexpRow2List) && actFormulaValue.equalsIgnoreCase(expFormulaValue))
		{
			
			/*
			 * click(new_CloseBtn); Thread.sleep(1000);
			 * 
			 * click(voucherhomeCloseBtn);
			 */
			
			click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			/*
			 * click(new_CloseBtn); Thread.sleep(1000);
			 * 
			 * click(voucherhomeCloseBtn);
			 */
			
			click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	
	public boolean checkValidatingExportFunctionalityInLinksCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(1000);
		
		click(voucherNewBtn);
		
		Thread.sleep(1000);
		
		checkValidationMessage("Screen opened");
		
		documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		
		Thread.sleep(2000);
		
		click(workFlowCustomizeBtnCL);
		
		Thread.sleep(5000);
		
		click(workFlowExportBtn);
		
		Thread.sleep(5000);
		/*Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		 
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
			
		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\LinkCustomizationExporting.exe");
	     
	     Thread.sleep(5000);*/
		
		
		
		boolean novalidationConfirmationMessage = validationConfirmationMessage.getText().isEmpty();

		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("actvalidationConfirmationMessage    :"+actvalidationConfirmationMessage);
		
		System.out.println("expvalidationConfirmationMessage    :"+expvalidationConfirmationMessage);
		
		
		
		
		
		if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			
		{
			
			click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return true;
			
		}
		else
		{
			
			click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return false;
			
		}
		
		
		
	
		
		
		
	}
	
	
	public boolean checkValidatingImportFunctionalityInLinksCustomization()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(2000);

		/*
		 * File Efile=new
		 * File(getBaseDir()+"\\autoIt\\ExportFiles\\exported.xml");
		 * 
		 * if(Efile.exists()) { Efile.delete(); }
		 */
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();

		Thread.sleep(1000);

		click(voucherNewBtn);

		Thread.sleep(1000);

		checkValidationMessage("Screen opened");

		documentNumberTxt.sendKeys(Keys.CONTROL, "l");

		Thread.sleep(2000);

		click(workFlowCustomizeBtnCL);

		Thread.sleep(5000);

		click(workFlowWarehouseCodeTab);
		Thread.sleep(1500);

		click(workFlowRemoveColumnBtn);

		click(programmableTab);

		Thread.sleep(1500);

		click(workFlowRemoveColumnBtn);

		click(custSaveBtn);
		
		checkValidationMessage("Data saved successfully");
		
		documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		
		Thread.sleep(1500);
		
		

		int actworkflowHeaderListCount  = workflowHeaderList.size();
		int expworkflowHeaderListCount  = 5;

		/*
		 * ArrayList<String> actworkflowHeaderListArray = new ArrayList<String>();
		 * 
		 * for (int i = 0; i < actworkflowHeaderListCount; i++) { String data =
		 * workflowHeaderList.get(i).getText().trim();
		 * 
		 * 
		 * if(data.isEmpty()==false) { actworkflowHeaderListArray.add(data); }
		 * 
		 * 
		 * }
		 * 
		 * String actworkflowHeaderList = actworkflowHeaderListArray.toString(); String
		 * expworkflowHeaderList = "";
		 */

		System.out.println("actworkflowHeaderListCount    :" + actworkflowHeaderListCount);

		System.out.println("expworkflowHeaderListCount    :" + expworkflowHeaderListCount);
		
		
		
		
		
		
		
		
		
		
		/*
		 * Thread.sleep(1500);
		 * 
		 * 
		 * documentNumberTxt.sendKeys(Keys.CONTROL,"l");
		 */
		
		Thread.sleep(1500);

		click(workFlowCustomizeBtnCL);

		Thread.sleep(5000);

		click(workFlowImportBtn);

		 Thread.sleep(3000);
	     
	     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\LinkcustomizationImport.exe");
	     
	     Thread.sleep(3000);
	     
	     click(custSaveBtn);
	     
	     checkValidationMessage("Data saved successfully");
	     
	     documentNumberTxt.sendKeys(Keys.CONTROL,"l");
	     
	     Thread.sleep(2000);
	     
	     int actworkflowHeaderListCount1  = workflowHeaderList.size();
		 int expworkflowHeaderListCount1  = 7;
	     
	     
		System.out.println("actworkflowHeaderListCount1    :" + actworkflowHeaderListCount1);

		System.out.println("expworkflowHeaderListCount1    :" + expworkflowHeaderListCount1);

		if (actworkflowHeaderListCount==expworkflowHeaderListCount && actworkflowHeaderListCount1==expworkflowHeaderListCount1 )

		{

			//click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return true;

		} else {

			//click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return false;

		}

	}
	
	
	public boolean checkValidatingDeleteFunctionalityInLinksCustomization()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();

		Thread.sleep(1000);

		click(voucherNewBtn);

		Thread.sleep(1000);

		checkValidationMessage("Screen opened");

		documentNumberTxt.sendKeys(Keys.CONTROL, "l");

		Thread.sleep(2000);

		click(workFlowCustomizeBtnCL);

		Thread.sleep(5000);

		click(workflowDeleteLayout);
		Thread.sleep(1500);
		
		String actAlt   =getAlert().getText();
		String expAlt   ="Do you want to delete the layout?";
		
		System.out.println("actAlt     :"+actAlt);
		System.out.println("expAlt     :"+expAlt);
		
		getAlert().accept();
		
		String expValidationMsg ="Layout Deleted Successfully";
		String actValidationMsg =checkValidationMessage(expValidationMsg);
		
		
		if (actValidationMsg.equalsIgnoreCase(expValidationMsg) && actAlt.equalsIgnoreCase(expAlt))

		{

			//click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return true;

		} else {

			//click(custCancelBtn);
			Thread.sleep(1500);
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return false;

		}

	}
	
	@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']/button")
	public static WebElement homePannelOpenBtn;
	
	@FindBy(xpath = "//a[text()='Pending Purchases Orders']")
	public static WebElement pendingPurchasesOrdersLink;
	
	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
	public static List<WebElement> grid_VoucherNoList;
	
	@FindBy(xpath = "//*[@id='id_TransHomeFilter']")
	public static WebElement filterVoucher;
	
	@FindBy(xpath = "//*[text()='Filter']")
	public static WebElement filterPopupTxt;
	
	@FindBy(xpath = "//*[@id='idFilterCustomizeIcon']")
	public static WebElement filterCustomizationIcon;
	
	@FindBy(xpath = "(//*[text()='Customize'])[1]")
	public static WebElement customizationPopupTxt;
	
	@FindBy(xpath = "//*[@id='btnSetFilterVal']")
	public static WebElement defaultFilterPopupOkBtn;
	
	@FindBy(xpath = "(//label[contains(text(),'DocNo')])[1]//..//input")
	public static WebElement docnoCheckBx;
	
	@FindBy(xpath = "//*[@id='FilterFieldCust_2050_2']/div/div[3]/button[1]")
	public static WebElement customizePopupOkBtn;
	
	@FindBy(xpath = "//*[@id='2050_2_DefaultFilter_0_Start']")
	public static WebElement fromDocNoTxt;
	
	@FindBy(xpath = "//*[@id='2050_2_DefaultFilter_0_End']")
	public static WebElement toDocNoTxt;
	
	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
	public static List<WebElement> grid_CheckBoxList;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td")
	public static List<WebElement> Row1BodyList;

	
	
	
	public boolean checkFilterOptionsUnderPendingPurchaseOrderLink()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();

		Thread.sleep(2000);
		
		

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homePannelOpenBtn));
		//homePannelOpenBtn.click();

		Thread.sleep(1000);

		click(pendingPurchasesOrdersLink);

		Thread.sleep(1500);

		int actualgrid_VoucherNoList = grid_VoucherNoList.size()-1;
		int expectedgrid_VoucherNoList = 2;

		System.out.println("actualgrid_VoucherNoList   	 :" + actualgrid_VoucherNoList);
		System.out.println("expectedgrid_VoucherNoList   :" + expectedgrid_VoucherNoList);

		click(filterVoucher);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterPopupTxt));

		boolean actFilterpopupIsDisplaying = filterPopupTxt.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("act Filter popupIs Displaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);

		click(filterCustomizationIcon);

		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationPopupTxt));

		boolean actcustomizationpopupIsDisplaying = customizationPopupTxt.isDisplayed();
		boolean expcustomizationpopupIsDisplaying = true;

		System.out.println("actcustomizationpopupIsDisplaying : " + actcustomizationpopupIsDisplaying
				+ "  Value Expected  " + expcustomizationpopupIsDisplaying);

		click(docnoCheckBx);

		click(customizePopupOkBtn);

		Thread.sleep(1500);

		enterText(fromDocNoTxt, "4");

		// fromDocNoTxt.sendKeys(Keys.TAB);

		enterText(toDocNoTxt, "4");

		click(defaultFilterPopupOkBtn);
		
		Thread.sleep(2000);

		int actualgrid_VoucherNoListAfterFiletr = grid_VoucherNoList.size()-1;
		int expectedgrid_VoucherNoListAfterFiletr = 1;

		System.out.println("actualgrid_VoucherNoListAfterFiletr   	 :" + actualgrid_VoucherNoListAfterFiletr);
		System.out.println("expectedgrid_VoucherNoListAfterFiletr    :" + expectedgrid_VoucherNoListAfterFiletr);

		Thread.sleep(2000);

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) {
			String VoucherNo = grid_VoucherNoList.get(i).getText();

			if (VoucherNo.equalsIgnoreCase("4")) {
				getAction().doubleClick(grid_CheckBoxList.get(i)).build().perform();
			}
		}

		checkValidationMessage("Link data loaded");

		enterText(purchaseAccountTxt, "Purchase");
		Thread.sleep(1500);
	

		enterText(departmentTxt, "DUBAI");

		Thread.sleep(1500);

		int row1List = Row1BodyList.size();
		System.err.println(row1List);
		ArrayList<String> row1SalesList = new ArrayList<String>();
		for (int i = 0; i < row1List; i++) {
			String data = Row1BodyList.get(i).getText();
			row1SalesList.add(data);
		}

		String actrow1List = row1SalesList.toString();
		String exprow1List = "[1, STD RATE COGS ITEM, Dozs, 0, 10.00, 1.00, PurOrd:4, 10.00, 10.00, 0.00]";

		System.out.println("actrow1List       :" + actrow1List);
		System.out.println("exprow1List       :" + exprow1List);

		click(vouchersaveBtn);

		Thread.sleep(2000);

		click(billRefNewRefTxt);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 3";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actrow1List.equalsIgnoreCase(exprow1List) && actualgrid_VoucherNoList == expectedgrid_VoucherNoList
				&& actualgrid_VoucherNoListAfterFiletr == expectedgrid_VoucherNoListAfterFiletr
				&& actFilterpopupIsDisplaying == expFilterpopupIsDisplaying
				&& actcustomizationpopupIsDisplaying == expcustomizationpopupIsDisplaying) {
			System.out.println("Test Pass : Reports Are As Expected");

			return true;
		} else {
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	@FindBy(xpath="//span[@id='2078']")
	private static WebElement mipSearch;
	
	 @FindBy(xpath="//*[@id='txtSearchMenu_MainLayout']")
	 private static WebElement serachMenuTextHomePage;
	 
	 
	 
	 
	 public static void prongHornExit() throws AWTException, InterruptedException, IOException
		{
		 
			
			
			/* Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_WINDOWS);
			 robot.keyPress(KeyEvent.VK_R); 
			 robot.keyRelease(KeyEvent.VK_R);
			 robot.keyRelease(KeyEvent.VK_WINDOWS);*/
			 
			 
		     
		     Thread.sleep(4000);
		     
		    Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\pronghornexit.exe");
		   
		     //Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\inetmgrRestart.exe");
		     //Thread.sleep(3000);
		     
		     
			/*
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * 
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * 
			 * 
			 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
			 */
	  
		    Thread.sleep(2000);

		  
		
		}
		
		public static  void inetRestart() throws AWTException, InterruptedException, IOException
		{
			
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_WINDOWS); 
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D); 
			robot.keyRelease(KeyEvent.VK_WINDOWS);
			
			Thread.sleep(4000);
			
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\RightClick.exe");
		 
				
				/*
				 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_TAB);
				 * robot.keyRelease(KeyEvent.BUTTON3_DOWN_MASK);
				 * 
				 * 
				 * 
				 * 
				 * robot.keyPress(KeyEvent.VK_WINDOWS); robot.keyPress(KeyEvent.VK_R);
				 * robot.keyRelease(KeyEvent.VK_R); robot.keyRelease(KeyEvent.VK_WINDOWS);
				 * 
				 * 
				 * 
				 * 
				 * 
				 * Thread.sleep(3000);
				 * 
				 * Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\proghornexit.exe")
				 * ;
				 * 
				 * //Runtime.getRuntime().exec(getBaseDir()+
				 * "\\autoIt\\scripts\\inetmgrRestart.exe"); //Thread.sleep(3000);
				 * 
				 * robot.keyPress(KeyEvent.VK_TAB);
				 * robot.keyRelease(KeyEvent.BUTTON3_DOWN_MASK);
				 * //robot.keyPress(KeyEvent.VK_TAB);
				 * robot.keyRelease(KeyEvent.BUTTON1_DOWN_MASK);
				 * 
				 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
				 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
				 * 
				 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
				 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
				 * 
				 * 
				 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
				 */
					 
				 
			 
	  
	         Thread.sleep(5000);

		     
		     
		   // Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\proghornExit.exe");
		     
		}
		
		
		public static void  prongHornOn() throws AWTException, InterruptedException, IOException
		{
		 
			
			/*
			 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_WINDOWS);
			 * robot.keyPress(KeyEvent.VK_R); robot.keyRelease(KeyEvent.VK_R);
			 * robot.keyRelease(KeyEvent.VK_WINDOWS);
			 */
			 
		     
		     Thread.sleep(3000);
		     
		  Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PronghornOn.exe");
		   
		     //Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\inetmgrRestart.exe");
		     //Thread.sleep(3000);
		     
		     
			/*
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * 
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
			 * 
			 * 
			 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
			 */
	  
		  Thread.sleep(5000);
		  
		  Robot robot = new Robot(); 
		  robot.keyPress(KeyEvent.VK_ALT);
		  robot.keyPress(KeyEvent.VK_TAB);
		  
		  robot.keyRelease(KeyEvent.VK_ALT);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  
		  

		     
		     
		   // Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\proghornExit.exe");
		     
		     
		}
		
		
		public boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
    	{
    		Thread.sleep(2000);

    	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    String compname="Transaction Authorization";

    		Select oSelect = new Select(companyDropDownList);

    		List <WebElement> elementCount = oSelect.getOptions();

    		int cqSize = elementCount.size();

    		System.out.println("CompanyDropdownList Count :"+cqSize);

    		int i;

    		for(i=0; i<elementCount.size(); i++) 
    		{

    			elementCount.get(i).getText();

    			String optionName = elementCount.get(i).getText();
    			if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
    			{
    				System.out.println("q"+elementCount.get(i).getText());
    				elementCount.get(i).click();
    			}
    		}


    		Thread.sleep(2000);
    	    
    	    lp.clickOnSignInBtn();
    	    
    	    
    		Thread.sleep(5000);
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    		String actUserInfo=userNameDisplay.getText();
    		
    		System.out.println("User Info  : "+actUserInfo);
    		
    		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
    		
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    		companyLogo.click();
    		
    		String getCompanyTxt=companyName.getText();
    		String getLoginCompanyName=getCompanyTxt.substring(0, 25);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="SU";
    		String expLoginCompanyName   ="Transaction Authorization";
    		boolean expDashboard = true;
    		
    		
    		Thread.sleep(2000);
    		
    		
    		
    		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
    		{
				return true;
			}
    		else
    		{
    			return false;
			}
    	}
	 
	 
	
	public boolean checkCD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	     
	     lp.enterUserName(unamelt);
	     
	     lp.enterPassword(pawslt);
	     
	     Thread.sleep(2000);
	     
	     lp.clickOnSignInBtn();
	     
	     Thread.sleep(7000);
	     
		if(serachMenuTextHomePage.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='copydoc_tblBodyTransRender']/tr/td[3]")
	private static List<WebElement> cdVoucherNameList;
	
	@FindBy(xpath="//*[@id='copydoc_tblBodyTransRender']/tr/td[1]/input")
	private static List<WebElement> cdChkBoxList;
	
	
	@FindBy(xpath="//input[@id='optCopyDocType']")
	private static WebElement cd_vouchertypeTxt;
	
	@FindBy(xpath="//select[@id='id_searchoncolumns']")
	private static WebElement cd_searchOnDropdown1;
	
	@FindBy(xpath="//div[@id='id_transaction_entry_container_others']//div[5]//select[1]")
	private static WebElement cd_searchOnDropdown2;
	
	@FindBy(xpath="//input[@id='srch_doc']")
	private static WebElement cd_searchTxt;
	
	@FindBy(xpath="//input[@id='id_transaction_entry_copydocument_refresh']")
	private static WebElement cd_refreshBtn;
	
	@FindBy(xpath="//input[@id='id_transaction_entry_copydocument_filter_togglebutton']")
	private static WebElement cd_filterBtn;
	
	@FindBy(xpath="//input[@id='copydoc_HeaderChkBox']")
	private static WebElement cd_HeaderChkBox;
	
	@FindBy(xpath="//tr[@id='tr_copydoc_voucher_1']//td//input")
	private static WebElement cd_FirstChkBox;
	
	@FindBy(xpath="//input[@id='id_chkclubsimilartxn']")
	private static WebElement cd_clubsimilarTransChkBox;
	
	@FindBy(xpath="//*[@id='id_copydoc_grid1_buttonsrow']/div[3]/input")
	private static WebElement cd_SelectallBtn;
	
	@FindBy(xpath="//button[@id='btn_firstPage']")
	private static WebElement cd_firstBtn;
	
	@FindBy(xpath="//button[@id='btn_previousPage']")
	private static WebElement cd_PreviousBtn;
	
	@FindBy(xpath="//button[@id='input_pagenumber']")
	private static WebElement cd_PageNo;
	
	@FindBy(xpath="//button[@id='btn_nextPage']")
	private static WebElement cd_nextBtn; 
	
	@FindBy(xpath="//button[@id='btn_lastPage']")
	private static WebElement cd_LastBtn;
	
	@FindBy(xpath="//input[@id='id_transaction_copydoc_ok']")
	private static WebElement cd_OkBtn;
	
	@FindBy(xpath="//input[@id='id_transaction_copydoc_cancel']")
	private static WebElement cd_CancelBtn;
	

	
	
	
	public boolean checkCannotExceedTheBaseValueOptionForMultipleRowsWithSameItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		checkEraseAllTransactionsLogoutAndLogin();
		//checkEraseAllTransactions();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		click(firstRowIndex);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(duplicateRowBtn));
		duplicateRowBtn.click();
		
		Thread.sleep(1500);
		
		System.out.println("2nd Row Added");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(duplicateRowBtn));
		duplicateRowBtn.click();
		
		Thread.sleep(1500);
		
		System.out.println("3rd Row Added");
		
		Thread.sleep(1000);
		
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Hyderabad"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
		select2ndRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
		select3rdRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		
		
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		grid_ChkBox1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomedeleteBtn));
		voucherHomedeleteBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
		checkUserFriendlyMessage();
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor1=vendorAccountListCount.size();
		
		System.err.println(countVendor1);
		
		for(int i=0 ; i < countVendor1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount1=wareHouseListCount.size();
		
		System.err.println(warehouseCount1);
			
		for(int i=0 ; i < warehouseCount1 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
		select3rdRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
		select3rdRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		System.out.println("************************************* checkCannotExceedTheBaseValueOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true && savingMessage1==true && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	public boolean checkCannotExceedTheBaseValueOptionForMultipleRowsWithDifferentItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}*/
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount2=itemListCount.size();
		
		System.err.println(itemcount2);
			
		for(int i=0 ; i < itemcount2 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		System.out.println("2nd Row Added");
		
		
		
		
		
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount3=itemListCount.size();
		
		System.err.println(itemcount3);
			
		for(int i=0 ; i < itemcount3 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("FIFO COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		System.out.println("3rd Row Added");
		
		
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount4=itemListCount.size();
		
		System.err.println(itemcount4);
			
		for(int i=0 ; i < itemcount4 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("WA COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		System.out.println("4th Row Added");
		
		
		
		
		/*click(firstRowIndex);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(duplicateRowBtn));
		duplicateRowBtn.click();
		
		Thread.sleep(1500);
		
		System.out.println("2nd Row Added");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(duplicateRowBtn));
		duplicateRowBtn.click();
		
		Thread.sleep(1500);
		
		System.out.println("3rd Row Added");
		
		Thread.sleep(1000);*/
		
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Hyderabad"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		//1st Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		
		// 2nd Row
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
		select2ndRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
		select2ndRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		// 3rd Row
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
		select3rdRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount5=itemListCount.size();
		
		System.err.println(itemcount5);
			
		for(int i=0 ; i < itemcount5 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("FIFO COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
		select3rdRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
		select3rdRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_1stColumn));
		select4thRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount6=itemListCount.size();
		
		System.err.println(itemcount6);
			
		for(int i=0 ; i < itemcount6 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("WA COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_5thColumn));
		select4thRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
		select4thRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
		select2ndRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
		select3rdRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);*/
		
		
		
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		grid_ChkBox1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomedeleteBtn));
		voucherHomedeleteBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
		checkUserFriendlyMessage();
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor1=vendorAccountListCount.size();
		
		System.err.println(countVendor1);
		
		for(int i=0 ; i < countVendor1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount1=wareHouseListCount.size();
		
		System.err.println(warehouseCount1);
			
		for(int i=0 ; i < warehouseCount1 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		
		
		//1st Row
		
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();		
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount7=itemListCount.size();
				
				System.err.println(itemcount7);
					
				for(int i=0 ; i < itemcount7 ;i++)
				{
					String data=itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
					{
						itemListCount.get(i).click();
						
						break;
					}
				}
				
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
				select1stRow_5thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
				workFlowHeaderChkBox.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
				workFlowOkBtn.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
				select1stRow_7thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				
				
				// 2nd Row
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
				select2ndRow_1stColumn.click();		
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount8=itemListCount.size();
				
				System.err.println(itemcount8);
					
				for(int i=0 ; i < itemcount8 ;i++)
				{
					String data=itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("BR COGS ITEM"))
					{
						itemListCount.get(i).click();
						
						break;
					}
				}
				
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
				select2ndRow_5thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
				workFlowHeaderChkBox.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
				workFlowOkBtn.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
				select2ndRow_7thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				
				// 3rd Row
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
				select3rdRow_1stColumn.click();		
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount9=itemListCount.size();
				
				System.err.println(itemcount9);
					
				for(int i=0 ; i < itemcount9 ;i++)
				{
					String data=itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("FIFO COGS ITEM"))
					{
						itemListCount.get(i).click();
						
						break;
					}
				}
				
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
				select3rdRow_5thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
				workFlowHeaderChkBox.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
				workFlowOkBtn.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
				select3rdRow_7thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_1stColumn));
				select4thRow_1stColumn.click();		
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount10=itemListCount.size();
				
				System.err.println(itemcount10);
					
				for(int i=0 ; i < itemcount10 ;i++)
				{
					String data=itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("WA COGS ITEM"))
					{
						itemListCount.get(i).click();
						
						break;
					}
				}
				
				enter_ItemTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_5thColumn));
				select4thRow_5thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys("2");
				enter_Quantity.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
				workFlowHeaderChkBox.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
				workFlowOkBtn.click();	
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_5thColumn));
				select4thRow_5thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.sendKeys("2");
				enter_Quantity.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
				select4thRow_7thColumn.click();	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
		
		
		
		
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		System.out.println("************************************* checkCannotExceedTheBaseValueOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true && savingMessage1==true && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	public boolean checkCannotExceedTheBaseValueOptionForMultipleRowsWithSameItem1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
		
		/*click(firstRowIndex);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(duplicateRowBtn));
		duplicateRowBtn.click();
		
		Thread.sleep(1500);
		
		System.out.println("2nd Row Added");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(duplicateRowBtn));
		duplicateRowBtn.click();
		
		Thread.sleep(1500);
		
		System.out.println("3rd Row Added");
		
		Thread.sleep(1000);*/
		
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Hyderabad"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
	    
		Thread.sleep(2000);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		grid_ChkBox1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHomedeleteBtn));
		voucherHomedeleteBtn.click();
		
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
		checkUserFriendlyMessage();
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).build().perform();
		
		checkUserFriendlyMessage();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count1=purchaseAccountListCount.size();
		
		System.err.println(count1);
		
		for(int i=0 ; i < count1 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor1=vendorAccountListCount.size();
		
		System.err.println(countVendor1);
		
		for(int i=0 ; i < countVendor1 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount1=departmentListCount.size();
		
		System.err.println(departmentcount1);
			
		for(int i=0 ; i < departmentcount1 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount1=wareHouseListCount.size();
		
		System.err.println(warehouseCount1);
			
		for(int i=0 ; i < warehouseCount1 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount1=itemListCount.size();
		
		System.err.println(itemcount1);
			
		for(int i=0 ; i < itemcount1 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		Thread.sleep(2000);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
		select3rdRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno2=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		/*String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);*/
		
		
		boolean savingMessage2=checkVoucherSavingMessage(docno2);
		
		click(previousBtn);
		
		checkValidationMessage("Voucher loaded successfully");
		
		click(new_Suspend);
		
		checkValidationMessage("Voucher loaded successfully");
		
		click(new_CloseBtn);
		
		Thread.sleep(2000);
		
		String actStatus   =voucherHomePgeSupendedStatus.getText();
		String expStatus   ="True";
		
		System.out.println("actStatus   :"+actStatus);
		System.out.println("expStatus   :"+expStatus);
		
		Thread.sleep(2000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		Thread.sleep(3000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count2=purchaseAccountListCount.size();
		
		System.err.println(count2);
		
		for(int i=0 ; i < count2 ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor2=vendorAccountListCount.size();
		
		System.err.println(countVendor2);
		
		for(int i=0 ; i < countVendor2 ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount2=departmentListCount.size();
		
		System.err.println(departmentcount2);
			
		for(int i=0 ; i < departmentcount2 ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount2=wareHouseListCount.size();
		
		System.err.println(warehouseCount2);
			
		for(int i=0 ; i < warehouseCount2 ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount2=itemListCount.size();
		
		System.err.println(itemcount2);
			
		for(int i=0 ; i < itemcount2 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
		select3rdRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno3=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		/*String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);*/
		
		boolean savingMessage3=checkVoucherSavingMessage(docno3);
		
		click(new_CloseBtn);
		
		Thread.sleep(2000);
		
		doubleClick(SupendedVoucherCheckBox);
		checkValidationMessage("Voucher loaded successfully");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		
		
		
		
		
		
		
		System.out.println("************************************* checkCannotExceedTheBaseValueOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage2  :  "+savingMessage2 +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage3  :  "+savingMessage3 +" Value Expected : "+"TRUE");
		System.out.println("ValidationMessage1 : "+actStatus+" Value Expected : "+expStatus);
		System.out.println("ValidationMessage2 : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true && savingMessage1==true && actValidationMessage.equalsIgnoreCase(expValidationMessage)
				&& savingMessage2==true && savingMessage3==true && actStatus.equalsIgnoreCase(expStatus))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	public boolean checkCannotExceedTheBaseValueOptionOnEditing() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		  		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    prongHornOn();
	    Thread.sleep(2000);
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
		purchasesOrdersVoucher.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		 vendorAccountTxt.sendKeys(Keys.SPACE);
		 
		 Thread.sleep(2000);
		 
		 int vendorcount=vendorAccountListCount.size();
		 
		 System.err.println(vendorcount);
		 
		 for(int i=0 ; i < vendorcount ;i++)
		 {
			 String data=vendorAccountListCount.get(i).getText();
			 
			 if(data.equalsIgnoreCase("Vendor A"))
			 {
				 vendorAccountListCount.get(i).click();
				 
				 break;
			 }
		 }
			
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
		pvWareHouseTxt.click();
		pvWareHouseTxt.sendKeys(Keys.END);
		pvWareHouseTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		pvWareHouseTxt.sendKeys(Keys.BACK_SPACE);
		pvWareHouseTxt.sendKeys(Keys.SPACE);
		
		int warehousecount=pvwareHouseListCount.size();
		
		System.err.println(warehousecount);
		
		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=pvwareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("HYDERABAD"))
			{
				pvwareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		pvWareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount=itemListCount.size();
		
		System.err.println(itemcount);
			
		for(int i=0 ; i < itemcount ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
			
		enter_ItemTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.sendKeys(Keys.TAB);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		boolean savingMessage=checkVoucherSavingMessage(docno);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNew));
		purchaseVoucherNew.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		checkUserFriendlyMessage();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt));
		purchaseAccountTxt.click();
		purchaseAccountTxt.sendKeys(Keys.SPACE);
		
		int count=purchaseAccountListCount.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=purchaseAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase"))
			{
				purchaseAccountListCount.get(i).click();
				
				break;
			}
		}
		
		purchaseAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.SPACE);
		
		int countVendor=vendorAccountListCount.size();
		
		System.err.println(countVendor);
		
		for(int i=0 ; i < countVendor ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Vendor A"))
			{
				vendorAccountListCount.get(i).click();
				
				break;
			}
		}
		
		vendorAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		
		wareHouseTxt.sendKeys(Keys.SPACE);
			
		int warehouseCount=wareHouseListCount.size();
		
		System.err.println(warehouseCount);
			
		for(int i=0 ; i < warehouseCount ;i++)
		{
			String data=wareHouseListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Hyderabad"))
			{
				wareHouseListCount.get(i).click();
				
				break;
			}
		}
			
		wareHouseTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys(Keys.SPACE);
		
		int itemcount0=itemListCount.size();
		
		System.err.println(itemcount0);
			
		for(int i=0 ; i < itemcount0 ;i++)
		{
			String data=itemListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
			{
				itemListCount.get(i).click();
				
				break;
			}
		}
		
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno1=documentNumberTxt.getAttribute("value");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		boolean savingMessage1=checkVoucherSavingMessage(docno1);
		
		Thread.sleep(2000);
		
		click(previousBtn);
		
		checkValidationMessage("Voucher loaded successfully");
	    
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowHeaderChkBox));
		workFlowHeaderChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowOkBtn));
		workFlowOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
			select1stRow_5thColumn.click();	
		
		Thread.sleep(1200);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("2");
		enter_Quantity.sendKeys(Keys.TAB);*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_7thColumn));
		select1stRow_7thColumn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();
		
		Thread.sleep(2000);
		
		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
	
		String expValidationMessage = "Link has already been consumed by another voucher. Please re-check the links.";
		String actValidationMessage = checkValidationMessage(expValidationMessage);
		
		System.out.println("************************************* checkCannotExceedTheBaseValueOption  *********************************");
		System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
		System.out.println("SavingMessage1  :  "+savingMessage1 +" Value Expected : "+"TRUE");
		System.out.println("ValidationMessage : "+actValidationMessage+" Value Expected : "+expValidationMessage);
		
		prongHornExit();
		Thread.sleep(10000);
		checkLogoutAndLoginWithoutPronghorn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys("PurchasesFlow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		
		draggedPurchasesVouchersN.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		
		if(cannotExceedTheBaseValueChkbox.isSelected()==true)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotExceedTheBaseValueChkbox));
			cannotExceedTheBaseValueChkbox.click();
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage1="WorkFlow Saved Successfully";
	  		
		String actMessage1=checkValidationMessage(expMessage1);
		  		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		checkEraseAllTransactionsLogoutAndLogin();
		
		if (savingMessage==true && savingMessage1==true && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("Voucher Saved");
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;
	
	
	
	public boolean checkLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	  userNameDisplay.click();
	 
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	  logoutOption.click();
	  
	  Thread.sleep(2000);
	  
	  System.out.println("Logout  Successfully");

	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	  boolean actUserName = username.isDisplayed();
	  boolean expUserName = true; 
			  
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
      boolean actPassword = password.isDisplayed();
      boolean expPassword = true;  
		
      System.out.println("*************************CheckLogout***************************");
      
      System.out.println("UserName is Displaying : "+actUserName+"  Value Expected  "+expUserName);
      System.out.println("Password is Displaying : "+actPassword+"  Value Expected  "+expPassword);
      
	if(actUserName==expUserName && actPassword==expPassword)  
      {
		return true;
	  }
      else
      {
		return false;
	  }
    }


	
	
	
	
	
	
	
	
	public DesignWorkFLowOptionsPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
}
