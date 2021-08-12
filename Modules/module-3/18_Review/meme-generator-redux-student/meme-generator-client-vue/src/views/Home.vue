<template>
  <div class="home">
    <h1>Let's Create a Meme!!!</h1>
    <meme-list />
  </div>
</template>

<script>
import MemeList from '../components/MemeList.vue'
// @ is an alias to /src

export default {
  name: 'Home',
  components: {
    MemeList
  },

  data() {
    return 
  }
}
</script>
