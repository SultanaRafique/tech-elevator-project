<template>
  <div class="bookDetail" >
        <h2 class="book-title">{{ book.title }}</h2>
        <h3 class="book-author">{{ book.author }}</h3>
        <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />

        <div>
            <label>{{book.read ? "I have read this book" : "I have not read this book"}}</label>
        </div>
  </div>
</template>

<script>
 export default {
    name: 'book-deatil',
    props: ["bookIsbn"],
    computed:{
        book(){
            return this.$store.state.books.find(item =>{
                return item.isbn === this.$route.params.isbn;
            });
        }
    }
}
</script>

<style>

</style>