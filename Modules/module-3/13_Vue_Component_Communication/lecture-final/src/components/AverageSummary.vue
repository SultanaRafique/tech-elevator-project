<template>
  <div class="well">
    <span class="amount" v-on:click="updateFilter()">{{ averageRating }}</span>
    Average Rating
  </div>
</template>

<script>
export default {
  name: "average-summary",
  methods: {
    updateFilter() {
      this.$store.commit('UPDATE_FILTER', 0);
    }
  },
  computed: {
    averageRating() {
      // const reviews = this.$store.state.reviews;
      let sum = this.$store.state.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);
      return (sum / this.$store.state.reviews.length).toFixed(2);
    }
  }
};
</script>
