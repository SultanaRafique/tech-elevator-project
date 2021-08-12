<template>
  <div class="card">

     <!-- Please leave <img> commented out until directed to remove open and close comment tags in the README. -->
    
    <label class="book-title"><h2>{{book.title}}</h2></label>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <label class="book-author"><h3>{{book.author}}</h3></label>
    
    <button v-on:click="flipStatus(book.isbn)"  v-bind:class="book.read ? 'mark-read' : 'mark-unread'" >
        <span> {{book.read ? 'Mark Read' : 'Mark Unread'}} </span>
    </button>
    
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ['book'],

    methods:{
        flipStatus(isbn){
          this.$store.commit('FLIP_STATUS',isbn)
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}

</style>