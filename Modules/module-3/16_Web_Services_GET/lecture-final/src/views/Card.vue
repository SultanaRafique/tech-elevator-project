<template>
  <card-detail v-bind:board-id="boardId" v-bind:card-id="cardId" />
</template>

<script>
import CardDetail from '@/components/CardDetail';

export default {
  name: 'card',
  components: {
    CardDetail
  },
  data() {
    return {
      boardId: null,
      cardId: null
    }
  },
  created() {
    this.boardId = this.$route.params.boardID;
    this.cardId = this.$route.params.cardID;
  }

};
</script>
