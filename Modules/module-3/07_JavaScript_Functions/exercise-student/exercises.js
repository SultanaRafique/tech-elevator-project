/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
    function isAdmitted(gpa, satScore=0, recommendation=false){

        if(gpa > 4.0){
            return true;
        } else if (satScore > 1300){
            return true;
        } else if (gpa > 3.0 && recommendation === true){
            return true;
        } else if (satScore > 1200 && recommendation === true){
            return true;
        } else {
            return false;
        }
    }

/**
 * Write a function called useParameterToFilterArray that takes an anonymous
 * function and uses that in the `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];

function useParameterToFilterArray(filterFunction ) {

    return unfilteredArray.filter(filterFunction);

}

/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

    function makeNumber (first, second){

        return parseInt( " " + first + second) ;
    }

/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */

    function addAll(){

        let sum = 0;

        for ( let i = 0 ; i < arguments.length; i++){
             
            sum += arguments[i];
        }
        
        return sum;
    }

/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */

/**

 * So if ["morning", "evening", "night"] array passed in  , then this function
* returns the array  ["Happy morning", "Happy evening", "Happy night"].
 * 
 * @param {string[]} array of strings to prepend 'Happy' to the beginning of  each word.
 *  @returns {string[]} the resultant string array 
 */

 
    function makeHappy(array){
        return array.map( str => "Happy " + str);
    }

    

/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */

 /**
  * 
  * So if [{streetNumber: 107,
 *          streetName: "Snow pike",
 *          streetType: "West",
 *          city: "Philadelphia",
 *          state: "PA",
 *          zip: 12345
            },
            
            {streetNumber: 108,
 *          streetName: "George pike",
 *          streetType: "East",
 *          city: "Philadelphia",
 *          state: "PA",
 *          zip: 12347
            }] 
            
            array passed in  , then this function returns the array 
        ["107 Snow pike West Philadelphia PA 12345", "108 George pike East Philadelphia PA 12347"].
  * 
  *  @param {Object[]} array of Object  
  *  @returns {string[]} the resultant string array  
  */

    function getFullAddressesOfProperties(array){

       return array.map((item) => {
            return  item.streetNumber + " " + item.streetName + " " + item.streetType + " " + item.city + " " + item.state + " " + item.zip ;

       } );
    }

/*
 * Write and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It must work for strings and numbers.
 * 
 *  So if ["zebra", "giraffe","lion"] passed in , then this function
 * returns the string "giraffe".
 * 
 *  So if [12, 67, 44, 77, 23, 99] passed in , then this function
 * returns the number 99.
 * 
 */

 /**
  * 
  *@param {string []} array of string  
  *  @returns {string} the resultant largest string array
  * 
  * @param {number []} array of number  
  *  @returns {number} the resultant largest number
  */

    function findLargest(array){
            let largest = "";
         array.forEach((item) => {
            
            if(item > largest){
                largest = item;    
             }     
        });   
        
        return largest;
    }


/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */

 /**
  * 
  *  @param {number[][]} two dimensional array of  of number  
  *  @returns {number} the resultant addition of all  numbers of two dimensional array
  */
    function getSumOfSubArrayValues (twoDArray){

        if(!twoDArray){
            return 0;
        }

       return twoDArray.reduce((twoDSum, oneDArray) =>{
        let oneDSum =  oneDArray.reduce((num1, num2) => {
            return num1 + num2;
          }, 0 );
          return twoDSum + oneDSum;
        }, 0);
    }