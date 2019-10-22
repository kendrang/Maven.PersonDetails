package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;
        while (i<personArray.length)
        {result += personArray[i];
        i++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";

        for(int i=0 ; i<personArray.length ; i++){
            result += personArray[i];}
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for ( Person i : personArray){
            result += i ;
        }
        // identify array's typ
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
