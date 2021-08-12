<template>
  <div>
      <h1>Product Detail</h1>
      <product-detail v-bind:product-id="$store.state.activeProduct"/>
  </div>
</template>

<script>
import ProductDetail from '../components/ProductDetail.vue'
export default {
    name: 'product',
    components: { ProductDetail },
    created() {
        const activeProductId = this.$route.params.id;
        this.$store.commit('SET_ACTIVE_PRODUCT', activeProductId);
    }

}
</script>

<style>

</style>