<template>
  <div class="main">

      <div class="well-display">
        <div class="well">
            <span class="amount"> {{ averageRating }}</span>
            Average Rating
        </div>

        <div class="well">
            <span class="amount">{{ numberOfOneStarReviews }}</span>
            1 Star Review{{ numberOfOneStarReviews != 1 ? 's' : ''}}
        </div>
 
        <div class="well">
            <span class="amount">{{ numberOfTwoStarReviews }}</span>
            2 Star Review{{ numberOfTwoStarReviews != 1 ? 's' : ''}}
        </div>
        
        <div class="well">
            <span class="amount">{{ numberOfThreeStarReviews }}</span>
            3 Star Review{{ numberOfThreeStarReviews != 1 ? 's' : ''}}
        </div>
        
        <div class="well">
            <span class="amount">{{ numberOfFourStarReviews }}</span>
            4 Star Review{{ numberOfFourStarReviews != 1 ? 's' : ''}}
        </div>
        
        <div class="well">
            <span class="amount">{{ numberOfFiveStarReviews }}</span>
            5 Star Review{{ numberOfFiveStarReviews != 1 ? 's' : ''}}
        </div>
      </div>

       <h2>Product Reviews for {{ name }}</h2>
 
       <p class="description">{{ description }}</p>

       <div class="review" v-for="review in reviews" v-bind:key="review.id" v-bind:class="{ favorited: review.favorited }">
            <h4>{{ review.reviewer }}</h4>
            <div class="rating">
                <img src="../assets/star.png" v-bind:title="review.rating + ' Star Review'"
                    class="ratingStar" v-for="n in review.rating" v-bind:key="n"/>
            </div>
            <h3>{{ review.title }}</h3>
            
            <p>{{ review.review }}</p>

            <p>Favorite? <input type="checkbox"  v-model="review.favorited"/></p>


            <!-- v-show can be used to show or hide an element based on whether expression evaluates to true. 
                v-show manipulates the diaplay property. If you inspect the HTML for an element with v-show
                you will see that display gets set to display: none when the expression evaluates to false but that will
                be removed if the expression evaluates to false -->

            <!-- <p v-show="review.favorited">This is a favorite</p> -->


            <!-- v-id works the same way but it actually REMOVES the element from the DOM if the expression 
                evaluates to false and adds it back when the expression evaluates to true. You can see this
                behavior if you inspect the page using dev tools -->

            <!-- <p v-if="review.favorited">This is a favorite</p> -->

            <!-- you can omit the v-bind of v-bind: and use : for short hand. In other words, v-bind:class
                becomes :class -->
        </div>
    </div>
</template>

<script>
export default {
    name: 'product-review',
    data() {
        return {
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends.',
            reviews: [
                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
                    rating: 3,
                    favorited: false
                },
                {
                    reviewer: "Tim Ferriss",
                    title: "Had a cigar party started in less than 4 hours.",
                    review:
                    "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
                    rating: 4,
                    favorited: false
                },
                {
                    reviewer: "Ramit Sethi",
                    title: "What every new entrepreneurs needs. A door stop.",
                    review:
                    "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
                    rating: 1,
                    favorited: false
                },
                {
                    reviewer: "Gary Vaynerchuk",
                    title: "And I thought I could write",
                    review:
                    "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
                    rating: 3,
                    favorited: false
                }
            ]
        }
    },
    computed: {
        averageRating() {
            // Use reduce to get the total of all the ratings
            let sum = this.reviews.reduce( (currentSum, review) => {
                return currentSum + review.rating;
            }, 0);
        
            // Divide by the number of reviews
            return sum / this.reviews.length;
        },
            numberOfOneStarReviews() {
            return this.reviews.reduce((currentCount, review) => {
            return currentCount + (review.rating === 1);
            }, 0);
        },
        numberOfTwoStarReviews() {
            return this.reviews.reduce((currentCount, review) => {
            return currentCount + (review.rating === 2);
            }, 0);
        },
        numberOfThreeStarReviews() {
            return this.reviews.reduce((currentCount, review) => {
            return currentCount + (review.rating === 3);
            }, 0);
        },
        numberOfFourStarReviews() {
            return this.reviews.reduce((currentCount, review) => {
            return currentCount + (review.rating === 4);
            }, 0);
        },
        numberOfFiveStarReviews() {
            return this.reviews.reduce((currentCount, review) => {
            return currentCount + (review.rating === 5);
            }, 0);
        }
    }
}
</script>

<style scoped>
    div.main {
        margin: 1rem 0;
    }

    div.main div.well-display {
        display: flex;
        justify-content: space-around;
    }
    
    div.main div.well-display div.well {
        display: inline-block;
        width: 15%;
        border: 1px black solid;
        border-radius: 6px;
        text-align: center;
        margin: 0.25rem;
    }
    
    div.main div.well-display div.well span.amount {
        color: darkslategray;
        display: block;
        font-size: 2.5rem;
    }
    
    div.main div.review {
        border: 1px black solid;
        border-radius: 6px;
        padding: 1rem;
        margin: 10px;
    }
    
    div.main div.review div.rating {
        height: 2rem;
        display: inline-block;
        vertical-align: top;
        margin: 0 0.5rem;
    }
    
    div.main div.review div.rating img {
        height: 100%;
    }
    
    div.main div.review p {
        margin: 20px;
    }
    
    div.main div.review h3 {
        display: inline-block;
    }
    
    div.main div.review h4 {
        font-size: 1rem;
    }

    div.main div.review.favorited {
        background-color: lightyellow;
    }

</style>