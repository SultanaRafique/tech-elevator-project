`<template>
  <div class="home">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Love+Ya+Like+A+Sister">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta">
    <!-- <p>You must be authenticated to see this</p> -->

    <nav>
      <div>
        <div class="row1">
          <div><a><router-link :to="{name: 'myflashcards'}" class="editCards">Flashcards</router-link></a></div>
          <div><a><router-link :to="{name: 'searchCard'}" class="viewCards">Search Cards</router-link></a></div>
        </div>
        <div class="row2">
          <div><a><router-link :to="{name: 'deck'}" class="createDeck">Create Decks</router-link></a></div>
          <div><a><router-link :to="{name: 'deckBoard'}" class="viewDecks">View Decks</router-link></a></div>
          <div><a><router-link :to="{name: 'session'}" class="newSession">Study Session</router-link></a></div>
        </div>
      </div>
    </nav>
  </div>
</template>

<script>
export default {
  name: "home",
  components: {},
    data() {
        return {
            home: {
                flashcards: '',
                deck: '',
                deck_list: '',
                session: ''
            }
        }
    }
};
</script>

<style>
div {
  text-align: center;
  color: white;
}
h1 {
  font-family: "Love Ya Like A Sister", sans-serif;
}
ul {
  list-style-type: none;
  margin: 0 20px 0 20px;
  padding: 0;
}
li {
  font-family: "Love Ya Like A Sister", sans-serif;
  font-size: 2rem;
  font-weight: 400;
  text-transform: uppercase;
  border-bottom: 1px solid white;
  padding-top: 30px
}
.editCards {
  align-content: center;
  font-size: 40px;
  width: 350px;
  height: 152px;
  margin: 0 auto;
  background-image: url("../images/blue.png");
  background-size: 100%;
}
.createDeck {
  align-content: center;
  font-size: 40px;
  width: 350px;
  height: 152px;
  margin: 0 auto;
  background-image: url("../images/yellow.png");
  background-size: 100%;
}
.viewDecks {
  align-content: center;
  font-size: 40px;
  width: 350px;
  height: 152px;
  margin: 0 auto;
  background-image: url("../images/red.png");
  background-size: 100%;
}
.viewCards {
  align-content: center;
  font-size: 40px;
  width: 350px;
  height: 152px;
  margin: 0 auto;
  background-image: url("../images/green.png");
  background-size: 100%;
}
.newSession {
  align-content: center;
  font-size: 40px;
  width: 350px;
  height: 152px;
  margin: 0 auto;
  background-image: url("../images/orange.png");
  background-size: 100%;
}
.editCards:link {
  size: 40px;
  padding-top: 200px;
  display: block;
  color: black;
  text-decoration: none;
}
.createDeck:link {
  size: 40px;
  padding-top: 200px;
  display: block;
  color: black;
  text-decoration: none;
}
.viewDecks:link {
  size: 40px;
  padding-top: 200px;
  display: block;
  color: black;
  text-decoration: none;
}
.viewCards:link {
  size: 40px;
  padding-top: 200px;
  display: block;
  color: black;
  text-decoration: none;
}
.newSession:link {
  size: 40px;
  padding-top: 200px;
  display: block;
  color: black;
  text-decoration: none;
}
.createDeck:visited {
  color: black;
}
.editCards:visited {
  color: black;
}
.viewDecks:visited {
  color: black;
}
.viewCards:visited {
  color: black;
}
.newSession:visited {
  color: black;
}
.editCards:hover {
  color: cyan;
  padding-left: 5px;
}
.createDeck:hover {
  color: orangered;
  padding-left: 5px;
}
.viewDecks:hover {
  color: hotpink;
  padding-left: 5px;
}
.viewCards:hover {
  color: yellow;
  padding-left: 5px;
}
.newSession:hover {
  color: red;
  padding-left: 5px;
}
.row1 {
  display: flex;
  align-items: center;
  justify-content: space-evenly;
}
.row2 {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
</style>
