<template>
  <div>
      <!-- create a search field with the id search-term -->
      <label for="search-term"></label>
      <input type="text" id="search-term" v-model="searchTerm" v-on:keyup="updateSearchTerm"/>
      
      <!-- the field should update the search filter as you type -->
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
        updateSearchTerm(){
           this.store.commit("UPDATE_SEARCH", this.searchTerm) 
        }
    }
    

}
</script>

<style scoped>
    /* label {
        // if you want label next to text field
        display: inline;
        // if you want label above to text field
        display: block;
    } */

    #serch-term {
        width: 70%;
    }
</style>