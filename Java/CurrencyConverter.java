	
	public class CurrencyConverter {
     
	    // Currency exchange rates of different currencies relative to 1 US dollar
        static double[] exchangeRates={63,3,3,5,7,8};
		
		void setExchangeRates(double[] rates) {
			exchangeRates = rates;
		}
		
		void updateExchangeRate(int countryIndex, double newVal) {
			exchangeRates[countryIndex] = newVal;
		}
		
		double getExchangeRate(int countryIndex) {
			return exchangeRates[countryIndex];
		}
		
		double computeTransferAmount(int countryIndex, double amount) {
			return amount * getExchangeRate(countryIndex);
		}
		
       
        static void printCurrencies() {
    	     System.out.println("\nrupee: " + exchangeRates[0]);
    	     System.out.println("dirham: " + exchangeRates[1]);
    	     System.out.println("real: " + exchangeRates[2]);
    	     System.out.println("chilean_peso: " + exchangeRates[3]);
    	     System.out.println("mexican_peso: " + exchangeRates[4]);
    	     System.out.println("_yen: " + exchangeRates[5]);
    	     System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
        }
    	   
       
    }