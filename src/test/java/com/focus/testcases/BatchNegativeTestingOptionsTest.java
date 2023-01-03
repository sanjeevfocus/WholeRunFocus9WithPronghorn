package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.BatchNegativeTestingOptionsPage;
import com.focus.base.BaseEngine;

public class BatchNegativeTestingOptionsTest extends BaseEngine {
	BatchNegativeTestingOptionsPage BNT;

   /*
	@Test(priority = 44301)
	public void checkDeleteCompanyOptionInSearch()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeleteCompanyOptionInSearch(), true);
	}

	@Test(priority = 44302)
	public void checkRestoreCompanyForBatchNegativeOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkRestoreCompanyForBatchNegativeOptions(), true);
	}

	@Test(priority = 44303)
	public void checkLoginAfterRestoringBatchNegativeOptionsBackup()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoginAfterRestoringBatchNegativeOptionsBackup(), true);
	}
	*/
	  // First Scenario Starts : Changing Inward Voucher Transaction Date to Future
	  // Date After Full Consumption of Batch in Outward Voucher
	
	
	@Test(priority= 54300)
	public void checkLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		BNT=new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLogin(),true);
	}
	/*
	@Test(priority = 54301)
	public void checkSavingPurchaseVoucherVATVoucher1WithTodaysDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1WithTodaysDate(), true);
	}
	
	@Test(priority = 54302)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1(), true);
	}
	
	@Test(priority = 54303)
	public void checkSavingSalesInvoiceVATVoucher1WithNextDateByConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithNextDateByConsumingFullQuantity(), true);
	}
	
	@Test(priority = 54304)
	public void checkReSavingPurchaseVoucherVATVoucher1WithDateNextToSalesInvoiceFullConsumeQty()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1WithDateNextToSalesInvoiceFullConsumeQty(),
				true);
	}

	// First Scenario Stop : Changing Inward Voucher Transaction Date to Future
	// Date After Full Consumption of Batch in Outward Voucher

	// Future Date After Suspending Outward Voucher With Full Consumption of
	// batch and Resaving Outward Voucher

	@Test(priority = 54310)
	public void checkSuspendingSalesInvoiceVATVoucher1FromVoucherHomePage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1FromVoucherHomePage(), true);
	}

	@Test(priority = 54311)
	public void checkReSavingPurchaseVoucherVATVoucher1WithDateNextToSalesInvoiceAfterSuspendingSalesInvoiceVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkReSavingPurchaseVoucherVATVoucher1WithDateNextToSalesInvoiceAfterSuspendingSalesInvoiceVoucher(),
				true);
	}
	
	@Test(priority = 54312)
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingPurchaseVoucherDateNextToSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingPurchaseVoucherDateNextToSalesInvoice(), true);
	}
	
	// Second Scenario Stop : Changing Inward Voucher Transaction Date to Future
	// Date After Suspending Outward Voucher from Voucher Home With Full
	// Consumption of batch and Resaving Outward Voucher

	// Third Scenario Starts : Changing Inward Voucher Transaction Date to Future
	// Date After Suspending Outward Voucher from Entry Page Home With Full
	// Consumption of batch and Resaving Outward Voucher

	@Test(priority = 54318)
	public void checkReSavingPurchaseVoucherVATVoucher1WithDateSameAsSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1WithDateSameAsSalesInvoiceVoucher1(), true);
	}
	
	@Test(priority = 54319)
	public void checkSuspendingSalesInvoiceVATVoucher1FromEntryPage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1FromEntryPage(), true);
	}
	
	@Test(priority = 54320)
	public void checkReSavingPurchaseVoucherVATVoucher1WithDateNextToSalesInvoiceAfterSuspendingSalesInvoiceVoucherInEntryPage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkReSavingPurchaseVoucherVATVoucher1WithDateNextToSalesInvoiceAfterSuspendingSalesInvoiceVoucherInEntryPage(),
				true);
	}

	@Test(priority = 54321)
	public void checkReSavingSalesInvoiceVATVoucher1SuspendedFromEntryPageAfterChangingPurchaseVoucherDateNextToSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkReSavingSalesInvoiceVATVoucher1SuspendedFromEntryPageAfterChangingPurchaseVoucherDateNextToSalesInvoice(),
				true);
	}

	// Third Scenario Ends : Changing Inward Voucher Transaction Date to Future Date
	// After Suspending Outward Voucher from Entry Page Home With Full Consumption
	// of batch and Resaving Outward Voucher

	// Fourth Scenario Starts : Changing outward Transaction Date Prior to Inward
	// Voucher Transaction Date After Full Consumption of Batch

	@Test(priority = 54325)
	public void checkBatchPopupWithValuesInSalesInvoiceVATVoucher1WithDateSameAsPurchaseVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupWithValuesInSalesInvoiceVATVoucher1WithDateSameAsPurchaseVoucher1(),
				true);
	}

	@Test(priority = 54326)
	public void checkSavingSalesInvoiceVATVoucher1WithDateSameAsPurchaseVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithDateSameAsPurchaseVoucher1(), true);
	}

	@Test(priority = 54327)
	public void checkBatchPopupIsDisplayingEmptyWhenTryToSaveSalesInvoiceVATVoucher1WithDatePriorToPurchaseVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkBatchPopupIsDisplayingEmptyWhenTryToSaveSalesInvoiceVATVoucher1WithDatePriorToPurchaseVoucher(),
				true);
	}

	// Fourth Scenario Ends : Changing outward Transaction Date Prior to Inward
	// Voucher Transaction Date After Full Consumption of Batch

	// Fifth Scenario Starts : Try to Suspending inward Document After Full
	// Consumption of batch from Home page

	@Test(priority = 54330)
	public void checkSuspendingPurchaseVoucherVATVoucher1InHomePageAfterConsumingFullyInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSuspendingPurchaseVoucherVATVoucher1InHomePageAfterConsumingFullyInSalesInvoiceVoucher1(),
				true);
	}

	// Fifth Scenario Stop : Try to Suspending inward Document After Full
	// Consumption of batch from Home page

	// Sixth Scenario Starts : Try to Suspending inward Document After Full
	// Consumption of batch from Entry page

	@Test(priority = 54331)
	public void checkSuspendingPurchaseVoucherVATVoucher1InEntryPageAfterConsumingFullyInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSuspendingPurchaseVoucherVATVoucher1InEntryPageAfterConsumingFullyInSalesInvoiceVoucher1(),
				true);
	}

	// Sixth Scenario Starts : Try to Suspending inward Document After Full
	// Consumption of batch from Entry page

	// Seventh Scenario Starts : Try to Suspending inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch and Resaving Outward
	// Document(Keep Inward Suspend) // Suspending from Homepage

	@Test(priority = 54332)
	public void checkSuspendingSalesInvoiceVATVoucher1FromVoucherHomePageForSeventhScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1FromVoucherHomePageForSeventhScenario(), true);
	}

	@Test(priority = 54333)
	public void checkSuspendingPurchaseVoucherVATVoucher1InHomePageAfterSuspendingSalesInvoiceVAt()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchaseVoucherVATVoucher1InHomePageAfterSuspendingSalesInvoiceVAt(),
				true);
	}

	@Test(priority = 54334)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSuspendingPurchaseVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterSuspendingPurchaseVoucher1(), true);
	}

	// Seventh Scenario Stops : Try to Suspending inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch and Resaving Outward
	// Document(Keep Inward Suspend)

	// Eight Scenario Starts : Try to Suspending inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch and Resaving Outward
	// Document(Keep Inward Suspend)
	// Suspending from Entry Page

	@Test(priority = 54335)
	public void checkReSavingPurchaseVoucherVATVoucher1AfterSeventhScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1AfterSeventhScenario(), true);
	}

	@Test(priority = 54336)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSeventhScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterSeventhScenario(), true);
	}

	@Test(priority = 54337)
	public void checkSuspendingSalesInvoiceVATVoucher1FromEntryPageForEightScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1FromEntryPageForEightScenario(), true);
	}

	@Test(priority = 54338)
	public void checkSuspendingPurchaseVoucherVATVoucher1InEntryPageAfterSuspendingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSuspendingPurchaseVoucherVATVoucher1InEntryPageAfterSuspendingSalesInvoiceVoucher1(), true);
	}
	
	@Test(priority = 54339)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSuspendingPurchaseVoucher1FromEntryPage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterSuspendingPurchaseVoucher1FromEntryPage(),
				true);
	}

	// Eight Scenario Stops : Try to Suspending inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch and Resaving Outward
	// Document(Keep Inward Suspend)

	// Ninth Scenario Starts : Try to Deleting inward Document After Full
	// Consumption of batch (From Homepage and Entry Page)
	
	@Test(priority = 54340)
	public void checkReSavingPurchaseVoucherVATVoucher1AfterEigthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1AfterEigthScenario(), true);
	}

	@Test(priority = 54341)
	public void checkReSavingSalesInvoiceVATVoucher1AfterEightScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterEightScenario(), true);
	}
	
	@Test(priority = 54342)
	public void checkDeletingPurchaseVoucherVATVoucher1InHomePageAfterConsumingFullQuantityInSalesInvoiceVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkDeletingPurchaseVoucherVATVoucher1InHomePageAfterConsumingFullQuantityInSalesInvoiceVAT(),
				true);
	}

	@Test(priority = 54343)
	public void checkDeletingPurchaseVoucherVATVoucher1InEntryPageAfterConsumingFullQuantityInSalesInvoiceVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkDeletingPurchaseVoucherVATVoucher1InEntryPageAfterConsumingFullQuantityInSalesInvoiceVAT(),
				true);
	}

	// Ninth Scenario Stops : Try to Deleting inward Document After Full Consumption
	// of batch (From Homepage and Entry Page)

	// Tenth Scenario Starts : Try to Deleting inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch

	@Test(priority = 54344)
	public void checkSuspendingSalesInvoiceVATVoucher1FromEntryPageForTenthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1FromEntryPageForTenthScenario(), true);
	}

	@Test(priority = 54345)
	public void checkDeletingPurchaseVoucherVATVoucher1InHomePageAfterSuspendingSalesInvoiceVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchaseVoucherVATVoucher1InHomePageAfterSuspendingSalesInvoiceVAT1(),
				true);
	}

	// Tenth Scenario Stops : Try to Deleting inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch

	// Eleventh Scenario Starts : Try to Deleting inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch and Resaving Outward
	// Document(After Deleting Inward)

	@Test(priority = 54346)
	public void checkReSavingSalesInvoiceVATVoucher1AfterDeletingPurchaseVoucherVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterDeletingPurchaseVoucherVAT(), true);
	}
	
	@Test(priority = 54347)
	public void checkSavingPurchaseVoucherVATVoucher1AgainAfterDeletingPurchaseVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1AgainAfterDeletingPurchaseVoucher(), true);
	}
	
	@Test(priority = 543458) // Negative Error Message
	public void checkReSavingSuspendedSalesInvoiceVATVoucher1AfterSavingPurchaseVoucherVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSuspendedSalesInvoiceVATVoucher1AfterSavingPurchaseVoucherVAT(), true);
	}

	// Eleventh Scenario Starts : Try to Deleting inward Document After Suspending
	// Outward Voucher With Full Consumption of Batch and Resaving Outward
	// Document(After Deleting Inward)

	// Twelfth Scenario Starts : Try to Suspending and Deleting inward Document
	// After Suspending Outward Voucher With Full Consumption of Batch and Resaving
	// Outward Document(After Deleting Inward)

	@Test(priority = 543459)
	public void checkSuspendingSalesInvoiceVATVoucher1ForTwelfthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForTwelfthScenario(), true);
	}
	
	@Test(priority = 543460)
	public void checkSuspendAndDeletingPurchaseVoucherVATVoucher1InHomePageAfterSuspendingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSuspendAndDeletingPurchaseVoucherVATVoucher1InHomePageAfterSuspendingSalesInvoiceVoucher1(),
				true);
	}
	
	@Test(priority = 543461)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSuspendingAndDeletingPurchaseVoucherVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterSuspendingAndDeletingPurchaseVoucherVAT(),
				true);
	}

	@Test(priority = 543462)
	public void checkSavingPurchaseVoucherVATVoucher1AgainAfterSuspendingAndDeletingPurchaseVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1AgainAfterSuspendingAndDeletingPurchaseVoucher(),
				true);
	}

	@Test(priority = 543463) // Negative Error Message
	public void checkReSavingSuspendedSalesInvoiceVATVoucher1AfterSavingSuspendedAndDeletedPurchaseVoucherVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSuspendedSalesInvoiceVATVoucher1AfterSavingSuspendedAndDeletedPurchaseVoucherVAT(),
				true);
	}

	// Twelfth Scenario Stops : Try to Suspending and Deleting inward Document After
	// Suspending Outward Voucher With Full Consumption of Batch and Resaving
	// Outward Document(After Deleting Inward)

	// Thirteenth Scenario Starts : Try to Edit Quantity in inward Document Lower
	// Than Consumned Quantity in Outward Voucher

	@Test(priority = 543464)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1WithQuantityBelowConsumedQuantityInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1WithQuantityBelowConsumedQuantityInSalesInvoiceVoucher1(),
				true);
	}

	// Thirteenth Scenario Stops : Try to Edit Quantity in inward Document Lower
	// Than Consumned Quantity in Outward Voucher

	// Fourteenth Scenario Starts : Try to Edit Quantity in inward Document Lower
	// Than Consumned Quantity in Outward Voucher after Suspending and Resaving
	// Outward Voucher

	@Test(priority = 543465)
	public void checkSuspendingSalesInvoiceVATVoucher1ForFourteenthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForFourteenthScenario(), true);
	}
	
	@Test(priority = 543466)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1WithQuantityBelowConsumedQuantityAfterSuspendingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1WithQuantityBelowConsumedQuantityAfterSuspendingSalesInvoiceVoucher1(),
				true);
	}
	
	@Test(priority = 543467)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSavingPurchaseVoucherVATWithBelowConsumedQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterSavingPurchaseVoucherVATWithBelowConsumedQuantity(), true);
	}
	
	@Test(priority = 543468)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1WithQuantityEqualToConsumedQuantityInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1WithQuantityEqualToConsumedQuantityInSalesInvoiceVoucher1(),
				true);
	}
	
	@Test(priority = 543469) // Negative Error Message
	public void checkReSavingSuspendedSalesInvoiceVATVoucher1AfterSavingPurchaseVoucherVATWithQuantityFrom5To10()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSuspendedSalesInvoiceVATVoucher1AfterSavingPurchaseVoucherVATWithQuantityFrom5To10(),
				true);
	}
	
	// Fourteenth Scenario Stops : Try to Edit Quantity in inward Document Lower
	// Than Consumned Quantity in Outward Voucher after Suspending and Resaving
	// Outward Voucher

	// Fifteenth Scenario Starts : Try to Change Warehouse in Inward Document After
	// Full Consumption of Batch
	
	@Test(priority = 543470)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabad(),
				true);
	}

	// Fifteenth Scenario Stops : Try to Change Warehouse in Inward Document After
	// Full Consumption of Batch

	// Sixteenth Scenario Starts : Try to Change Warehouse in Inward Document After
	// Suspending and Resaving Outward Voucher With Full Consumption of Batch

	@Test(priority = 543471)
	public void checkSuspendingSalesInvoiceVATVoucher1ForSixteenthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForSixteenthScenario(), true);
	}

	@Test(priority = 543472)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabadAfterSuspendingSalesInvoiceVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabadAfterSuspendingSalesInvoiceVoucher(),
				true);
	}

	@Test(priority = 543473)
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingWarehouseToSecunderabadInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingWarehouseToSecunderabadInPurchaseVoucherVAT1(),
				true);
	}

	@Test(priority = 543474)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBackWarehouseFromSecunderabadToHyderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBackWarehouseFromSecunderabadToHyderabad(),
				true);
	}

	@Test(priority = 543475) // Negative Error Message
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingWarehouseToHyderabadInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingWarehouseToHyderabadInPurchaseVoucherVAT1(), true);
	}

	// Sixteenth Scenario Stops : Try to Change Warehouse in Inward Document After
	// Suspending and Resaving Outward Voucher With Full Consumption of Batch

	// Seventeenth Scenario Starts : Try to Change Item in Inward Document After
	// Full Consumption of Batch in Outward Document

	@Test(priority = 543476)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingItemFromBRCOGSITEMToBATCHBRITEM()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingItemFromBRCOGSITEMToBATCHBRITEM(), true);
	}

	// Seventeenth Scenario Stops : Try to Change Item in Inward Document After Full
	// Consumption of Batch in Outward Document

	// Eighteenth Scenario Starts : Try to Change Item in Inward Document After
	// Suspending and Resaving Outward Document With Full Consumption of Batch

	@Test(priority = 543477)
	public void checkSuspendingSalesInvoiceVATVoucher1ForEighteenthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForEighteenthScenario(), true);
	}
	
	@Test(priority = 543478)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingItemFromBRCOGSITEMToBATCHBRITEMAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingItemFromBRCOGSITEMToBATCHBRITEMAfterSuspendingSalesInvoice(),
				true);
	}

	@Test(priority = 543479)
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingItemToBatchBRItemInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingItemToBatchBRItemInPurchaseVoucherVAT1(), true);
	}

	@Test(priority = 543480)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingItemFromBATCHBRITEMToBRCOGSITEM()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingItemFromBATCHBRITEMToBRCOGSITEM(), true);
	}

	@Test(priority = 543481) // Negative Error Message
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingItemNameToBRCOGSITEMInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingItemNameToBRCOGSITEMInPurchaseVoucherVAT1(), true);
	}

	// Eighteenth Scenario Stops : Try to Change Item in Inward Document After
	// Suspending and Resaving Outward Document With Full Consumption of Batch

	// Nineteenth Scenario Starts : Try to Change BatchNo in Inward Document After
	// Full Consumption of batch in Outward Document

	@Test(priority = 543482)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBatchNoFromBATCHPVAT1ToBATCHPVAT2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBatchNoFromBATCHPVAT1ToBATCHPVAT2(), true);
	}

	// Nineteenth Scenario Stops : Try to Change BatchNo in Inward Document After
	// Full Consumption of batch in Outward Document

	// Twentieth Scenario Starts : Try to Change BatchNo in Inward Document After
	// Suspending and Resaving Outward Document With Full Consumption of Batch

	@Test(priority = 543483)
	public void checkSuspendingSalesInvoiceVATVoucher1ForTwentiethScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForTwentiethScenario(), true);
	}

	@Test(priority = 543484)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBatchNoFromBATCHPVAT1ToBATCHPVAT2AfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBatchNoFromBATCHPVAT1ToBATCHPVAT2AfterSuspendingSalesInvoice(),
				true);
	}

	@Test(priority = 543485)
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingBatchNoInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingBatchNoInPurchaseVoucherVAT1(), true);
	}

	@Test(priority = 543486)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBatchNoFromBATCHPVAT2ToBATCHPVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByChangingBatchNoFromBATCHPVAT2ToBATCHPVAT1(), true);
	}

	@Test(priority = 543487) // Negative Error Message
	public void checkReSavingSalesInvoiceVATVoucher1AfterChangingBatchNoToBatchPVAT1InPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterChangingBatchNoToBatchPVAT1InPurchaseVoucherVAT1(), true);
	}
		
	// Twentieth Scenario Stops : Try to Change BatchNo in Inward Document After
	// Suspending and Resaving Outward Document With Full Consumption of Batch

	// Twenty First Scenario Starts : Try to Deleting Row in Inward Voucher(With
	// Same Batch) After Full Consumption of batch in Outward Document.
	
	@Test(priority = 543488)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByAddingRow2WithSameQuantityAndBatchNo()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByAddingRow2WithSameQuantityAndBatchNo(),
				true);
	}
	
	@Test(priority = 543489)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow1WhichHasConsumedFullyInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow1WhichHasConsumedFullyInSalesInvoice(),
				true);
	}

	// Twenty First Scenario Stops : Try to Deleting Row in Inward Voucher(WitSame
	// Batch) After Full Consumption of batch in Outward Document.

	// Twenty Second Scenario Starts : Try to Deleting Row in Inward Voucher(With
	// Same batch) After suspending and Resaving Outward Document With Full
	// Consumption of batch

	@Test(priority = 543490)
	public void checkSuspendingSalesInvoiceVATVoucher1ForTwentySecondScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForTwentySecondScenario(), true);
	}
	
	
	@Test(priority = 543491)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow1WhichHasConsumedFullyInSalesInvoiceAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow1WhichHasConsumedFullyInSalesInvoiceAfterSuspendingSalesInvoice(),
				true);
	}

	@Test(priority = 543492)
	public void checkReSavingSalesInvoiceVATVoucher1AfterDeletingARowInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterDeletingARowInPurchaseVoucherVAT1(), true);
	}

	// Twenty Second Scenario Stops : Try to Deleting Row in Inward Voucher(With
	// Same batch) After suspending and Resaving Outward Document With Full
	// Consumption of batch

	// Twenty Third Scenario Starts : Try to Deleting Row in Inward Voucher After
	// Full Consumption of batch in Outward Document.

	@Test(priority = 543493)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByAddingRow2WithSameQuantityAndDifferentBatchNo()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByAddingRow2WithSameQuantityAndDifferentBatchNo(),
				true);
	}
	
	@Test(priority = 543494) // Negative Error Message
	public void checkReSavingSalesInvoiceVATVoucher1AfterAddingRow2WithBatchNoAsBatchPVAT2InPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterAddingRow2WithBatchNoAsBatchPVAT2InPurchaseVoucherVAT1(),
				true);
	}

	@Test(priority = 543495)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow2WhichHasConsumedFullyInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow2WhichHasConsumedFullyInSalesInvoice(),
				true);
	}

	// Twenty Third Scenario Stops : Try to Deleting Row in Inward Voucher After
	// Full Consumption of batch in Outward Document.

	// Twenty Fourth Scenario Starts : Try to Deleting Row in Inward Voucher After
	// suspending and Resaving Outward Document With Full Consumption of batch

	@Test(priority = 543496)
	public void checkSuspendingSalesInvoiceVATVoucher1ForTwentyFourthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForTwentyFourthScenario(), true);
	}

	@Test(priority = 543497)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow2WhichHasConsumedFullyInSalesInvoiceAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeletingRow2WhichHasConsumedFullyInSalesInvoiceAfterSuspendingSalesInvoice(),
				true);
	}

	@Test(priority = 543498)
	public void checkReSavingSalesInvoiceVATVoucher1AfterDeletingARow2InPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterDeletingARow2InPurchaseVoucherVAT1(), true);
	}

	// Twenty Fourth Scenario Stops : Try to Deleting Row in Inward Voucher After
	// suspending and Resaving Outward Document With Full Consumption of batch

	// Twenty Fifth Scenario Starts : Try to Adding and Deleting Row in inward
	// Document After Consumption of Batch in Outward Document

	@Test(priority = 543499)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByAdding2ndRowWithSameQuantityAndDifferentBatchNo()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByAdding2ndRowWithSameQuantityAndDifferentBatchNo(),
				true);
	}
	
	@Test(priority = 543500) // Negative Error Message
	public void checkSavingSalesInvoiceVATVoucher1WithQuantityAs11AfterAddingRow2WithBatchNoAsBatchPVAT2InPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceVATVoucher1WithQuantityAs11AfterAddingRow2WithBatchNoAsBatchPVAT2InPurchaseVoucherVAT1(),
				true);
	}
	
	@Test(priority = 543501)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndRowWhichHasConsumedInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndRowWhichHasConsumedInSalesInvoice(),
				true);
	}

	// Twenty Fifth Scenario Stops : Try to Adding and Deleting Row in inward
	// Document After Consumption of Batch in Outward Document

	// Twenty Sixth Scenario Starts : Try to Adding and Deleting Row in inward
	// Document After Suspending and Resaving Outward Document With Consumption of
	// Batch

	@Test(priority = 543502)
	public void checkSuspendingSalesInvoiceVATVoucher1ForTwentySixthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForTwentySixthScenario(), true);
	}

	@Test(priority = 543503)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndWhichHasConsumedInSalesInvoiceAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndWhichHasConsumedInSalesInvoiceAfterSuspendingSalesInvoice(),
				true);
	}
	
	@Test(priority = 543504)
	public void checkReSavingSalesInvoiceVATVoucher1AfterDeleting2ndRowInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterDeleting2ndRowInPurchaseVoucherVAT1(), true);
	}

	// Twenty Sixth Scenario Stops : Try to Adding and Deleting Row in inward
	// Document After Suspending and Resaving Outward Document With Consumption of
	// Batch

	// Twenty Seventh Scenario Starts : Try to Adding and Deleting Row in inward
	// Document(With Same Batch) After Consumption of Batch in Outward Document

	@Test(priority = 543505)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByAddingRow2WithSameQuantityAndBatchNoForTwentySeventhScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkEditingAndSavingPurchaseVoucherVATVoucher1ByAddingRow2WithSameQuantityAndBatchNoForTwentySeventhScenario(),
				true);
	}
	
	@Test(priority = 543506) // Negative Error Message
	public void checkSavingSalesInvoiceVATVoucher1WithQuantityAs11AfterAddingRow2WithBatchNoAsBatchPVAT1InPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceVATVoucher1WithQuantityAs11AfterAddingRow2WithBatchNoAsBatchPVAT1InPurchaseVoucherVAT1(),
				true);
	}

	@Test(priority = 543507)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndRowWhichHasConsumedInSalesInvoice1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndRowWhichHasConsumedInSalesInvoice1(),
				true);
	}

	// Twenty Seventh Scenario Stops : Try to Adding and Deleting Row in inward
	// Document(With Same Batch) After Consumption of Batch in Outward Document

	// Twenty Eight Scenario Starts : Try to Adding and Deleting Row in inward
	// Document(With Same batch) After Suspending and Resaving Outward Document With
	// Consumption of Batch

	@Test(priority = 543508)
	public void checkSuspendingSalesInvoiceVATVoucher1ForTwentyEightScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForTwentyEightScenario(), true);
	}

	@Test(priority = 543509)
	public void checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkEditingAndSavingPurchaseVoucherVATVoucher1ByDeleting2ndAfterSuspendingSalesInvoice(), true);
	}
	
	@Test(priority = 543510)
	public void checkReSavingSalesInvoiceVATVoucherAfterDeleting2ndRowInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucherAfterDeleting2ndRowInPurchaseVoucherVAT1(), true);
	}

	// Twenty Eight Scenario Stops : Try to Adding and Deleting Row in inward
	// Document(With Same batch) After Suspending and Resaving Outward Document With
	// Consumption of Batch

	// Twenty Ninth Scenario Starts : Try to Consume Quantity Which are Already
	// Consumed by inserting outward Document Prior to Consumed Document.(inserting
	// // Doc Between inward and outward)
	
	@Test(priority = 543511)
	public void checkEditingAndSavingPurchaseVoucherVATVoucherWithCurrentDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEditingAndSavingPurchaseVoucherVATVoucherWithCurrentDate(), true);
	}
	
	@Test(priority = 543512)
	public void checkDeletingSalesInvoiceVATVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVoucher1(), true);
	}
	
	@Test(priority = 543513)
	public void checkSavingSalesInvoiceVATVoucher1WithDate2DaysMoreThanPresentDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithDate2DaysMoreThanPresentDate(), true);
	}
	
	@Test(priority = 543514)
	public void checkBatchPopupInSalesInvoiceVATVoucher2WithDateAsPreviousDateToSalesInvoice1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupInSalesInvoiceVATVoucher2WithDateAsPreviousDateToSalesInvoice1(), true);
	}

	// Twenty Ninth Scenario Stops : Try to Consume Quantity Which are Already
	// Consumed by inserting outward Document Prior to Consumed Document.(inserting
	// Doc Between inward and outward)

	// Thirtieth Scenario Starts : Try to Resaving Outward Suspended Outward
	// Document after Full Consumption of Batch in Other Outward Document
	
	@Test(priority = 543515)
	public void checkSuspendingSalesInvoiceVATVoucher1ForThirtiethScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForThirtiethScenario(), true);
	}
	
	@Test(priority = 543516)
	public void checkSavingSalesInvoiceVATVoucher2WithDate1DaysMoreThanSalesInvoiceVoucher1Date()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher2WithDate1DaysMoreThanSalesInvoiceVoucher1Date(),
				true);
	}

	@Test(priority = 543517)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSavingSalesInvoiceVoucher2WithSameValues()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterSavingSalesInvoiceVoucher2WithSameValues(),
				true);
	}

	// Thirtieth Scenario Stops : Try to Resaving Outward Suspended Outward Document
	// after Full Consumption of Batch in Other Outward Document

	// Thirty First Scenario Starts : Try to Suspending Stock Transfer Voucher After
	// Full Consumption of Batch
	
	@Test(priority = 543518)
	public void checkDeletingSalesInvoiceVATVouchersForThirtyFirstScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVouchersForThirtyFirstScenario(), true);
	}
	
	@Test(priority = 543519)
	public void checkBatchPopupInStockTransferVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupInStockTransferVoucher1(), true);
	}
	
	@Test(priority = 543520)
	public void checkSavingStockTransferVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingStockTransferVoucher1(), true);
	}
	
	@Test(priority = 543521)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1WithWarehouseAsSecunderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1WithWarehouseAsSecunderabad(), true);
	}

	@Test(priority = 543522)
	public void checkSavingSalesInvoiceVATVoucher1WithWarehouseAsSecunderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithWarehouseAsSecunderabad(), true);
	}

	@Test(priority = 543523)
	public void checkSuspendingStockTransferVoucherFromEntryAndHomePageAfterConsumingInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingStockTransferVoucherFromEntryAndHomePageAfterConsumingInSalesInvoice(),
				true);
	}

	// Thirty First Scenario Stops : Try to Suspending Stock Transfer Voucher After
	// Full Consumption of Batch

	// Thirty Second Scenario Starts : Try to Delete Stock Transfer Voucher After
	// Full Consumption of Batch (From Entry and Homepage)

	@Test(priority = 543524)
	public void checkDeletingStockTransferVoucherFromEntryPageAfterConsumingInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingStockTransferVoucherFromEntryPageAfterConsumingInSalesInvoice(), true);
	}

	@Test(priority = 543525)
	public void checkDeletingStockTransferVoucherFromHomePageAfterConsumingInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingStockTransferVoucherFromHomePageAfterConsumingInSalesInvoice(), true);
	}

	// Thirty Second Scenario Stops : Try to Delete Stock Transfer Voucher After
	// Full Consumption of Batch (From Entry and Homepage)

	// Thirty Third Scenario Starts : Try to Change Quantity in Stock transfer
	// Voucher After Full Consumption of batch
	
	@Test(priority = 543526)
	public void checkBatchPopupInStockTransferVoucherAfterChangingQuantityTo5AndSaving()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupInStockTransferVoucherAfterChangingQuantityTo5AndSaving(), true);
	}
	
	// Thirty Third Scenario Stops : Try to Change Quantity in Stock transfer
	// Voucher After Full Consumption of batch

	// Thirty Fourth Scenario Starts : Try to ReSave Suspended Stock Transfer
	// Voucher After Full Consumption of batch

	@Test(priority = 543527)
	public void checkDeletingSalesInvoiceVATVouchersForThirtyThirdScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVouchersForThirtyThirdScenario(), true);
	}
	
	@Test(priority = 543528)
	public void checkSuspendingStockTransferVoucherFromEntryPageAfterDeletingVoucherInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingStockTransferVoucherFromEntryPageAfterDeletingVoucherInSalesInvoice(),
				true);
	}
	
	@Test(priority = 543529)
	public void checkBatchPopupInSalesInvoiceVATVoucher1WithWarehouseAsHyderabadAfterSuspendingStockTransferVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkBatchPopupInSalesInvoiceVATVoucher1WithWarehouseAsHyderabadAfterSuspendingStockTransferVoucher(),
				true);
	}
	
	@Test(priority = 543530)
	public void checkSavingSalesInvoiceVATVoucher1WithWarehouseAsHyderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithWarehouseAsHyderabad(), true);
	}
	
	@Test(priority = 543531)
	public void checkResavingStockTransferVoucherAfterConsumingWithWarehouseAsHyderabadInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingStockTransferVoucherAfterConsumingWithWarehouseAsHyderabadInSalesInvoice(),
				true);
	}

	// Thirty Fourth Scenario Stops : Try to ReSave Suspended Stock Transfer Voucher
	// After Full Consumption of batch

	// Thirty Fifth Scenario Starts : Try to Suspend Inward Document After Stock
	// transfer

	@Test(priority = 543532)
	public void checkDeletingSalesInvoiceVATVouchersForThirtyFifthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVouchersForThirtyFifthScenario(), true);
	}
	
	@Test(priority = 543533)
	public void checkResavingStockTransferVoucherAfterDeletingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingStockTransferVoucherAfterDeletingSalesInvoiceVoucher1(), true);
	}
	
	@Test(priority = 543534)
	public void checkSuspendingPurchaseVoucherVATVoucher1InEntryAndHomePageAfterConsumingFullyInStockTransferfVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSuspendingPurchaseVoucherVATVoucher1InEntryAndHomePageAfterConsumingFullyInStockTransferfVoucher1(),
				true);
	}

	// Thirty Fifth Scenario Stops : Try to Suspend Inward Document After Stock
	// transfer

	// Thirty Sixth Scenario Starts : Try to Suspend Inward Document After
	// Suspending Stock Transfer
	
	@Test(priority = 543535)
	public void checkBatchPopupInSalesInvoiceVATVoucher1WithWarehouseAsSecunderabadAfterResavingStockTransferVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkBatchPopupInSalesInvoiceVATVoucher1WithWarehouseAsSecunderabadAfterResavingStockTransferVoucher(),
				true);
	}

	@Test(priority = 543536)
	public void checkSavingSalesInvoiceVATVoucher1WithWarehouseAsSecunderabadAfterResavingStockTransferVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingSalesInvoiceVATVoucher1WithWarehouseAsSecunderabadAfterResavingStockTransferVoucher(),
				true);
	}
	
	@Test(priority = 543537)
	public void checkSuspendingStockTransferVoucherFromEntryPageAfterSavingSalesInvoiceVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingStockTransferVoucherFromEntryPageAfterSavingSalesInvoiceVoucher(), true);
	}

	@Test(priority = 543538)
	public void checkSuspendingPurchaseVoucherVATVoucher1InEntryAndHomePageAfterConsumingFullyInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSuspendingPurchaseVoucherVATVoucher1InEntryAndHomePageAfterConsumingFullyInSalesInvoiceVoucher1(),
				true);
	}

	// Thirty Sixth Scenario Stops : Try to Suspend Inward Document After Suspending
	// Stock Transfer

	// Thirty Seventh Scenario Starts : Try to Deleting Inward Document After
	// Suspending Stock Transfer

	@Test(priority = 543539)
	public void checkDeletingPurchaseVoucherFromEntryPageAfterConsumingInStockTransfer()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchaseVoucherFromEntryPageAfterConsumingInStockTransfer(), true);
	}

	@Test(priority = 543540)
	public void checkDeletingPurchaseVoucherFromHomePageAfterConsumingInStockTransfer()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchaseVoucherFromHomePageAfterConsumingInStockTransfer(), true);
	}

	// Thirty Seventh Scenario Stops : Try to Deleting Inward Document After
	// Suspending Stock Transfer

	// Thirty Eight Scenario Starts : Try to Resave Suspended Purchases Return
	// Voucher After Full Consumption of batch

	@Test(priority = 543541)
	public void checkDeletingSalesInvoiceVATVouchersForThirtyEightScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVouchersForThirtyEightScenario(), true);
	}

	@Test(priority = 543542)
	public void checkDeletingStockTransferVoucherAfterDeletingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingStockTransferVoucherAfterDeletingSalesInvoice(), true);
	}
	
	@Test(priority = 543543)
	public void checkSavingPurchaseReturnsVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseReturnsVoucher1(), true);
	}
	
	@Test(priority = 543544)
	public void checkSuspendingPurchaseReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchaseReturnsVoucher(), true);
	}
	
	@Test(priority = 543545)
	public void checkBatchPopupInSalesInvoiceVATVoucher1AfterSu0spendingPurchaseReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupInSalesInvoiceVATVoucher1AfterSuspendingPurchaseReturnsVoucher(), true);
	}

	@Test(priority = 543546)
	public void checkSavingSalesInvoiceVATVoucher1AfterSuspendingPurchaseReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1AfterSuspendingPurchaseReturnsVoucher(), true);
	}
	
	@Test(priority = 543547)
	public void checkReSavingPurchaseReturnsVoucher1AfterSavingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseReturnsVoucher1AfterSavingSalesInvoiceVoucher1(), true);
	}

	// Thirty Eight Scenario Stops : Try to Resave Suspended Purchases Return
	// Voucher After Full Consumption of batch

	// Thirty Ninth Scenario Starts : Try to Suspend Sales Return Voucher After Full
	// Consumption of batch
	
	@Test(priority = 543548)
	public void checkSavingSalesReturnsVoucher1WithQuantityAs60()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesReturnsVoucher1WithQuantityAs60(), true);
	}
	
	@Test(priority = 543549)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1Row2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1Row2(), true);
	}

	@Test(priority = 543550) // Negative Error Message
	public void checkSavingSalesInvoiceVATVoucher1WithRow2AndQuantity60()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithRow2AndQuantity60(), true);
	}
	
	@Test(priority = 543551)
	public void checkSuspendingSalesReturnsVoucher1FromEntryAndHomePageAfterConsumingInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesReturnsVoucher1FromEntryAndHomePageAfterConsumingInSalesInvoice(),
				true);
	}

	// Thirty Ninth Scenario Stops : Try to Suspend Sales Return Voucher After Full
	// Consumption of batch

	// Fortieth Scenario Starts : Try to Delete Sales Return Voucher After Full
	// Consumption of batch

	@Test(priority = 543552)
	public void checkDeletingSalesReturnsVoucher1FromEntryAndHomePageAfterConsumingInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesReturnsVoucher1FromEntryAndHomePageAfterConsumingInSalesInvoice(),
				true);
	}
	
	// Fortieth Scenario Stops : Try to Delete Sales Return Voucher After Full
	// Consumption of batch

	// Forty one Scenario Starts : Try to Delete Sales Return Voucher After Full
	// Consumption of batch With Different Transaction Dates

	@Test(priority = 543553)
	public void checkSavingPurchaseVoucherVATVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1(), true);
	}

	@Test(priority = 543554)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher2(), true);
	}

	@Test(priority = 543555)
	public void checkSavingSalesInvoiceVATVoucher2WithNextDateByConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher2WithNextDateByConsumingFullQuantity(), true);
	}

	@Test(priority = 543556)
	public void checkSavingSalesReturnsVoucher2WithDateNextToSalesInvoiceAndQuantityAs60()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesReturnsVoucher2WithDateNextToSalesInvoiceAndQuantityAs60(), true);
	}
	
	@Test(priority = 543557) // Base Quantity is not as expected
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher3(), true);
	}

	@Test(priority = 543558) // Base Quantity is not as expected
	public void checkSavingSalesInvoiceVATVoucher3WithNextDateByConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher3WithNextDateByConsumingFullQuantity(), true);
	}
	
	@Test(priority = 543559)
	public void checkDeletingSalesReturnsVoucher2FromEntryAndHomePageAfterConsumingInSalesInvoice3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesReturnsVoucher2FromEntryAndHomePageAfterConsumingInSalesInvoice3(),
				true);
	}

	// Forty one Scenario Stops : Try to Delete Sales Return Voucher After Full
	// Consumption of batch With Different Transaction Dates

	// Forty Second Scenario Starts : Try to Resave Suspended Shortages in Stocks
	// Voucher After Full Consumption of batch
	
	@Test(priority = 543560)
	public void checkSavingPurchaseVoucherVATVoucher3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher3(), true);
	}
	
	@Test(priority = 543561)
	public void checkBatchPopupInShortageInStocksVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupInShortageInStocksVoucher1(), true);
	}

	@Test(priority = 543562)
	public void checkSavingShortageInStockVoucher1ConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingShortageInStockVoucher1ConsumingFullQuantity(), true);
	}

	@Test(priority = 543563)
	public void checkSuspendingShortageInStocksVoucher1FromEntryPage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingShortageInStocksVoucher1FromEntryPage(), true);
	}
	
	@Test(priority = 543564) // Base Quantity is Displaying as 780
	public void checkBatchPopupInShortageInStocksVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupInShortageInStocksVoucher2(), true);
	}

	@Test(priority = 543565) // Base Quantity is Displaying as 780
	public void checkSavingShortageInStockVoucher2ConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingShortageInStockVoucher2ConsumingFullQuantity(), true);
	}

	@Test(priority = 543566) // Do not Post COGS is enabled for Shortage in Stock.

	public void checkResavingSuspendedShortageInStocksVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSuspendedShortageInStocksVoucher1(), true);
	}
	
	// Forty Second Scenario Stops : Try to Resave Suspended Shortages in Stocks
	// Voucher After Full Consumption of batch
	
	// Erasing All Transactions
	
	@Test(priority = 543570)
	public void checkEraseAllTransactionsLogoutAndLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Scenarios Using "Allow Negative Batch Quantities" Option
	// Forty Third Scenario Starts : try to Saving Negative batch Quantity Without
	// Enabling Allow Negative batch Quantity Option
	
	@Test(priority = 543580)
	public void checkSavingPurchaseVoucherVATVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher(), true);
	}
	
	@Test(priority = 543581)
	public void checkSavingSalesInvoiceVATVoucher1WithMoreThanAvailableQuantityInPurchaseVoucherWithoutEnablingAllowNegativeBatchQuantities()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceVATVoucher1WithMoreThanAvailableQuantityInPurchaseVoucherWithoutEnablingAllowNegativeBatchQuantities(),
				true);
	}
	
	// Forty Third Scenario Stops : try to Saving Negative batch Quantity Without
	// Enabling Allow Negative batch Quantity Option

	// Forth Forth Scenario Starts : try to Saving Negative batch Quantity With
	// Enabling Allow Negative batch Quantity Option and Disable Option After Saving
	// Negative Stock
	
	@Test(priority = 543582)
	public void checkEnablingAllowNegativeBatchQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEnablingAllowNegativeBatchQuantityOption(), true);
	}
	
	@Test(priority = 543583)
	public void checkLogoutAndLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLogoutAndLogin(), true);
	}
	
	@Test(priority = 543584)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1AfterEnablingAllowBatchNegativeQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1AfterEnablingAllowBatchNegativeQuantityOption(),
				true);
	}

	@Test(priority = 543585) // Negative Error Message
	public void checkSavingSalesInvoiceVATVoucher1AfterEnablingAllowBatchNegativeQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1AfterEnablingAllowBatchNegativeQuantityOption(),
				true);
	}
	
	@Test(priority = 543586) 
	public void checkValidatingQuantityInEntryPageAndBatchPopupAfterSavingWithQuantityGreaterThanAvailableQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkValidatingQuantityInEntryPageAndBatchPopupAfterSavingWithQuantityGreaterThanAvailableQuantity(),
				true);
	}
	*/
	@Test(priority = 543587)
	public void checkDisablingAllowNegativeBatchQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDisablingAllowNegativeBatchQuantityOption(), true);
	}

	@Test(priority = 543588)
	public void checkLogoutAndLoginAfterDisablingAllowNegativeBatchQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLogoutAndLogin(), true);
	}
	
	@Test(priority = 543589)
	public void checkValidatingQuantityInEntryPageAndBatchPopupInSalesInvoice1AfterDisablingAllowNegativeBatchQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkValidatingQuantityInEntryPageAndBatchPopupInSalesInvoice1AfterDisablingAllowNegativeBatchQuantityOption(),
				true);
	}
	
	// Forth Forth Scenario Stops : try to Saving Negative batch Quantity With
	// Enabling Allow Negative batch Quantity Option and Disable Option After Saving
	// Negative Stock
	
	// Erasing All Transactions
	
	@Test(priority = 543590)
	public void checkEraseAllTransactionsLogoutAndLoginAfterAllowNegativeBatchQuantityOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Scenarios Using "Consolidate Batches By Batch No" Option
	// Forty Fifth Scenario Starts : try to Change Inward Document Date to Future
	// Date After Consumption of Batch in Outward Document.
	
	@Test(priority = 543591)
	public void checkSavingPurchaseVoucherVATVoucher1With2Rows()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1With2Rows(), true);
	}
	
	@Test(priority = 543592)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1WithQuantity11()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1WithQuantity11(), true);
	}

	@Test(priority = 543593)
	public void checkSavingSalesInvoiceVATVoucher1WithQuantity11()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithQuantity11(), true);
	}

	@Test(priority = 543594)
	public void checkReSavingPurchaseVoucherVATVoucher1WithDateNextToCurrentDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1WithDateNextToCurrentDate(), true);
	}

	// Forty Fifth Scenario Stops : try to Change Inward Document Date to Future
	// Date After Consumption of Batch in Outward Document.

	// Forty Sixth Scenario Starts : try to Change Inward Document Date to Future
	// Date After Suspending and Resaving Outward Document With Consumption of
	// Batch.
	
	@Test(priority = 543595)
	public void checkSuspendingSalesInvoiceVATVoucher1ForFortySixthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForFortySixthScenario(), true);
	}
	
	@Test(priority = 543596)
	public void checkReSavingPurchaseVoucherVATVoucher1WithDateNextToCurrentDateAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingPurchaseVoucherVATVoucher1WithDateNextToCurrentDateAfterSuspendingSalesInvoice(),
				true);
	}
	
	@Test(priority = 543597)
	public void checkReSavingSalesInvoiceVATVoucherAfterChangingDateNextToCurrentDateInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucherAfterChangingDateNextToCurrentDateInPurchaseVoucherVAT1(), true);
	}

	// Forty Sixth Scenario Stops : try to Change Inward Document Date to Future
	// Date After Suspending and Resaving Outward Document With Consumption of
	// Batch.

	// Forty Seventh Scenario Starts : try to Change Warehouse in Inward Document
	// After Consumption of Batch in Outward Document.
	
	@Test(priority = 543598)
	public void checkReSavingPurchaseVoucherVATVoucher1WithCurrentDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1WithCurrentDate(), true);
	}

	@Test(priority = 543599)
	public void checkReSavingSalesInvoiceVATVoucher1AfterResavingPurchaseVoucherVAT1WithCurrentDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1AfterResavingPurchaseVoucherVAT1WithCurrentDate(),
				true);
	}
	
	@Test(priority = 543600)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabad(),
				true);
	}

	// Forty Seventh Scenario Stops : try to Change Warehouse in Inward Document
	// After Consumption of Batch in Outward Document.

	// Forty Eight Scenario Starts : try to Change Warehouse in Inward Document
	// After Suspend And Resaving Outward Document With Consumption of Batch
	
	@Test(priority = 543601)
	public void checkSuspendingSalesInvoiceVATVoucher1ForFortyEightScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForFortyEightScenario(), true);
	}
	
	@Test(priority = 543602)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabadAfterSuspendingSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkReSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromHyderabadToSecunderabadAfterSuspendingSalesInvoice(),
				true);
	}

	@Test(priority = 543603)
	public void checkReSavingSalesInvoiceVATVoucherAfterChangingWarehouseToSecunderabadInPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucherAfterChangingWarehouseToSecunderabadInPurchaseVoucherVAT1(),
				true);
	}

	// Forty Eight Scenario Stops : try to Change Warehouse in Inward Document After
	// Suspend And Resaving Outward Document With Consumption of Batch

	// Forty Ninth Scenario Starts : try to Change Quantity in First Row Inward
	// Document Lesser Than Consumed Batch in Outward Document.

	@Test(priority = 543604)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromSecunderabadToHyderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingWarehouseFromSecunderabadToHyderabad(),
				true);
	}

	@Test(priority = 543605)
	public void checkDeletingSalesInvoiceVATVoucher1AfterChangingWarehouseInPurchaseVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVoucher1AfterChangingWarehouseInPurchaseVoucher(), true);
	}
	
	@Test(priority = 543606)
	public void checkSavingSalesInvoiceVATVoucher1WithQuantity180()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1WithQuantity180(), true);
	}

	@Test(priority = 543607)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingQuantityTo12In1stRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingQuantityTo12In1stRow(), true);
	}

	// Forty Ninth Scenario Stops : try to Change Quantity in First Row Inward
	// Document Lesser Than Consumed Batch in Outward Document.

	// Fiftieth Scenario Starts : try to Change Quantity in Second Row Inward
	// Document Lesser Than Consumed Batch in Outward Document.

	@Test(priority = 543608)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingQuantityTo12In2ndRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingQuantityTo12In2ndRow(), true);
	}

	// Fiftieth Scenario Starts : try to Change Quantity in Second Row Inward
	// Document Lesser Than Consumed Batch in Outward Document.

	// Fifty One Scenario Starts : try to Change Item in First Row Inward Document
	// After Consumption of Batch in Outward Document.

	@Test(priority = 543609)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingItemToBATCHBRITEMIn1stRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingItemToBATCHBRITEMIn1stRow(), true);
	}

	// Fifty One Scenario Stops : try to Change Item in First Row Inward Document
	// After Consumption of Batch in Outward Document.

	// Fifty Second Scenario Starts : try to Change Item in Second Row Inward
	// Document After Consumption of Batch in Outward Document.

	@Test(priority = 543610)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingItemToBATCHBRITEMIn2ndRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingItemToBATCHBRITEMIn2ndRow(), true);
	}

	// Fifty Second Scenario Stops : try to Change Item in Second Row Inward
	// Document After Consumption of Batch in Outward Document.

	// Fifty Third Scenario Starts : try to Deleting First Row Inward Document After
	// Consumption of Batch in Outward Document.

	@Test(priority = 543611)
	public void checkReSavingPurchaseVoucherVATVoucher1ByDeleting1stRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByDeleting1stRow(), true);
	}

	// Fifty Third Scenario Stops : try to Deleting First Row Inward Document After
	// Consumption of Batch in Outward Document.

	// Fifty Forth Scenario Starts : try to Deleting Second Row Inward Document
	// After Consumption of Batch in Outward Document.

	@Test(priority = 543612)
	public void checkReSavingPurchaseVoucherVATVoucher1ByDeleting2ndRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByDeleting2ndRow(), true);
	}

	// Fifty Forth Scenario Stops : try to Deleting Second Row Inward Document After
	// Consumption of Batch in Outward Document.

	// Fifty Five Scenario Starts : try to Change BatchNo in First Row in Inward
	// Document After Consumption of Batch in Outward Document.

	@Test(priority = 543613)
	public void checkReSavingPurchaseVoucherVATVoucher1ByBatchNoIn1stRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByBatchNoIn1stRow(), true);
	}
	
	// Fifty Five Scenario Stops : try to Change BatchNo in First Row in Inward
	// Document After Consumption of Batch in Outward Document.

	// Fifty Sixth Scenario Starts : try to Change BatchNo in Second Row in Inward
	// Document After Consumption of Batch in Outward Document.

	@Test(priority = 543613)
	public void checkReSavingPurchaseVoucherVATVoucher1ByBatchNoIn2ndRow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByBatchNoIn2ndRow(), true);
	}

	// Fifty Sixth Scenario Stops : try to Change BatchNo in Second Row in Inward
	// Document After Consumption of Batch in Outward Document.

	// Erasing All Transactions
	
	@Test(priority = 543614)
	public void checkEraseAllTransactionsLogoutAndLoginAfterConsolidateBatchesByBatchNoOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Scenarios Using "Expiry Dates For Batches" Option
	// Fifty Seventh Scenario Starts : Try to Change Expiry Date in Inward Document
	// After Partial Consumption of Batch in Outward Document
	
	@Test(priority = 543615)
	public void checkSavingPurchaseVoucherVATVoucher1WithExpiryDate4DaysMoreThanCurrentDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1WithExpiryDate4DaysMoreThanCurrentDate(), true);
	}
	
	@Test(priority = 543616)
	public void checkSavingSalesInvoiceVATVoucher1ByConsumingPartialQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1ByConsumingPartialQuantity(), true);
	}
	
	@Test(priority = 543617)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingExpiryDate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseVoucherVATVoucher1ByChangingExpiryDate(), true);
	}

	// Fifty Seventh Scenario Stops : Try to Change Expiry Date in Inward Document
	// After Partial Consumption of Batch in Outward Document

	// Fifty Eight Scenario Starts : Try to Change Expiry Date in Inward Document
	// After Full Consumption of Batch in Outward Document

	@Test(priority = 543618)
	public void checkReSavingSalesInvoiceVATVoucher1ByConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucher1ByConsumingFullQuantity(), true);
	}

	@Test(priority = 543619)
	public void checkReSavingPurchaseVoucherVATVoucher1ByChangingExpiryDateAfterConsumingFullQuantityInSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkReSavingPurchaseVoucherVATVoucher1ByChangingExpiryDateAfterConsumingFullQuantityInSalesInvoice(),
				true);
	}

	// Fifty Eight Scenario Stops : Try to Change Expiry Date in Inward Document
	// After Full Consumption of Batch in Outward Document

	// Erasing All Transactions
	
	@Test(priority = 543625)
	public void checkEraseAllTransactionsLogoutAndLoginAfterExpiryDatesForBatchOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Fifty Ninth Scenario Starts : Try to Consume Batch Quantity Through Link
	// Which is Already Fully Consumed in Other Outward Document
	
	@Test(priority = 543626)
	public void checkSavingPurchaseVoucherVATVoucher1ForFiftyNinthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1ForFiftyNinthScenario(), true);
	}
	
	@Test(priority = 543627)
	public void checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1AfterSavingPurchaseVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkBatchPopupIsDisplayingWithValuesInSalesInvoiceVATVoucher1AfterSavingPurchaseVoucher1(), true);
	}

	@Test(priority = 543628)
	public void checkSavingSalesInvoiceVATVoucher1ByConsumingFullQuantityAfterSavingPurchaseVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1ByConsumingFullQuantityAfterSavingPurchaseVoucher1(),
				true);
	}
	
	@Test(priority = 543629)
	public void checkSavingPurchaseReturnsVoucher1AfterConsumingFullQuantityInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseReturnsVoucher1AfterConsumingFullQuantityInSalesInvoiceVoucher1(),
				true);
	}

	// Fifty Ninth Scenario Stops : Try to Consume Batch Quantity Through Link Which
	// is Already Fully Consumed in Other Outward Document

	// Sixtieth Scenario Starts : Try to Consume Batch Quantity Through Link Which
	// is Already Fully Consumed in suspended Outward Document
	
	@Test(priority = 543630)
	public void checkSuspendingSalesInvoiceVATVoucher1ForSixtiethScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForSixtiethScenario(), true);
	}
	
	@Test(priority = 543631)
	public void checkSavingPurchaseReturnsVoucher1AfterSuspendingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseReturnsVoucher1AfterSuspendingSalesInvoiceVoucher1(), true);
	}

	@Test(priority = 543632)
	public void checkReSavingSalesInvoiceVATVoucherAfterConsumingFullQuantityInPurchaseReturnsVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucherAfterConsumingFullQuantityInPurchaseReturnsVoucher1(), true);
	}

	// Sixtieth Scenario Stops : Try to Consume Batch Quantity Through Link Which is
	// Already Fully Consumed in suspended Outward Document

	// Sixty One Scenario Starts : Try to Consume Batch Quantity Through Link, By
	// Suspending and Resaving linked Document and Loading Link Twice in New link
	// Document

	@Test(priority = 543633)
	public void checkSuspendingPurchaseReturnsVoucher1ForSixtiethOneScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchaseReturnsVoucher1ForSixtiethOneScenario(), true);
	}

	@Test(priority = 543634)
	public void checkSavingPurchaseReturnsVoucher2AfterSuspendingPurchaseReturnsVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseReturnsVoucher2AfterSuspendingPurchaseReturnsVoucher1(), true);
	}
	
	@Test(priority = 543635)
	public void checkReSavingPurchaseReturnsVoucher1AfterConsumingFullQuantityInPurchaseReturnsVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingPurchaseReturnsVoucher1AfterConsumingFullQuantityInPurchaseReturnsVoucher2(), true);
	}

	// Sixty One Scenario Stops : Try to Consume Batch Quantity Through Link, By
	// Suspending and Resaving linked Document and Loading Link Twice in New link
	// Document

	// Sixty Two Scenario Starts : Try to Consume Batch Quantity Through Link Which
	// is Already Partially Consumed in Other Outward Document
	
	@Test(priority = 543636)
	public void checkDeletingPurchaseReturnsVoucher1And2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchaseReturnsVoucher1And2(), true);
	}
	
	@Test(priority = 543637)
	public void checkDeletingSalesInvoiceVATVoucher1ForSavingWithConsumingPartially()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVoucher1ForSavingWithConsumingPartially(), true);
	}
	
	@Test(priority = 543638)
	public void checkSavingSalesInvoiceVATVoucher1ByConsumingPartialQuantity60()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1ByConsumingPartialQuantity60(), true);
	}
	
	@Test(priority = 543639)
	public void checkSavingPurchaseReturnsVoucher1AfterPartiallyConsumingQuantityInSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingPurchaseReturnsVoucher1AfterPartiallyConsumingQuantityInSalesInvoiceVoucher1(), true);
	}
	
	// Sixty Two Scenario Stops : Try to Consume Batch Quantity Through Link Which
	// is Already Partially Consumed in Other Outward Document

	// Sixty Three Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming partial Quantities
	
	@Test(priority = 543640)
	public void checkAddingLinkFromPurchaseVoucherVATToSalesInvoiceN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkAddingLinkFromPurchaseVoucherVATToSalesInvoiceN(), true);
	}
	
	
	
	@Test(priority = 543641)
	public void checkDeletingSalesInvoiceVATVoucher1AfterAddingSalesInvoiceNInDesignWorkFlow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceVATVoucher1AfterAddingSalesInvoiceNInDesignWorkFlow(), true);
	}
	
	@Test(priority = 543642)
	public void checkSavingPurchaseVoucherVATVoucher1AfterAddingLinkFromPurchasesVoucherVATToSalesInvoiceN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingPurchaseVoucherVATVoucher1AfterAddingLinkFromPurchasesVoucherVATToSalesInvoiceN(), true);
	}
	
	@Test(priority = 543643)
	public void checkSavingPurchaseReturnsVoucher1ByConsumingPartialQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseReturnsVoucher1ByConsumingPartialQuantity(), true);
	}
	
	@Test(priority = 543644)
	public void checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflow(), true);
	}

	// Sixty Three Scenario Stops : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents With Consuming partial Quantities

	// Sixty Fourth Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming partial Quantities,Suspending and
	// Resaving one Link Document

	@Test(priority = 543645)
	public void checkDeletingSalesInvoiceNVoucher1ForSixtyFourthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingSalesInvoiceNVoucher1ForSixtyFourthScenario(), true);
	}
	
	@Test(priority = 543646)
	public void checkSuspendingPurchaseReturnsVoucher1AfterDeletingSalesInvoiceNVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchaseReturnsVoucher1AfterDeletingSalesInvoiceNVoucher1(), true);
	}
	
	@Test(priority = 543647)
	public void checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowByConsumingFullQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowByConsumingFullQuantity(), true);
	}

	@Test(priority = 543648)
	public void checkResavingPurchaseReturnsVoucher1AfterConsumingFullQuantityInSalesInvoiceN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingPurchaseReturnsVoucher1AfterConsumingFullQuantityInSalesInvoiceN(), true);
	}
	
	// Sixty Fourth Scenario Stops : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming partial Quantities,Suspending and
	// Resaving one Link Document

	// Erasing All Transactions
	
	@Test(priority = 543649)
	public void checkEraseAllTransactionsLogoutAndLoginForSixtyFifthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Sixty Fifth Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming partial Quantities and Suspending and
	// Resaving Other Than Link Document
	
	@Test(priority = 543650)
	public void checkSavingPurchaseVoucherVATVoucher1ForSixtyFifthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1ForSixtyFifthScenario(), true);
	}
	
	@Test(priority = 543651)
	public void checkBatchPopupValuesInDeliveryNoteVoucher1AfterSavingPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkBatchPopupValuesInDeliveryNoteVoucher1AfterSavingPurchaseVoucherVAT1(), true);
	}
	
	@Test(priority = 543652)
	public void checkSavingDeliveryNoteVoucher1AfterSavingPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingDeliveryNoteVoucher1AfterSavingPurchaseVoucherVAT1(), true);
	}

	@Test(priority = 543653)
	public void checkSuspendingDeliveryNotesVoucher1FromEntryPage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingDeliveryNotesVoucher1FromEntryPage(), true);
	}
	
	@Test(priority = 543654)
	public void checkSavingPurchaseReturnsVoucher1ByConsumingPartialQuantityAfterSuspendingDeliveryNotesVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingPurchaseReturnsVoucher1ByConsumingPartialQuantityAfterSuspendingDeliveryNotesVoucher1(),
				true);
	}
	
	@Test(priority = 543655)
	public void checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterSavingPurchaseReturns()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterSavingPurchaseReturns(),
				true);
	}
	
	@Test(priority = 543656)
	public void checkResavingDeliveryNotesVoucher1AfterConsumingFullQuantityInSalesInvoiceN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingDeliveryNotesVoucher1AfterConsumingFullQuantityInSalesInvoiceN(), true);
	}

	// Sixty Fifth Scenario Stops : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents With Consuming partial Quantities and Suspending and
	// Resaving Other Than Link Document

	// Erasing All Transactions
	
	@Test(priority = 543657)
	public void checkEraseAllTransactionsLogoutAndLoginForSixtySixthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Sixty Sixth Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming Full Quantities
	
	@Test(priority = 543658)
	public void checkSavingPurchaseVoucherVATVoucher1ForSixtySixthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1ForSixtySixthScenario(), true);
	}
	
	@Test(priority = 543659)
	public void checkSavingPurchaseReturnsVoucher1ByConsumingFullQuantityAfterSavingPurchaseVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseReturnsVoucher1ByConsumingFullQuantityAfterSavingPurchaseVoucher1(),
				true);
	}

	@Test(priority = 543660)
	public void checkLoadingWorkflowInSalesInvoiceNVoucher1AfterFullConsumingInPurchaseReturns()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoadingWorkflowInSalesInvoiceNVoucher1AfterFullConsumingInPurchaseReturns(), true);
	}

	// Sixty Sixth Scenario Stops : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents With Consuming Full Quantities

	// Sixty Seventh Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming Full Quantities and Suspending Resaving
	// One Link Document
	
	@Test(priority = 543661)
	public void checkSuspendingPurchaseReturnsVoucher1ForSixtySeventhScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchaseReturnsVoucher1ForSixtySeventhScenario(), true);
	}
	
	@Test(priority = 543662)
	public void checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterSuspendingPurchaseReturns()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterSuspendingPurchaseReturns(),
				true);
	}
	
	@Test(priority = 543663)
	public void checkResavingPurchaseReturnsVoucher1AfterConsumingQuantityInSalesInvoiceN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingPurchaseReturnsVoucher1AfterConsumingQuantityInSalesInvoiceN(), true);
	}

	// Sixty Seventh Scenario Stops : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents With Consuming Full Quantities and Suspending Resaving
	// One Link Document

	// Sixty Eight Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents By Using Do Not Club With Common Base Option, With
	// Consuming partial Quantities
	
	@Test(priority = 543664)
	public void checkEnablingDoNotClubWithCommonBaseFromPurchaseVoucherVATToSalesInvoiceN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEnablingDoNotClubWithCommonBaseFromPurchaseVoucherVATToSalesInvoiceN(), true);
	}
	
	// Erasing All Transactions
	
	@Test(priority = 543665)
	public void checkEraseAllTransactionsLogoutAndLoginForSixtyEightScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	@Test(priority = 543666)
	public void checkSavingPurchaseVoucherVATVoucher1AfterEnablingDoNotClubWithCommonBase()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1AfterEnablingDoNotClubWithCommonBase(), true);
	}
	
	@Test(priority = 543667)
	public void checkSavingPurchaseReturnsVoucher1ByConsumingPartialQuantityAfterSavingPurchaseVoucherVATVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingPurchaseReturnsVoucher1ByConsumingPartialQuantityAfterSavingPurchaseVoucherVATVoucher1(),
				true);
	}
	
	@Test(priority = 543668)
	public void checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterConsumingPartiallyQuantityInPurchaseReturns()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterConsumingPartiallyQuantityInPurchaseReturns(),
				true);
	}

	// Sixty Eight Scenario Stops : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents By Using Do Not Club With Common Base Option, With
	// Consuming partial Quantities

	// Sixty Ninth Scenario Starts : Try to Consume Batch Quantity By Loading Link
	// in Two Link Documents By Using Do Not Club With Common Base Option,With
	// Consuming Full Quantities

	@Test(priority = 543669)
	public void checkDeletingPurchaseReturnsVoucher1ForSixtyNinthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchaseReturnsVoucher1ForSixtyNinthScenario(), true);
	}
	
	@Test(priority = 543670)
	public void checkReSavingPurchaseReturnsVoucher1ByLoadingWorkFlow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingPurchaseReturnsVoucher1ByLoadingWorkFlow(), true);
	}
	
	@Test(priority = 543671)
	public void checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterConsumingFullQuantityInPurchaseReturns()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingSalesInvoiceNVoucher1ByLoadingFromWorkflowAfterConsumingFullQuantityInPurchaseReturns(),
				true);
	}

	// Sixty Ninth Scenario Stops : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents By Using Do Not Club With Common Base Option,With
	// Consuming Full Quantities

	// Seventieth Scenario Starts : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents By Using Do Not Club With Common Base Option,With
	// Consuming Full Quantities and Suspending Resaving One Link Document

	@Test(priority = 543672)
	public void checkSuspendingPurchaseReturnsVoucher1ForSeventiethScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchaseReturnsVoucher1ForSeventiethScenario(), true);
	}

	@Test(priority = 543673)
	public void checkSavingSalesInvoiceNVoucher1ByConvertingPendingVoucherAfterSuspendingPurchaseReturns()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingSalesInvoiceNVoucher1ByConvertingPendingVoucherAfterSuspendingPurchaseReturns(), true);
	}

	@Test(priority = 543674)
	public void checkResavingPurchaseReturnsVoucher1AfterConsumingQuantityInSalesInvoiceNWithDoNotConsolidateWithCommonBase()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkResavingPurchaseReturnsVoucher1AfterConsumingQuantityInSalesInvoiceNWithDoNotConsolidateWithCommonBase(),
				true);
	}

	// Seventieth Scenario Starts : Try to Consume Batch Quantity By Loading Link in
	// Two Link Documents By Using Do Not Club With Common Base Option,With
	// Consuming Full Quantities and Suspending Resaving One Link Document

	// Erasing All Transactions
	
	@Test(priority = 543675)
	public void checkEraseAllTransactionsLogoutAndLoginForSeventyOneScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Seventy One Scenario Starts : try to Consume batch Quantity More Than
	// Available Quantity in outward Document through Link Between Sales Order and
	// Sales Invoice
	
	@Test(priority = 543676)
	public void checkSavingPurchaseVoucherVATVoucher1ForSeventyOneScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1ForSeventyOneScenario(), true);
	}
	
	@Test(priority = 543677)
	public void checkSavingSalesOrderVoucher1AfterSavingPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVoucher1AfterSavingPurchaseVoucherVAT1(), true);
	}
	
	@Test(priority = 543678)
	public void checkSavingSalesOrderVoucher2AfterSavingPurchaseVoucherVAT1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVoucher2AfterSavingPurchaseVoucherVAT1(), true);
	}
	
	@Test(priority = 543679)
	public void checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAfterSavingSalesOrderDoc1AndDoc2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAfterSavingSalesOrderDoc1AndDoc2(), true);
	}

	// Seventy One Scenario Stops : try to Consume batch Quantity More Than
	// Available Quantity in outward Document through Link Between Sales Order and
	// Sales Invoice

	// Seventy Two Scenario Starts : try to Consume batch Quantity More Than
	// Available Quantity in outward Document through Loading Two Base Vouchers in
	// two Link Vouchers
	
	@Test(priority = 543680)
	public void checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAndSelectingSalesOrderDoc1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAndSelectingSalesOrderDoc1(),
				true);
	}

	@Test(priority = 543681)
	public void checkBatchPopupInSalesInvoiceVATVoucher2ByLoadingFromWorkflowAndSelectingSalesOrderDoc2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkBatchPopupInSalesInvoiceVATVoucher2ByLoadingFromWorkflowAndSelectingSalesOrderDoc2(), true);
	}

	// Seventy Two Scenario Stops : try to Consume batch Quantity More Than
	// Available Quantity in outward Document through Loading Two Base Vouchers in
	// two Link Vouchers

	// Seventy Third Scenario Starts : try to Consume batch Quantity More Than
	// Available Quantity in outward Document By Suspending and Resaving Link
	// Voucher With Same Base Voucher
	
	@Test(priority = 543682)
	public void checkSuspendingSalesInvoiceVATVoucher1ForSeventyThirdScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForSeventyThirdScenario(), true);
	}
	
	@Test(priority = 543683)
	public void checkSavingSalesInvoiceVATVoucher2ByLoadingFromWorkflowAndSelectingSalesOrderDoc2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATVoucher2ByLoadingFromWorkflowAndSelectingSalesOrderDoc2(),
				true);
	}

	@Test(priority = 543684)
	public void checkReSavingSalesInvoiceVATVoucherAfterSalesInvoiceVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesInvoiceVATVoucherAfterSalesInvoiceVoucher2(), true);
	}

	// Seventy Third Scenario Stops : try to Consume batch Quantity More Than
	// Available Quantity in outward Document By Suspending and Resaving Link
	// Voucher With Same Base Voucher

	// Erasing All Transactions

	@Test(priority = 543685)
	public void checkEraseAllTransactionsLogoutAndLoginForSeventyForthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Seventy Forth Scenario Starts : Try to Auto Load batch Details In Outward
	// Document through Links by Enabling Input batch Even If Stock is Not Updated
	// Option in Base Voucher Settings
	
	@Test(priority = 543686)
	public void checkSavingPurchaseVoucherVATVoucher1ForSeventyForthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATVoucher1ForSeventyForthScenario(), true);
	}
	
	@Test(priority = 543687)
	public void checkEnablingInputBatchEvenIfStockIsNotUpdatedInSalesOrderVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEnablingInputBatchEvenIfStockIsNotUpdatedInSalesOrderVoucher(), true);
	}
	
	@Test(priority = 543688)
	public void checkSavingSalesOrderVoucher1AfterEnablingInputBatchEvenIfStockIsNotUpdated()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVoucher1AfterEnablingInputBatchEvenIfStockIsNotUpdated(), true);
	}
	
	@Test(priority = 543689) //
	public void checkSavingSalesOrderVoucher2AfterEnablingInputBatchEvenIfStockIsNotUpdated()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVoucher2AfterEnablingInputBatchEvenIfStockIsNotUpdated(), true);
	}
	
	@Test(priority = 543690)
	public void checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAfterSavingSalesOrderDoc1AndDoc2AfterEnablingInputBatchEvenIfStockIsNotUpdated()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAfterSavingSalesOrderDoc1AndDoc2AfterEnablingInputBatchEvenIfStockIsNotUpdated(),
				true);
	}
	
	// Seventy Forth Scenario Stops : Try to Auto Load batch Details In Outward
	// Document through Links by Enabling Input batch Even If Stock is Not Updated
	// Option in Base Voucher Settings

	// Seventy Fifth Scenario Starts : Try to Auto Load batch Details In Outward
	// Document through Loading Two Base Vouchers in two Link Vouchers

	@Test(priority = 543691)
	public void checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAndSelectingSalesOrderDoc1AfterEnablingInputBatchEvenIfStockIsNotUpdated()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAndSelectingSalesOrderDoc1AfterEnablingInputBatchEvenIfStockIsNotUpdated(),
				true);
	}
	
	@Test(priority = 543692)
	public void checkBatchPopupInSalesInvoiceVATVoucher2ByLoadingFromWorkflowAndSelectingSalesOrderDoc2AfterEnablingInputBatchEvenIfStockIsNotUpdated()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkBatchPopupInSalesInvoiceVATVoucher2ByLoadingFromWorkflowAndSelectingSalesOrderDoc2AfterEnablingInputBatchEvenIfStockIsNotUpdated(),
				true);
	}

	// Seventy Fifth Scenario Stops : Try to Auto Load batch Details In Outward
	// Document through Loading Two Base Vouchers in two Link Vouchers

	// Seventy Sixth Scenario Starts : Try to Auto Load batch Details In Outward
	// Document through Loading Same Base Vouchers in two Link Vouchers by
	// Suspending and Resaving Link one Voucher

	@Test(priority = 543693)
	public void checkSuspendingSalesInvoiceVATVoucher1ForSeventySixthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesInvoiceVATVoucher1ForSeventySixthScenario(), true);
	}
	
	@Test(priority = 543694)
	public void checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAndSelectingSalesOrderDoc2AfterSuspendingSalesInvoiceVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT
				.checkSavingSalesInvoiceVATVoucher1ByLoadingFromWorkflowAndSelectingSalesOrderDoc2AfterSuspendingSalesInvoiceVoucher1(),
				true);
	}

	@Test(priority = 543695)
	public void checkReSavingSalesInvoiceVATVoucher1AfterSalesInvoiceVoucher2BySelectingSalesOrderVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkReSavingSalesInvoiceVATVoucher1AfterSalesInvoiceVoucher2BySelectingSalesOrderVoucher2(), true);
	}

	// Seventy Sixth Scenario Stops : Try to Auto Load batch Details In Outward
	// Document through Loading Same Base Vouchers in two Link Vouchers by
	// Suspending and Resaving Link one Voucher
	
	// Erasing All Transactions
	
	@Test(priority = 543700)
	public void checkEraseAllTransactionsLogoutAndLoginSeventySixthScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllTransactionsLogoutAndLogin(), true);
	}
	
	// Sudheer
    
	@Test(priority = 600001)
	public void checkSavingPurchaseVoucherVATWithCurrentdate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATWithCurrentdate(), true);
	}
	
	@Test(priority = 600002)
	public void checkAuthorisationOFSalesInvoiceDocumentWithoutEnablingInventoryOptionUnderkeepUnposted()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(
				BNT.checkAuthorisationOFSalesInvoiceDocumentWithoutEnablingInventoryOptionUnderkeepUnposted(), true);
	}
	
	@Test(priority = 600003)
	public void checkSalesInvoiceVAT1WithFutureDateAfterSavingAuthorisationOnSales()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSalesInvoiceVAT1WithFutureDateAfterSavingAuthorisationOnSales(), true);
	}
	
	@Test(priority = 600003)
	public void checkSavingSalesInvoiceVAT1WithCurrentDateAfterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVAT1WithCurrentDateAfterBatchConsumed(), true);
	}
	
	@Test(priority = 600004)
	public void checkLoginToAuthoriseUserForSalesAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoginToAuthoriseUserForSalesAuthorisation(), true);
	}

	@Test(priority = 600005)
	public void checkLoginToSuperUserAndSavingSalesInvioceVAT2AfterAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoginToSuperUserAndSavingSalesInvioceVAT2AfterAuthorisation(), true);
	}

	@Test(priority = 600006)
	public void checkSuspendingVoucherInSalesInvoiceVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingVoucherInSalesInvoiceVAT(), true);
	}
	
	@Test(priority = 600007)
	public void checkSavingSalesVoucher2AfterSuspending1stVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesVoucher2AfterSuspending1stVoucher(), true);
	}
	
	@Test(priority = 600008)
	public void checkResavingSales1stVoucherAfterBatchConsumedIn2ndVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSales1stVoucherAfterBatchConsumedIn2ndVoucher(), true);
	}
	
	@Test(priority = 600009)
	public void checkDeletingPurchaseVoucherVATAfterBatchConsumedInSalesInvoiceVat()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchaseVoucherVATAfterBatchConsumedInSalesInvoiceVat(), true);
	}
	
	@Test(priority = 600010)
	public void checkSuspendingVoucherInPurchaseVoucherVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingVoucherInPurchaseVoucherVAT(), true);
	}
	
	@Test(priority = 600011)
	public void checkChangingQuantityInPurchaseVoucherAfterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingQuantityInPurchaseVoucherAfterBatchConsumed(), true);
	}

	// For Updating inAuthorisation we are deleting Vouchers in Sales Invoice
	
	@Test(priority = 600013)
	public void checkDeletingVoucherInSalesInvoiceVATWhenStatusInPending()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingVoucherInSalesInvoiceVATWhenStatusInPending(), true);
	}
	
	@Test(priority = 600014)
	public void checkEnablingInventoryoptionUnderkeepUnpostedInTransdactionAuthorisationOfSalesType()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEnablingInventoryoptionUnderkeepUnpostedInTransdactionAuthorisationOfSalesType(),
				true);
	}
	
	@Test(priority = 600015)
	public void checkSavingVoucherinSalesInvoiceVATAfterEnablingInventoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingVoucherinSalesInvoiceVATAfterEnablingInventoryOption(), true);
	}

	@Test(priority = 600016)
	public void checkSavingSalesINvoiceVAT2AfterFullBatchConsumedIn1stVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesINvoiceVAT2AfterFullBatchConsumedIn1stVoucher(), true);
	}
	
	@Test(priority = 600018)
	public void checkLoginToUserAllOptionsToAuthoriseSalesVouchers1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoginToUserAllOptionsToAuthoriseSalesVouchers1(), true);
	}

	@Test(priority = 600019)
	public void chechAuthoriseVoucher2AfterAuthorisation1stVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.chechAuthoriseVoucher2AfterAuthorisation1stVoucher(), true);
	}
	
	@Test(priority = 600020)
	public void checkLogintoSuperUseAndSavingSalesInvoice2After1stVoucherAuthorised()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLogintoSuperUseAndSavingSalesInvoice2After1stVoucherAuthorised(), true);
	}
	
	@Test(priority = 600021)
	public void checkDeletingVoucherInSalesInvoiceWithAuthorisationStatusPending()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingVoucherInSalesInvoiceWithAuthorisationStatusPending(), true);
	}

	@Test(priority = 600022)
	public void checkSuspendingSalesVoucher1AfterAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesVoucher1AfterAuthorisation(), true);
	}
	
	@Test(priority = 600023)
	public void checkSavingVoucherInSalesInvoice2AfterSusoendingVocher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingVoucherInSalesInvoice2AfterSusoendingVocher1(), true);
	}

	@Test(priority = 600024)
	public void checkResavingSalesInvoice1VoucherAfterBatchConsumedinVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSalesInvoice1VoucherAfterBatchConsumedinVoucher2(), true);
	}

	@Test(priority = 600025)
	public void checkDeletingPurchasVatVoucherAfterBatchConsumedinSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingPurchasVatVoucherAfterBatchConsumedinSalesInvoice(), true);
	}
	
	@Test(priority = 600026)
	public void checkSuspendingPurchasVatVoucherAfterBatchConsumedinSalesInvoice()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingPurchasVatVoucherAfterBatchConsumedinSalesInvoice(), true);
	}

	@Test(priority = 600027)
	public void checkChangingQunatityInPurchaseVoucherAfterConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingQunatityInPurchaseVoucherAfterConsumed(), true);
	}

	// Scenarios With Reservations

	// Deleting VOuchers in Sales Invoice VAT
	
	@Test(priority = 600029)
	public void checkEraseAllDATA()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEraseAllDATA(), true);
	}
	
	@Test(priority = 600030)
	public void checkSavingPurchaseVoucherVATForReservation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATForReservation(), true);
	}
	
	@Test(priority = 600031)
	public void checkSalesOrderInReservationTypeIsManualAndinputBatchEvenIfStockNoyUpdatedChkbox()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSalesOrderInReservationTypeIsManualAndinputBatchEvenIfStockNoyUpdatedChkbox(),
				true);
	}
	
	@Test(priority = 600032)
	public void checkSavingSalesOrderVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVoucher1(), true);
	}
	
	@Test(priority = 600033)
	public void checkResavingSalesOrderWithGraeterQtyThanInward()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSalesOrderWithGraeterQtyThanInward(), true);
	}
	
	@Test(priority = 600034)
	public void checkDeletingVoucherInsalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingVoucherInsalesOrder(), true);
	}
	
	@Test(priority = 600035)
	public void checkSavingSalesOrderWithFullConsumptionInward()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderWithFullConsumptionInward(), true);
	}

	@Test(priority = 600036)
	public void checkReservedPopAfterBatchFullConsumedinSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReservedPopAfterBatchFullConsumedinSalesOrder(), true);
	}

	@Test(priority = 600037)
	public void checkSuspendingVoucherInsalesOrder1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingVoucherInsalesOrder1(), true);
	}
	
	@Test(priority = 600038) // Transaction Negative mssage displaying even though stocki present:
								// exp(Voucher 2)
	public void checkSavingSalesOrder2AfterSuspendingVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrder2AfterSuspendingVoucher1(), true);
	}
	
	@Test(priority = 600039) // Issue as While resaving SAles Order ,it should not allow as Batch Consumed in
								// exp(Voucher 2)
								// so2
	public void checkResavingSalesOrder1AfterSavingVoucher2WithFullBatchConsumption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSalesOrder1AfterSavingVoucher2WithFullBatchConsumption(), true);
	}
	
	// Should work on
	@Test(priority = 600040) // Issue Suspended Voucher is not displaying in sales invoice
	public void checkLinksInSalesInvoiceAfterSavingSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLinksInSalesInvoiceAfterSavingSalesOrder(), true);
	}
	
	// Erase All Here
	@Test(priority = 600041)
	public void checkSavingPurchaseVoucherVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVAT(), true);
	}
	
	@Test(priority = 600042)
	public void checkEnableInputBatchEvenStockIsNotUpdatedOptionInSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEnableInputBatchEvenStockIsNotUpdatedOptionInSalesOrder(), true);
	}
	
	@Test(priority = 600043)
	public void checkSavingSalesOrderVoucherAfterEnableInputBatchEvenIfStockNotUpdatedChkbox()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVoucherAfterEnableInputBatchEvenIfStockNotUpdatedChkbox(), true);
	}
	
	@Test(priority = 600044)
	public void checkSavingSalesOrdervoucher2AfterConsumedBatchInVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrdervoucher2AfterConsumedBatchInVoucher1(), true);
	}

	@Test(priority = 600045)
	public void checkSuspendingSalesVou1AfterEnablingOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingSalesVou1AfterEnablingOptions(), true);
	}
	
	@Test(priority = 600046) // Error Mesage Stock Negative (exp voucher no also 2)
	public void checkSavingSalesVou2AfterSuspendingVou1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesVou2AfterSuspendingVou1(), true);
	}
	
	@Test(priority = 600047) // Error Mesage Stock Negative
	public void checkResavingSalesOrderVou1AfterVou2Saved()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSalesOrderVou1AfterVou2Saved(), true);
	}

	@Test(priority = 600048) // Error Message  // Expected Issue
	public void checkSavingSalesInvoiceVoucherWithLinks()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVoucherWithLinks(), true);
	}
	
	// Eraise All Here
	@Test(priority = 600049)
	public void checkSavingPurchaseVoucherVATWithQty20()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATWithQty20(), true);
	}
	
	@Test(priority = 600050)
	public void checkSavingSalesOrderWithConsumingHalfQtyFromPurVouVat()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderWithConsumingHalfQtyFromPurVouVat(), true);
	}
	
	@Test(priority = 600051)
	public void checkChangingQtyInPurVouVATAfterSavingSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingQtyInPurVouVATAfterSavingSalesOrder(), true);
	}

	@Test(priority = 600052)
	public void checkSuspendingVoucherInSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingVoucherInSalesOrder(), true);
	}
	
	@Test(priority = 600053)
	public void checkChangingQtyinPurVoucherAfterSalesOrderVouSuspended()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingQtyinPurVoucherAfterSalesOrderVouSuspended(), true);
	}

	@Test(priority = 600054)
	public void checkReSavingSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkReSavingSalesOrder(), true);
	}
	
	@Test(priority = 600055)
	public void checkSavingPurchaseVoucherVATWithChangingItemAfterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPurchaseVoucherVATWithChangingItemAfterBatchConsumed(), true);
	}

	@Test(priority = 600056)
	public void checkChangingBatchInPurchaseVoucherVATAfterAfterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingBatchInPurchaseVoucherVATAfterAfterBatchConsumed(), true);
	}

	@Test(priority = 600057)
	public void checkSuspendingVoucherInSalesOrderAndChangingBatchNameInPurchaseVouVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSuspendingVoucherInSalesOrderAndChangingBatchNameInPurchaseVouVAT(), true);
	}
	
	@Test(priority = 600058)
	public void checkSavingPVWithChangingWareHouseAfterVoucherConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPVWithChangingWareHouseAfterVoucherConsumed(), true);
	}
	
	@Test(priority = 600059)
	public void checkDefineAuthorizationWithoutKeepunpostingOptionOnInventoryDocumentInSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDefineAuthorizationWithoutKeepunpostingOptionOnInventoryDocumentInSalesOrder(),
				true);
	}
	
	// Here Erase all data and SAving Inward VOucher pVvat
	
	@Test(priority = 600060)
	public void checkSavingSalOrdVou1AfterAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalOrdVou1AfterAuthorisation(), true);
	}
	
	@Test(priority = 600061)
	public void checkSavingVoucherInsalesOrderafterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingVoucherInsalesOrderafterBatchConsumed(), true);
	}
	
	@Test(priority = 600062)
	public void checkSavingSalesInvoiceWithLoadingLinks()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceWithLoadingLinks(), true);
	}

	@Test(priority = 600063)
	public void checkEditingQtyInPVVATAfterSavingSalesInvoiceVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkEditingQtyInPVVATAfterSavingSalesInvoiceVAT(), true);
	}
	
	@Test(priority = 600064)
	public void checkChangingItemInPvVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingItemInPvVAT(), true);
	}
	
	@Test(priority = 600065)
	public void checkChangingBatchNameInPVVATAfterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingBatchNameInPVVATAfterBatchConsumed(), true);
	}

	@Test(priority = 600066)
	public void checkChangingWarehouseInPVVATAfterAfterBatchConsumed()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingWarehouseInPVVATAfterAfterBatchConsumed(), true);
	}

	@Test(priority = 600067)
	public void checkDeletingVoucherInSIAndSuspendingVoucherInSO()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDeletingVoucherInSIAndSuspendingVoucherInSO(), true);
	}
	
	@Test(priority = 600068) // Error Message _ve and Voucher is saved (exp voucher also 2)
	public void checkSavingVoucherInSO2AfterSuspendingVoucherSO1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingVoucherInSO2AfterSuspendingVoucherSO1(), true);
	}
	
	@Test(priority = 600069) // Negative Message
	public void checkResavingSalesOrd1AfterSavingSalesOrd2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkResavingSalesOrd1AfterSavingSalesOrd2(), true);
	}

	@Test(priority = 600071) // in Links Suspended Col showing Empty and only to 1 voucher is dipslay // Expected Issue
	public void checkSavingSIWithLoadingLinks()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSIWithLoadingLinks(), true);
	}
	
	// Erase all Here
	
	@Test(priority = 600072)  // (as per rathod instructions code edited)
	public void checkDefineAuthorizationOnSalesOrderDocumentWithKeepUnpostingReservationsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkDefineAuthorizationOnSalesOrderDocumentWithKeepUnpostingReservationsOption(),
				true);
	}
	
	@Test(priority = 600073)
	public void checkSavingPVVATAndSOVoucherAfterAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPVVATAndSOVoucherAfterAuthorisation(), true);
	}
	
	@Test(priority = 600074)
	public void checkSavingSO1AfterChangingInAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSO1AfterChangingInAuthorisation(), true);
	}
	
	@Test(priority = 600075) // negative message on saving (exp voucher also 2)
	public void checkSavingSO2AfterChangingInAuthorisation()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSO2AfterChangingInAuthorisation(), true);
	}
	
	@Test(priority = 600077) // doubt need to clarification with Rathod.  pending (as per rathod instructions code edited)
	public void checkSavingSalesInvoiceVATWihLoadingLinks()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesInvoiceVATWihLoadingLinks(), true);
	}
	
	// Erese Here
	@Test(priority = 600079)
	public void checksavingPVVATAndSavingSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checksavingPVVATAndSavingSalesOrder(), true);
	}
	
	@Test(priority = 600081) // Negative Message (exp voucher also 2)
	public void checkSavingSalesOrderVopucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingSalesOrderVopucher2(), true);
	}
	
	@Test(priority = 600082)
	public void checkLoginToUserForAuthorisationINSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoginToUserForAuthorisationINSalesOrder(), true);
	}

	@Test(priority = 600083)
	public void checkAuthorisedVoucherInSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkAuthorisedVoucherInSalesOrder(), true);
	}

	@Test(priority = 600084)  // doubt need to clarification with Rathod.  pending  (as per rathod instructions code edited)
	public void checksavingsalesInvoiceVATAfterTwoVouchersAuthorised()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checksavingsalesInvoiceVATAfterTwoVouchersAuthorised(), true);
	}
	
	// Erase Here
	@Test(priority = 600085)
	public void checkSavingPVVatAndSO()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingPVVatAndSO(), true);
	}
	
	@Test(priority = 600086)
	public void checkLoginToUserallOptionsForAuthoriseSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLoginToUserallOptionsForAuthoriseSalesOrder(), true);
	}
	
	@Test(priority = 600087)
	public void checkSavingVou2AfterAuthorisationInsalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkSavingVou2AfterAuthorisationInsalesOrder(), true);
	}
	
	@Test(priority = 600088)
	public void checkChangingItemAndBatchAndWareHouseInConsumedPVVAT()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkChangingItemAndBatchAndWareHouseInConsumedPVVAT(), true);
	}  
	
	@Test(priority=600089)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		BNT = new BatchNegativeTestingOptionsPage(getDriver());
		Assert.assertEquals(BNT.checkLogout(),true);
	}  
		
}
