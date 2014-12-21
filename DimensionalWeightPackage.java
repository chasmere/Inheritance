
public class DimensionalWeightPackage extends Package implements somethingToImplement{

/**
 * A function that gives us the dimensional weight of the package.
 * And inside this function, it calls the "getFactor()" function...which is never the one here in the "DimensionalWeightPackage" class..
 * becuase it is overrrided by the ones in either the DHLPackage or the FEDExs getFactor() function, depending on the Package we have created.
 */
	public double getDimensionalWeight(){
		double dimensionalWeight = ( getWidth() * getHeight() * getLength() )/ getFactor();
		return dimensionalWeight;
	}
/**
 * Function that gives us the maximum weight between the normal entered weight of the package, and the dimensional weight of 
 * either the DHLPackage or the FEDExs dimensional weight package.
 * (getPrice() function calls the getWeight() function which is overrrided by this, down below, getWeight() function;
 */
	@Override
	public double getWeight() {
		return Math.max(weight, getDimensionalWeight());
	}
	
/**
 * A Function that will be overrided by the ones in classes : DHL Package and the one in the FEDEx Package;
 */
	public double getFactor(){
		double factor = 1 + Math.random() * 10;
		return factor;
	}
}
