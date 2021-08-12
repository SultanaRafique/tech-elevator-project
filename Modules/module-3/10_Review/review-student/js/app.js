
const quizCount = 10;
let correctChoice;
// The problem set must contain ten problems but should be flexible enough to change in the future.
// The problems must be randomly generated.
// The left and right operands must be between 0 and 9.
// The operation must be multiplication.





document.addEventListener('DOMContentLoaded', () => {

    
    let div = document.querySelector('.expression');
    let answerSet = document.getElementById('answers').children;
    answerSet[0].id = "answerList";

    const liElement = document.getElementById('answerList').children;

    Array.from(liElement).forEach(item => {
        item.classList.add('choice');
    });


    let problem = document.querySelector('.currentProblem');
    let score = document.querySelector('.currentScore');
    let problemNum = parseInt(problem.innerText);
    let  scoreValue = parseInt(score.innerText);



    Array.from(liElement).forEach((element) => {
        //let element = document.querySelectorAll('.choice');
       
           
            element.addEventListener('click' , (evt) => {

               let elementValue = parseInt(evt.target.innerText);

                if(problemNum === quizCount ){

                    if(elementValue === correctChoice){
                     
                        scoreValue += 1;
                        score.innerText = scoreValue;   
                     }

                    hideElements();
                    return;
                }

                 if(elementValue === correctChoice){
                     
                    scoreValue += 1;
                    score.innerText = scoreValue;
                    
                 }

                getProblemSet();

                problemNum += 1; 
                problem.innerText = problemNum;
                      
            });    
        });
    

    //console.log(liElement);
    
    //selectChoice();
    getProblemSet();

    const startOverBtn = document.getElementById('btnStartOver');

    startOverBtn.addEventListener('click', () =>{

        score.innerText = '0';
        problem.innerText = '0';

        
        getProblemSet();
        showElements();

        //selectChoice();
    });
        
        
       

    function multiply(a, b){

        div.innerText = '' + a + ' * ' + b;
        return a * b;
    }



    function showElements(){
        let hideElements = document.querySelectorAll('.show-hide');
        Array.from(hideElements).forEach(item => {
            item.style.visibility = "visible";
        });

    }

    function hideElements(){
        let hideElements = document.querySelectorAll('.show-hide');
        Array.from(hideElements).forEach(item => {
            item.style.visibility = "hidden";
        });

    }
    
    
    function getProblemSet(){

         correctChoice = multiply(getRandomNumber(9), getRandomNumber(9));
        let answerChoices = [];
        answerChoices[0] = correctChoice;
        

        for(let i= 1; i < 4; i++){
            answerChoices[i] = getRandomNumber(81);
        }

        shuffleArray(answerChoices);
       
        for(let j = 0; j < 4; j++){

            liElement[j].innerText = answerChoices[j];
        }

        return correctChoice;

    }

    

    //function selectChoice(){

        
        
        
        //getProblemSet();

        //let problemInnerText = problem.innerText;
        //console.log(parseInt(problem.innerText));
        
       

    //}  

    
    });
 
