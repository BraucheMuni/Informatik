package Kuchen;

public class Verteilen {
    void kuchenVerteilen(int kuchen)
    {
    	System.out.println("Es wurden " + kuchen + " Kuchenstuecke weitergegeben.");
    	
		if (kuchen > 1)
    	{
    		int haelfte = kuchen / 2;
    		kuchenVerteilen(haelfte);
    		kuchenVerteilen(kuchen - haelfte);
    	}
		else
		{
    		System.out.println("Das Stueck wurde gegessen.");
    	}
    }
    
    void kuchenVerteilen3(int kuchen)
    {
    	System.out.println("Es wurden " + kuchen + " Kuchenstuecke weitergegeben.");

		if (kuchen > 2)
		{
			int drittel = kuchen / 3;

			kuchenVerteilen3(drittel);
			kuchenVerteilen3(drittel);
			kuchenVerteilen3(kuchen - drittel * 2);
		}
		else if (kuchen > 1)
    	{
    		int haelfte = kuchen / 2;

    		kuchenVerteilen(haelfte);
    		kuchenVerteilen(kuchen - haelfte);
    	}
		else
		{
    		System.out.println("Das Stück wurde gegessen.");
    	}
    }
}