let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];
let groceryElements;

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}



document.addEventListener('DOMContentLoaded', () => {

  setPageTitle();
  displayGroceries();

  
  function doToggleAll() {

    // const groceryElements = document.querySelectorAll('ul > li');

    markValue = false;

    if (allItemsIncomplete) {
      markValue = true
    }

    groceryElements.forEach( (item) => {
      changeCompleted(item, markValue);
    })

    const toggleAll = document.getElementById('toggleAll');


    allItemsIncomplete = !markValue;

    
    const buttonText = allItemsIncomplete ? 'Mark All Complete' : 'Mark All Incomplete';
    toggleAll.innerText = buttonText;

  }


  function changeCompleted(element, isMarkComplete) {
    if (isMarkComplete) {
      if (!element.classList.contains('completed')) {
        element.classList.add('completed');
        const icon = element.querySelector('i');
        icon.classList.add('completed');
      }
    } else {
      if (element.classList.contains('completed')) {
        element.classList.remove('completed');
        const icon = element.querySelector('i');
        icon.classList.remove('completed');
      }
    }
  }

  groceryElements = document.querySelectorAll('ul > li');
  groceryElements.forEach( (element) => {
    element.addEventListener('click', (evt) => {
      changeCompleted(evt.currentTarget, true);
    })
    element.addEventListener('dblclick', (evt) => {
      const curElem = evt.currentTarget;
      changeCompleted(evt.currentTarget, false);
    })
  });

  const toggleAll = document.getElementById('toggleAll');
  toggleAll.addEventListener('click', (evt) => {
    evt.preventDefault();
    doToggleAll();
  });



});