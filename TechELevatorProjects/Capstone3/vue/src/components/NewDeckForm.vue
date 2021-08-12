<template>
  <div>
    <!-- <form v-if="showForm"> -->
    <form>
      <div>
        <h2>Enter a Deck Name and Description</h2>
        </div>
      <input class='field' placeholder="Deck Name" type="text" v-model="deck.name" required />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Love+Ya+Like+A+Sister">
      <!-- <form v-if="showForm"> -->
       
       

      <input class='field'
        placeholder="Deck Description"
        type="text"
        v-model="deck.description"
        required
      />

     

      <div>
        <h2>Click Cards to Add to Deck</h2>
        <div>
          <input class='field'
            type="text"
            placeholder="Search by Keywords"
            v-model="keywordToAdd"
          />
          <button class='btn' v-on:click.prevent="addSearchKeyword">+Keyword</button>
          <button class='btn' v-on:click.prevent="clearFilters">
            Reset Search Parameters
          </button>
        </div>
        <div class="miniCardContainer">
          <span
            v-on:click.prevent="addCardToDeck(card.flashCardId)"
            class="miniCard"
            v-bind:class="{ inDeck: deck.cards.includes(card.flashCardId) }"
            v-for="card in this.filteredList"
            v-bind:key="card.id"
          >
            {{ card.question }}
          </span>
        </div>
        <button class='btn' v-on:click.prevent="addAll">Select All</button>
        <button class='btn' v-on:click.prevent="removeAll">Deselect All</button>
        <table class="keywordTable" v-show="this.filters.length != 0">
          <th>Search Parameters</th>
          <tr v-for="param in this.filters" v-bind:key="param.id">
            <td>{{ param }}</td>
          </tr>
        </table>

        <div>
        <h2>If All Done, Submit!</h2>
        </div>

        <div>
         <button class='btn' @click.prevent="addNewDeck">Submit</button>
         </div>
      </div>
      <div v-show="deckCreated">{{ deck.name }} created successfully</div>
    </form>
    <div><a><router-link :to="{name: 'deckBoard'}" class="toDecks">Click here to view all decks created</router-link></a></div>
  </div>
</template>

<script>
import DeckService from "@/services/DeckService";
import FlashcardService from "@/services/FlashcardService.js";

export default {
  name: "new-deck-form",
  components: {},
  created() {
    FlashcardService.getMyCards(this.$store.state.user.id).then((response) => {
      const cards = response.data;
      this.$store.commit("SET_FLASHCARDS", cards);
      return cards;
    });
  },
  computed: {
    filteredList() {
      let newList = this.$store.state.flashcards;
      if (this.filters.length != 0) {
        for (let i = 0; i < this.filters.length; i++) {
          newList = newList.filter((card) => {
            return card.keywords.includes(this.filters[i]);
          });
        }
      }
      return newList;
    },
  },
  data() {
    return {
      filters: [],
      keywordToAdd: "",
      deck: {
        userId: this.$store.state.user.id,
        name: "",
        description: "",
        cards: [],
      },
      deckCreated: false,

      //showForm: false
    };
  },
  methods: {
    addCardToDeck(cardId) {
      if (!this.deck.cards.includes(cardId)) {
        this.deck.cards.push(cardId);
      } else {
        this.deck.cards = this.deck.cards.filter((card) => {
          return card != cardId;
        });
      }
    },
    addAll() {
      for (let i = 0; i < this.filteredList.length; i++) {
        if (!this.deck.cards.includes(this.filteredList[i].flashCardId)) {
          this.deck.cards.push(this.filteredList[i].flashCardId);
        }
      }
    },
    removeAll() {
      for (let i = 0; i < this.filteredList.length; i++) {
        if (this.deck.cards.includes(this.filteredList[i].flashCardId)) {
          this.deck.cards = this.deck.cards.filter((card) => {
            return card != this.filteredList[i].flashCardId;
          });
        }
      }
    },
    addSearchKeyword() {
      if (
        this.keywordToAdd != "" &&
        !this.filters.includes(this.keywordToAdd.toLocaleLowerCase())
      ) {
        this.filters.push(this.keywordToAdd.toLocaleLowerCase());
        this.keywordToAdd = "";
      }
    },
    clearFilters() {
      this.filters = [];
    },

    addNewDeck() {
      this.deckCreated = false;
      if (this.deck.name != "" && this.deck.description != "") {
        DeckService.addDeck(this.deck).then((response) => {
          this.deckCreated = response.data;
          console.log(this.deckCreated);
        });
      }

      //   if (this.keywordToAdd != "" && !this.flashcard.keywords.includes(this.keywordToAdd)) {
      //     this.flashcard.keywords.push(this.keywordToAdd);
      //     this.keywordToAdd = "";
      //   }
    },
  },
};
</script>

<style>
.inDeck {
  background-color: limegreen;
  background-image: none;
}
.toDecks {
  display: block;
  font-family: "Love Ya Like A Sister", sans-serif;
  color:#FFFFFF;
  font-size: 20px;
  text-decoration: none;
  padding-top: 30px;
}
.toDecks:link {
  color:#FFFFFF;
}
.toDecks:hover {
  color: gold;
}
.btn {
  display:inline-block;
  padding:0.7em 1.7em;
  margin:0 0.3em 0.3em 0;
  border-radius:0.25rem;
  box-sizing: border-box;
  text-decoration:none;
  font-family: "Love Ya Like A Sister", sans-serif;
  /* font-family:'Roboto',sans-serif; */
  font-weight:400;
  color:#FFFFFF;
  background-color:#3369ff;
  box-shadow:inset 0 -0.6em 1em -0.35em rgba(0,0,0,0.17),inset 0 0.6em 2em -0.3em rgba(255,255,255,0.15),inset 0 0 0em 0.05em rgba(255,255,255,0.12);
  text-align:center;
  position:relative;
}

.field{
  display:inline-block;
  height: 30px;
  width: 300px;
  background-color: white;
  display: inline-block;
  border-radius: 5px;
    
}

</style>