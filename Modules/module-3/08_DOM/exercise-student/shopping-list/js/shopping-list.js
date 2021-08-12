// add pageTitle
let  pageTitle = 'My Shopping List';

// add groceries
let groceries = ['Milk', 'Bread', 'Butter', 'Jam', 'Yoghurt', 'Oats', 'Bananas', 'Grapes', 'Apples', 'Rice', ];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */


function setPageTitle() {

  let h1 = document.getElementById('title');
  h1.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {

    let listContainer = document.getElementById("groceries");

  for(let i = 0; i < groceries.length; i++){

    let itemContainer = document.createElement('li');
    itemContainer.setAttribute('id', 'listItem'+ i )
    listContainer.appendChild(itemContainer);

    itemContainer.innerText = groceries[i];
  }

}


  
function markCompleted() {
  for(let i = 0; i < groceries.length; i++){

    let itemContainer = document.getElementById('listItem'+ i);
    console.log(itemContainer);
    itemContainer.setAttribute('class', 'completed');

  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});

