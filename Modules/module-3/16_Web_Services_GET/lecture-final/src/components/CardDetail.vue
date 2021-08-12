<template>
  <div>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <h1> {{ card.title }} </h1>
      <h2> {{ card.description }}</h2>
      <comments-list v-bind:comments="card.comments" />
    </div>
    <router-link v-if="!isLoading" v-bind:to="{ name: 'Board', params:  { id: BoardId }}">
      Back to Board
    </router-link>
  </div>
</template>

<script>
import boardService from '../services/BoardService';
import CommentsList from './CommentsList.vue';

export default {
  components: { CommentsList },
  name: "card-detail",
  props: ["BoardId", "CardId"],
  data() {
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      },
      isLoading: true
    }
  },
  created() {
    boardService.getCard(this.$route.params.boardID,
      this.$route.params.cardID).then( cardData => {
        this.card = cardData;
        this.isLoading = false;
      });
  }
}
</script>
