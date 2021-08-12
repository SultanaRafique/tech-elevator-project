<template>
<div>
    <div>
        
    <form  class="new-book-form"   v-on:submit.prevent="addNewBook">

      <div  class="field" >
        <label for="title">Title:</label>
        <input class="title-input" type="text" id="title" v-model="newBook.title" />
      </div>

      <div class="field" >
        <label for="author">Author:</label>
        <input class="author-input" type="text" id="author" v-model="newBook.author"/>
      </div>

      <div class="field" >
        <label for="isbn">ISBN:</label>
        <input class="isbn-input" type="text" id="isbn"  v-model="newBook.isbn"/>
      </div>

      <button type="submit" class="btn save">Save Book</button>

    </form>

    </div>
</div>
  
</template>

<script>
export default {
    name: 'new-book-form' ,
    data() {
        return {
            newBook: {
                title: "",
                author: "",
                 read: true,
                isbn: ""
            }
        }

    },

    methods: {
        addNewBook(){
            this.$store.commit('ADD_NEW_BOOK',this.newBook);
        }
    }
}
</script>

<style>



</style>