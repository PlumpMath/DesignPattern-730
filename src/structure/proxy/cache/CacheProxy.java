/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.cache;

/**
 *
 * @author dengxt
 */
public class CacheProxy implements Calculator{
    Calculator calculator = null;
    int result = 0;
    @Override
    public int calculate() {
        if(this.calculator == null){
            this.calculator = new TimeCostCalculator();
            result = calculator.calculate();
        }
        
        return result;
    }
    
}
