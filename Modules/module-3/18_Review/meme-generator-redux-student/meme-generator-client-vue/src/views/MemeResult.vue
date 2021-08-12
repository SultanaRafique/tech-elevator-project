<template>
  <div>
        <div class="result-image">
            <img v-bind:src="resultUrl"/>
        </div>

        <div class="result-url">
            <label for="result">Meme URL:</label>
            <input id="result" type="text" v-bind:value="resultUrl" disabled />
        </div>
      
        <!-- link this back to the Home view -->
        <router-link v-bind:to="{name: 'home'}">
            Back to Meme list
        </router-link>
  </div>
</template>

<script>
export default {
    name: 'meme-result',

    /* retrieve tthis property from the store */
    computed: {
        resultUrl() {
            return this.$store.state.resultMemeUrl;
        }
    }

}
</script>

<style>
img {
    width: 100%;
    height: 100%;
}

</style>