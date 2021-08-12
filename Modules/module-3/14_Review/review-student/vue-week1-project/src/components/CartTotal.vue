<template>
    <div class="total">
        <!-- add the total cost here -->
        Total: ${{totalCost}}
    </div>

</template>

<script>
export default {
    name: 'cart-total',
    computed: {
        totalCost() {
            /* get all the cartItems prices*/
            let totalCost = 0.00;
            this.cartItems.forEach( item => {
                totalCost += totalCost;

            });

            /* sum all the prices and return */

            /* place holder */
            return 0;
        },
        cartItems() {
            const cart = this.$store.state.cart;
            return this.$store.state.products.filter( product => {
                return cart.includes(product.product_id);
            });
        }
    }

}
</script>

<style>

    .total {
        text-align: right;
        color: blue;
    }

</style>