/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */

 function multiplyTogether(firstParameter, secondParameter) {
   return firstParameter * secondParameter;
 }

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter = 0, secondParameter = 0) {
  return firstParameter * secondParameter;
}

 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}

/**
 * Concat all items in arguments array
 */
function concatAll() {
    let result = '';
    for(let i = 0; i < arguments.length; i++) {
        result += arguments[i];
    }
    return result;
}

/**
 * Creates a sentence from parameters and returns it
 * @param {string} name 
 * @param {number} age 
 * @param {string[]} listOfQuirks 
 * @param {string} separator 
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

let sumNum = (num1, num2) => { 
  return num1 + num2
};

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce( (num1, num2) => {
    return num1 + num2;
  } );
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */

let divByThreeFilter = (num) => { return num % 3 === 0 };

function isDivisbileByThree(numParam) {
  return numParam % 3 === 0;
}


function allDivisibleByThree(numbersToFilter) {
  // return numbersToFilter.filter( (num) => {
  //   return num % 3 === 0;
  // })
  return numbersToFilter.filter(divByThreeFilter);
  // return numbersToFilter.filter(isDivisibileByThree);
}

function startsWithA(words) {
  return words.filter( (word) => { return word.startsWith('a') } );
}



/**
 * Takes an array amd returns a new array that contains the initial values, each incremented by three
 * @param {number[]} numbers array of numbers to process
 */
function addThreeToAll(numbers) {
  return numbers.map( (num) => { return num + 3} );
}

/**
 * Takes an array of strings and outputs each one on its own line
 * @param {string[]} data 
 */
function dumpArray(data) {
  data.forEach( (item) => { console.log(item)} );
}


function sortNums(numbers) {
  return numbers.sort( (num1, num2) => {
    if (num1 > num2) {
      return 1;
    } else if (num2 > num1) {
      return -1;
    }
    return 0;
  })
}

const sortRule = (num1, num2) => {
  if (num1 > num2) {
    return 1;
  } else if (num2 > num1) {
    return -1;
  }
  return 0;
};

function sortNumsWithVariableFunc(numbers) {
  return numbers.sort( sortRule );
}

function sortWordLength(words) {
  return words.sort( (word1, word2) => {
    if (word1.length > word2.length) {
      return 1;
    } else if (word2.length > word1.length) {
      return -1;
    }
    return 0;
  })
}

function allWordsLongerThan3(words) {
  return words.every( (word)=> { return word.length >= 3 });
}

function someWordsLongerThan3(words) {
  return words.some( (word)=> { return word.length > 7 });
}