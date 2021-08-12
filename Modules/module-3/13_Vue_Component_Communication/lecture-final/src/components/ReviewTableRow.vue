<template>
    <tr>
        <td>
            {{ review.title }}
        </td>
        <td>
            {{ review.reviewer }}
        </td>
        <td>
            {{ review.review }}
        </td>
        <td class="stars">
            <img src="../assets/star.png"
            class="star"
            style="width: 20px"
            v-for="x in review.rating"
            v-bind:key="x"
            v-bind:title="review.rating + ' Star Review'"
            />
        </td>
        <td>
            <input type="checkbox" v-bind:checked="review.favorited" v-on:click="onFavoritedChange(review)"/>
        </td>
        {{ show }}
    </tr>
</template>

<script>
export default {
    name: 'review-table-row',
    props: ["review", "show"],
    methods: {
        onFavoritedChange(reviewToChange) {
            this.$store.commit('FLIP_FAVORITED', reviewToChange)
        }
    }
}
</script>

<style>   
    .stars {
    display: flex;
    }
</style>