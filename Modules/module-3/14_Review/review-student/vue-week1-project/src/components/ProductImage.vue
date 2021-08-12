<template>
    <div class="img-div">
    <!-- src property should be set based on image being displayed -->
    <img v-bind:src="imgSrc" />
  </div>
</template>

<script>
export default {
    name: 'product-image',
    props: ["imgSrc"]
}
</script>

<style scoped>
    .img-div {
        width: 200px;
        height: 200px;
        border-right: 2px solid black;
        padding: 5px;
    }

    img {
        max-width: 100%;
        max-height: 100%;
    }
</style>