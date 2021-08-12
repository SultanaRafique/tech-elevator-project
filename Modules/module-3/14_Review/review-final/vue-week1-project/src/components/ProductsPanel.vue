<template>
  <div>
        <!-- this should display all products -->
        <div class="product-container" id="product-row" v-for="product in filteredProducts" v-bind:key="product.id" >
            <!-- add the ProductImage component, sdet its if to img-panel -->
            <product-image id="img-panel" v-bind:img-src = "product.product_image_url" />
            
            <!-- add the ProductDetail component -->
            <product-detail id="text-panel" v-bind:product="product"/>
            
        </div>
    </div>
</template>

<script>
import ProductDetail from './ProductDetail.vue'
import ProductImage from './ProductImage.vue'
export default {
    name: 'products-panel',
    components: {
        ProductImage,
        ProductDetail
    },
    computed: {
        /* create a property to filter the products by search 
            once search is implemented. make sure it actually
            filters the products on the page */
            filteredProducts() {
                return this.$store.state.products.filter( (product) => {
                    const searchTerm = this.$store.state.search;
                    return product.product_name.toLowerCase().includes(searchTerm.toLowerCase());
                });
            }

    }

}
</script>

<style>
    .product-container {
        display: grid;
        grid-template-columns: 1fr 9fr;
        grid-template-areas: "img-panel text-panel";
        border: 2px solid black;
        margin-right: 20px;

    }

    #img-panel {
        grid-area: img-panel;
    }

    #text-panel {
        grid-area: text-panel;
        background-color: #f2f2f2;
        padding-left: 20px;
    }

    .attribution {
        font-size: 10px;
    }

    .cat-filter {
        width: 50%;
        padding-bottom: 10px;
    }
</style>