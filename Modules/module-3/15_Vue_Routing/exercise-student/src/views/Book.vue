<template>
  <book-detail v-bind:book-isbn="$store.state.activeBookIsbn"/>
</template>

<script>
import BookDetail from '../components/BookDetail.vue'
export default {
    name: 'book',
  components: { BookDetail },
  created(){
      const activeBookIsbn = this.$route.params.isbn;
      this.$store.commit('SET_ACTIVE_BOOK', activeBookIsbn);
  }

}
</script>

<style>

</style>
