package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.DesignWorkFLowOptionsPage;
import com.focus.base.BaseEngine;

public class DesignWorkFlowOptionsTest extends BaseEngine 
{
	static DesignWorkFLowOptionsPage dp;
	
	 
	@Test(priority=100)	 
	 public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		dp=new DesignWorkFLowOptionsPage(getDriver());
		 Assert.assertEquals(dp.checkLogin(), true);
	 }
	
	
	@Test(enabled=false)
	public void checkLoginAndRestoreOptionsCompanyAndLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoginAndRestoreOptionsCompanyAndLogin(),true);
	}
	 	
	
	@Test(priority=101)
	public void checkBackup() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkBackup(),true);
	}
	
	
	@Test(priority=201)
	public void checkSavingOpeningStockVoucher1WithBatchItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingOpeningStockVoucher1WithBatchItem(),true);
	}
	
	@Test(priority=202)
	public void checkSavingShortageInStocksVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingShortageInStocksVoucher1(),true);
	}
	
	@Test(priority=203)
	public void checkExcessesInStocksVoucherBatchNosByConvertingPendingShortageInStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkExcessesInStocksVoucherBatchNosByConvertingPendingShortageInStocks(),true);
	}
	
	@Test(priority=204)
	public void checkExcessesInStocksVoucherBatchNosByWorkFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkExcessesInStocksVoucherBatchNosByWorkFlow(),true);
	}
	
	@Test(priority=205)
	public void checkEraseAllTransactionsAfterExcessesInStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactionsAfterIntialCheck(),true);
	}
	
	
	@Test(priority=1002)
	public void checkInputingWorkflowNameAsPurchasesFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkInputingWorkflowNameAsPurchasesFlow(),true);
	}
	
	@Test(priority=1003)
	public void checkLinkBetweenPurchaseOrderAndPVN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkBetweenPurchaseOrderAndPVN(),true);
	}
	
	@Test(priority=1004)
	public void CheckLinkValueDropDownOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.CheckLinkValueDropDownOptions(),true);
	}
	
	@Test(priority=1005)
	public void checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrderAndPvn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrderAndPvn(),true);
	}
	
	@Test(priority=1006)
	public void checkSelectingItemOptionBetweenPurchaseOrderAndPvn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSelectingItemOptionBetweenPurchaseOrderAndPvn(),true);
	}
	
	@Test(priority=1007)
	public void checkMapOptionAndMappedFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkMapOptionAndMappedFields(),true);
	}
	
	
	@Test(priority=1008)
	public void checkSavingPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrders(),true);
	}
	
	
	@Test(priority=1009)
	public void checkPendingPurchaseOrdersPurchaseVoucherNHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingPurchaseOrdersPurchaseVoucherNHomePage(),true);
	}
	
	@Test(priority=1010)
	public void checkPendingLinksThroughConvertOptionWithSelectingRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingLinksThroughConvertOptionWithSelectingRow(),true);
	}
	
	@Test(priority=1011) 
	public void checkSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields(),true);
	}
	
	
	@Test(priority=1012)
	public void checkEraseAllTransactionsAfterIntialCheck() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactionsAfterIntialCheck(),true);
	}
	
	
	
	//@Test(priority=1013)
	public void checkUpdatingMapFieldsInBetweenPurchaseOrdersAndPvn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkUpdatingMapFieldsInBetweenPurchaseOrdersAndPvn(),true);
	}
	
	
	
	@Test(priority=1014)
	public void checkSavingPurchaseOrdersAfterUpdatingMapFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrdersAfterUpdatingMapFields(),true);
	}
	
	@Test(priority=1015) 
	public void checkPendingLinksThroughConvertOptionAfterMapFieldsUpdating() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingLinksThroughConvertOptionAfterMapFieldsUpdating(),true);
	}
	
	
	@Test(priority=1016)
	public void CheckSavingAndDeleteAllTransactions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.CheckSavingAndDeleteAllTransactions(),true);
	}
	
	
	
	
	
	@Test(priority=1017)
	public void checkRaiseLinkDocumentWhenBaseIsSavedOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRaiseLinkDocumentWhenBaseIsSavedOption(),true);
	}
	
	
	@Test(priority=1018)
	public void checkAutoCLoseInDaysOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAutoCLoseInDaysOption(),true);
	}
	
	
	
	@Test(priority=1019) // Quantity after Consolidating is not as expected.
	public void checkConsolidateOnDocumentWhenDisplayingInSelection() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkConsolidateOnDocumentWhenDisplayingInSelection(),true);
	}
	
	
	
	@Test(priority=1020) 
	public void checkCheckStockWhileLinkingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCheckStockWhileLinkingOption(),true);
	}
	
	@Test(priority=1021) 
	public void checkCannotExceedTheBaseValueOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCannotExceedTheBaseValueOption(),true);
	}     
	
	@Test(priority=1022)
	public void checkBaseDocumentCannotBeEditiedAfterItIsLinkedOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkBaseDocumentCannotBeEditiedAfterItIsLinkedOption(),true);
	}
	
	@Test(priority=1023)
	public void checkCloseLinkAfterDueDateElapses() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkAfterDueDateElapses(),true);
	}
	
	@Test(priority=1024)
	public void checkLinkIsMandatoryOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkIsMandatoryOption(),true);
	}
	
	@Test(priority=1025)
	public void checkDoNotClubWithCommonBaseOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkDoNotClubWithCommonBaseOption(),true);
	}
	
	
	@Test(priority=1026)
	public void checkDoNotAllowSelectionIfLinksFieldsAreNotSelectedOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkDoNotAllowSelectionIfLinksFieldsAreNotSelectedOption(),true);
	}
	
	
	@Test(priority=1027)
	public void checkAllowBackDatedLinkingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAllowBackDatedLinkingOption(),true);
	}
	
	
	@Test(priority=1028)
	public void checkRecheckBeforeTheSavingIfLinkIsConsumedElseWhereOnTheNetWorkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRecheckBeforeTheSavingIfLinkIsConsumedElseWhereOnTheNetWorkOption(),true);
	}
	
	@Test(priority=1029)
	public void checkUseThisLinkOnlyForLoadingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkUseThisLinkOnlyForLoadingOption(),true);
	}
	
	
	@Test(priority=1030)
	public void checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption(),true);
	}
	
	@Test(priority=1031)
	public void checkLinkIsOptionalIfTheDocumentIsLinkedToOtherBaseDocumentOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkIsOptionalIfTheDocumentIsLinkedToOtherBaseDocumentOption(),true);
	}

	@Test(priority=1032)
	public void checkRaiseLinkDocumentWhenBaseIsSaved() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRaiseLinkDocumentWhenBaseIsSaved(),true);
	}
	
	  
	
	@Test(priority=1033)
	public void checkLoadPendingDocumentsAndBasedOnFieldOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoadPendingDocumentsAndBasedOnFieldOption(),true);
	}
	
	
	
	@Test(priority=1034)
	public void checkLoadPendingDocumentsAndBasedOnFieldOptionWithExtraField() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoadPendingDocumentsAndBasedOnFieldOptionWithExtraField(),true);
	}
	
	
	@Test(priority=1035)	
	public void CheckToleranceValueAndUseItemWiseToleranceWhenAvailableOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.CheckToleranceValueAndUseItemWiseToleranceWhenAvailableOption(),true);
	}
	
	
	
	@Test(priority=1036) // Customization Issue in Workflow. Hiding Suspend Column.
	public void checkCustomizeOptionAndHideThisColumnInControlPlusL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndHideThisColumnInControlPlusL(),true);
	}
	
	@Test(priority=1037)
	public void checkCustomizeOptionAndAddingExtraFieldsInControlPlusL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndAddingExtraFieldsInControlPlusL(),true);
	}
	
	
	@Test(priority=1038) // Customization Issue in Workflow. Hiding Suspend Column in Linewise.
	public void checkCustomizeOptionAndHideThisColumnInLineWise() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndHideThisColumnInLineWise(),true);
	}
	
	@Test(priority=1039) 
	public void checkCustomizeOptionAndAddingExtraFieldsInLineWise() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndAddingExtraFieldsInLineWise(),true);
	}
	
	
	
	
	@Test(priority=1040)
	public void checkRestoringForLinks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRestoreOfCompany(),true);
	}
	
	
	
	
	// Links
	
	@Test(priority=1041)
	public void checkCloseLinkAndPartialOptionInPurchaseOrderHavingTwoLinkDocuments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkAndPartialOptionInPurchaseOrderHavingTwoLinkDocuments(),true);
	}
	
	
	@Test(priority=1042)
	public void checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingTwoLinkDocuments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingTwoLinkDocuments(),true);
	}
	
	
	@Test(priority=1043)
	public void checkDeletingPurchaseFlowAndSavingNewFlowWithOneBaseAndOneLinkDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkDeletingPurchaseFlowAndSavingNewFlowWithOneBaseAndOneLinkDocument(),true);
	}
	
	
	
	@Test(priority=1044)
	public void checkCloseLinkAndPartialOptionInPurchaseOrderHavingOneLinkDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkAndPartialOptionInPurchaseOrderHavingOneLinkDocument(),true);
	}
	
  	
	@Test(priority=1045)
	public void checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingOneLinkDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingOneLinkDocument(),true);
	}
	
	
	
	
	@Test(priority=1046)
	public void checkRestoringForTransactionsForOrderManagement() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRestoreOfCompany(),true);
	}
	
	
	
	//Transactions For Order management
	
	@Test(priority=1047)
	public void checkSavingPurchaseOrderAndPurchaseVoucherNPartialConsumeCloseLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrderAndPurchaseVoucherNPartialConsumeCloseLink(),true);
	}
	
	@Test(priority=1048)
	public void checkSavingPurchaseOrderAndPurchaseVoucherNRowWisePartialConsumeCloseLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrderAndPurchaseVoucherNRowWisePartialConsumeCloseLink(),true);
	}

	@Test(priority=1049)
	public void checkSavingPurchaseOrderVoucherForCloseLinkAndEditingLinkOptionAndSlabChangeVoucherSave() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrderVoucherForCloseLinkAndEditingLinkOptionAndSlabChangeVoucherSave(),true);
	}
	
	@Test(priority=1050)
	public void checkAuthorizingPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAuthorizingPurchaseVoucher(),true);
	}
	
	
	
	
	// Order ManageMent Report
	
	@Test(priority=1051)
	public void checkListingOfDocumentsReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkListingOfDocumentsReport(),true);
	}
	
	
	@Test(priority=1052)
	public void checkListingOfDocumentsByDueDateReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkListingOfDocumentsByDueDateReport(),true);
	}
	
	
	@Test(priority=1053)
	public void checkAgeingOfPendingDocumentsReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAgeingOfPendingDocumentsReport(),true);
	}
	
	
	@Test(priority=1054)
	public void checkAgeingOfPendingDocumentsByDueDateReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAgeingOfPendingDocumentsByDueDateReport(),true);
	}

	@Test(priority=1055)
	public void checkLinkChainAnalysisReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkChainAnalysisReport(),true);
	}
	
	@Test(priority=1056)
	public void checkPendingVoucherReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingVoucherReport(),true);
	}
	
	@Test(priority=1057)
	public void checkValidatingAddingNewFieldInLinksCustomization() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkValidatingAddingNewFieldInLinksCustomization(),true);
	}
	
	
	@Test(priority=1058)
	public void checkValidatingExportFunctionalityInLinksCustomization() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkValidatingExportFunctionalityInLinksCustomization(),true);
	}
	
	@Test(priority=1059)
	public void checkValidatingImportFunctionalityInLinksCustomization() throws NullPointerException, IOException,
			InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		dp = new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkValidatingImportFunctionalityInLinksCustomization(), true);
	}
	 
	@Test(priority = 1060)
	public void checkValidatingDeleteFunctionalityInLinksCustomization() throws NullPointerException, IOException,
			InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		dp = new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkValidatingDeleteFunctionalityInLinksCustomization(), true);
	}
	
	@Test(priority=1061)  
	public void checkFilterOptionsUnderPendingPurchaseOrderLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkFilterOptionsUnderPendingPurchaseOrderLink(),true);
	}
	
	@Test(priority=1062) 
	public void checkCannotExceedTheBaseValueOptionForMultipleRowsWithSameItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCannotExceedTheBaseValueOptionForMultipleRowsWithSameItem(),true);
	} 
	
	@Test(priority=1063) 
	public void checkCannotExceedTheBaseValueOptionForMultipleRowsWithDifferentItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCannotExceedTheBaseValueOptionForMultipleRowsWithDifferentItem(),true);
	} 
	
	@Test(priority=1064) 
	public void checkCannotExceedTheBaseValueOptionForMultipleRowsWithSameItem1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCannotExceedTheBaseValueOptionForMultipleRowsWithSameItem1(),true);
	} 
	
	@Test(priority=1065) 
	public void checkCannotExceedTheBaseValueOptionOnEditing() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCannotExceedTheBaseValueOptionOnEditing(),true);
	} 
	
	
	@Test(priority=2000)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLogout(),true);
	}  
	
	
	
	
	
	
	
	
}
