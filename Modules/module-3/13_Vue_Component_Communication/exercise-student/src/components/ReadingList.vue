<template>
<div class="book-container" id="book-card-id"> 
  <!-- this should display all book-cards -->
  <div  v-for="book in $store.state.books" v-bind:key="book.id">
    <!-- add book-card -->
    <book-card v-bind:book="book"/>
 </div>
</div>
</template>

<script>
import BookCard from './BookCard.vue'

export default {
  components: { BookCard },
    name: 'reading-list'
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>