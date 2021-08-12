<template>
  <div>
      <!-- create a search field with the id search-term -->
      <!-- the field should update the search filter as you type -->
      <label for="search-term">Search </label>
      <input type="text" id="search-term" v-model="searchTerm" v-on:keyup="updateSearchTerm" />
  </div>
</template>

<script>
export default {
    name: 'product-search',
    data() {
        return {
            searchTerm: ''
        }
    },
    methods: {
        updateSearchTerm() {
            this.$store.commit('UPDATE_SEARCH', this.searchTerm);
        }
    }
}
</script>

<style scoped>
    /* label {
         display: block; 
    } */

    #serch-term {
        width: 70%;
    }
</style>