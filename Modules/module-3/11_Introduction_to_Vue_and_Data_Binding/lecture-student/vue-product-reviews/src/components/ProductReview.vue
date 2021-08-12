<template>
  <div class = "main">
      <h2>Product review for {{ name}}</h2>  
      <p class = "description">{{ description}}</p>

      <div class = "review" v-for="review in reviews" v-bind:key="review.id">
          <h4>{{review.reviewer}}</h4>
        <div class="rating">
            <img src = "../assets/star.png" v-bing:title="review-rating + 'Star Review'" class="" />   
        </div>
        <h3>{{ review.title}}</h3>
        <p>{{review.review}}</p>
      </div>
  </div>
</template>

<script>
export default {
    name: "product-review",
    data(){
        return {
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends.',
            reviews: [
                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly a book, I mean, I can see that. Pages kept togrther with",
                    rating: 3
                },

                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly a book, I mean, I can see that. Pages kept togrther with",
                    rating: 3
                },

                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly a book, I mean, I can see that. Pages kept togrther with",
                    rating: 3
                },

                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly a book, I mean, I can see that. Pages kept togrther with",
                    rating: 3
                }

            ]
        }
    }

}
</script>

<style scoped>
    div.main {
        margin: 1rem 0; 
    }

</style>