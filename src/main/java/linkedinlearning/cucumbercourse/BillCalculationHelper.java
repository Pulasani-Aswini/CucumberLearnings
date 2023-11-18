package linkedinlearning.cucumbercourse;

public class BillCalculationHelper {

	public static double CalculateBillForCustomer(int intialBillAmount, double taxRate) {
		double taxamount=(intialBillAmount*taxRate)/100;
		return taxamount+intialBillAmount;
	}

}
