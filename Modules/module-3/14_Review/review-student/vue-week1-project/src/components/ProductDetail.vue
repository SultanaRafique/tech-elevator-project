<template>
    <div id="main-container">
        <div id="panel">
            <div id="product-name">
                <!-- product name goes here -->
                <!-- evaluate and display -->
                {{product.product_name}}
            </div>
           
            <div id="rating-price"> 
                <!-- modify this so it creates as many stars as intRating returns -->
                <!-- only show this if there is a rating -->
                <div>
                    <img class="rating-star" src="../assets/star-symbol.png"  v-for="x in intRating" v-bind:key="x"/>

                    <!-- this will be shown if we need a half star the showHalfStar
                        property indicates this -->
                    <img v-show="showHalfStar" class="rating-star" src="../assets/star-half-yellow.png" />
                </div>

                <!-- show this section if there is no rating -->
                <div id="no-rating" v-show="intRating < 1">
                    No rating available.
                </div>

                <!-- product price goes here -->
                <!-- only show this is if price available -->
                <div id="price"  v-show="product.product-price">
                    ${{ product.product-price }}
                </div>

                <!-- show this section if there is no price avaiable -->
                <div id="no-price" v-show="!product.product-price">
                    No price information available.
                </div>
            </div>

            <!-- if item not in cart, show add to cart button -->
            <div v-show="!inCart" class="add-to-cart">
                <!-- clicking on button should add the item to the cart -->
                <!-- this button should be disabled if price is not available -->
                <button  class="blue-button"  v-bind:disabled="!product.product-price" v-on:click="addToCart">
                    <i class="fas fa-cart-plus"></i>
                </button>
            </div>
            <!-- if item already in cart show this message -->
            <div v-show="inCart" class="in-cart">
                Already in cart
            </div>
        </div>
  </div>
</template>

<script>
export default {
    name: 'product-detail',
    props: ['product'],
    computed: {
        intRating() {
            return parseInt(this.product.product_rating);
        },
        showHalfStar() {
            return (this.product.product_rating - this.intRating) >= .5;
        },
        inCart() {
            /* check if item is in cart. note that cart curretnly only
                stores product id (will refactor that later) */
            this.$store.
                /* placeholder */
            return false;
        }
    },
    methods: {
         removeCart(){

             this.$store.commit("REMOVE_FROM_CART", itemToRemove)

         },
        addToCart(){
            this.$store.commit('ADD_TO_CART', "this.product")
        }
    }
}
</script>

<style scoped>

    #panel {
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        margin-top: 20px;
    }

    #product-name {
        font-family: Haettenschweiler, 'Arial Narrow Bold', sans-serif;
        font-weight: bold;
        font-size: 18px;
        text-align: left;
    }

    #price {
        font-family: Haettenschweiler, 'Arial Narrow Bold', sans-serif;
        font-size: 18px;
        text-align: left;
        margin-left: 20px;
        margin-top: auto;
        margin-bottom: auto;
    }

    #no-rating, #no-price{
        margin-top: auto;
        margin-bottom: auto;
        color: red;
    }

    #rating-price {
        margin-top: 20px;
        display: flex;
        font-weight: bold;
    }

    .rating-star {
        width: 30px;
        height: auto;
        align-self: top;
    }

    .add-to-cart, .in-cart {
        font-size: 28px;
        text-align: right;
        padding-top: 20px;

        padding-right: 40px;
        color: blue;
    }

    .in-cart {
        font-size: 20px;
        margin-top: 10px;
    }

    .blue-button {
        color: blue;
    }

</style>