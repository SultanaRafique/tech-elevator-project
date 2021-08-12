<template>
<div>
    <div>
            <div class="loading" v-if="isLoading">
              <img src="../assets/ping_pong_loader.gif" />
            </div>

            <div>
              <h1>{{card.title}}</h1>
              <h1>{{card.description}}</h1>
              <comments-list vibind:comments="card.comments"/>
            </div>

            <router-link v-if="!isLoading" v-bind:to ="{name: 'Board', params: { id: BoardId}}" >
            Back to boards
            </router-link>
      </div>
</div>
</template>

<script>
import boardService from '../services/BoardService'
import CommentsList from './CommentsList.vue';
export default {
  components: { CommentsList },
  name: "card-detail",
  props: ['cardId', 'boardId'],
  data() {
    return {
   card: {

      title: '',
      description: '',
      status: '',
      comments: []

    },
    isloading: true
}
  },
  created(){
    boardService.getCard(this.$route.params.boardID,
    this.$route.params.cardID).then((cardData) =>{
      this.card = cardData;
      this.loading = false;
    });

  }

};
</script>
