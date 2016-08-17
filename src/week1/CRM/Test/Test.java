package week1.CRM.Test;

import week1.CRM.Development;
import week1.CRM.Utils.Array;

/**
 * Created by IT on 14.08.2016.
 */
public class Test {

    public static void main(String[] args) {
        Development dev = new Development();
        Array array= new Array();
        boolean addExeptional = true;
        boolean arrRess = array.add(dev);
        //System.out.println("%s addMetod", (addExeptional == arrRess));
    }

}
