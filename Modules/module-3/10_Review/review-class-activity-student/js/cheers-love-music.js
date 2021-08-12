

/*
Step 1: Add an eventListener to the document which will listen
for the DOMContentLoaded event. Once the event is fired
add this eventListener is triggered, the code inside it will run
*/
document.addEventListener('DOMContentLoaded', ()=>{


    /*
    Step 2: create a word div that matches the divs with the item-text class
    its id will be music-word-div and add it to the div with the class item-grid
    */ 
    

    const wordDiv = document.createElement('div');
    wordDiv.classList.add('item-text');
    wordDiv.id = 'music-word-div';

    const gridDiv = document.querySelector('.item-grid');
    gridDiv.appendChild(wordDiv);
   
    


    /* Step 3 create a span element with the id music-word


    */


   const  newSpan = document.createElement('span');
   newSpan.id = 'music-word';

    /* Step 4: set the new spans contents to the word MUSIC */

    newSpan.innerText = 'MUSIC';

    /* Step 5: add the span you created to word div you created above */


    wordDiv.appendChild(newSpan);

    /* Step 6: a method called createXYPosDiv has been created to
        add the XYPos panel to the given parent. call this method
        to add the panel to the grid*/

        createXYPosDiv(gridDiv);

    /* Step 7: fill out the item-grid class in styles.css to be a grid with 3 columns
        with ratio 3:5:2 and 3 rows.

        the rows should each contain the item-image and corresponding item-text
        (i.e. cheers-image-div cheers-word-div) in the first 2 columns.

        the final row should contain the mouse-coords-div in the 3rd column
    */
    
    /* Step 8: create a method which will select all the text items and
        update them to use the text-italic class. use forEach to iterate
        over the items */

        function italicizeText(){
            const textItem = document.querySelectorAll('.item-text');
            textItem.forEach( (item) => {
                item.classList.add('text-italic');
            });


        }

        function updateXYPos(){
            const xPos = document.getElementById('x-pos');
            const yPos = document.getElementById('y-pos');

            xPos.innerText = 'x-position';
            yPos.innerText = 'y-position';

        }

    /* Step 9: call the method you wrote in step 9 */

    italicizeText();

    /*
        Step 10: Add a listener for the mouse being over the element with the id cheers-word
        
        The listener should call the existing toggleColor method with the element 
        that fired the event

    */

    let cheersWord = document.getElementById('cheers-word');

    cheersWord.addEventListener('mouseover', (evt) =>{
        toggleColor(evt.currentTarget);
    });

    

    /* Step 11: Add a listener to the cheers-word that calls the toggleColor
        method with the element that fired the event when the mouse moves
        out of the element
    */

   cheersWord.addEventListener('mouseleave', (evt) =>{
    toggleColor(evt.currentTarget);
    });

    /*
        Step 12: Add a listener for the mouse being clicked 
        on the element with the id cheers-image
        
        The listener should call the existing toggleColor method with the element 
        that fired the event

    */

    const cheersImage = document.addEventListener('click', (evt) => {
        toggleColor(evt.currentTarget);
    });

   /* Step 13: call the provided method addListenersToOtherWordsAndImages method
        (no params) to
        attach similar listeners to the other words and images */

        addListenersToOtherWordsAndImages();

    /* Step 14: Write a methods that takes the x and y coordingates and
     udpates them in the x y position panel */

    /*
    Step 15: Add a listener for the mouse moving

    */
   document.addEventListener('mousemove',(evt) =>{
       updateXYPos(evt.clientX, evt.clientY);

    });

});


