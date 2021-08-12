<template>
  <table>
    <thead>
        <th>Title</th>
        <th>Reviewer</th>
        <th>Review</th>
        <th>Rating</th>
        <th>Favorited</th>
    </thead>
    <tbody>
      <!-- <tr v-for="review in filteredReviews" v-bind:key="review.id">
        <td>
          {{ review.title }}
        </td>
        <td>
          {{ review.reviewer }}
        </td>
        <td>
          {{ review.review }}
        </td>
        <td class="stars">
          <img src="../assets/star.png"
            class="star"
            style="width: 20px"
            v-for="x in review.rating"
            v-bind:key="x"
            v-bind:title="review.rating + ' Star Review'"
          />
        </td>
        <td>
          <input type="checkbox" v-bind:checked="review.favorited" v-on:click="onFavoritedChange(review)"/>
        </td>
      </tr> -->
      <review-table-row v-for="theReview in filteredReviews" v-bind:key="theReview.id" v-bind:review="theReview" v-bind:show="true"/>
      <tr v-show="filteredReviews.length === 0">
         <td colspan="5">There are no reviews</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
import ReviewTableRow from './ReviewTableRow.vue';
export default {
  components: { ReviewTableRow },
  name: "review-table",
  computed: {
    filteredReviews() {
      const reviews = this.$store.state.reviews;
      const filterVal = this.$store.state.filter;
      return filterVal === 0 ? reviews :
        reviews.filter( review => {
          return filterVal === review.rating;
      });
      // return reviews.filter( review => {
      //   return filterVal === 0 ? true : filterVal === review.rating;
      // });
    }
  }
  // ,
  // methods: {
  //   onFavoritedChange(reviewToChange) {
  //     this.$store.commit('FLIP_FAVORITED', reviewToChange)
  //   }
  // }
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
.stars {
  display: flex;
}
</style>
