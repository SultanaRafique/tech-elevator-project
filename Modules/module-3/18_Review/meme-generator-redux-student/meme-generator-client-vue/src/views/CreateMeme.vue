<template>
  <div>
      <h1>Create Meme</h1>
      <h2>Meme: {{ meme.memeName }}</h2>
      <img v-bind:src="meme.memeUrl" />
      <form v-on:submit.prevent="createMeme">
          <div class="form-element">
            <label for="meme-text">Meme Text 1:</label>
            <input id="meme-text" type="text" v-model="text1"/>
          </div>
          
          <div class="form-element">
            <label for="meme-text">Meme Text 2:</label>
            <input id="meme-text" type="text" v-model="text2"/>
          </div>
          
          <input type="submit" />
      </form>
       <!-- link this back to the Home view -->
       <router-link v-bind:to="{name: 'home'}">
        Back to Meme List
       </router-link>
  </div>
</template>

<script>
import MemeService from '../services/MemeService';

export default {
    name: 'create-meme',
    data() {
        return {
            text1: null,
            text2: null
        }
    },
    /* Created a computed property meme that returns the meme whose id 
        is specified in the path
    */ 
   computed: {
       meme() {
           const memeId = this.$route.params.id;
           this.$store.state.meme.find( meme => {
               return meme.memeId === memeId;
           });
       }

   },

    methods: {
        /* write the method below  
        
        the object specifying the meme to  create should have these properties:

        memeId
        caption1
        caption2

        if the meme is created successfully, store its URL in the data
        store, and then redirect to the MemeResult View
        
        */
        createMeme() {
            const memeInfo = {
                memeId = this.meme.memeId,
                caption1: this.text1,
                caption2: this.text2,

            }

            MemeService.createMeme(memeInfo).then( Response => {
                this.$store.commit('SET_RESTFUL_URL', Response.data);
                this.$router.push({name: 'meme-result'});
            })
        }
    }

}
</script>

<style>
form {
    margin: 20px 0;
}
img {
    max-width: 300px;
    max-height: auto;
}

input[type="text"] {
    width: 300px;
    margin-bottom: 10px;
}
</style>